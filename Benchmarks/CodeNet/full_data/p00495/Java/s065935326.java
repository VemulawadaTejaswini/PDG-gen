
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = scanner.nextInt();

		int ans = 0;
		for (int i = 0; i < m - ans; i++) {
			int idx = i;
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (b[idx] == a[j]) {
					cnt++;
					idx++;
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}