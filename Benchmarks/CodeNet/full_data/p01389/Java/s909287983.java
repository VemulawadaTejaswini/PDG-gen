import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] dp = new int[h + 1][w + 1];
		for (int i = 0; i <= h; i++) {
			Arrays.fill(dp[i], INF);
		}
		for (int i = 1; i <= h; i++) {
			char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < tmp.length; j++) {
				dp[i][j + 1] = tmp[j] - '0';
			}
		}
		dp[0][1] = dp[1][0] = 0;

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		System.out.println(dp[h][w]);
	}
}