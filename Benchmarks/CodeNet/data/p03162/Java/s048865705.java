import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] activity = new int[n][3];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				activity[i][j] = kb.nextInt();
			}
		}
		int[][] dp = new int[n][3];
		dp[0][0] = activity[0][0];
		dp[0][1] = activity[0][1];
		dp[0][2] = activity[0][2];
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(k == j) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + activity[i][j]);
				}
			}
		}
		int max = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
		System.out.println(max);
	}
}
