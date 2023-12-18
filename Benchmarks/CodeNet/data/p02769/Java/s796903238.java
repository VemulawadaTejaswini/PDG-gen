import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;
	static BigInteger BMOD = new BigInteger(Long.toString(MOD));

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long NINV = (new BigInteger(Integer.toString(n))).modInverse(BMOD).longValue();

		long combi = 1;
		long ans = 1;
		for ( int i = 0 ; i < Math.min(n - 1, k) ; i++ ) {
			combi = (combi * (n - i)) % MOD;
			combi = (combi * (new BigInteger(Integer.toString(i + 1))).modInverse(BMOD).longValue()) % MOD;

			long h = (combi * (n - i - 1)) % MOD;
			h = (h * NINV) % MOD;

			long p = (combi * h) % MOD;
			ans = (ans + p) % MOD;
		}

		System.out.println(ans);
	}
}
