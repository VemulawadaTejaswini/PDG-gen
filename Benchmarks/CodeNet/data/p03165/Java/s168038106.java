import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		int a = s.length;
		int b = t.length;
		int[][] dp = new int[a + 1][b + 1];
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (s[i - 1] == t[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		char[] lcs = new char[dp[a][b]];
		while (a > 0 && b > 0) {
			if (dp[a][b] == dp[a - 1][b]) {
				a--;
			} else if (dp[a][b] == dp[a][b - 1]) {
				b--;
			} else {
				a--;
				b--;
				lcs[dp[a][b]] = s[a];
			}
		}
		System.out.println(lcs);
	}
}
