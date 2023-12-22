import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int cnt = 1;
		while(true) {
			int W = in.nextInt();
			if(W == 0) return;
			int N = in.nextInt();
			int v[] = new int[N+1];
			int w[] = new int[N+1];
			in.nextLine();
			for(int i=1;i<=N;i++) {
				String[] strs = in.nextLine().split(",");
				v[i] = Integer.parseInt(strs[0]);
				w[i] = Integer.parseInt(strs[1]);
			}
			System.out.println("Case "+cnt+":");
			solve(W, N, v, w);
			cnt++;
		}
	}

	public static void solve(int W, int N, int[] v, int[] w) {
		int[][] dp = new int[N+2][W+2];
		for(int i=0;i<N+2;i++) dp[0][i] = 0;

		for(int i=1;i<=N;i++) {
			for(int j=1;j<=W;j++) {
				dp[i][j] = dp[i-1][j];
				if(j-w[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j - w[i]] + v[i], dp[i - 1][j]);
				}
			}
		}
		int ans_V = 0;
		int ans_W = Integer.MAX_VALUE / 2;
		for(int i=0;i<=W;i++) {
			if(ans_V < dp[N][i]) {
				ans_V = dp[N][i];
				ans_W = i;
			}
		}
		System.out.println(ans_V);
		System.out.println(ans_W);
	}
}