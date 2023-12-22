import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static final String EOF = "END_OF_TEXT";
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      int n;
      int h;
      
      while(true){
         str = sc.nextLine();
         if(str.equals("-")){
            break;
         }
         n = Integer.parseInt(sc.nextLine());
         
         while(n > 0){
            h = Integer.parseInt(sc.nextLine());
            str = str.substring(h) + str.substring(0,h);
            n--;
         }
         System.out.println(str);
      }
   }//main
   
   
}//class
