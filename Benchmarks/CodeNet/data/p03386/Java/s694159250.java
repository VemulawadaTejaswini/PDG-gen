import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = C;
      System.out.println(A);
      for(;C>1;C--){
        A++;
        System.out.println(A);
      }
      System.out.println(B);
      for(;D>1;D--){
        B--;
      System.out.println(B);
      }
   }
 }
