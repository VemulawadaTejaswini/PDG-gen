import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	class P implements Comparable<P> {
		double x, y;

		P(double x_, double y_) {
			x = x_;
			y = y_;
		}

		P add(P p) {
			return new P(x + p.x, y + p.y);
		}

		P sub(P p) {
			return new P(x - p.x, y - p.y);
		}

		P mul(double v) {
			return new P(x * v, y * v);
		}

		P div(double v) {
			return new P(x / v, y / v);
		}

		double dot(P p) {
			return x * p.x + y * p.y;
		}

		double det(P p) {
			return x * p.y - y * p.x;
		}

		double abs2() {
			return x * x + y * y;
		}

		double abs() {
			return Math.sqrt(abs2());
		}

		P norm() {
			return div(abs());
		}

		P rot90() {
			return new P(-y, x);
		}

		P proj(P src, P dst) {
			P p_sd = dst.sub(src).norm();
			return src.add(p_sd.mul(sub(src).dot(p_sd)));
		}

		P reflect(P src, P dst) {
			P middle = proj(src, dst);
			return add(middle.sub(this).mul(2));
		}

		public String toString() {
			return String.format("%f %f", x, y);
		}

		@Override
		public int compareTo(P o) {
			if (Math.abs(x - o.x) > 1e-6)
				return Double.compare(x, o.x);
			else {
				return Double.compare(y, o.y);
			}
		}
	}

	P isLL(P p1, P p2, P q1, P q2) {
		double d = p2.sub(p1).det(q1.sub(q2));
		if (Math.abs(d) < 1e-10)
			return null;
		return p1.add(p2.sub(p1).mul(q1.sub(q2).det(p1.sub(q2)) / d));
	}

	P[] isCC(P c1, double r1, P c2, double r2) {
		ArrayList<P> ret = new ArrayList<>();
		double d = c1.sub(c2).abs();
		if (d < 1e-10)
			return new P[0];
		double cos = (r1 * r1 + d * d - r2 * r2) / (2 * d * r1);
		P midP = c1.add(c2.sub(c1).norm().mul(r1 * cos));
		double h = r1 * Math.sqrt(1 - cos * cos);
		ret.add(midP.add(c2.sub(c1).norm().rot90().mul(h)));
		if (h == 0)
			return new P[] { midP.add(c2.sub(c1).norm().rot90().mul(h)) };
		else {
			return new P[] { midP.add(c2.sub(c1).norm().rot90().mul(h)), midP.add(c2.sub(c1).norm().rot90().mul(-h)) };
		}
	}

	boolean intersect(P p1, P p2, P q1, P q2) {
		return Line2D.linesIntersect(p1.x, p1.y, p2.x, p2.y, q1.x, q1.y, q2.x, q2.y);
	}

	double distSS(P p1, P p2, P q1, P q2) {
		if (intersect(p1, p2, q1, q2))
			return 0;
		double dist = Double.MAX_VALUE;
		for (double d : new double[] { distSP(p1, p2, q1), distSP(p1, p2, q2), distSP(q1, q2, p1),
				distSP(q1, q2, p2) }) {
			dist = Math.min(d, dist);
		}
		return dist;
	}

	double distSP(P p1, P p2, P p) {
		return Line2D.ptSegDist(p1.x, p1.y, p2.x, p2.y, p.x, p.y);
	}

	void run() {

		Scanner sc = new Scanner(System.in);
		P c1 = new P(sc.nextDouble(), sc.nextDouble());
		double r1 = sc.nextDouble();
		P c2 = new P(sc.nextDouble(), sc.nextDouble());
		double r2 = sc.nextDouble();
		P[] ps = isCC(c1, r1, c2, r2);
		Arrays.sort(ps);
		if (ps.length == 1) {
			System.out.println(ps[0].toString() + " " + ps[0].toString());
		} else {
			System.out.println(ps[0].toString() + " " + ps[1].toString());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}