import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[]c1 = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
		double[]c2 = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
		scan.close();
		double[]ans = getCrossPoint(c1, c2);
		if(ans[0] > ans[2]) {
			System.out.printf("%10.8f %10.8f %10.8f %10.8f\n", ans[2], ans[3], ans[0], ans[1]);
		}else if(ans[0] == ans[2]) {
			if(ans[1] > ans[3]) {
				System.out.printf("%10.8f %10.8f %10.8f %10.8f\n", ans[2], ans[3], ans[0], ans[1]);
			}else {
				System.out.printf("%10.8f %10.8f %10.8f %10.8f\n", ans[0], ans[1], ans[2], ans[3]);
			}
		}else {
			System.out.printf("%10.8f %10.8f %10.8f %10.8f\n", ans[0], ans[1], ans[2], ans[3]);
		}
	}

	static double arg(double[]v) {
		return Math.atan2(v[1], v[0]);
	}
	static double[] polar(double a, double r) {
		double[]p = {Math.cos(r) * a, Math.sin(r) * a};
		return p;
	}
	static double[] getCrossPoint(double[]c1, double[]c2) {
		double[]u = {c1[0], c1[1]};
		double[]v = {c2[0], c2[1]};
		double d = abs(vec(u, v));
		double a = Math.acos((c1[2] * c1[2] + d * d - c2[2] * c2[2]) / (2 * c1[2] * d));
		double t = arg(vec(u, v));
		double[]k1 = polar(c1[2], t + a);

		double[]k2 = polar(c1[2], t - a);
		double[]k = {add(u, k1)[0], add(u, k1)[1], add(u, k2)[0], add(u, k2)[1]};
		return k;
	}
	static double[] add(double[]p1 , double[]p2) {
		double[]p = {p1[0] + p2[0], p1[1] + p2[1]};
		return p;
	}
	static double[] sub(double[]p1, double[]p2) {
		double[]p = {p1[0] - p2[0], p1[1] - p2[1]};
		return p;
	}
	static double[] getCrossPoints(double[]c, double[]p1, double[]p2) {
		double[]p3 = {c[0], c[1]};
		double[]h = project(p1, p2, p3);
		double[]e = vec(p1, p2);
		double l = abs(e);

		double base = Math.sqrt(c[2] * c[2] - norm(vec(p3, h)));
		e[0] *= base / l;
		e[1] *= base / l;
		double[]a = {h[0] + e[0], h[1] + e[1], h[0] - e[0], h[1] - e[1]};
		return a;
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
	static double abs(double[]p) {
		return Math.sqrt(norm(p));
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
