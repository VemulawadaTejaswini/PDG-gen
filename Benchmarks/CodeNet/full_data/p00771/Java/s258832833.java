import java.util.*;

public class Main {
	static int n;
	static double[] x;
	static double[] y;
	static double[] l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			x = new double[n];
			y = new double[n];
			l = new double[n];
			for (int i = 0; i < n; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				l[i] = sc.nextDouble();
			}

			double xl = -100;
			double xr = 100;

			for (int i = 0; i < 100; ++i) {
				double mxl = (2 * xl + xr) / 3;
				double mxr = (xl + 2 * xr) / 3;
				double Lmxl = len(mxl);
				double Lmxr = len(mxr);
				if (Lmxl < Lmxr) {
					xl = mxl;
				} else {
					xr = mxr;
				}
			}
			System.out.println(Math.sqrt(len(xl)));
		}
		sc.close();
	}

	static double len(double x) {
		double yl = -100;
		double yr = 100;

		for (int i = 0; i < 100; ++i) {
			double myl = (2 * yl + yr) / 3;
			double myr = (yl + 2 * yr) / 3;
			double Lmyl = calc(x, myl);
			double Lmyr = calc(x, myr);
			if (Lmyl < Lmyr) {
				yl = myl;
			} else {
				yr = myr;
			}
		}
		return calc(x, yl);
	}

	static double calc(double cx, double cy) {
		double len2 = Double.MAX_VALUE / 4;// (x-xi)^2+(y-yi)^2+z^2<=li^2
		// z^2<=li^2-(x-xi)^2-(y-yi)^2
		for (int i = 0; i < n; ++i) {
			len2 = Math.min(len2, l[i] * l[i] - (cx - x[i]) * (cx - x[i]) - (cy - y[i]) * (cy - y[i]));
		}
		return len2;
	}
}