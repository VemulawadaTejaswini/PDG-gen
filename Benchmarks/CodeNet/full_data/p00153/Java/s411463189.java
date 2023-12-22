import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|\\s+");
		while (true) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			if ((x1 | y1) == 0)
				break;
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			int r = sc.nextInt();
			// 1行目 三角形の第1の頂点の座標x1 y1（整数 整数；半角空白区切り）
			// 2行目 三角形の第2の頂点の座標x2 y2（整数 整数；半角空白区切り）
			// 3行目 三角形の第3の頂点の座標x3 y3（整数 整数；半角空白区切り）
			// 4行目 円の中心の座標x4 y4（整数 整数；半角空白区切り）
			// 5行目 円の半径r（整数）
			//
			Point2D.Double[] ps = new Point2D.Double[4];
			ps[0] = new Point2D.Double(x1, y1);
			ps[1] = new Point2D.Double(x2, y2);
			ps[2] = new Point2D.Double(x3, y3);
			ps[3] = new Point2D.Double(x4, y4);
			boolean flag = true;
			for (int i = 0; i < 3; i++) {
				if (!(nor(ps[3], ps[i]) <= r * r))
					flag = false;
			}
			if (flag) {
				System.out.println("b");
				continue;
			}
			double min = Double.MAX_VALUE;
			for (int i = 0; i < 3; i++) {
				double dis = Math.max(Line.distanceSP(new Line(ps[i],
						ps[(i + 1) % 3]), ps[3]), Line.distanceSP(new Line(
						ps[i], ps[(i + 1) % 3]), ps[3]));
				min = Math.min(min, dis);
			}
			boolean right = true;
			boolean left = true;
			for (int i = 0; i < 3; i++) {
				double ep = Line.extp(Line.sub(ps[(i + 1) % 3], ps[i]),
						Line.sub(ps[3], ps[i]));
				if (ep < 0)
					left = false;
				else if (ep > 0)
					right = false;
			}
			boolean in = left | right;
			if (r <= min && in)
				System.out.println("a");
			else if (!in && r < min)
				System.out.println("d");
			else
				System.out.println("c");
		}
	}

	public static double nor(Point2D.Double p, Point2D.Double q) {
		return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
	}
}

// Output
//
// 入力データセットごとに以下の判定結果を出力します。
//
// 円が三角形に含まれる場合 a
// 三角形が円に含まれる場合 b
// それ以外の場合で、共通部分がある場合には c
// 共通部分がない場合には d

class Line {
	public Point2D.Double p1;
	public Point2D.Double p2;

	Line(Point2D.Double p1, Point2D.Double p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public double length() {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
				* (p1.y - p2.y));
	}

	public double ip(Line l) {
		Point2D.Double q1 = l.p1;
		Point2D.Double q2 = l.p2;
		return (p2.x - p1.x) * (q2.x - q1.x) + (p2.y - p1.y) * (q2.y - q1.y);
	}

	public double ep(Line l) {
		Point2D.Double q1 = l.p1;
		Point2D.Double q2 = l.p2;
		return (p2.x - p1.x) * (q2.y - q1.y) - (p2.y - p1.y) * (q2.x - q1.x);
	}

	public static double distanceSP(Line s, Point2D.Double p) {
		Point2D.Double r = proj(s, p);
		if (intersectSP(s, r))
			return norm(sub(r, p));
		return Math.min(norm(sub(s.p1, p)), norm(sub(s.p2, p)));
	}

	public static boolean intersectSP(Line s, Point2D.Double p) {
		return ccw(s.p1, s.p2, p) == 0;
	}

	public static int ccw(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		Point2D.Double p = sub(b, a);
		Point2D.Double q = sub(c, a);
		if (extp(p, q) > EPS)
			return 1; // counter clockwise
		if (extp(p, q) < -EPS)
			return -1; // clockwise
		if (inp(p, q) < -EPS)
			return 2; // c--a--b on line
		if (Math.abs(norm(p) - norm(q)) < EPS)
			return -2; // a--b--c on line
		return 0; // a--c--b(or a--c=b) on line
	}

	public static Point2D.Double sub(Point2D.Double p1, Point2D.Double p2) {
		return new Point2D.Double(p1.x - p2.x, p1.y - p2.y);
	}

	public static Point2D.Double proj(Line l, Point2D.Double p) {
		double t = inp(sub(p, l.p1), sub(l.p1, l.p2))
				/ Math.pow(norm(sub(l.p1, l.p2)), 2);
		Point2D.Double tp = sub(l.p1, l.p2);
		return new Point2D.Double(l.p1.x + t * tp.x, l.p1.y + t * tp.y);
	}

	public static double inp(Point2D.Double p1, Point2D.Double p2) {
		return p1.x * p2.x + p1.y * p2.y;
	}

	public static double extp(Point2D.Double p1, Point2D.Double p2) {
		return p1.x * p2.y - p2.x * p1.y;
	}

	public static final double EPS = 1.0e-8;

	public static double norm(Point2D.Double p) {
		return Math.hypot(p.x, p.y);
	}

	public double disToPoint(Point2D.Double q1) {
		Line p1q1 = new Line(p1, q1);
		double ip1 = p1q1.ip(this);
		double ip2 = this.ip(this);
		if (ip1 <= 0)
			return p1q1.length();
		else if (0 < ip1 && ip1 < ip2) {
			double d2 = ip1 / this.length();
			double size = p1q1.length();
			return Math.sqrt(size * size - d2 * d2);
		} else {
			Line p2q1 = new Line(p2, q1);
			return p2q1.length();
		}
	}

	public boolean isCross(Line q1q2) {
		Point2D.Double q1 = q1q2.p1;
		Point2D.Double q2 = q1q2.p2;
		Line p1q1 = new Line(p1, q1);
		Line p1q2 = new Line(p1, q2);
		Line q1p1 = new Line(q1, p1);
		Line q1p2 = new Line(q1, p2);
		if (this.ep(p1q1) * this.ep(p1q2) < 0
				&& q1q2.ep(q1p1) * q1q2.ep(q1p2) < 0)
			return true;
		else
			return false;
	}

	public double minDistance(Line q1q2) {
		if (this.isCross(q1q2))
			return 0;
		double ans = Double.MAX_VALUE;
		Point2D.Double q1 = q1q2.p1;
		Point2D.Double q2 = q1q2.p2;
		ans = Math.min(ans, this.disToPoint(q1));
		ans = Math.min(ans, this.disToPoint(q2));
		ans = Math.min(ans, q1q2.disToPoint(p1));
		ans = Math.min(ans, q1q2.disToPoint(p2));
		return ans;
	}

	public String toString() {
		return p1 + "=>" + p2;
	}
}