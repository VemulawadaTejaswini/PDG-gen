import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String input;
      String[] ab;
      int a,b;
      
      while(true){
         input = sc.nextLine();
         ab = input.split(" " , 0);
         
         a = Integer.parseInt(ab[0]);
         b = Integer.parseInt(ab[1]);
         
         if(a == 0 && b == 0){
            break;
         }else{
            Arrays.sort(ab);
            System.out.println(ab[0] + " " + ab[1]);
         }
      }
      
   
   }//main method      
}//class