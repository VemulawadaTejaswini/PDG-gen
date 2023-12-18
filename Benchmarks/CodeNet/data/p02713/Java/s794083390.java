import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[][] dp = new int[201][201];
		long res = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				int gcd;
				if (dp[i][j] == 0) {
					gcd = gcd(i, j);
					dp[i][j] = gcd;
				} else {
					gcd = dp[i][j];
				}
				for (int k = 1; k <= K; k++) {
					int gcd3;
					if (dp[gcd][k] == 0) {
						gcd3 = gcd(gcd, k);
						dp[gcd][k] = gcd3;
					} else {
						gcd3 = dp[gcd][k];
					}
					res += gcd3;
				}
			}
		}
		System.out.println(res);
	}

	private static int gcd(int i, int j) {
		while (i != 0 && j != 0) {
			if (i < j) {
				j %= i;
			} else {
				i %= j;
			}
		}
		return Math.max(i, j);
	}
}