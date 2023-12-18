import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		double x1 = 0, y1 = 0,
				x2 = 0, y2 = 0,
				x3 = 0, y3 = 0,
				x4 = 0, y4 = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if (x[i] >= 0 && y[i] >= 0) {
				x1 += x[i];
				y1 += y[i];
			} else if (x[i] <= 0 && y[i] >= 0) {
				x2 += x[i];
				y2 += y[i];
			} else if (x[i] <= 0 && y[i] <= 0) {
				x3 += x[i];
				y3 += y[i];
			} else if (x[i] >= 0 && y[i] <= 0) {
				x4 += x[i];
				y4 += y[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (!(x[i] >= 0 && y[i] >= 0)
					&& x1 * x1 + y1 * y1 < Math.pow(x1 + x[i], 2) + Math.pow(y1 + y[i], 2)) {
				x1 += x[i];
				y1 += y[i];
			} else if (!(x[i] <= 0 && y[i] >= 0)
					&& x2 * x2 + y2 * y2 < Math.pow(x2 + x[i], 2) + Math.pow(y2 + y[i], 2)) {
				x2 += x[i];
				y2 += y[i];
			} else if (!(x[i] <= 0 && y[i] <= 0)
					&& x3 * x3 + y3 * y3 < Math.pow(x3 + x[i], 2) + Math.pow(y3 + y[i], 2)) {
				x3 += x[i];
				y3 += y[i];
			} else if (!(x[i] >= 0 && y[i] <= 0)
					&& x4 * x4 + y4 * y4 < Math.pow(x4 + x[i], 2) + Math.pow(y4 + y[i], 2)) {
				x4 += x[i];
				y4 += y[i];
			}
		}
		double max = Math.max(x1 * x1 + y1 * y1, x2 * x2 + y2 * y2);
		max = Math.max(max, x3 * x3 + y3 * y3);
		max = Math.max(max, x4 * x4 + y4 * y4);
		System.out.println(Math.sqrt(max));
	}
}
