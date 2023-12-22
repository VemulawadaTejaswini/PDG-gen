import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
		int u = sc.nextInt();
		int[] v = new int[n];
		int[] w = new int[n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}

		int[][] dp = new int[n+1][u+1];

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j <= u; j++) {
				if (i == n) {
					dp[i][j] = 0;
					continue;
				} else {
					if (w[i] > j) {
						dp[i][j] = dp[i+1][j];
					} else {
						dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j - w[i]] + v[i]);
					}
				}
			}
		}

		out.println(dp[0][u]);
	}
}

