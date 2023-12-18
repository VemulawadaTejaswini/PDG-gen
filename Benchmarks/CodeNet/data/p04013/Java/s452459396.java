import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		List<Integer> x = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			x.add(scanner.nextInt());
		}

		long ans = 0;
		long[][][] dp = new long[n + 1][n + 1][n * a + 1];
		dp[0][0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n * a; k++) {
					if (j - 1 >= 0 && k - x.get(i - 1) >= 0) {
						dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x.get(i - 1)];
					} else {
						dp[i][j][k] = dp[i - 1][j][k];
					}

				}
			}
		}

		for (int j = 1; j <= n; j++) {
			ans += dp[n][j][a * j];

		}

		System.out.println(ans);
	}
}