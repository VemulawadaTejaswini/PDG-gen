import java.util.*;

public class Main {
	final int MOD = 100000000;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;
	Scanner sc = new Scanner(System.in);


	void doIt() {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[N + 1];
		int v[] = new int[N + 1];
		long dp[][] = new long[N + 1][1001];
		for(int i = 1; i <= N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		Arrays.fill(dp[0], (long)1e9 + 1);
		dp[0][0] = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= 1000; j++) {
				dp[i][j] = dp[i - 1][j];
				if(j - v[i] >= 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
				}
			}
		}
		//for(int i = 0; i <= N; i++) {
			//for(int j = 0; j < 150; j++) {
			//	System.out.println(j + " " + dp[N][j] + " ");
			//}
			//System.out.println();
		//}
		for(int i = 1000; i >= 0; i--) {
			if(dp[N][i] <= W) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}