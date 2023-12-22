import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Eleven Lover
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;

			int N = line.length();
			int[][] dp = new int[N + 1][11];

			for (int i = 0; i < N; i++) {
				int d = line.charAt(i) - '0';
				dp[i + 1][d] = (d > 0 ? 1 : 0);
				for (int j = 0; j < 11; j++) {
					if (dp[i][j] != 0) {
						dp[i + 1][(10 * j + d) % 11] += dp[i][j];
					}
				}
			}

			int ans = 0;

			for (int i = 0; i < N; i++) {
				ans += dp[i + 1][0];
			}

			System.out.println(ans);
		}
	}
}