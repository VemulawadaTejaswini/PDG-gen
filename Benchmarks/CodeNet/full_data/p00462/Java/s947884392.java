
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int d = scanner.nextInt();
			if (d == 0)
				break;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] p = new int[n + 1];
			for (int i = 0; i < n - 1; i++)
				p[i] = scanner.nextInt();
			p[n] = d;
			Arrays.sort(p);
			int ans = 0;
			for (int i = 0; i < m; i++) {
				int k = scanner.nextInt();
				int pos = Arrays.binarySearch(p, k);
				if (pos < 0) {
					pos = -pos - 2;
					int c = Math.min(k - p[pos], p[pos + 1] - k);
					ans += c;
				}
			}
			System.out.println(ans);
		}
	}
}