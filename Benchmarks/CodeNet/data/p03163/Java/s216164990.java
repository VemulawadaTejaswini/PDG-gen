import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] w = new int[N];
		int[] v = new int[N];

		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		long[][] dp = new long[N + 1][W + 1];
		for (int i = 0; i <= W; i++) {
			dp[N][i] = 0;
		}

		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j <= W; j++) {
				if (j < w[i]) {
					dp[i][j] = dp[i + 1][j];
				} else {
					dp[i][j] = Math.max(
							dp[i + 1][j],
							dp[i + 1][j - w[i]] + v[i]);
				}
			}
		}

		out.println(dp[0][W]);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
