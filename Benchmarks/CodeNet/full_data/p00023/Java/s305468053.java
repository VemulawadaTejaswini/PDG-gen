import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.isNaN;
import static java.lang.StrictMath.sqrt;
import static jdk.nashorn.internal.runtime.ScriptRuntime.EQ;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			Point pa = new Point(in.nextDouble(), in.nextDouble());
			double ra = in.nextDouble();
			Point pb = new Point(in.nextDouble(), in.nextDouble());
			double rb = in.nextDouble();

			Circle ca = new Circle(pa, ra);
			Circle cb = new Circle(pb, rb);

			int ans = CircleUtil.calcIntersection(ca, cb);

			System.out.println(ans);
		}
	}
}

class CircleUtil {
	private static final double EPS = 1e-10;

	/**
	 * ???????????????????????????
	 * @param ca
	 * @param cb
	 * @return 2: cb???ca??????????????? -2: ca???cb??????????????? 1: ca??¨cb?????????????????????(???????????????????????????), 0: ?????????????????????????????????????????????
	 */
	public static int calcIntersection(Circle ca, Circle cb) {
		double r = PointUtil.dist(ca.getCenter(), cb.getCenter());
		double ra = ca.getR();
		double rb = cb.getR();
		if(r > (ra+rb)) {
			return 0; // no cross
		}

		if(r + ra < rb) {
			return -2;
		}

		if(r + rb < ra) {
			return 2;
		}

		return 1; // cross
	}

	public static void swap(Point a, Point b) {
		double tx = a.x, ty = a.y;
		a.x = b.x; a.y = b.y;
		b.x = tx; b.y = ty;
	}

	public static void swapXY(Point p1) {
		double buf = p1.getX();
		p1.x = p1.y;
		p1.y = buf;
	}
}

class Circle {
	Point center;
	double r;

	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
}

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point getMinus(Point p2) {
		double sx = this.x - p2.getX();
		double sy = this.y - p2.getY();
		return new Point(sx,sy);
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
	public static double EPS = 1e-10;

	public static double dist(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2.0) + Math.pow(p2.getY() - p1.getY(), 2.0));
	}

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

		return Math.acos((a1*b1+a2*b2) / ( Math.sqrt(a1*a1 + a2*a2) * Math.sqrt(b1*b1 + b2*b2)));
	}

	public static boolean isParallel(Point a1, Point a2, Point b1, Point b2) {
		return EQ(cross(a1.getMinus(a2), b1.getMinus(b2)), 0.0);
	}

	public static double cross(Point a, Point b) {
		return a.getX()*b.getY() - a.getY()*b.getX();
	}

	public static boolean EQ(double left, double right) {
		if(Math.abs(left - right) <= EPS) {
			return true;
		}
		return false;
	}
}