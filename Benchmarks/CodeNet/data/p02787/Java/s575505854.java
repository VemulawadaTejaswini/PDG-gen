import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		long[] dp = new long[20000];
		Arrays.fill(dp, 1000000000);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= a[i]; j++) {
				dp[j] = Math.min(dp[j], b[i]);
			}
			for (int j = 0; j <= h; j++) {
				dp[j + a[i]] = Math.min(dp[j + a[i]], dp[j] + b[i]);
			}
		}
		System.out.println(dp[h]);
	}
}
