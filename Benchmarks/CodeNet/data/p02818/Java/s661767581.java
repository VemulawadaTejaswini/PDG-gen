import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int N = sc.nextInt();

      while(N > 0){
       if(A > 0){
        A--; N--;
       }else{
        B--; N--;
       }
 
       if(A = 0 && B = 0){
        N--;
       }
      }

      System.out.print(A);
      System.out.print(B);
   }
 }