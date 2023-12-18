import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int m = Integer.parseInt(in.next());
		char[][] original = new char[n][m];
		for(int i = 0; i < n; i++) {
			original[i] = in.next().toCharArray();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(original[i][j] == '.') {
					ans = Math.max(ans, solve(i, j, original, n, m));
				}
			}
		}
		System.out.println(ans);
	}
	public static int solve(int ii, int jj, char[][] original, int x, int y) {
		int[][] visited = new int[x][y];
		int[][] dp = new int[x][y];
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				dp[i][j] = 1000000;
		dp[ii][jj] = 0;
		int max = 0;
		while(true) {
			int min = 1000000;
			int xx = -1;
			int yy = -1;
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					if((dp[i][j] != 1000000) && (visited[i][j] == 0)) {
						if(dp[i][j] < min) {
							min = dp[i][j];
							xx = i;
							yy = j;
							max = Math.max(max, dp[i][j]);
						}
					}
				}
			}
			if(xx == -1) break;
			else {
				visited[xx][yy] = 1;
				if(xx - 1 >= 0) {
					if(original[xx - 1][yy] == '.') {
						dp[xx - 1][yy] = Math.min(dp[xx - 1][yy], dp[xx][yy] + 1);
					}
				}
				if(xx + 1 < x) {
					if(original[xx + 1][yy] == '.') {
						dp[xx + 1][yy] = Math.min(dp[xx + 1][yy], dp[xx][yy] + 1);
					}
				}
				if(yy - 1 >= 0) {
					if(original[xx][yy - 1] == '.') {
						dp[xx][yy - 1] = Math.min(dp[xx][yy - 1], dp[xx][yy] + 1);
					}
				}
				if(yy + 1 < y) {
					if(original[xx][yy + 1] == '.') {
						dp[xx][yy + 1] = Math.min(dp[xx][yy + 1], dp[xx][yy] + 1);
					}
				}
			}
		}
		return max;
	}
}