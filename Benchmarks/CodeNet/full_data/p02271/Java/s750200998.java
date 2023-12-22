import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		boolean[][] dp = new boolean[n+1][40001];
		dp[0][0] = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= 40000; j++) {
				dp[i+1][j] = (j-a[i]>=0 && dp[i][j-a[i]]) || dp[i][j];
			}
		}

		int q = in.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = in.nextInt();
			if (dp[n][m[i]]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

}

