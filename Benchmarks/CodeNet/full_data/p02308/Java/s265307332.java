import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[]c = new double[3];
		c[0] = scan.nextDouble();
		c[1] = scan.nextDouble();
		c[2] = scan.nextDouble();
		int q  =scan.nextInt();
		for(int i = 0; i < q; i++) {
			double[]p1 = {scan.nextDouble(), scan.nextDouble()};
			double[]p2 = {scan.nextDouble(), scan.nextDouble()};
			double[]ans = getCrossPoints(c, p1, p2);
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
		scan.close();
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
