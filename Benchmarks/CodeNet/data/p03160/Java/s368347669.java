import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h[] = new int[N+1];
		long dp[] = new long[N+1];
		for (int i = 1; i <= N; i++) {
			h[i] = sc.nextInt();
		}

		Arrays.fill(dp,1,N + 1, Integer.MAX_VALUE);
		dp[1] = 0;

		for (int i = 1; i < N; i++){
			if (i <= N-2) {
				dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(h[i] - h[i + 2]));
			}
			dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(h[i] - h[i + 1]));
		}
	  System.out.println(dp[N]);
	}
}
