import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limW = sc.nextInt();
        int[] w = new int[n+1], v = new int[n+1];
        for(int i = 1; i <= n; i++) {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        }

        System.out.println(solve(n, limW, w, v));

    }

	private static long solve(int n, int limW, int[] w, int[] v) {
		long[][] dp = new long[n+1][limW+1];

		for(int i = 0; i < limW; i++) {
			dp[0][i] = 0;
		}

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= limW; j++) {
				if(j < w[i]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
				}

			}
		}
		long maxValue = dp[n][limW];
		return maxValue;

	}
}