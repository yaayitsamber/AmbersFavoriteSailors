      /**************************************************************
      ***************************************************************
      ***************************************************************
      ***                                                       	***
      ***                     ID INFORMATION                      ***
      ***                                                      	***
      ***   Programmer  		   :        Amber Hilton            ***
      ***   Assignment #		 	:   		Program #2I/O           ***
      ***   Assignment Name		:	    	SWINGING AWAY           ***
      ***   Course # and Title	:	    	CISC 190 - Java        	***
      ***   Class Meeting Time	:	    	MW 9:35 - 12:45	      ***
      ***   Instructor			   :	    	Professor Forman 	      ***
      ***   Hours	            	:		   20+   			         ***
      ***   Difficulty 		      :	    	5.6    		            ***                                              
      ***   Completion Date		:	    	November 9, 2015        ***
      ***   Program Name			:  	   AmberFavoriteSailors    ***
      ***                                            					***
      ***************************************************************
      ***************************************************************
      ***                                                   		***
      ***                  PROGRAM DESCRIPTION            		   ***
      ***                                                         ***					
      ***  This program will interact with the user via JOption   ***
      ***  windows. Text fields will be utilized for the user to  ***
      ***  input their favorite sailor scout(Sailor Moon). The    *** 
      ***  will save the these values and display read            ***
      ***  them from a saved text file upon the users request     ***
      ***  when the user is finished, they can enter "Q" to quit  ***
      ***  and exit the program.                                  ***
      ***                                                         ***
      ***                                                         ***
      ***   	                                                	***
      ***                                                         ***
      ***                                            					***
      ***************************************************************
      ***************************************************************
      ***                                                         ***
      ***                  CUSTOM METHODS                         ***
      ***    helloDirectory(); 
      ***    collectScouts();
      ***    dontQuitScouts();
      ***    readScouts();
      ***    appendScouts();
      ***    becomeMichaelangelo();
      ***    
      ***                                   		                  ***
      ***   	                                                   ***
      ***                                                     		***
      ***************************************************************
      ***************************************************************
      ***                                                         ***
      ***                  	 CREDITS	                           ***
      ***   Thanks for beautiful animation and inspiration from   *** 
      ***   Naoko Takeuchi, creator of Sailor Moon.               ***
      ***   Thanks to Anthoney and Ricky. Hilarious duo of crime  ***
      ***   fighting coders.                                      ***
      ***   Allison and Arnold, my shoulders to cry on. So much   ***
      ***   support!                                              *** 
      ***   Professor Forman; things and stuff                    ***
      ***                                                         ***
      ***                   YOU'RE WELCOME                        ***
      ***   Anthoney, Ricky: I print out the damn task sheets.    ***
      ***   Allison and Arnold: You need my neurosis, admit it.   ***
      ***                                   		                  ***
      ***   	                                                   ***
      ***                                                     		***
      ***************************************************************
      ***************************************************************
      ***                                                         ***
      ***                  	 MEDIA                              ***
      ***   Thanks for beautiful animation and inspiration from   *** 
      ***   Naoko Takeuchi, creator of Sailor Moon.               ***
      ***   Thanks to Anthoney and Ricky. Hilarious duo of crime  ***
      ***   fighting coders.                                      ***
      ***   Allison and Arnold, my shoulders to cry on. So much   ***
      ***   support!                                              *** 
      ***   Professor Forman; things and stuff                    ***
      ***                                                         ***
      ***                   YOU'RE WELCOME                        ***
      ***   Anthoney, Ricky: I print out the damn task sheets.    ***
      ***   Allison and Arnold: You need my neurosis, admit it.   ***
      ***                                   		                  ***
      ***   	                                                   ***
      ***                                                     		***
      ***************************************************************/ 




import javax.swing.*;      //Needed for JOptionPane, JFrame, JLabel & JPanel
import java.util.Scanner;	//Needed for Scanner class
import java.io.*;				//Needed for IOException, PrintWriter, File classes
import java.awt.*;         //Needed for font and color classes
import java.applet.*;      //needed to play music
import java.net.URL;       // needed to access file that contains music

public class AmbersFavorite
{
   JFrame splashJFrame = new JFrame ("She is the one named Sailoooorrrr...");
   String MY_NAME = "Amber"; 
       
   public static void main(String[] args) throws IOException
   {
      new AmbersFavorite();      
   } 
      
