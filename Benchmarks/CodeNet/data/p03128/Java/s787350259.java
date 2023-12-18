import java.util.*;

public class Main {
	static final int[] COUNTS = new int[]{0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	static int[] dp;
	static int[] mCount;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		mCount = new int[m];
		for (int i = 0; i < m; i++) {
			mCount[i] = COUNTS[arr[i]];
		}
		dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			dp[i] = dfs(i);
		}
		int length = dp[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < m; j++) {
				int a = mCount[m - 1 - j];
				if (dp[n] == dfs(n - a) + 1) {
					n -= a;
					sb.append(arr[m - 1 - j]);
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
	static int dfs(int x) {
		if (x < 0) {
			return -1;
		} else if (x == 0) {
			return 0;
		}
		if (dp[x] != 0) {
			return dp[x];
		}
		int max = Integer.MIN_VALUE;
		for (int a : mCount) {
			int y = dfs(x - a);
			if (max < y + 1) {
				max = y + 1;
			}
		}
		if (max == 0) {
			max = -1;
		}
		return max;
	}
}
