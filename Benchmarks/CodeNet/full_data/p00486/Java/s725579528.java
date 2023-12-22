
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int n = scanner.nextInt();
		int[] y = new int[n];
		int[] x = new int[n];
		int[] sy = new int[n];
		int[] sx = new int[n];
		for (int i = 0; i < n; i++) {
			sx[i] = x[i] = scanner.nextInt();
			sy[i] = y[i] = scanner.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int ax = 0;
		int ay = 0;
		long ans = Long.MAX_VALUE;
		int m = (n - 1) / 2;
		for (int i = m; i <= m + 1; i++) {
			for (int j = m; j <= m + 1; j++) {
				long res = 0;
				long max = 0;
				for (int k = 0; k < n; k++) {
					long dis = Math.abs(sx[k] - x[i]) + Math.abs(sy[k] - y[j]);
					res += dis * 2;
					max = Math.max(max, dis);
				}
				res -= max;
				if (res < ans) {
					ans = res;
					ax = x[i];
					ay = y[j];
				}
			}
		}
		System.out.println(ans);
		System.out.println(ax + " " + ay);
	}
}