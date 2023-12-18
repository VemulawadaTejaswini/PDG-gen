import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;
	static BigInteger BMOD = new BigInteger(Long.toString(MOD));
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long total = 1;
		long pow = 2;
		for ( int i = 0 ; i < 30 ; i++ ) {
			if ( (n & (1 << i)) != 0 ) {
				total = (total * pow) % MOD;
			}
			pow = (pow * pow) % MOD;
		}

		total = (total + MOD - combination(n, a)) % MOD;
		total = (total + MOD - combination(n, b)) % MOD;

		System.out.println(total - 1);
	}

	public static long combination(long n, long a) {
		long ans = 1;
		for ( int i = 0 ; i < a ; i++ ) {
			ans = (ans * (n - i)) % MOD;
			ans = (ans * (new BigInteger(Integer.toString(i + 1))).modInverse(BMOD).longValue()) % MOD;
		}
		return ans;
	}
}
