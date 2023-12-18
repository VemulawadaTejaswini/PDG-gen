import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();
			long max = 0;
			
			for(long i=1;i<=n;i++) {
				max = Math.max(max, calc(a,b,i));
			}
			
			System.out.println(max);
			
		}
		
		static long calc(long a,long b, long n) {
			long res = 0;
			
			res = ((a*n)/b)-((n/b)*a);
			return res;
		}
		
	}
