import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		long[][] dp1 = new long[n + 1][t + 1];
		long[][] dp2 = new long[n + 1][t + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= t; j++) {
				dp1[i + 1][j] = Math.max(dp1[i][j], j - a[i] >= 0 ? dp1[i][j - a[i]] + b[i] : 0);
			}
		}

		for (int i = n; i > 0; i--) {
			for (int j = 0; j <= t; j++) {
				dp2[i - 1][j] = Math.max(dp2[i][j],
						j - a[i - 1] >= 0 ? dp2[i][j - a[i - 1]] + b[i - 1] : 0);
			}
		}

		long answer = 0;
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j < t; j++) {
				answer = Math.max(answer, dp1[i][j] + dp2[i + 1][t - 1 - j] + b[i]);
			}
		}

		System.out.println(answer);
	}
}
