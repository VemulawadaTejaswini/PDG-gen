import java.util.*;
public class Main {
   public static void main(String args[]){
      //declaration and initialization
      Scanner sc = new Scanner(System.in);
      String input[];
      
      //variables for each problem
      String answer;
      int a;
      int b;
      int c;
      int temp;
      
      //reading the intput
      input = sc.nextLine().split(" ",0);
      
      //assginment
      a = Integer.parseInt(input[0]);
      b = Integer.parseInt(input[1]);
      c = Integer.parseInt(input[2]);
      
      //evaluation
      //bubble sort
      if(a > b){
         temp = a;
         a = b;
         b = temp;
      }
      
      if(b > c){
         temp = b;
         b = c;
         c = temp;
      }
      
      if(a > b){
         temp = a;
         a = b;
         b = temp;
      }
            
     //output
     System.out.println(a + " " + b + " " + c);
      
      
      
   }//main
      
}//class