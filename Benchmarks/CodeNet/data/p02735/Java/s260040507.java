
import java.util.Scanner;

public class Main {

	public static int Check(char c) {
		if(c == '#') {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] dp = new int[h][w];
		String[] masu = new String[h];
		for(int i = 0; i < h; i++) {
			masu[i] = sc.next();
		}
		if(masu[0].charAt(0) == '#') {
			dp[0][0] = 1;
		} else {
			dp[0][0] = 0;
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i == 0 && j == 0)
					continue;
				if(i == 0) {
					dp[i][j] = dp[i][j - 1] + (dp[i][j - 1] % 2 == Check(masu[i].charAt(j)) ? 0 : 1);
				} else if(j == 0) {
					dp[i][j] = dp[i - 1][j] + (dp[i - 1][j] % 2 == Check(masu[i].charAt(j)) ? 0 : 1);
				} else {
					dp[i][j] = Math.min(dp[i][j - 1] + (dp[i][j - 1] % 2 == Check(masu[i].charAt(j)) ? 0 : 1), dp[i - 1][j] + (dp[i - 1][j] % 2 == Check(masu[i].charAt(j)) ? 0 : 1));
				}
			}
		}
		System.out.println((dp[h - 1][w - 1] + 1) / 2);

	}

}
