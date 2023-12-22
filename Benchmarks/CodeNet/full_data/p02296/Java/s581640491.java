import java.util.Scanner;

public class Main {
	static final double EPS = 0.00000000001;
	static final int COUNTER_CLOCKWISE = 1;
	static final int CLOCKWISE = -1;
	static final int ONLINE_BACK = 2;
	static final int ONLINE_FRONT = -2;
	static final int ON_SEGMENT = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			double[]p0 = new double[2];
			double[]p1 = new double[2];
			double[]p2 = new double[2];
			double[]p3 = new double[2];
			p0[0] = scan.nextInt();
			p0[1] = scan.nextInt();
			p1[0] = scan.nextInt();
			p1[1] = scan.nextInt();
			p2[0] = scan.nextInt();
			p2[1] = scan.nextInt();
			p3[0] = scan.nextInt();
			p3[1] = scan.nextInt();
			double ans = getDistance(p0, p1, p2, p3);
			System.out.println(ans);
		}
		scan.close();
	}
	static int ccw(double[]p0, double[]p1, double[]p2) {
		double[]a = vec(p0, p1);
		double[]b = vec(p0, p2);
		if(cross(a, b) > EPS) return COUNTER_CLOCKWISE;
		if(cross(a, b) < -EPS) return CLOCKWISE;
		if(dot(a, b) < -EPS) return ONLINE_BACK;
		if(norm(a) < norm(b)) return ONLINE_FRONT;
		return ON_SEGMENT;
	}
	static boolean intersect(double[]p1, double[]p2, double[]p3, double[]p4) {
		if(ccw(p1, p2, p3) * ccw(p1, p2, p4) <= 0 && ccw(p3, p4, p1) * ccw(p3, p4, p2) <= 0) {
			return true;
		}else {
			return false;
		}
	}
	static double getDistance(double[]a, double[]b, double[]c, double[]d) {
		if(intersect(a, b, c, d)) return 0.0;
		double t1 = getDistanceSP(a, b, c);
		double t2 = getDistanceSP(a, b, d);
		double t3 = getDistanceSP(c, d, a);
		double t4 = getDistanceSP(c, d, b);
		return Math.min(Math.min(t1, t2), Math.min(t3, t4));
	}
	static double getDistanceSP(double[]p1, double[]p2, double[]p) {
		double[]u1 = vec(p1, p2);
		double[]u2 = vec(p2, p1);
		double[]v = vec(p1, p);
		double[]w = vec(p2, p);
		if(dot(u1, v) < 0.0) return abs(v);
		if(dot(u2, w) < 0.0) return abs(w);
		return getDistanceLP(p1, p2, p);
	}
	static double getDistanceLP(double[]a, double[]b, double[]p) {
		double[]u = vec(a, b);
		double[]v = vec(a, p);
		double t1 = Math.abs(cross(u, v));
		double t2 = abs(u);
		return t1 / t2;

	}
	static double getDistance(double[]a, double[]b) {
		return abs(vec(a, b));
	}
	static double abs(double[]p) {
		return Math.sqrt(norm(p));
	}
	static double[] project(double[]p1, double[]p2, double[]p3) {
		double[]base = vec(p1, p2);
		double[]u = vec(p1, p3);
		double r = dot(u, base) / norm(base);
		double x = p1[0] + base[0]  * r;
		double y = p1[1] + base[1]  * r;
		double[]h = {x, y};
		return h;
	}
	static double norm(double[]p) {
		return p[0] * p[0] + p[1] * p[1];
	}
	static double[] vec(double[]p1, double[]p2) {
		double[]u = {p2[0] - p1[0], p2[1] - p1[1]};
		return u;
	}
	static double dot(double[]u, double[]v) {
		return u[0] * v[0] + u[1] * v[1];
	}
	static double cross(double[]u, double[]v) {
		return u[0] * v[1] - u[1] * v[0];
	}
}
