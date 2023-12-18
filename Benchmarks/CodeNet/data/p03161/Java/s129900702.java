import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dp = new int[n];
		int[] h = new int[n];
		final int INF = 1000000000;
		dp[0] = 0;

		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			if(i > 0)dp[i] = INF;
		}

		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= k; j++) {
				if(i - j < 0) continue;
				dp[i] = min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
			}
		}

		System.out.println(dp[n - 1]);

		sc.close();
	}

	public static int min(int a, int b) {
		if(a > b) {
			return b;
		}else {
			return a;
		}
	}
}
