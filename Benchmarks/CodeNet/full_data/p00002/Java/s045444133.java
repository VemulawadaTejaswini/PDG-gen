import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      
      while(sc.hasNext()){
         str = sc.nextLine();
         arr = str.split(" ");
         int a = Integer.parseInt(arr[0]);
         int b = Integer.parseInt(arr[1]);
      
         System.out.println((int)Math.log10(a+b)+1);
      }
   }//main
}//class