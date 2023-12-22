import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;

	public static void main(String[] args) {
		int M = sc.nextInt();
		N = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < M; ++i) {
			boolean[] a = new boolean[N];
			for (int j = 0; j < N; ++j) {
				a[j] = sc.nextInt() == 1;
				if (i != 0) a[j] = !a[j];
			}
			ans += solve(a);
		}
		System.out.println(ans);
	}

	static int solve(boolean[] a) {
		int[][] dp = new int[N][N];
		for (int i = 0; i < N; ++i) {
			int cur = a[i] ? 1 : 0;
			if (i != 0) cur = 1 - cur;
			if (i != N - 1) cur = 1 - cur;
			dp[i][i] = cur;
		}
		for (int len = 1; len < N; ++len) {
			for (int left = 0; left + len < N; ++left) {
				{
					int cur = a[left] ? 1 : 0;
					if (left != 0) cur = 1 - cur;
					dp[left][left + len] = cur + dp[left + 1][left + len];
				}
				for (int next = left + 1; next < left + len; ++next) {
					dp[left][left + len] = Math.max(dp[left][left + len], (a[next] ? 1 : 0) + dp[left][next - 1]
							+ dp[next + 1][left + len]);
				}
				{
					int cur = a[left + len] ? 1 : 0;
					if (left + len != N - 1) cur = 1 - cur;
					dp[left][left + len] = Math.max(dp[left][left + len], cur + dp[left][left + len - 1]);
				}
			}
		}
		return dp[0][N - 1];
	}
}