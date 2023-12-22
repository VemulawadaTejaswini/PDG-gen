
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
			d[i] = (a - p ) % n;
		}
		Arrays.sort(d);
		int ret = Math.min(n - d[0], d[m - 1]);
		for (int i = 0; i < m; i++) {
			if (i > 0) {
				int a = 2 * (n - d[i]) + d[i - 1];
				ret = Math.min(ret, a);
			}
			if (i < m - 1) {
				int b = 2 * d[i] + n - d[i + 1];
				ret = Math.min(ret, b);
			}
		}
		System.out.println(ret * 100);
	}
}