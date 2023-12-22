import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[][] = new int[n][n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int k = sc.nextInt();
				if (i == 0 && j == 0) {
					dp[i][j] = k;
				} else if (i == 0) {
					dp[i][j] = dp[i][j - 1] + k;
				} else if (j == 0) {
					dp[i][j] = dp[i - 1][j] + k;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + k;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = i + 1; k < n; k++) {
					for (int l = j + 1; l < n; l++) {
						int tmp1, tmp2, tmp3;
						tmp1 = tmp2 = tmp3 = 0;
						if (0 < i && 0 < j) {
							tmp1 = dp[i - 1][j - 1];
							tmp2 = dp[k][j - 1];
							tmp3 = dp[i - 1][l];
						} else if (0 < i) {
							tmp3 = dp[i - 1][l];
						} else if (0 < j) {
							tmp2 = dp[k][j - 1];
						}
						max = Math.max(max, dp[k][l] - tmp2 - tmp3 + tmp1);
					}
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args){
		new Main().run();
	}
}