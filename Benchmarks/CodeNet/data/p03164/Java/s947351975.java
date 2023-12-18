import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[N];
		int v[] = new int[N];
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		int dp[][] = new int[N + 1][N * 100 + 1];
		for(int i = 0; i <= N; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
		}
		dp[0][0] = 0;
		
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= N * 100; j++) {
				if(j - v[i - 1] >= 0) {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v[i - 1]] + w[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
			if(i == N) {
				for(int j = 0; j <= N * 100; j++) {
					if(dp[N][j] <= W) {
						ans = Math.max(ans, j);
					} else {
						//System.out.println(j);
					}
				}
			}
		}
		System.out.println(ans);
		
	}
}
