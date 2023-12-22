import java.util.Scanner;

 
public class Main {

	static long mod = (long) (Math.pow(10, 9) + 7);
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n  = sc.nextLong();
		
		long temp1 = (power(9, n) + power(9, n) - power(8, n)) % mod; 
		long ans = (power(10, n) - temp1) % mod;
		
		System.out.println(ans % mod);
		sc.close();
	}
	
	private static long power(long x, long y) {
		long culc = 1;
		
		for(long i = 0; i < y; i++) {
			culc = culc * x % mod; 
		}

		return culc;
	}
}


