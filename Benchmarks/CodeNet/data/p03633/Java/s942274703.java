import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}
		sc.close();

		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans = lcm(ans, t[i]);
		}
		System.out.println(ans);
	}

	static long lcm(long a, long b) {
		BigInteger ba = BigInteger.valueOf(a);
		BigInteger bb = BigInteger.valueOf(b);
		return ba.multiply(bb).divide(ba.gcd(bb)).longValue();
	}
}
