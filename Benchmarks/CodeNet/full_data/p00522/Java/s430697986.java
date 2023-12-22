
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[] manju = new int[m];
		for (int i = 0; i < m; i++)
			manju[i] = scanner.nextInt();
		int[] dp = new int[m + 1];
		Arrays.fill(dp, 1 << 30);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			int c = scanner.nextInt();
			int e = scanner.nextInt();
			for (int j = m; j >= 0; j--) {
				int a = Math.max(0, j - c);
				dp[j] = Math.min(dp[j], dp[a] + e);
			}
		}
		Arrays.sort(manju);
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += manju[m - i - 1];
			ans = Math.max(ans, sum - dp[i + 1]);
		}
		System.out.println(ans);
	}
}