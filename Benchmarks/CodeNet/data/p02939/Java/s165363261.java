import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		char last_1 = '!';
		String last_2 = "";
		int dp[][] = new int[N+1][2];
		for (int i=0;i<N;i++) {
			if (S.charAt(i) != last_1) {
				dp[i+1][0] = Math.max(dp[i][0], dp[i][1]) + 1;
			} else {
				dp[i+1][0] = dp[i][1] + 1;
			}
			if (i==0) {
				last_1 = S.charAt(i);
				continue;
			}
			if (String.valueOf(S.charAt(i)) + String.valueOf(S.charAt(i)) != last_2 ) {
				dp[i+1][1] = Math.max(dp[i-1][0], dp[i-1][1]) + 1;
			} else {
				dp[i+1][1] = dp[i-1][0] + 1;
			}
			last_1 = S.charAt(i);
			last_2 = String.valueOf(S.charAt(i)) + String.valueOf(S.charAt(i));
		}
		System.out.println(Math.max(dp[N][0], dp[N][1]));
	}
}