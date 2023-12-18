import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		System.out.println(calc(x, y));
	}

	static double calc(int[] x, int[] y) {
		double gosa = 1e-7;
		double l = 0;
		double r = 1000;
		double ret = 2000;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = getMaxR(x, y, m1, getY(x, y, m1));
			double v2 = getMaxR(x, y, m2, getY(x, y, m2));
			if (v1 <= v2) {
				r = m2;
				ret = v1;
			} else {
				l = m1;
				ret = v2;
			}
		}
		return ret;
	}

	static double getY(int[] x, int[] y, double mx) {
		double gosa = 1e-7;
		double l = 0;
		double r = 1000;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = getMaxR(x, y, mx, m1);
			double v2 = getMaxR(x, y, mx, m2);
			if (v1 <= v2) {
				r = m2;
			} else {
				l = m1;
			}
		}
		return r;
	}

	static double getMaxR(int[] x, int[] y, double mx, double my) {
		double max = 0;
		for (int i = 0; i < y.length; i++) {
			double d = Math.hypot(x[i] - mx, y[i] - my);
			max = Math.max(max, d);
		}
		return max;
	}
}
