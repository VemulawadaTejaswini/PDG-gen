
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int D = scanner.nextInt();
			int N = scanner.nextInt();
			if ((D | N) == 0)
				break;
			int[] a = new int[N];
			int[] e = new int[N];
			int[] r = new int[N];
			for (int i = 0; i < N; i++) {
				int aa = scanner.nextInt();
				int ee = scanner.nextInt();
				int rr = scanner.nextInt();
				a[i] = aa;
				e[i] = ee;
				r[i] = rr;
			}
			int[][] dp = new int[D + 1][101];
			for (int[] d : dp)
				Arrays.fill(d, INF);
			dp[D][0] = 0;
			for (int i = D; i > 0; i--) {
				for (int j = 0; j <= 100; j++) {
					if (dp[i][j] == INF)
						continue;
					for (int k = 0; k < N; k++) {
						if (j < r[k])
							continue;
						dp[Math.max(0, i - a[k])][Math.min(100, j + e[k])] = Math
								.min(dp[Math.max(0, i - a[k])][Math.min(100, j
										+ e[k])], dp[i][j] + 1);
					}
				}
			}
			int ret = INF;
			for (int i = 0; i < 101; i++)
				ret = Math.min(ret, dp[0][i]);
			System.out.println(ret == INF ? "NA" : ret);
		}

	}

	int INF = 1 << 30;
}