import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int[] s = new int[N];
		for(int i = 0; i < N; i++)
			s[i] = Character.getNumericValue(S.charAt(i));
		long ans = 0;
		long[][] dp = new long[N+1][2020];
		for(int i = 1; i <= N; i++) {
			dp[i][s[i-1]] += 1;
			for(int j = 0; j < 2020; j++) {
				dp[i][(j*10+s[i-1])%2019] += dp[i-1][j];
			}
			ans += dp[i][0];
		}
		System.out.println(ans);
	}

}