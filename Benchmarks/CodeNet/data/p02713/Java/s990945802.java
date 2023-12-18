import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();

		long gcd = 0;

		long sum = 0;

		for (int ai = 1; ai <= k; ai++) {
			for (int bi = 1; bi <= k; bi++) {
				for (int ci = 1; ci <= k; ci++) {
					gcd = getGcd(getGcd(ai, bi), ci);
					sum += gcd;
				}
			}
		}

		System.out.println(sum);
	}

	private static long getGcd(long x, long y) {

		long bigger = Math.max(x, y);
		long smaller = Math.min(x, y);

		long mod = bigger % smaller;

		while (mod != 0) {
			bigger = smaller;
			smaller = mod;
			mod = bigger % smaller;
		}

		return smaller;
	}

}