   AmbersFavorite() throws IOException
   {  
      String helloDirectory   = "nada";

      
      
      //deploys but most methods are nested, thats bad huh?
      helloDirectory();  
        
   }          
/******************************************************************************
**
**		NAME:     helloDirectory     
**		DESCRIPTION:   	-- Welcomes user via JOptionPane, instructs them to enter C to Create a database of Scouts
                        Q to Quit or R to review selected Scouts.
                        void method, returns no information, with no parameters
**                      
******************************************************************************/
         
         
   public String helloDirectory () throws IOException
         
   {
   ///////////////////////////////////////////////////////////////////////////////
      		
   ///					LOCAL OBJECT DECLARATION
      		
   //////////////////////////////////////////////////////////////////////////////
   
      Icon  superComp    =  new ImageIcon ("superComp.png");
      Icon  sailorMoon   =  new ImageIcon ("sailorMoonMini.gif");
      Icon  sailorMars   =  new ImageIcon ("sailorMarsMini.gif");
      Icon  sailorMercury=  new ImageIcon ("sailorMercuryMini.gif");
      Icon  sailorJupiter=  new ImageIcon ("sailorJupiterMini.gif");
      Icon  sailorSaturn =  new ImageIcon ("sailorSaturn.gif");
      Icon  sailorVenus  =  new ImageIcon ("sailorVenus.gif");   
      Icon  lunaMini     =  new ImageIcon ("lunaMini.gif");
      Icon  sailorGroup  =  new ImageIcon ("sailorGroup.png");  
      Icon  galaxy       =  new ImageIcon ("pinkGalaxy.jpg");          
   
      JPanel heysailorJPanel = new JPanel();
      JLabel galaxyJLabel = new JLabel ();

   /////////////////////////////////////////////////////////////////////////////////////////////////
   
   //////////////////////////////////////////////////////////////////////////////////////////////////
      		
   ///					VARIABLE DECLCARTION
      		
   //////////////////////////////////////////////////////////////////////////////////////////////////
     
      String hello = "<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     +"Hi! Welcome to Amber's Favorite Sailor Scouts<br>"
                     //+"Enter your favorite Sailor Scout!<br>"
                     +"To create a database of Sailor Scouts Enter \"C\"<br>"
                     +"To review your database of Sailor Scouts Enter \"R\"<br>"
                     +"To quit reviewing your database Enter \"Q\"<br>"
                     +"</font></html>";
      String direction = "<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     +"Hi! Welcome to Amber's Favorite Sailor Scouts<br>"
                     //+"Enter your favorite Sailor Scout!<br>"
                     +"To create a database of Sailor Scouts Enter \"C\"<br>"
                     +"To review your database of Sailor Scouts Enter \"R\"<br>"
                     +"To quit reviewing your database Enter \"Q\"<br>"
                     +"</font></html>";               
      String helloDirectory   = "nada";  
      String operation = "null";  
   ///////////////////////////////////////////////////////////////////////////////////////////////////      
      
      //SETTING UP JFRAME COMPONENTS
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      splashJFrame.setSize(screenSize.width, screenSize.height);
      galaxyJLabel.setIcon(galaxy);
      heysailorJPanel.add(galaxyJLabel);
      splashJFrame.getContentPane().add(heysailorJPanel);
      try {java.applet.AudioClip clip = java.applet.Applet.newAudioClip(new java.net.URL("SAILORMUSIC.wav")); clip.play();} 
         catch (java.net.MalformedURLException murle) { System.out.println(murle);}
      splashJFrame.setVisible(true); 
      try {java.applet.AudioClip clip = java.applet.Applet.newAudioClip(new java.net.URL("SAILORMUSIC.wav")); clip.play();} 
         catch (java.net.MalformedURLException murle) { System.out.println(murle);}
         
      //INITIAL JOPTION PANE, CHOICE LEADS TO SWITCH              
      helloDirectory=(String)JOptionPane.showInputDialog(null, hello, "Hey Sailor", 
                                       JOptionPane.PLAIN_MESSAGE, superComp,null, "C");
      switch(helloDirectory)
      {
         case  "C"  : 
         case  "c"  :  collectScouts();
            break;
         case  "Q"  : //IF USER QUITS TOO EARLY, SEND THEM BACK TO BEGINING WITH WARNING THEN REPEAT METHOD
         case  "q"  : operation   =  "You cant give up yet! The Negaverse is stealing energy!"; 
            break;
         case  "R"  : //IF USER ATTEMPTS TO READ TOO EARLY, SEND THEM BACK WITH WARNING THEN REPEAT METHOD 
         case  "r"  : operation   =  "You didnt enter any scouts!"; 
            break;
         default:    //DEFAULT IF USER ENTERS INVALID CHARACTER THEN REPEAT METHOD
            operation   =  "Let's fight for Beauty and Love! Your input of "+helloDirectory+" was invalid!";    
      }                           
      JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     + operation
                     + "</font></html>");
      helloDirectory();//recursion, repeat dat method!
      
