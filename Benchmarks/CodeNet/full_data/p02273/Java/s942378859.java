
import java.util.Scanner;

public class Main {

	static int n;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		n = in.nextInt();

		System.out.println(p1);

		koch(n, p1, p2);

		System.out.println(p2);
		in.close();


	}
	static void koch(int i, Point p1, Point p2) {
		if (i == 0) {
			return;
		}
		double th = Math.toRadians(60);

		double sx = (p1.x * 2 + p2.x) / 3;
		double sy = (p1.y * 2 + p2.y) / 3;
		double tx = (p1.x + p2.x * 2) / 3;
		double ty = (p1.y + p2.y * 2) / 3;

		// TODO: 回転後の座標の求め方
		double ux = (tx - sx) * Math.cos(th) - (ty - sy) * Math.sin(th) + sx;
		double uy = (tx - sx) * Math.sin(th) - (ty - sy) * Math.cos(th) + sy;

		Point s = new Point(sx, sy);
		Point u = new Point(ux, uy);
		Point t = new Point(tx, ty);

		koch(i-1, p1, s);
		System.out.println(s);

		koch(i-1, s, u);
		System.out.println(u);

		koch(i-1, u, t);
		System.out.println(t);

		koch(i-1, t, p2);
	}
	static class Point {
		double x;
		double y;
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("%.8f", this.x) + " " + String.format("%.8f", this.y);
		}
	}

}

