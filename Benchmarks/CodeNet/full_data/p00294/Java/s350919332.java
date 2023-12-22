
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int p = scanner.nextInt();
		int[] d = new int[m];
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			d[i] = (a + n - p) % n;
		}
		Arrays.sort(d);
		int ans = Math.min(d[m - 1], n - d[0]);
		for (int i = 0; i < m; i++) {
			if (i != 0)
				ans = Math.min(ans, 2 * (n - d[i]) + d[i - 1]);
			if (i != m - 1)
				ans = Math.min(ans, 2 * d[i] + n - d[i + 1]);
		}
		System.out.println(ans * 100);

	}
}