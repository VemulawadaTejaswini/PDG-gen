import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		System.out.println(solver(n, a));
	}

	long solver(long n, long a) {
		long ans = n;
		for (int i = 1; i <= 40; ++i) {
			// min ( k1 + k2 + ... ki + a*(i-1) )
			// k1*k2*k3*...*ki>=n
			// 3 * 3 >= 8
			long t = a * (i - 1);
			long maxK = f(i, n);
			long curK = 1;
			for (int j = 0; j < i; ++j) {
				if (curK * pow(maxK - 1, i - j) > 0 && curK * pow(maxK - 1, i - j) < n) {
					t += maxK;
					curK *= maxK;
				} else {
					t += maxK - 1;
					curK *= maxK - 1;
				}
				if (curK < 0) {
					curK = n;
				}
			}
			ans = Math.min(ans, t);
		}
		return ans;
	}

	long f(long i, long n) {
		long ok = n;
		long ng = -1;
		out: while (ok - ng > 1) {
			long middle = (ok + ng) / 2;
			long v = 1;
			for (int k = 0; k < i; ++k) {
				v *= middle;
				if (v < 0) {
					ok = middle;
					continue out;
				}
			}
			if (v >= n) {
				ok = middle;
			} else {
				ng = middle;
			}
		}
		return ok;
	}

	long pow(long a, long n) {
		long ret = 1;
		for (; n > 0; n >>= 1, a *= a) {
			if (n % 2 == 1) {
				ret *= a;
			}
		}
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}