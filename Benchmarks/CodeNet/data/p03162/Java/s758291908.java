import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][3];
		int[][] abc = new int[n][3];

		for(int i = 0; i < n; i++) {
			abc[i][0] = sc.nextInt();
			abc[i][1] = sc.nextInt();
			abc[i][2] = sc.nextInt();
		}

		dp[0][0] = abc[0][0];
		dp[0][1] = abc[0][1];
		dp[0][2] = abc[0][2];

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				dp[i][j] = max(dp[i][j], dp[i - 1][(j + 1) % 3] + abc[i][j]);
				dp[i][j] = max(dp[i][j], dp[i - 1][(j + 2) % 3] + abc[i][j]);
			}
		}

		System.out.println(max(max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));

		sc.close();
	}

	public static int max(int x, int y) {
		if(x < y) return y;
		else return x;
	}
}
