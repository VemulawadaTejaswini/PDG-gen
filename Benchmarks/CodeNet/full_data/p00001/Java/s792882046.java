import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] height = new int[10];
      
      for(int i = 0; i < 10; i ++){
         height[i] = Integer.parseInt(sc.nextLine());
      }
      
      Arrays.sort(height);
      
      System.out.println(height[9]);
      System.out.println(height[8]);
      System.out.println(height[7]);
      
   }//main
}//class