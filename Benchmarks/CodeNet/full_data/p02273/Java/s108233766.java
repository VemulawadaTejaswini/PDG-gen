
import java.io.*;

class Point {
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.x + " " + this.y;
	}
	public double x, y;
}

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(100.0, 0.0);
		System.out.println(p1);
		kochcurv(p1, p2, n);
		System.out.println(p2);
	}
	public static void kochcurv(Point p1, Point p2, int n) {
		if (n == 0) {
			return;
		}
		Point s, t, u;
		s = new Point(
			(2.0 * p1.x + p2.x) / 3.0, (2.0 * p1.y + p2.y) / 3.0);
		t = new Point(
			(p1.x + 2.0 * p2.x) / 3.0, (p1.y + 2.0 * p2.y) / 3.0);
		u = new Point(
			(t.x - s.x) * Math.cos(RADIAN_60) - (t.y - s.y) * Math.sin(RADIAN_60) + s.x,
			(t.x - s.x) * Math.sin(RADIAN_60) + (t.y - s.y) * Math.cos(RADIAN_60) + s.y);
		kochcurv(p1, s, n - 1);
		System.out.println(s);
		kochcurv(s, u, n - 1);
		System.out.println(u);
		kochcurv(u, t, n - 1);
		System.out.println(t);
		kochcurv(t, p2, n - 1);
	}
	public static final double RADIAN_60 = Math.PI * 60.0 / 180.0;
}