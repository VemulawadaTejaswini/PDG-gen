import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H+2][W+2];
		char[] a = new char[W];
		for(int i = 1; i <= H; i++) {
			a = sc.next().toCharArray();
			for(int j = 1; j <= W; j++)
				A[i][j] = a[j-1];
		}
		int ans = 0;
		int INF = 100000000;
		int[][] dp = new int[H+2][W+2];
		for(int i = 0; i <= H+1; i++)
			Arrays.fill(dp[i], INF);
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				if(A[i][j] == '#')
					dp[i][j] = 0;
			}
		}
		while(true) {
			boolean ok = true;
			for(int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if(dp[i][j] >= INF) {
						ok = false;
						dp[i][j] = Math.min(dp[i+1][j]+1,Math.min(dp[i-1][j]+1, Math.min(dp[i][j-1]+1, dp[i][j+1]+1)));
					}
				}
			}
			if(ok)
				break;
		}
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				ans = Math.max(ans, dp[i][j]);
			}
		}
		System.out.println(ans);
	}

}