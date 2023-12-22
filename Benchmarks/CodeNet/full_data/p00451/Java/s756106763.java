import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String s1 = sc.next();
			String s2 = sc.next();
			int dp[][] = new int[s1.length()][s2.length()];
			int max = 0;

			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) != s2.charAt(j)) {
						dp[i][j] = 0;
					} else {
						if (i != 0 && j != 0) {
							dp[i][j] = dp[i - 1][j - 1] + 1;
						} else {
							dp[i][j] = 1;
						}
					}
					max = Math.max(max, dp[i][j]);
				}
			}

			System.out.println(max);
		}
	}
}