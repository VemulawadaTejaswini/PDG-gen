import java.util.Arrays;
import java.util.Scanner;

public class Main {
	double as[];
	double bs[];
	double cs[];
	double ds[];
	final double EPS = 1.0e-10;
	int n;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			as = new double[n];
			bs = new double[n];
			cs = new double[n];
			ds = new double[n];
			for (int i = 0; i < n; i++) {
				as[i] = sc.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				bs[i] = sc.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				cs[i] = sc.nextDouble();
			}
			for (int i = 0; i < n; i++) {
				ds[i] = sc.nextDouble();
			}
			solve();
		}
	}

	void solve() {
		P[][] ps = new P[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			ps[0][i] = new P(as[i - 1], 0);
		}
		ps[0][0] = new P(0, 0);
		ps[0][n + 1] = new P(1, 0);
		for (int i = 1; i <= n; i++) {
			ps[n + 1][i] = new P(bs[i - 1], 1);
		}
		ps[n + 1][0] = new P(0, 1);
		ps[n + 1][n + 1] = new P(1, 1);
		for (int i = 1; i <= n; i++) {
			ps[i][0] = new P(0, cs[i - 1]);
			ps[i][n + 1] = new P(1, ds[i - 1]);
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				P cp = isLL(ps[0][i], ps[n + 1][i], ps[j][0], ps[j][n + 1]);
				ps[j][i] = cp;
			}
		}
		// for (int i = 0; i <= n + 1; i++) {
		// System.out.println(Arrays.toString(ps[i]));
		// }
		double max = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				max = Math.max(
						max,
						calcArea(ps[j][i], ps[j][i + 1], ps[j + 1][i + 1],
								ps[j + 1][i]));
			}
		}
		System.out.printf("%.10f\n", max);
	}

	double calcArea(P a, P b, P c, P d) {
		return Math.abs(a.sub(b).det(c.sub(b))) / 2
				+ Math.abs(a.sub(d).det(c.sub(d))) / 2;
	}

	// 直線と直線の交点
	P isLL(P p1, P p2, P q1, P q2) {
		double d = q2.sub(q1).det(p2.sub(p1));
		if (Math.abs(d) < EPS)
			return null;
		return p1.add(p2.sub(p1).mul(q2.sub(q1).det(q1.sub(p1)) / d));
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}

class P {
	double x;
	double y;

	P(double x, double y) {
		this.x = x;
		this.y = y;
	}

	P sub(P p) {
		return new P(x - p.x, y - p.y);
	}

	P add(P p) {
		return new P(x + p.x, y + p.y);
	}

	double det(P p) {
		return x * p.y - y * p.x;
	}

	P mul(double k) {
		return new P(k * x, k * y);
	}

	public String toString() {
		return "(" + x + " , " + y + ")";
	}
}