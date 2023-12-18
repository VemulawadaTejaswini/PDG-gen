import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		final long M = 1_000_000_007;

		long[][] c = new long[n + 2][n + 2];
		c[0][0] = 1;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				c[i + 1][j] = (c[i + 1][j] + c[i][j]) % M;
				c[i + 1][j + 1] = (c[i + 1][j + 1] + c[i][j]) % M;
			}
		}

		for (int i = 1; i <= k; i++) {
			System.out.println((c[n - k + 1][i] * c[k - 1][i - 1]) % M);
		}
	}
}
