import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		double ans = 0;
		int xx = 0;
		int yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] > 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (y[i] > 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] < 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (y[i] < 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] > 0 && x[i] + y[i] > 0 || y[i] > 0 && x[i] + y[i] > 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] > 0 && x[i] - y[i] > 0 || y[i] < 0 && y[i] - x[i] > 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] < 0 && x[i] + y[i] < 0 || y[i] > 0 && x[i] + y[i] > 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));

		xx = 0;
		yy = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] < 0 && x[i] + y[i] < 0 || y[i] < 0 && y[i] + x[i] < 0) {
				xx += x[i];
				yy += y[i];
			}
		}
		ans = Math.max(ans, calc(xx, yy));
		System.out.println(ans);
	}

	static double calc(long x, long y) {
		long a = x * x + y * y;
		return Math.sqrt(a);
	}
}
