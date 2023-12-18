import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[100010][3];
		int[][] dp = new int[100010][3];

		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			a[i][2] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k) {
						continue;
					}
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][k] + a[i][j]);
					//					System.out.print(dp[i+1][j] + " ");
				}
			}
			//			System.out.println();
		}

		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans = Math.max(ans, dp[n][i]);
		}

		System.out.println(ans);
		sc.close();

	}
}