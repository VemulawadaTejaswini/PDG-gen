import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] c = nextIntArray(sc, m);

		sc.close();

		int[][] dp = new int[m + 1][n + 1]; // dp[i][j] i-1番目の種類まで使用してj円となるように選んだ時のコイン枚数の最小値
		for (int i = 0; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = 100100100;
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j <= n; j++) {

				dp[i + 1][j] = dp[i][j];

				if (j >= c[i]) {
					dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i + 1][j - c[i]] + 1);
				}

			}
		}

		out.println(dp[m][n]);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}

