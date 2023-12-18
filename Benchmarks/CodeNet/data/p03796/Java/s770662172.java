

import java.util.Scanner;

public class Main{
	static int A = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(N));
	}
	
		public static long factorial(int a) {
		      long fact = 1;
		      long i = 1;
		      while(i <= a) {
		         fact *= i;
		         i++;
		         fact%=A;
		      }
		      return fact%=A;
		   }
}
