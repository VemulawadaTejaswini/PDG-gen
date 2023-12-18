import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
        	h[i] = sc.nextInt();
        }

        System.out.println(solve(n,k,h)[n-1]);

    }



	private static long[] solve(int n, int k, int[] h) {
		long[] dp = new long[n];
		Arrays.fill(dp, Long.MAX_VALUE);

		dp[0] = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i-j < 0)
					break;

				dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(h[i-j]-h[i]));
			}
		}

		return dp;

	}
}