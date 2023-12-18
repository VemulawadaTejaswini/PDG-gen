import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int c[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int[][][] dp = new int[N][10 * N + 1][10 * N + 1];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 10 * N + 1; j++) {
				for(int k = 0; k < 10 * N + 1; k++) {
					dp[i][j][k] = Integer.MAX_VALUE / 2;
				}
			}
		}
		dp[0][0][0] = 0;
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < 10 * N + 1; j++) {
				for(int k = 0; k < 10 * N + 1; k++) {
					if(j - a[i] >= 0 && k - b[i] >= 0) {
						dp[i + 1][j][k] = Math.min(dp[i + 1][j][k], dp[i][j - (int)a[i]][k - (int)b[i]] + c[i]);
						if(j / Ma == k / Mb || k / Ma == j / Mb) {
							ans = Math.min(ans, dp[i + 1][j][k]);
						}
					}
				}
			}
		}
		
		if(ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}
