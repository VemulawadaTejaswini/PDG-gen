
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		char[][] x = new char[q][];
		char[][] y = new char[q][];

		for (int i = 0; i < q; i++) {
			x[i] = in.next().toCharArray();
			y[i] = in.next().toCharArray();
		}

		for (int i = 0; i < q; i++) {
			// dp
			int[][] dp = new int[x[i].length+1][y[i].length+1];
			for (int j = 0; j < x[i].length; j++) {
				for (int l = 0; l < y[i].length; l++) {
					if (x[i][j] == y[i][l]) {
						dp[j+1][l+1] = dp[j][l]+1;
					} else {
						dp[j+1][l+1] = Math.max(dp[j+1][l], dp[j][l+1]);
					}
				}
			}
			System.out.println(dp[x[i].length][y[i].length]);
		}

	}
}

