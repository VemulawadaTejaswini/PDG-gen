import java.util.*;

public class Main {
	static final int r = 1000000000 + 7;

	public static int solve(int s) {
		int ans = 0;
		int dp[] = new int[s + 1];
		dp[0] = 1;
		for (int i = 3; i <= s; ++i) {
			int tmp = dp[i - 1] + dp[i - 3];
			tmp %= r;
			dp[i] = tmp;
		}
		ans = dp[s];
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		int ans = solve(s);
		System.out.println(ans);
	}
}
