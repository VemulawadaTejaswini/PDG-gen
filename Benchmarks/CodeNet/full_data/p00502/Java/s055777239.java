
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
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
		d = new int[m][3];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < 3; j++) {
				int a = scanner.nextInt();
				d[i][j] = a;
			}
		Arrays.sort(d, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		dp = new int[n][m];
		for (int[] dp1 : dp)
			Arrays.fill(dp1, -1);
		int ans = 0;
		for (int i = 0; i < m; i++) {
			if (d[i][0] <= t[0] && t[0] <= d[i][1]) {
				ans = slove(1, i);
				break;
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			if (d[i][0] <= t[0] && t[0] <= d[i][1]) {
				ans = Math.max(ans, slove(1, i));
				break;
			}
		}
		System.out.println(ans);

	}

	private int slove(int day, int x) {
		if (day == n)
			return 0;
		if (dp[day][x] != -1)
			return dp[day][x];
		int ret = 0;
		for (int i = m - 1; i >= 0; i--) {
			if (d[i][0] <= t[day] && t[day] <= d[i][1]) {
				ret = Math.max(ret,
						slove(day + 1, i) + Math.abs(d[i][2] - d[x][2]));
				break;
			}
		}
		for (int i = 0; i < m; i++) {
			if (d[i][0] <= t[day] && t[day] <= d[i][1]) {
				ret = Math.max(ret,
						slove(day + 1, i) + Math.abs(d[i][2] - d[x][2]));
				break;
			}
		}

		return dp[day][x] = ret;
	}

	int n, m;
	int[] t;
	int[][] d, dp;
}