import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		long ans = 0;
		long[][] dp = new long[N+1][2019];
		for(int i = 1; i <= N; i++) {
			int s = Character.getNumericValue(S.charAt(i-1));
			dp[i][s] += 1;
			for(int j = 0; j < 2019; j++) {
				dp[i][(j*10+s)%2019] += dp[i-1][j];
			}
			ans += dp[i][0];
		}
		System.out.println(ans);
	}

}