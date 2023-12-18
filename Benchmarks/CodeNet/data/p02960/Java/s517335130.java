
import java.util.Scanner;

public class Main {

	static long mod = 1000000000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long[][] dp = new long[s.length()][13];
		for(int i = 0; i < s.length(); i++) {
			if(i == 0) {
				if(s.charAt(0) == '?') {
					for(int j = 0; j < 10; j++) {
						dp[0][j] = 1;
					}
				} else {
					dp[0][Integer.valueOf(s.substring(0, 1))] = 1;
				}
			} else {
				if(s.charAt(i) == '?') {
					for(int j = 0; j < 13; j++) {
						for(int k = 0; k < 10; k++) {
							dp[i][(j * 10 + k) % 13] += dp[i - 1][j];
							dp[i][(j * 10 + k) % 13] %= mod;
						}
					}
				} else {
					int v = Integer.valueOf(s.substring(i, i + 1));
					for(int j = 0; j < 13; j++) {
						dp[i][(j * 10 + v) % 13] += dp[i - 1][j];
						dp[i][(j * 10 + v) % 13] %= mod;
					}
				}
			}
		}

		System.out.println(dp[s.length() - 1][5]);
	}

}
