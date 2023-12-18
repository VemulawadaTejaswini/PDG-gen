
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), h[] = new int[n];
		long dp[] = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			long a = Integer.MAX_VALUE;
			if (i - 1 >= 0)
				a = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
			long b = Integer.MAX_VALUE;
			if (i - 2 >= 0)
				b = dp[i - 2] + Math.abs(h[i - 2] - h[i]);
			dp[i] = Long.min(a, b);
		}
		System.out.println(dp[n - 1]);
		sc.close();
	}
}
