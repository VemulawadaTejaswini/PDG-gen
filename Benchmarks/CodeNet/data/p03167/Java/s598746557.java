import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		String matrix[][] = new String[h][w];
		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		int dp[][] = new int[h][w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (matrix[i][j].equals("#")) {
					dp[i][j] = 0;
				} else {
					if (i - 1 < 0 && j - 1 < 0) {
						dp[i][j] = 1;
					} else if (i - 1 < 0) {
						dp[i][j] = (dp[i][j - 1]) % 1000000007;
					} else if (j - 1 < 0) {
						dp[i][j] = (dp[i - 1][j]) % 1000000007;
					} else {
						dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
					}
				}
			}
		}

		System.out.println((dp[h - 1][w - 1]) % 1000000007);
	}
}