      return helloDirectory;                          
   }                       
/******************************************************************************
**
**		NAME:     collectScouts     
**		DESCRIPTION:   	-- collects user input Sailor Scout names via JOptionPane, display a fun picture of 
                        special scouts, stores **                      
******************************************************************************/ 
   public void collectScouts () throws IOException
   {
   
//////////////////////////////////////////////////////////////////////////////////////////////////
      		
///					         CONSTANT DECLCARTION
      		
//////////////////////////////////////////////////////////////////////////////////////////////////
   
      Icon  lunaMini     =  new ImageIcon ("lunaMini.gif"); 
      String selectScouts= "FUCK";//sorry, i was angry.
      String operation = "GODDAMNIT";//yeah, i still am, these are just here to hold space in memory.
      
////////////////////////////////////////////////////////////////////////////////////////////////////      
      
      //Instance of the PrintWriter class, constructor; creates a text file named AmbersFavoriteSailor.
      PrintWriter writeToFile = new PrintWriter(new FileWriter("AmbersFavoriteSailor.txt"));
      
      //I tried so many loop-switch-while-if combos before I got to this one. Learning?
      do 
      {
         selectScouts=(String)JOptionPane.showInputDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                  +"Enter a Sailor Scout or Press \"Q\" to quit. Or Press \"R\" to Review ", 
                  "DATABASE ENTRY",JOptionPane.PLAIN_MESSAGE, lunaMini, null, "Sailor Moon"); 
               
               //DEPLOYS THE DONT QUIT YET METHOD, ROBUST YEAH?
         if("Q".equalsIgnoreCase(selectScouts)   )
         {  
            writeToFile.close();
            dontQuitScouts();
         } 
               //DEPLOYS THE READ METHOD, MUST QUIT AFTER REVIEWING.   
         if("R".equalsIgnoreCase(selectScouts)    )
         {
            writeToFile.close();
            dontQuitScouts();
         } 
      
         JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     +"You've added "+selectScouts+ " to your directory!");//writes sailor scout entries to txt file  
         writeToFile.println(selectScouts);//ALLISON SAVED ME HERE. I was thisclose to ripping my eyes out.
               
      }
        while( selectScouts != "Q" && selectScouts != "R");
            
   }      
/******************************************************************************
**
**		NAME:     quitScouts     
**		DESCRIPTION:   	-- bids the user farwell from the Favorite Sailor Scouts Program via a JOptionPane             
******************************************************************************/ 
   public void dontQuitScouts() throws IOException
   {  
//////////////////////////////////////////////////////////////////////////////////////////////////
      		
///					         CONSTANT DECLCARTION
      		
//////////////////////////////////////////////////////////////////////////////////////////////////

      Icon  superComp    =  new ImageIcon ("superComp.png");
      BufferedReader readTheFile = new BufferedReader( new FileReader( "AmbersFavoriteSailor.txt" ) );
      
///////////////////////////////////////////////////////////////////////////////////////////////////   
      
      int yesorno =  JOptionPane.showConfirmDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     +"Are you sure you want to leave? The world is depending on you!",
                     "You can't give up!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                     
      if (yesorno      ==  JOptionPane.NO_OPTION)
      {JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			+ "=\"American Typewriter\">"
                     +"Let's get going! Evil never sleeps!",
                     "Time to Battle", JOptionPane.PLAIN_MESSAGE, superComp);
         appendScouts();} 
      else if (yesorno ==  JOptionPane.YES_OPTION)               
      {JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			                        + "=\"American Typewriter\">"
                                             +"You're a Hero. Believe in yourself", 
                                             "Exiting Database",JOptionPane.PLAIN_MESSAGE, superComp);
         while (readTheFile.readLine()== null)
         {JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
               		                        + "=\"American Typewriter\">"
                                             +"Dont be lazy, Meatball Head!");
            collectScouts();}
         if(readTheFile.readLine()!=null);
      }                             
      {readScouts();}
               
   }
