import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Princess's Gamble
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			int[][] dp = new int[N][2];
			int expected = 0;

			for (int i = 0; i < N; i++) {
				line = br.readLine();
				dp[i][0] = parseInt(line.substring(0, line.indexOf(' ')));
				dp[i][1] = parseInt(line.substring(line.indexOf(' ') + 1));
				expected += dp[i][0] * dp[i][1];
			}

			Arrays.sort(dp, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[1], o2[1]);
				}
			});

			for (int i = N - 1; i >= 0; i--) {
				if (dp[i][0] <= M) {
					expected -= dp[i][0] * dp[i][1];
					M -= dp[i][0];
				} else if (dp[i][0] > M) {
					expected -= M * dp[i][1];
					M = 0;
				}
				if (M == 0) break;
			}

			System.out.println(expected);

		} //end while
	} //end main
}