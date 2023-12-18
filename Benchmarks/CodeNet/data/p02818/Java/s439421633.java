import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();

      if(A + B <= K){
       A = 0;B = 0;
       System.out.println(A + " " + B);

      }else if(A >= K && K < A + B){
       System.out.println((A - K) + " " + B);

      }else{
        A = 0;
       System.out.println("0 " + (B - (K - A)));

      }
   }
 }