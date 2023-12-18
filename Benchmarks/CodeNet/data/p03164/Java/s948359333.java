import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);

		int w[] = new int[110];
		int v[] = new int[110];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			w[i] = Integer.parseInt(str[0]);
			v[i] = Integer.parseInt(str[1]);
		}

		long dp[][] = new long[110][100100];
		for (int i = 0; i < 110; i++) {
			for (int j = 0; j < 100100; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		dp[0][0] = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 100100; j++) {
				if (j - v[i] >= 0)
					dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);

				dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
			}
		}

		int ans = 0;
		for (int i = 0; i < 100100; i++) {
			if (dp[N][i] <= W) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
