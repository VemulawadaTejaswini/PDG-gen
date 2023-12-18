import java.util.*;
import java.lang.*;


public class Main {
	static int h;
	static int w;
	static char[][] masu;
	static long count;
	static boolean[][] used;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		masu = new char[h + 2][w + 2];
		for (int i = 0; i < w + 2; i++) {
			masu[0][i] = 'n';
			masu[h + 1][i] = 'n';
		}
		for (int i = 0; i < h + 2; i++) {
			masu[i][0] = 'n';
			masu[i][w + 1] = 'n';
		}
		for (int i = 1; i <= h; i++) {
			String tmp = sc.next();
			for (int j = 1; j <= w; j++) {
				masu[i][j] = tmp.charAt(j - 1);
			}
		}
		dp = new int[h + 2][w + 2];
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (masu[i][j] == '#') {
					used = new boolean[h + 2][w + 2];
					count += dfs(i, j);
				}
			}
		}
		System.out.println(count);
	}
	static int dfs(int i, int j) {
		int count = 0;
		if (masu[i - 1][j] == '.' && !used[i - 1][j]) {
			count++;
			used[i][j] = true;
			used[i - 1][j] = true;
			if (masu[i - 2][j] == '#' && !used[i - 2][j]) {
				if (dp[i - 2][j] == 0) {
					dp[i - 2][j] = dfs(i - 2, j);
				}
				count += dp[i - 2][j];
			}
			if (masu[i - 1][j - 1] == '#' && !used[i - 1][j - 1]) {
				if (dp[i - 1][j - 1] == 0) {
					dp[i - 1][j - 1] = dfs(i - 1, j - 1);
				}
				count += dp[i - 1][j - 1];
			}
			if (masu[i - 1][j + 1] == '#' && !used[i - 1][j + 1]) {
				if (dp[i - 1][j + 1] == 0) {
					dp[i - 1][j + 1] = dfs(i - 1, j + 1);
				}
				count += dp[i - 1][j + 1];
			}
		}
		if (masu[i + 1][j] == '.' && !used[i + 1][j]) {
			count++;
			used[i][j] = true;
			used[i + 1][j] = true;
			if (masu[i + 2][j] == '#' && !used[i + 2][j]) {
				if (dp[i + 2][j] == 0) {
					dp[i + 2][j] = dfs(i + 2, j);
				}
				count += dp[i + 2][j];
			}
			if (masu[i + 1][j - 1] == '#' && !used[i + 1][j - 1]) {
				if (dp[i + 1][j - 1] == 0) {
					dp[i + 1][j - 1] = dfs(i + 1, j - 1);
				}
				count += dp[i + 1][j - 1];
			}
			if (masu[i + 1][j + 1] == '#' && !used[i + 1][j + 1]) {
				if (dp[i + 1][j + 1] == 0) {
					dp[i + 1][j + 1] = dfs(i + 1, j + 1);
				}
				count += dp[i + 1][j + 1];
			}
		}
		if (masu[i][j + 1] == '.' && !used[i][j + 1]) {
			count++;
			used[i][j] = true;
			used[i][j + 1] = true;
			if (masu[i][j + 2] == '#' && !used[i][j + 2]) {
				if (dp[i][j + 2] == 0) {
					dp[i][j + 2] = dfs(i, j + 2);
				}
				count += dp[i][j + 2];
			}
			if (masu[i - 1][j + 1] == '#' && !used[i - 1][j + 1]) {
				if (dp[i - 1][j + 1] == 0) {
					dp[i - 1][j + 1] = dfs(i - 1, j + 1);
				}
				count += dp[i - 1][j + 1];
			}
			if (masu[i + 1][j + 1] == '#' && !used[i + 1][j + 1]) {
				if (dp[i + 1][j + 1] == 0) {
					dp[i + 1][j + 1] = dfs(i + 1, j + 1);
				}
				count += dp[i + 1][j + 1];
			}
		}
		if (masu[i][j - 1] == '.' && !used[i][j - 1]) {
			count++;
			used[i][j] = true;
			used[i][j - 1] = true;
			if (masu[i][j - 2] == '#' && !used[i][j - 2]) {
				if (dp[i][j - 2] == 0) {
					dp[i][j - 2] = dfs(i, j - 2);
				}
				count += dp[i][j - 2];
			}
			if (masu[i - 1][j - 1] == '#' && !used[i - 1][j - 1]) {
				if (dp[i - 1][j - 1] == 0) {
					dp[i - 1][j - 1] = dfs(i - 1, j - 1);
				}
				count += dp[i - 1][j - 1];
			}
			if (masu[i + 1][j - 1] == '#' && !used[i + 1][j - 1]) {
				if (dp[i + 1][j - 1] == 0) {
					dp[i + 1][j - 1] = dfs(i + 1, j - 1);
				}
				count += dp[i + 1][j - 1];
			}
		}
		return count;
	}
}