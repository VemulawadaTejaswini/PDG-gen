import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
         
      int N = sc.nextInt();
      
      int n = (int)Math.pow(3,N);
      
      int sum = 1;
      for(int i = 0;i < N;i++){
          int a = sc.nextInt();
          if(a%2 == 0){
              sum *=2;
          }else{
              sum *= 1;
          }          
      }
           
      System.out.println(n - sum);
      
   }
}
        