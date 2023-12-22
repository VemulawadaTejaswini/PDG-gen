/*
 *           AUTHOR: Maria Theresa M. Padayhag
 *             DATE: 20160326
 *  PRE-REQUIREMENT: JDK 1.8
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class RomanFigure
{
   private final int arabic_number;
   
   public RomanFigure( String romanNumeral ) throws Exception
   {
      if( romanNumeral.length() == 0 ) {
         throw new Exception();
      }
      
      int tmp_arabic_number = 0;
      
      for( int i = 0; i < romanNumeral.length(); ) {
         char letter = romanNumeral.charAt( i );  
         int number  = letterToNumber( letter );  
         
         if(number < 0) {
            throw new Exception();
         } else {
            i++;
            if (i == romanNumeral.length()) {
               tmp_arabic_number += number;
            } else {
               int nextNumber = letterToNumber(romanNumeral.charAt(i));
               if (nextNumber > number) {
                  tmp_arabic_number += (nextNumber - number);
                  i++;
               } else {
                  tmp_arabic_number += number;
               }
            }               
         }
      }
      
      arabic_number = tmp_arabic_number;
   }
   
   public final int toArabic() 
   {
      return arabic_number;
   }
   
   private int letterToNumber( char letter ) 
   {
      switch ( letter ) {
         case 'I':  return 1;
         case 'V':  return 5;
         case 'X':  return 10;
         case 'L':  return 50;
         case 'C':  return 100;
         case 'D':  return 500;
         case 'M':  return 1000;
         default:   return -1;
        }
    }
}


public class Main
{
   public static void main( String args[] ) throws IOException
   {
      BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
      String input;
      RomanFigure rf;
      
      READ: 
      while( ( input = br.readLine() ) != null && input.length() !=0) {
         try {
            rf = new RomanFigure(input);
            System.out.println(rf.toArabic());
         } catch( Exception e ) {
            System.out.println("Invalid input.");
            continue READ;
         }      
      }
   }
}