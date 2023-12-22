import java.util.Scanner;

public class Main {
	static final long mod = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextInt();
			long ans = modPow(10L, n) + modPow(8L, n) - 2 * modPow(9L, n);
			System.out.println((ans + mod * 2) % mod);
		}
	}

	static long modPow(long n, long r) {
		if (r == 1) {
			return n % mod;
		}
		long div = r / 2;
		long retVal = modPow(n, div);
		retVal = retVal * retVal % mod;
		if (r % 2 == 0) {
			return retVal;
		} else {
			return retVal * n % mod;
		}
	}
}