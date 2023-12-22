import static java.lang.Math.abs;
import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		g:
		for (;sc.hasNext();) {
			P[] ps = new P[6];
			for (int i = 0; i < 6; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				ps[i] = new P(x, y);
				if (i == 1 && ps[0].x == 0 && ps[0].y == 0 && x == 0 && y == 0) break g;
			}
			
			double area = solve(ps);
			
			String ans;
			if (area < EPS) { ans = "kyo"; }
			else if (area < 100000 - EPS) { ans = "syo-kichi"; }
			else if (area < 1000000 - EPS) { ans = "kichi"; }
			else if (area < 1900000 - EPS) { ans = "chu-kichi"; }
			else { ans = "dai-kichi"; }
			System.out.println(ans);
		}
	}
	
	double solve(P[] ps) {

		P p1 = intersectionSS(ps[0], ps[1], ps[2], ps[3]);
		P p2 = intersectionSS(ps[2], ps[3], ps[4], ps[5]);
		P p3 = intersectionSS(ps[4], ps[5], ps[0], ps[1]);
		if (p1 == null || p2 == null || p3 == null) {
			return -1;
		}
		return area(new P[]{p1, p2, p3});
	}

	double area(P[] v) {
		double ret = 0.0;
		int n = v.length;
		for (int i = 0; i < n; i++) {
			ret += v[i].det(v[(i + 1) % n]);
		}
		return abs(ret / 2.0);
	}
	
	P intersectionSS(P a1, P a2, P b1, P b2) {
		if (isIntersectSS(a1, a2, b1, b2)) {
			return intersectionLL(a1, a2, b1, b2);
		}
		return null;
	}
	
	final double EPS = 1e-10;

	static class P implements Comparable<P> {
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(P o) {
			return x != o.x ? Double.compare(x, o.x) : Double.compare(y, o.y);
		}
		public String toString() {
			return "(" + x + "," + y + ")";
		}
		public double abs() {return sqrt(x * x + y * y); }
		public double abs2() {return (x * x + y * y); }
		public double arg() { return atan2(y, x); } // (-pi ? pi)
		public double dist(P o) {return this.sub(o).abs(); }
		public P mul(double k) {return new P(x * k, y * k);}
		public P div(double k) {return new P(x / k, y / k);}
		public P add(P o) {return new P(x + o.x, y + o.y);}
		public P sub(P o) {return new P(x - o.x, y - o.y);}
		public P mul(P o) {return new P(x * o.x - y * o.y,  x * o.y + y * o.x); }
		public P div(P o) {return new P(x * o.x + y * o.y, -x * o.y + y * o.x).div(o.abs2()); }
		public double dot(P o) {return x * o.x + y * o.y;} // a b sin(t)
		public double det(P o) {return x * o.y - y * o.x;} // a b cos(t)
		public P normal() { return this.div(this.abs()); }
		public P rot90() { return new P(-y, x); }
		public static P polar(double d, double rad) {return new P(d * Math.cos(rad), d * Math.sin(rad));}
	}
	int ccw(P a, P b, P c) {
		double cross = (b.sub(a)).det(c.sub(a));
		if (cross > EPS) return +1;
		if (cross < EPS) return -1;
		return 0;
	}
	boolean isIntersectSS(P a1, P a2, P b1, P b2) {
		return ccw(a1, a2, b1) * ccw(a1, a2, b2) <= 0 && ccw(b1, b2, a1) * ccw(b1, b2, a2) <= 0;
	}
	P intersectionLL(P a1, P a2, P b1, P b2) {
		P a = a2.sub(a1);
		P b = b2.sub(b1);
		return a1.add(a.mul(b.det(b1.sub(a1))).div(b.det(a)));
	}
}