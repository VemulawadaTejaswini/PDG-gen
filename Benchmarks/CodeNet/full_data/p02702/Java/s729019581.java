import java.util.*;
public class Main {

	public static void main(String[] args) {
		String S = new Scanner(System.in).next();
		int N = S.length();
		int ans = 0;
		int[][] dp = new int[2][2019];
		for(int i = 0; i < N; i++) {
			int s = Character.getNumericValue(S.charAt(i));
			dp[1][s] = 1;
			for(int j = 0; j < 2019; j++)
				dp[1][(j*10+s)%2019] += dp[0][j];
			ans += dp[1][0];
			dp[0] = dp[1].clone();
			Arrays.fill(dp[1], 0);
		}
		System.out.println(ans);
	}

}
