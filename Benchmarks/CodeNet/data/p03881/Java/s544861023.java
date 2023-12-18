
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 6; ++j) {
				p[i][j] = sc.nextDouble() / 100;
			}
		}

		double l = 0;
		double r = 1;
		for (int i = 0; i < 100; ++i) {
			double lm = (2 * l + r) / 3;
			double rm = (l + 2 * r) / 3;
			if (simulate(lm) > simulate(rm)) {
				l = lm;
			} else {
				r = rm;
			}
		}
		System.out.println(simulate(l));
	}

	double simulate(double x) {
		double ret = 0;
		for (int j = 0; j < 6; ++j) {
			ret += Math.max(x * p[0][j], (1 - x) * p[1][j]);
		}
		return ret;

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}