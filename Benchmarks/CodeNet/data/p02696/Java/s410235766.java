import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();
			long maxn = 0;
			long maxb = 0;
			
			maxn = Math.max(calc(a,b,n), calc(a,b,(n-1)));
			
			if(b<n) {
				maxb = Math.max(calc(a,b,b), calc(a,b,(b-1)));
			}
			
			System.out.println(Math.max(maxn, maxb));
			
			
		}
		
		static long calc(long a,long b, long n) {
			long res = 0;
			
			res = ((a*n)/b)-((n/b)*a);
			return res;
		}
		
	}
