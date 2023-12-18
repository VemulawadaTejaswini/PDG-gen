
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	final static long LNF = 1L << 60;
	final static double EPS = 1e-9;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {

		int n = ni();
		long[] h = new long[100010];
		long[] dp = new long[100010];

		for (int i = 0; i < n; i++) {
			h[i] = ni();
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i] = LNF;
		}

		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			dp[i] = Util.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
			if (i > 1) {
				dp[i] = Util.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
			}
		}
		System.out.println(dp[n-1]);
	}

	int ni() {
		return Integer.parseInt(sc.next());
	}

	long nl() {
		return sc.nextLong();
	}

	double nd() {
		return Double.parseDouble(sc.next());
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	static class Util {
		static <T extends Comparable<T>> T max(T a, T b) {
			if (a.compareTo(b) > 0) {
				return a;
			} else {
				return b;
			}
		}

		static <T extends Comparable<T>> T min(T a, T b) {
			if (a.compareTo(b) < 0) {
				return a;
			} else {
				return b;
			}
		}
	}

}
