import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// 14:09-
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int n = sc.nextInt();
		int w = sc.nextInt();

		long[] dp = new long[w + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;

		for (int i = 0; i < n; i++) {
			int wi = sc.nextInt();
			int vi = sc.nextInt();

			for (int j = dp.length - 1 - wi; j >= 0; j--) {
				long val = dp[j];
				if (val != -1) dp[j + wi] = Math.max(dp[j + wi], val + vi);
			}
		}

		long max = -1L;
		for (long val : dp) max = Math.max(max, val);

		System.out.println(max);
	}
}
