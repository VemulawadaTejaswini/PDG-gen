import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] arr = sc.nextLine().split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      
      int d = a / b;
      int r = a % b;
      double f = (double)a / (double)b;
      
      System.out.println(d + " " + r + " " + String.format("%.6f",f));
      
    
   }//main
}//class