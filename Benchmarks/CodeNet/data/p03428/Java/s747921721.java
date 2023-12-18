import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; ++i) {
			double[] deg = new double[n - 1];
			int cnt = 0;
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;
				deg[cnt++] = (Math.atan2(y[j] - y[i], x[j] - x[i]));
			}
			for (int j = 0; j < deg.length; ++j)
				if (deg[j] < 0)
					deg[j] += Math.PI;
			Arrays.sort(deg);
			double ans = 0;
			for (int j = 0; j < n - 1; ++j) {
				ans = Math.max(ans, (Math.PI * 2 + deg[(j + 1) % (n - 1)] - deg[j]) % (2 * Math.PI));
			}
			if (n == 2)
				ans = 2 * Math.PI;
			ans = ans - Math.PI;
			if (ans <= 0)
				System.out.println(0);
			else
				System.out.println(ans / (2 * Math.PI));
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}