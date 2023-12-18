
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] cs = sc.next().toCharArray();
		int ans = 0;
		int[][] dp = new int[N][N];
		for (int s = N - 1; s >= 0; --s) {
			for (int t = N - 1; t > s; --t) {
				if (cs[s] != cs[t])
					continue;
				dp[s][t] = 1 + (s + 1 < N && t + 1 < N ? dp[s + 1][t + 1] : 0);
				dp[s][t] = Math.min(dp[s][t], t - s);
			}
		}
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				ans = Math.max(ans, dp[i][j]);
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
