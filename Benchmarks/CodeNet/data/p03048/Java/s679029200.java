import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int cnt = 0;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, 0);
		for(int i = 0; i <= n; i += r) {
			dp[i] = 1;
		}
		for(int i = 0; i <= n - g; i++) {
			dp[i + g] = dp[i + g] + dp[i] * 1;
		}
		//System.out.println(Arrays.toString(dp));
		for(int i = 0; i <= n - b; i++) {
			dp[i + b] = dp[i + b] + dp[i] * 1;
		}
		System.out.println(dp[n]);
		//System.out.println(Arrays.toString(dp));
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
