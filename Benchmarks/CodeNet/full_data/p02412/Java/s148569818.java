import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      
      int end;
      int sum;
      
      int count;
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         
         end = Integer.parseInt(arr[0]);
         sum = Integer.parseInt(arr[1]);
         
         if(end == 0 && sum == 0){
            break;
         }
         
         count = 0;
         
         
         for(int i = 1; i <= end; i++){
            for(int j = i + 1; j <= end; j++){
               for(int k =j + 1; k <= end; k++){
                  if(i+j+k == sum){
                     count++;
                  }
               }
            }
         }
         
         System.out.println(count);
      }  
      
   }//main
}//class