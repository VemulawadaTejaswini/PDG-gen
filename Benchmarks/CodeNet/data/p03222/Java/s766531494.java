import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long m = 1000000007;

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int kk = sc.nextInt();

		long[][] dp = new long[h + 1][w];
		dp[0][0] = 1;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 1 << (w - 1); k++) {
					boolean ok = true;
					for (int l = 0; l < w - 2; l++) {
						if (((k >> l) & 1) == 1 && ((k >> (l + 1)) & 1) == 1) {
							ok = false;
						}
					}

					if (!ok) continue;

					if (j >= 1 && ((k >> (j - 1)) & 1) == 1) {
						dp[i + 1][j - 1] = (dp[i + 1][j - 1] + dp[i][j]) % m;

					} else if (j < w - 1 && ((k >> j) & 1) == 1) {
						dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % m;

					} else {
						dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % m;
					}
				}
			}
		}

		System.out.println(dp[h][kk - 1]);
	}
}
