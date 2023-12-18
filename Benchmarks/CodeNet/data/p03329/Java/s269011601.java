import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] dp = new int[100100];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			dp[i] = Math.min(dp[i], dp[i - 1] + 1);
			for (int j = 1; j < n; j++) {
				if(i - Math.pow(6, j) >= 0) dp[i] = Math.min(dp[i], dp[i - (int)Math.pow(6, j)] + 1);
				else break;
			}
			for (int k = 1; k < n; k++) {
				if(i - Math.pow(9, k) >= 0) dp[i] = Math.min(dp[i], dp[i - (int)Math.pow(9, k)] + 1);
				else break;
			}
		}

		System.out.println(dp[n]);
	}
}