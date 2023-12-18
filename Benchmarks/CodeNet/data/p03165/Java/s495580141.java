import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[][] dp = new int[s.length() + 3][t.length() + 3];
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = 0 ; j < t.length() ; j++){
				if(s.charAt(i) == t.charAt(j)) {
					dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1],dp[i][j] + 1);
				}
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1],dp[i][j + 1]);
				dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1],dp[i + 1][j]);
			}
		}
		String ans = "";
		StringBuilder sb = new StringBuilder(ans);

		int i = s.length();
		int j = t.length();

		while(i > 0 && j > 0) {
			if(dp[i][j] == dp[i - 1][j])
				i--;
			else if(dp[i][j] == dp[i][j - 1])
				j--;
			else {
				sb.append(s.charAt(i - 1));
				i--;
				j--;
			}

		}
		System.out.println(sb.reverse().toString());

	}
}

