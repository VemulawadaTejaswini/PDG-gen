import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limW = sc.nextInt();
        int[] w = new int[n+1], v = new int[n+1];
        int sumV = 0;
        for(int i = 1; i <= n; i++) {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        	sumV += v[i];
        }

        System.out.println(solve(n, limW, w, v, sumV));

    }

	private static long solve(int n, int limW, int[] w, int[] v, int sumV) {
		long[][] dp = new long[n+1][sumV+1];
		Arrays.fill(dp[0], Long.MAX_VALUE);
		dp[0][0] = 0;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= sumV; j++) {
				if(j < v[i]) {
					dp[i][j] = dp[i-1][j];
				}else if(dp[i-1][j-v[i]] != Long.MAX_VALUE){
					dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-v[i]]+w[i]);
				}else {
					dp[i][j] = dp[i-1][j];
				}

			}
		}

		long maxValue=-1;
		for(int i = dp[0].length -1; i >= 0; i--) {
			if(dp[n][i] <= limW) {
				maxValue = i;
				break;
			}
		}

		return maxValue;

	}
}