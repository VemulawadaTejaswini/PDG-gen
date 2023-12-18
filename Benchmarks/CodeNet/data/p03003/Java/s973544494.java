import java.util.Scanner;

public class Main {
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.nextInt();
		}

		long[][] dp = new long[s.length + 1][t.length + 1];
		long[][] sum = new long[s.length + 1][t.length + 1];
		dp[0][0] = 1;

		for (int i = 1; i <= s.length; i++) {
			for (int j = 1; j <= t.length; j++) {
				if (s[i - 1] == t[j - 1]) {
					dp[i][j] = (sum[i - 1][j - 1] + 1) % MOD;
				}

				sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + dp[i][j] + MOD;
				sum[i][j] %= MOD;
			}
		}

		//for (int i = 0; i < sum.length; i++) {
		//	for (int j = 0; j < sum[i].length; j++) {
		//		System.out.print(sum[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//
		//}

		System.out.println(sum[s.length][t.length] + 1);
	}
}
