import java.util.Scanner;

public class Main {
	static int n;
	static int[] x, y;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(ternarySearch());
	}

	static double ternarySearch() {
		double gosa = 1e-8;
		double l = 0;
		double r = 1000;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = ternarySearch(m1);
			double v2 = ternarySearch(m2);
			if (v1 <= v2) {
				r = m2;
			} else {
				l = m1;
			}
		}
		return ternarySearch(r);
	}

	static double ternarySearch(double cx) {
		double gosa = 1e-8;
		double l = 0;
		double r = 1000;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = calc(cx, m1);
			double v2 = calc(cx, m2);
			if (v1 <= v2) {
				r = m2;
			} else {
				l = m1;
			}
		}
		return calc(cx, r);
	}

	static double calc(double cx, double cy) {
		double ret = 0;
		for (int i = 0; i < n; i++) {
			double r = Math.hypot(x[i] - cx, y[i] - cy);
			ret = Math.max(ret, r);
		}
		return ret;
	}
}
