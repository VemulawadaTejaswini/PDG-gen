
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
		int k = scanner.nextInt();
		List<Integer>[] lists = new ArrayList[10];
		for (int i = 0; i < 10; i++)
			lists[i] = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int c = scanner.nextInt();
			int g = scanner.nextInt() - 1;
			lists[g].add(c);
		}
		int[] dp = new int[k + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for (int i = 0; i < 10; i++) {
			Collections.sort(lists[i], Collections.reverseOrder());;
			for (int j = k - 1; j >= 0; j--) {
				if (dp[j] == -1)
					continue;
				int sum = 0;
				for (int l = 0; l < lists[i].size() && j + l < k; l++) {
					sum += lists[i].get(l);
					dp[j + l + 1] = Math.max(dp[j + l + 1], dp[j] + sum
							+ (l + 1) * l);
				}
			}
		}
		System.out.println(dp[k]);

	}
}