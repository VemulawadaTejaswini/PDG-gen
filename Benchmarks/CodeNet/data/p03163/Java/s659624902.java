import java.util.*;

public class Main{
	void solve(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int W = scan.nextInt();
		int[] w = new int[n];
		long[] v = new long[n];
		for(int i = 0; i < n; i++) {
			w[i] = scan.nextInt();
			v[i] = scan.nextInt();
		}
		long[][] dp = new long[n + 1][W + 1];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= W; j++) {
				if(j < w[i]) dp[i + 1][j] = dp[i][j];
				else dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
			}
		}
		System.out.println(dp[n][W]);
		scan.close();
	}

	public static void main(String[] args){
		new Main().solve();
	}
}
 