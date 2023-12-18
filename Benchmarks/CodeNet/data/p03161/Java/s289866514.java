
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
		int k = ni();
		long[] h = new long[110000];
		long[] dp = new long[110000];

		for (int i = 0; i < n; i++) {
			h[i] = ni();
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i] = LNF;
		}

		dp[0] = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 1; j <= k; ++j) {
				dp[i + j] = Util.min(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]));

			}
		}
		System.out.println(dp[n - 1]);
//		debug(dp);
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
		System.out.println(Arrays.deepToString(os));
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
