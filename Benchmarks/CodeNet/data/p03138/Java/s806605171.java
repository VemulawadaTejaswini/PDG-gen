import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long f(long x) {
		long result = 0;
		for (long n : a) {
			result += x ^ n;
		}
		return result;
	}

	long f(long x, long mask) {
		long result = 0;
		for (long n : a) {
			result += (x ^ n) & mask;
		}
		return result;
	}

	int N;
	long K;
	long[] a;

	// t ここまで最大
	long rec(long x, long mask) {
		if (mask == 0) {
			return f(0, 0);
		}

		if ((x & mask) == 0) {
			return f(x, mask) + rec(x, mask >> 1);
		} else {
			long a1, a2;

			a1 = f(mask, mask) + rec(x, mask >> 1);
			a2 = f(0, mask) + rec(mask - 1, mask >> 1);

			return Math.max(a1, a2);
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		K = sc.nextLong();

		a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		if (K == 0) {
			out.println(f(0));
		} else {
			long ans = rec(K, Long.highestOneBit(K));
			out.println(ans);
		}
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
