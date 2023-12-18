
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if (N <= 1) {
			System.out.println(0);
			return;
		}
		long M = in.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextLong() / 2l;
		}
		long x = a[0];
		for (int i = 1; i < N; i++) {
			x = lcm(x, a[i]);
			if (x > M) {
				System.out.println(0);
				return;
			}
		}

		long count = 0;
		for (long i = 1; (i * x) <= M; i += 2l) {
			count++;
		}
		System.out.println(count);
		in.close();
	}

	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
}