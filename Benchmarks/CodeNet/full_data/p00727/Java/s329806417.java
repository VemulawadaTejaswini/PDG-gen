import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	int n;
	double[] x;
	double[] y;

	void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			x = new double[n];
			y = new double[n];
			for (int i = 0; i < n; ++i) {
				x[i] = sc.nextDouble();
				y[i] = -sc.nextDouble();
			}
			solver();
		}
	}

	@SuppressWarnings("unchecked")
	void solver() throws FileNotFoundException {
		ArrayList<Double> cand = new ArrayList<>();
		cand.add(0d);
		cand.add(Math.PI);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;
				cand.add(f(-(y[i] - y[j]), (x[i] - x[j]), 0));
				cand.add(f(-(y[i] - y[j]), (x[i] - x[j]), 2));
			}
		}
		for (double i = 0; i < Math.PI; i += 0.05) {
			cand.add(i);
		}
		Collections.sort(cand);
		for (int i = 0; i < cand.size(); ++i) {
			if (cand.get(i) > Math.PI) {
				cand.remove(i);
				--i;
			}
		}
		for (int i = 0; i < cand.size(); ++i) {
			while (i + 1 < cand.size() && cand.get(i + 1) - cand.get(i) < 1e-12) {
				cand.remove(i + 1);
			}
		}
		int sz = cand.size();
		for (int i = 0; i + 1 < sz; ++i) {
			cand.add(h((cand.get(i) + cand.get(i + 1)) / 2));
		}

		double max = 0;
		double min = Double.MAX_VALUE / 16;
		double max_arg = -1, min_arg = -1;
		for (double d : cand) {
			if (d > Math.PI)
				throw new AssertionError();
			if (max < g(d)) {
				max = g(d);
				max_arg = d;
			}
			if (min > g(d)) {
				min = g(d);
				min_arg = d;
			}
		}
		System.out.println(min_arg);
		System.out.println(max_arg);
	}

	double[] pos(double a) {
		double[] pos = new double[n];
		double c = Math.cos(a);
		double s = Math.sin(a);
		for (int i = 0; i < n; ++i) {
			pos[i] = s * x[i] - c * y[i];
		}
		Arrays.sort(pos);
		return pos;
	}

	double h(double a) {
		double[] pos = pos(a);
		int[] coe = new int[n];
		for (int i = 0; i < n; ++i) {
			if (i + 1 < n && pos[i + 1] - pos[i] <= 2) {
				--coe[i];
			}
			if (i - 1 >= 0 && pos[i] - pos[i - 1] <= 2) {
				++coe[i];
			}
		}
		double A = 0, B = 0;
		for (int i = 0; i < n; ++i) {
			A += x[i] * coe[i];
			B += y[i] * coe[i];
		}
		return f(A, B, 0);
	}

	double g(double a) {
		double[] pos = pos(a);
		double ret = 2;
		for (int i = 0; i + 1 < n; ++i) {
			if (pos[i + 1] - pos[i] > 2) {
				ret += 2;
			} else {
				ret += pos[i + 1] - pos[i];
			}
		}
		return ret;
	}

	double f(double A, double B, double C) {
		double tmp = Math.sqrt(A * A + B * B);
		A /= tmp;
		B /= tmp;
		C /= tmp;
		double shift = Math.atan2(A, B);
		double ret = Math.asin(C) - shift;
		ret = (ret + 4 * Math.PI) % (2 * Math.PI);
		if (ret > Math.PI) {
			ret = Math.PI - shift - Math.asin(C);
		}
		if (Math.abs(A * Math.cos(ret) + B * Math.sin(ret) - C) > 1e-6) {
			throw new AssertionError();
		}
		return ret;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}