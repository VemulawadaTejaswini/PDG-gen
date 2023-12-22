
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			int alen = a.length();
			int blen = b.length();
			int dp[][] = new int[alen + 1][blen + 1];

			int best = 0;
			for (int i = 1; i <= alen; i++)
				for (int j = 1; j <= blen; j++) {
					if (a.charAt(i - 1) == b.charAt(j - 1)) {
						dp[i][j] = dp[i - 1][j - 1] + 1;
						best = Math.max(best, dp[i][j]);
					}
				}
			System.out.println(best);
		}
	}
}