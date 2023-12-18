
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
		long[][] a = new long[110000][3];
		long[][] dp = new long[110000][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = ni();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if(j==k) continue;
					dp[i+1][k] = Util.max(dp[i+1][k], dp[i][j] + a[i][k]);
				}
			}
		}

		long result = 0;
		for (int i = 0; i < 3; i++) {
			result = Util.max(result, dp[n][i]);
		}
		System.out.println(result);

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
