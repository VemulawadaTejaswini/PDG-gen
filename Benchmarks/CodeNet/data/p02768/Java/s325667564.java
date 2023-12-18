import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		long all = BigInteger.valueOf(2).modPow(BigInteger.valueOf(n), BigInteger.valueOf(MOD)).longValue() - 1;

		System.out.println((all - calc(n, a) - calc(n, b) + MOD * 2) % MOD);
	}

	public static long calc(long n, long r) {
		long p = 1;
		long q = 1;

		for (long i = 0; i < r; i++) {
			p = p * (n - i) % MOD;
			q = q * (i + 1) % MOD;
		}

		return BigInteger.valueOf(q).modInverse(BigInteger.valueOf(MOD)).multiply(BigInteger.valueOf(p)).mod(BigInteger.valueOf(MOD)).longValue();
	}
}