import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

/**
 * Wrong Answer
 */
class Main {
	public static void main(String[] args) throws IOException {
		double EPS = 1e-6;
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			Point p1 = new Point(in.nextDouble(), in.nextDouble());
			Point p2 = new Point(in.nextDouble(), in.nextDouble());
			Point p3 = new Point(in.nextDouble(), in.nextDouble());
			Point p = new Point(in.nextDouble(), in.nextDouble());

			double angle = 0.0;
			// angle of (p-p3, p-p1)
			angle += Math.abs(PointUtil.angleRad(p3, p1, p));

			// angle of (p-p1, p-p2)
			angle += Math.abs(PointUtil.angleRad(p1, p2, p));

			// angle of (p-p2, p-p3)
			angle += Math.abs(PointUtil.angleRad(p2, p3, p));

			// 360 degree
			if(2 * Math.PI - EPS <= angle && angle <= 2 * Math.PI + EPS) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double len() {
		return x*x + y*y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

class PointUtil {
	/**
	 * angle of vec(p1-p) and vec(p2-p)
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static double angleRad(Point p1, Point p2, Point p) {
		double a1 = p1.getX() - p.getX();
		double a2 = p1.getY() - p.getY();
		double b1 = p2.getX() - p.getX();
		double b2 = p2.getY() - p.getY();

		return Math.acos((a1*b1+a2*b2) / ( sqrt(a1*a1 + a2*a2) * sqrt(b1*b1 + b2*b2)));
	}
}