import java.util.*;
 public class Main {
	public static void main(String[] args){
      int  A = 2;
      int  B = 2;
      int  C = 1;
      int  K = 3;

      int sum = 0;
     
      if(A >= K){
         sum = K;
         System.out.println(sum);

      }else if(A + B >= K){
         sum = A;
         System.out.println(sum);

      }else{
         sum = (A - (K - A - B));
         System.out.println(sum);
      }
   }
 }








