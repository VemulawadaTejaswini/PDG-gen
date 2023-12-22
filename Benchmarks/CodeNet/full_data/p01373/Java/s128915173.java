import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
			if (w == 0 && h == 0 && n == 0)
				break;
			n *= 2;
			double[] x = new double[n + 2];
			double[] y = new double[n + 2];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			x[n] = w;
			y[n] = 0;
			x[n + 1] = w;
			y[n + 1] = h;
			ArrayList<Double> y1 = new ArrayList<>();
			for (int i = 0; i < n + 2; i++) {
				for (int j = i + 1; j < n + 2; j++) {
					if (x[i] != x[j]) {
						double tmp = (y[i] - y[j]) / (x[i] - x[j]) * (-x[i]) + y[i];
						if (0 < tmp && tmp < h)
							y1.add(tmp);
					}
				}
			}
			y1.add(0.0);
			y1.add((double) h);
			y1.sort(null);
			for (int i = 0; i < y1.size() - 1; i++) {
				while (i < y1.size() - 1 && y1.get(i) == y1.get(i + 1)) {
					y1.remove(i);
				}
			}

			double ans = 0;
			double[] y2 = new double[n];

			for (int i = 0; i < y1.size() - 1; i++) {
				double y_mid = (y1.get(i) + y1.get(i + 1)) / 2;
				for (int j = 0; j < n; j++) {
					double tmp;
					if (x[j] == 0)
						tmp = 1L << 30;
					else
						tmp = (y[j] - y_mid) / (x[j] - 0) * (w - x[j]) + y[j];
					if (tmp < 0)
						tmp = 0;
					if (tmp > h)
						tmp = h;
					y2[j] = tmp;
				}
				Arrays.sort(y2);
				ans += (y2[n / 2] - y2[n / 2 - 1]) * (y1.get(i + 1) - y1.get(i));
			}
			System.out.println(ans / (h * h));
		}
	}
}