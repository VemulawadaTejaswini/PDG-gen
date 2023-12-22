import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		int mod = 998244353;
		long[][] dp1 = new long[c + 1][d + 1];
		long[][] dp2 = new long[c + 1][d + 1];
		for (int i = 1; i <= b; i++) {
			dp1[a][i] = 1;
		}
		for (int i = b + 1; i <= d; i++) {
			dp1[a][i] = dp1[a][i - 1] * a % mod;
		}

		for (int i = a + 1; i <= c; i++) {
			for (int j = 1; j <= d; j++) {
				dp1[i][j] = (dp1[i - 1][j] + dp2[i - 1][j]) * j % mod;
				if (j > b) {
					dp2[i][j] = (dp2[i][j - 1] * i + dp1[i][j - 1]) % mod;
				}
			}
		}
		System.out.println((dp1[c][d] + dp2[c][d]) % mod);
	}
}
