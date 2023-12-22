import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String argv[]) throws IOException {
		Scanner cin = new Scanner(System.in);
		int dp[][][] = new int[30][20][200];
		dp[0][0][0] = 1;
		for (int i = 1; i <= 20; ++ i) {
			for (int k = 0; k <= 10; ++ k) {
				for (int s = 0; s <= 155; ++ s) {
					dp[i][k][s] = dp[i - 1][k][s];
					if (k > 0 && s >= i) dp[i][k][s] += dp[i - 1][k - 1][s - i];
				}
			}
		}
		while (cin.hasNextInt()) {
			int n = cin.nextInt(), k = cin.nextInt(), s = cin.nextInt();
			if (n == 0) break;
			System.out.println(dp[n][k][s]);
		}
	}

}