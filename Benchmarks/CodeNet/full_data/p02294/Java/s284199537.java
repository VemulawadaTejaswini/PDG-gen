import java.util.Scanner;

/**
 * Segments/Lines - Intersection
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		String[] words;

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			double xp0, yp0, xp1, yp1, xp2, yp2, xp3, yp3;
			xp0 = sc.nextDouble();
			yp0 = sc.nextDouble();
			xp1 = sc.nextDouble();
			yp1 = sc.nextDouble();
			xp2 = sc.nextDouble();
			yp2 = sc.nextDouble();
			xp3 = sc.nextDouble();
			yp3 = sc.nextDouble();

			Point p0, p1, p2, p3;
			p0 = new Point(xp0, yp0);
			p1 = new Point(xp1, yp1);
			p2 = new Point(xp2, yp2);
			p3 = new Point(xp3, yp3);

			if (Geometries.isIntersect(p0, p1, p2, p3)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	} //end main
}

class Geometries {

	static double EPS = 1e-10;

	//????????????
	static boolean equals(double a, double b) {
		return Math.abs(a - b) < EPS;
	}

	//
	static enum Order {
		COUNTER_CLOCKWISE(1),   //???????¨???????
		CLOCKWISE(-1),          //????¨???????
		ONLINE_BACK(2),         //???????????????????????´??????
		ONLINE_FRONT(-2),       //????????????????????´??????
		ON_SEGMENT(0);          //???????????????

		private int value;

		Order(int value) {
			this.value = value;
		}
	}

	//?????????
	static Order order(Point p0, Point p1, Point p2) {
		Point v1 = p1.subtract(p0);
		Point v2 = p2.subtract(p0);
		if (v1.outer(v2) > EPS) {return Order.COUNTER_CLOCKWISE;}
		if (v1.outer(v2) < -EPS) {return Order.CLOCKWISE;}
		if (v1.inner(v2) < -EPS) {return Order.ONLINE_BACK;}
		if (v1.norm() < v2.norm()) {return Order.ONLINE_FRONT;}
		return Order.ON_SEGMENT;
	}

	static Order order(Segment s, Point p) {
		Point p0 = s.p1;
		Point p1 = s.p2;
		return order(p0, p1, p);
	}

	//??´?????????
	static boolean isOrthogonal(Point a, Point b) {
		return equals(a.inner(b), 0.0);
	}

	static boolean isOrthogonal(Point a1, Point a2, Point b1, Point b2) {
		return isOrthogonal(
				a1.subtract(a2),
				b1.subtract(b2)
		);
	}

	static boolean isOrthogonal(Segment s1, Segment s2) {
		return isOrthogonal(
				s1.p2.subtract(s1.p1),
				s2.p2.subtract(s2.p1)
		);
	}

	//????????????
	static boolean isParallel(Point a, Point b) {
		return equals(a.outer(b), 0.0);
	}

	static boolean isParallel(Point a1, Point a2, Point b1, Point b2) {
		return isParallel(
				a1.subtract(a2),
				b1.subtract(b2)
		);
	}

	static boolean isParallel(Segment s1, Segment s2) {
		return isParallel(
				s1.p2.subtract(s1.p1),
				s2.p2.subtract(s2.p1)
		);
	}

	//????????????
	static boolean isIntersect(Point a1, Point a2, Point b1, Point b2) {
		Order o1, o2, o3, o4;
		o1 = order(a1, a2, b1);
		o2 = order(a1, a2, b2);
		o3 = order(b1, b2, a1);
		o4 = order(b1, b2, a2);

		if (((o1 == Order.COUNTER_CLOCKWISE && o2 == Order.CLOCKWISE)
				|| (o1 == Order.CLOCKWISE && o2 == Order.COUNTER_CLOCKWISE))
				&& ((o3 == Order.COUNTER_CLOCKWISE && o4 == Order.CLOCKWISE)
				|| (o3 == Order.CLOCKWISE && o4 == Order.COUNTER_CLOCKWISE))) {
			return true;
		}
		return false;
	}

	static boolean isIntersect(Segment s1, Segment s2) {
		Point a1 = s1.p1;
		Point a2 = s1.p2;
		Point b1 = s2.p1;
		Point b2 = s2.p2;
		return isIntersect(a1, a2, b1, b2);
	}
}

class Point implements Comparable<Point> {

	static double EPS = 1e-10;

	double x, y;

	Point() {
		this(0.0, 0.0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		if (equals(p)) {
			return 0;
		} else {
			if (x != p.x) {
				return Double.compare(y, p.y);
			} else {
				return Double.compare(x, p.x);
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return x - p.x < EPS && y - p.y < EPS;
	}

	Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}

	Point subtract(Point p) {
		return new Point(x - p.x, y - p.y);
	}

	Point multiply(double k) {
		return new Point(x * k, y * k);
	}

	Point devide(double k) {
		return new Point(x / k, y / k);
	}

	double inner(Point p) {
		return x * p.x + y * p.y;
	}

	double outer(Point p) {
		return x * p.y - y * p.x;
	}

	double norm() {
		return x * x + y * y;
	}

	double abs() {
		return Math.sqrt(norm());
	}
}

class Segment {
	Point p1, p2;

	public Segment() {
		this(new Point(), new Point());
	}

	public Segment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
}

class Circle {
	Point c;
	double r;

	public Circle() {
		this(new Point(), 0.0);
	}

	public Circle(Point c, double r) {
		this.c = c;
		this.r = r;
	}
}