/******************************************************************************
**
**		NAME:     readScouts     
**		DESCRIPTION:   	-- import scanner class            
******************************************************************************/                                                          
   public void readScouts() throws IOException
   {
      
      /////////////////////////////////////////////////////////////////////////
   	
   	//					LOCAL OBJECT/VARIABLE DECLARATION BANNER
   	
   	/////////////////////////////////////////////////////////////////////////
   	
      String aSailorScout = "sailor poop";
      Icon  superComp    =  new ImageIcon ("superComp.png");
      Icon  sailorGroup  =  new ImageIcon ("groupSailor1.gif");  
      Scanner readFromFile = new Scanner( new File( "AmbersFavoriteSailor.txt" ) );
   	
      /////////////////////////////////////////////////////////////////////////
   
      JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			               + "=\"American Typewriter\">"
                                    +"You've compiled an impressive amount of data, lets review your entries",
                                    "Reading Database",JOptionPane.PLAIN_MESSAGE, superComp);
   
   
      while ( readFromFile.hasNext() )     
      {
         			//Read item from disk file and store it
         aSailorScout = readFromFile.nextLine();
      	//Screen echo of information read from disk					
      	//JOptionPane.showMessageDialog( null,aSailorScout );
         JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			                  + "=\"American Typewriter\">"
                                       +"Reading " +aSailorScout+" from database");
      }
   	
   	//Conclude disk reading by closing file	
      readFromFile.close();
   	//Inform user that disk reading had ended
      JOptionPane.showMessageDialog(null, "<html><font size=\"5\" color=\"F660AB\" face" 
            			               + "=\"American Typewriter\">"
                                    +  "Now Exiting "+MY_NAME+"'s Sailor Scout Database<br>" 
                                    + "Please Be Diligent<br>"
                                    +  "The Negaverse Grows Stronger Everyday!</font></html>","You're STELLAR!",
                                    JOptionPane.PLAIN_MESSAGE,sailorGroup); 
      becomeMichaelangelo();
      System.exit(0);                                             
   }
/******************************************************************************
**
**		NAME:     appendScouts     
**		DESCRIPTION:   	-- imports FileWriter and BufferedWriter class to add new entries to txt file
**                        without overwriting previous entries            
******************************************************************************/ 
   public void appendScouts () throws IOException
   {  
//////////////////////////////////////////////////////////////////////////////////////////////////
      		
///					         CONSTANT/OBJECT DECLCARTION
      		
//////////////////////////////////////////////////////////////////////////////////////////////////
  
      Icon  lunaMini     =  new ImageIcon ("lunaMini.gif");
      String selectScouts= "FUCK";
      File file = new File("AmbersFavoriteSailor.txt");
      
///////////////////////////////////////////////////////////////////////////////////////////////////       
      do 
      {
         selectScouts=(String)JOptionPane.showInputDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			      + "=\"American Typewriter\">"
                           + "Enter a Sailor Scout or Press \"Q\" to quit. Or Press \"R\" to Review ", 
                           "DATABASE ENTRY",JOptionPane.PLAIN_MESSAGE, lunaMini, null, "Sailor Moon"); 
      }    
       while(!file.exists());       
      JOptionPane.showMessageDialog(null,"<html><font size=\"5\" color=\"F660AB\" face" 
            			               + "=\"American Typewriter\">"
                                    +"You've added "+selectScouts+ " to your directory!");//writes sailor scout entries to txt file
                                    
    	//Here true is to append the content to file
      FileWriter fileWrite = new FileWriter(file,true);
    	//BufferedWriter writer give better performance
      BufferedWriter bw = new BufferedWriter(fileWrite);
      bw.write(selectScouts);
    	//Closing BufferedWriter Stream
      bw.close();
   }
