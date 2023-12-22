
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			x[i] = a - b;
			y[i] = a + b;
			xmax = Math.max(xmax, x[i]);
			ymax = Math.max(ymax, y[i]);
			xmin = Math.min(xmin, x[i]);
			ymin = Math.min(ymin, y[i]);
		}
		int ret = 0;
		int ret2 = 0;
		for (int i = 0; i < n; i++) {
			ret = Math.max(
					ret,
					Math.min(dist(xmax, x[i], ymax, y[i]),
							dist(x[i], xmin, y[i], ymin)));
			ret2 = Math.max(
					ret2,
					Math.min(dist(xmax, x[i], y[i], ymin),
							dist(x[i], xmin, ymax, y[i])));
		}
		System.out.println(Math.min(ret, ret2));

	}

	private int dist(int a, int b, int c, int d) {
		return Math.max(a - b, c - d);
	}
}