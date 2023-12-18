import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
	long[] dp;
		int now = 0;
		int a[] = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		long ans = 1;
		long w = 1000000007;
		for (int i = 0; i < m; i++) {
			if (a[i] - now > 2) {
				dp = new long[a[i] - now];
				dp[0] = 0;
				dp[1] = 1;
				dp[2] = 2;
				for (int j = 3; j < a[i] - now; j++) {
					dp[j] = dp[j - 1] + dp[j - 2];
				}
				ans = (long) (ans * dp[a[i] - now - 1]) % w;
				now = a[i] + 1;
			} else if (a[i] - now > 0) {
				ans = (long) (ans * (a[i] - now)) % w;
				now = a[i] + 1;
			} else {
				ans = 0;
				break;
			}
		}
		if (n - now + 1 > 2) {
			dp = new long[n - now + 1];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			for (int j = 3; j < n - now + 1; j++) {
				dp[j] = dp[j - 1] + dp[j - 2];
			}
			ans = (long) (ans * dp[n - now]) % w;
		} else if (n - now + 1 > 0) {
			ans = (long) (ans * (n - now)) % w;
		} else {
			ans = 0;
		}
		System.out.println(ans);
	}
}
