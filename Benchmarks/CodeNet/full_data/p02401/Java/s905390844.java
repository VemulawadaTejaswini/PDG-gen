import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int a;
      int b;
      String op;
      int answer;
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         
         a = Integer.parseInt(arr[0]);
         b = Integer.parseInt(arr[2]);
         
         op = arr[1];
         
         if(op.equals("?")){
            break;
         }
         
         if(op.equals("+")){
            answer = a + b;
         }else if(op.equals("-")){
            answer = a - b;
         }else if(op.equals("*")){
            answer = a * b;
         }else{//if(op.equals("/"))
            answer = a / b;
         }
         System.out.println(answer);
         
      }
      
   }//main
}//class