import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int[] dp = new int[n];
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = Math.max(i - k, 0); j < i; j++) {
				min = Math.min(min, dp[j] + Math.abs(h[i] - h[j]));
			}
			dp[i] = min;
		}
		System.out.println(dp[n - 1]);
	}
}
