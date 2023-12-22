
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] num = new int[n][2];
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE);
			dp[i][i] = 0;
			num[i][0] = scanner.nextInt();
			num[i][1] = scanner.nextInt();
		}
		for (int w = 1; w < n; w++) {
			for (int i = w; i < n; i++) {
				for (int j = i - w; j < i; j++) {
					int c = num[i - w][0] * num[j][1] * num[j + 1][0]
							* num[i][1];
					dp[i - w][i] = Math.min(dp[i - w][i], dp[i - w][j]
							+ dp[j + 1][i] + c);
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}
}