import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char temp;
      
      for(int i = 0; i < str.length(); i ++){
         temp = str.charAt(i);
         if(Character.isUpperCase(temp)){
            temp = Character.toLowerCase(temp);
         }else{
            temp = Character.toUpperCase(temp);
         }
         System.out.print(temp);
      }
      System.out.println();
   }//main
}//class