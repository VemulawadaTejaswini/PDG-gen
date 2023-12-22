
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer>[] books = new ArrayList[n];
		for (int i = 0; i < 10; i++)
			books[i] = new ArrayList<Integer>();
		while (n-- > 0) {
			int c = scanner.nextInt();
			int g = scanner.nextInt() - 1;
			books[g].add(c);
		}
		int[] dp = new int[m + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for (int i = 0; i < 10; i++) {
			Collections.sort(books[i], Collections.reverseOrder());
			for (int j = m - 1; j >= 0; j--) {
				int sum = 0;
				for (int k = 0; k < books[i].size() && j + k < m; k++) {
					sum += books[i].get(k);
					dp[j + k + 1] = Math.max(dp[j + k + 1], dp[j] + sum
							+ (k + 1) * k);
				}
			}
		}
		System.out.println(dp[m]);
	}
}