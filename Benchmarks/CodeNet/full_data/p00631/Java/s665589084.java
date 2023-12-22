
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[n];
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++)
				num[i] = scanner.nextInt();
			for (int i = 0; i < 1 << (n - 1); i++) {
				int sum1 = 0;
				int sum2 = 0;
				for (int j = 0; j < n; j++) {
					if (((i >> j) & 1) == 1)
						sum1 += num[j];
					else
						sum2 += num[j];
				}
				ans = Math.min(ans, Math.abs(sum1 - sum2));
			}
			System.out.println(ans);
		}

	}
}