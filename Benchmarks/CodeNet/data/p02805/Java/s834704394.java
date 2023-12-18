import java.util.Scanner;

public class Main {

	private static int[][] xy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		xy = new int[n][2];

		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}

		double l = 0;
		double r = 1001;
		int c = 0;
		while (c < 80) {
			double c1 = (l * 2 + r) / 3;
			double c2 = (l + r * 2) / 3;
			if (f(c1) < f(c2)) {
				r = c2;
			} else {
				l = c1;
			}
			c++;
		}

		System.out.println(String.format("%.8f", f(l)));
	}

	private static double f(double x) {
		double l = 0;
		double r = 1001;
		int c = 0;
		while (c < 80) {
			double c1 = (l * 2 + r) / 3;
			double c2 = (l + r * 2) / 3;
			if (g(x, c1) < g(x, c2)) {
				r = c2;
			} else {
				l = c1;
			}
			c++;
		}
		return g(x, l);
	}

	private static double g(double x, double y) {
		double a = 0.0;
		for (int i = 0; i < xy.length; i++) {
			double r = Math.sqrt((xy[i][0] - x) * (xy[i][0] - x) + (xy[i][1] - y) * (xy[i][1] - y));
			a = Math.max(a, r);
		}
		return a;
	}
}

