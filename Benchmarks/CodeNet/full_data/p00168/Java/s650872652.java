import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[] dp = new int[n + 1];
			dp[1] = 1;
			if (2 <= n) dp[2] = 2;
			if (3 <= n) dp[3] = 4;
			for (int i = 4; i <= n; i++) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}

			int d = ((dp[n]-1) / 10) + 1;
			System.out.println((d-1)/365 + 1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}