import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	static class Edge {
		double a, b;
		boolean isTop;
		boolean isRight;

		Edge(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
			if (a.x == b.x) {
				this.a = Double.POSITIVE_INFINITY;
				this.b = Double.NaN;
				isTop = false;
				if (a.x < c.x) {
					isRight = true;
				} else {
					isRight = false;
				}
			} else if (a.y == b.y) {
				this.a = 0;
				this.b = a.y;
				isRight = false;
				if (a.y < c.y) {
					isTop = true;
				} else {
					isTop = false;
				}
			} else {
				this.a = (b.y - a.y) / (b.x - a.x);
				this.b = a.y - this.a * a.x;
				if (this.a * c.x + this.b < c.y) {
					isTop = true;
				} else {
					isTop = false;
				}
				if ((c.y - this.b) / this.a < c.x) {
					isRight = true;
				} else {
					isRight = false;
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double p1, p2, p3, x;
		Edge e1, e2, e3;
		boolean flag = true;

		p1 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
		p2 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
		p3 = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
		x  = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
		e1 = new Edge(p1, p2, p3);
		e2 = new Edge(p2, p3, p1);
		e3 = new Edge(p3, p1, p2);

		if (e1.a == e2.a) {
			flag = false;
		}
		if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
			flag = false;
		}

		if (e1.a == Double.POSITIVE_INFINITY) {
			if (e1.isRight && x.x <= (x.y - e1.b) / e1.a) {
				flag = false;
			} else if (!e1.isRight && (x.y - e1.b) / e1.a <= x.x) {
				flag = false;
			}
		} else {
			if (e1.isTop && x.y <= e1.a * x.x + e1.b) {
				flag = false;
			} else if (!e1.isTop && e1.a *  x.x + e1.b <= x.y) {
				flag = false;
			}
		}
		if (e2.a == Double.POSITIVE_INFINITY) {
			if (e2.isRight && x.x <= (x.y - e2.b) / e2.a) {
				flag = false;
			} else if (!e2.isRight && (x.y - e2.b) / e2.a <= x.x) {
				flag = false;
			}
		} else {
			if (e2.isTop && x.y <= e2.a * x.x + e2.b) {
				flag = false;
			} else if (!e2.isTop && e2.a *  x.x + e2.b <= x.y) {
				flag = false;
			}
		}
		if (e3.a == Double.POSITIVE_INFINITY) {
			if (e3.isRight && x.x <= (x.y - e3.b) / e3.a) {
				flag = false;
			} else if (!e3.isRight && (x.y - e3.b) / e3.a <= x.x) {
				flag = false;
			}
		} else {
			if (e3.isTop && x.y <= e3.a * x.x + e3.b) {
				flag = false;
			} else if (!e3.isTop && e3.a *  x.x + e3.b <= x.y) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}