//******************************************************************************/
  
   public void becomeMichaelangelo()
   
   {  
      /////////////////////////////////////////////////////////////////////////
   
   	//			DECLARE AND DEFINE LOCAL CONSTANTS
   
   	/////////////////////////////////////////////////////////////////////////
      Icon sailorIcon = new ImageIcon("sailorIcon.gif");
      JFrame byeJFrame = new JFrame("Smell ya Later");
      JLabel byeJLabel = new JLabel();
      JPanel byeJPanel = new  JPanel();
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      byeJFrame.setSize(screenSize.width, screenSize.height);
      byeJPanel.setSize(screenSize.width, screenSize.height);
      byeJPanel.setBackground(Color.MAGENTA);
      byeJLabel.setIcon(sailorIcon);
      byeJPanel.add(byeJLabel);
      byeJFrame.getContentPane().add(byeJPanel);
      byeJFrame.setVisible(true); 
      final int LCOLUMN = 200;
      final int RCOLUMN = 220;
      final int HEIGHT  = 1010;
      final int LENGTH  = 800;
      Icon poopGif = new ImageIcon("poop.gif");
      String credits = "<html><font size=\"5\" color=\"#F660AB\" face" 
         					   + "=\"American Typewriter\">"
                           +"CREDITS<br>"
         					   + "   Thanks for consistent laughs and inspiration from<br>"     
                           + "the cast of Seinfeld.<br>"                     
                           + "Thanks to Allsion and Arnold for being Java Bosses<br>"    
                           + "Thanks to Rafa for providing the BEST TEXTBOOK<br>"
                           + "Thanks to Anthony and Ricky for being fun and wicked smaht!<br>"        
                           + "Thanks to Professor Forman, for your time & knowledge<br>" 
                           + "Opportunity to assist and inspire<br>"                     
                           + "   Allison, Arnold, Zilong, Anthony & Ricky<br> "
         					   + " <br> <br> &nbsp &nbsp &nbsp &nbsp<br>"
         					   + "&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<br>" 
         					   + "&nbsp &nbsp"
         					   + "</font></html>";
      String stars2 =  "<html><font size=\"5\" color=\"F660AB\" face" 
         					   + "=\"American Typewriter\">"
                           +"Stars: PROGRAM 2<br>"
         					   +"1.ROBUST AS F***<br>"
                           +"2.WARNING TO USER!<br>"
                           +"3.TASKS C-H<br>"
                           +"4.MANAGERS REPORT<br>"
                           + "TOTAL STARS:4"
         					   + " <br> <br> &nbsp &nbsp &nbsp &nbsp"
         					   + "&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp" 
         					   + "&nbsp &nbsp "
         					   + "</font></html>";     
      String graphics =  "<html><font size=\"5\" color=\"F660AB\" face" 
         					   + "=\"American Typewriter\">"
                           +"GRAPHICS<br>"
         					   +"sailorgroup1.gif:http://pa1.narvii.com/5631/478321153111130cdcd9e66648dcff7be0dd80fe_hq.gif<br<"
                           +"lunaMini.gif:http://38.media.tumblr.com/tumblr_m56iktDfky1qid2nw.gif, http://engrampixel.co.vu/tagged/sailor%20moon<br>"
                           +"pinkGalaxy.jpg:http://7-themes.com/data_images/out/32/6878614-galaxy-<br>"
                           +"group:http://myweeklyfacts.com/wp-content/uploads/2014/11/cover.jpg<br>"
                           +"kramerica:http://www.nekkidtees.com/wp-content/uploads/kramerica_large.gif<br>"
                           +"kramer gif:http://25.media.tumblr.com/b9b266e105bbe2aedb5bb3713887552c/tumblr_n27bkzkn3k1rfkogxo1_250.gif<br>"
                           +"elaine:http://ak-hdl.buzzfed.com/static/2014-07/3/20/enhanced/webdr08/anigif_enhanced-3329-1404435281-5.gif<br>"
         					   + " <br> <br> &nbsp &nbsp &nbsp &nbsp"
         					   + "&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp" 
         					   + "&nbsp &nbsp "
         					   + "</font></html>"; 
                             
      String id  =       "<html><font size=\"5\" color=\"F660AB\" face" 
         					   + "=\"American Typewriter\">"
                         + "                      ID INFORMATION                    <br>"
                         + "                                                       	<br>"
                         + "    Programmer: Amber Hilton            <br>"
                         + "    Assignment: PROGRAM #2            <br>"
                         + "    Assignment Name: FILE I/0             <br>"
                         + "    Course # and Title: CISC 190 - Java        <br>"
                         + "    Class Meeting Time	: MW 9:35  - 12:45	     <br>"
                         + "    Instructor: Professor Forman 	     <br>"
                         + "    Hours: 20  			           <br>"
                         + "    Difficulty: 5.6	   	              <br>"                                              
                         + "    Completion Date: November 9, 2015       <br>"
                         + "    Program Name: AmbersFavorite               <br>"
                         +"</font></html>";
                                               
                                           
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
   
      JOptionPane.showMessageDialog(null,id,"I DID ID",JOptionPane.WARNING_MESSAGE,poopGif);   
      JOptionPane.showMessageDialog(null,credits, "THANK YOU!",JOptionPane.WARNING_MESSAGE,poopGif);
      JOptionPane.showMessageDialog(null,stars2,"YOU'RE A STAR!",JOptionPane.WARNING_MESSAGE,poopGif);
      JOptionPane.showMessageDialog(null,graphics,"COOL PICS BRA!",JOptionPane.WARNING_MESSAGE,poopGif);
      
                     
   }   
}        
   
