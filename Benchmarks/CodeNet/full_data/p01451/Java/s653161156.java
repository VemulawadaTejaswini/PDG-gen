
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		int Na = sc.nextInt();
		int Nb = sc.nextInt();
		int[] xa = new int[Na];
		int[] ya = new int[Na];
		int[] xb = new int[Nb];
		int[] yb = new int[Nb];
		for (int i = 0; i < Na; ++i) {
			xa[i] = sc.nextInt();
			ya[i] = sc.nextInt();
		}
		for (int i = 0; i < Nb; ++i) {
			xb[i] = sc.nextInt();
			yb[i] = sc.nextInt();
		}

		double ans = Double.MAX_VALUE / 3;
		for (int t = 0; t < 2; ++t) {
			for (int i = 0; i < Na; ++i) {
				if (cross(xa[0], ya[0], xa[i], ya[i], xb[0], yb[0], xb[1], yb[1])) {
					continue;
				}
				for (int j = 0; j < Na; ++j) {
					if (cross(xa[i], ya[i], xa[j], ya[j], xb[0], yb[0], xb[1], yb[1])) {
						continue;
					}
					if (cross(xa[1], ya[1], xa[j], ya[j], xb[0], yb[0], xb[1], yb[1])) {
						continue;
					}
					ans = Math.min(ans, dist(xa[0], ya[0], xa[i], ya[i]) + dist(xa[i], ya[i], xa[j], ya[j])
							+ dist(xa[j], ya[j], xa[1], ya[1]) + dist(xb[0], yb[0], xb[1], yb[1]));
				}
			}
			Na ^= Nb;
			Nb ^= Na;
			Na ^= Nb;
			int[] tmp = new int[Na];
			tmp = Arrays.copyOf(xa, xa.length);
			xa = Arrays.copyOf(xb, xb.length);
			xb = Arrays.copyOf(tmp, tmp.length);
			tmp = Arrays.copyOf(ya, ya.length);
			ya = Arrays.copyOf(yb, yb.length);
			yb = Arrays.copyOf(tmp, tmp.length);
		}
		System.out.println(ans >= Double.MAX_VALUE / 4 ? "-1" : ans);
	}

	double dist(int xa, int ya, int xb, int yb) {
		int dx = xa - xb;
		int dy = ya - yb;
		return Math.sqrt(dx * dx + dy * dy);
	}

	boolean cross(int xa1, int ya1, int xb1, int yb1, int xa2, int ya2, int xb2, int yb2) {
		boolean ret = true;
		ret &= f(xa1, ya1, xb1, yb1, xa2, ya2) * f(xa1, ya1, xb1, yb1, xb2, yb2) <= 0;
		ret &= f(xa2, ya2, xb2, yb2, xa1, ya1) * f(xa2, ya2, xb2, yb2, xb1, yb1) <= 0;
		return ret;
	}

	int f(int xa, int ya, int xb, int yb, int x, int y) {
		return (ya - yb) * (x - xa) - (y - ya) * (xa - xb);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
