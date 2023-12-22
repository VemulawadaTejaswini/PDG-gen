import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int width = Integer.parseInt(sc.nextLine());
      int n = Integer.parseInt(sc.nextLine());
      String[] arr;
      int a;
      int b;
      int[] lot = new int[width];
      for(int i = 0; i < width; i ++){
         lot[i] = i + 1;
      }
      
      int temp;
      
      for(int i = 0; i < n; i ++){
         arr = sc.nextLine().split(",");
         a = Integer.parseInt(arr[0]);
         b = Integer.parseInt(arr[1]);
         
         temp = lot[a-1];
         lot[a-1] = lot[b-1];
         lot[b-1] = temp;
      }
      
      for(int i = 0; i < width; i ++){
         System.out.println(lot[i]);
      }
      
   }//main
}//class