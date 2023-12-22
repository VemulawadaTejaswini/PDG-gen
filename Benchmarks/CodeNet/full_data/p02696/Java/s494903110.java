import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();
			
			System.out.println(Math.max(calc(a,b,n), calc(a,b,(n-1))));
			
			
		}
		
		static long calc(long a,long b, long n) {
			long res = 0;
			
			res = ((a*n)/b)-((n/b)*a);
			return res;
		}
		
	}
