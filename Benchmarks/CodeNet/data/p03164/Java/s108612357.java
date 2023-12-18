import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] u = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();

		long[] dp = new long[100001];
		for (int j = 1; j < dp.length; j++) {
			dp[j] = 1000000000000000L;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 100000; j >= v[i]; j--) {
				dp[j] = Math.min(dp[j], dp[j - v[i]] + u[i]);
			}
		}

		for (int j = 100000; j >= 0; j--) {
			if (dp[j] <= w) {
				System.out.println(j);
				return;
			}
		}
	}
}
