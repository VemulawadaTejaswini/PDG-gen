
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		t = new int[n];
		for (int i = 0; i < n; i++)
			t[i] = scanner.nextInt();
		d = new int[3][m];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < 3; j++) {
				int a = scanner.nextInt();
				d[j][i] = a;
			}
		dp = new int[n][m];
		for (int[] dp1 : dp)
			Arrays.fill(dp1, -1);
		int ans = 0;
		for (int i = 0; i < m; i++) {
			if (t[0] < d[0][i] || d[1][i] < t[0])
				continue;
			ans = Math.max(ans, slove(1, i));
		}
		System.out.println(ans);

	}

	private int slove(int day, int x) {
		if (day == n)
			return 0;
		if (dp[day][x] != -1)
			return dp[day][x];
		int ret = 0;
		for (int i = 0; i < m; i++) {
			if (t[day] < d[0][i] || d[1][i] < t[day])
				continue;
			ret = Math
					.max(ret, slove(day + 1, i) + Math.abs(d[2][x] - d[2][i]));
		}

		return dp[day][x]=ret;
	}

	int n, m;
	int[] t;
	int[][] d, dp;
}