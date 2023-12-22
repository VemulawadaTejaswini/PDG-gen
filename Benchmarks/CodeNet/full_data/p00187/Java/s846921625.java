import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if ((x1 | y1 | x2 | y2) == 0)
				break;
			TSegment s1 = new TSegment(new TPoint(x1, y1), new TPoint(x2, y2));
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			TSegment s2 = new TSegment(new TPoint(x1, y1), new TPoint(x2, y2));
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			TSegment s3 = new TSegment(new TPoint(x1, y1), new TPoint(x2, y2));
			TPoint A = new TPoint();
			TPoint B = new TPoint();
			TPoint C = new TPoint();
			boolean flag = true;
			if (s1.calcIntersection(A, s2) == 0)
				flag = false;
			if (s2.calcIntersection(B, s3) == 0)
				flag = false;
			if (s1.calcIntersection(C, s3) == 0)
				flag = false;
			// 線分の交点を頂点とする三角形の面積 運勢
			// 1,900,000以上 大吉 (dai-kichi)
			// 1,000,000以上1,900,000未満 中吉 (chu-kichi)
			// 100,000以上1,000,000未満 吉 (kichi)
			// 0より大きく 100,000未満 小吉 (syo-kichi)
			// 三角形なし 凶 (kyo)
			if (flag) {
				double area = calcArea(A, B, C);
				if (area >= 1900000)
					System.out.println("dai-kichi");
				else if (area >= 1000000 && area < 1900000)
					System.out.println("chu-kichi");
				else if (area >= 100000 && area < 1000000)
					System.out.println("kichi");
				else if (area > 0 && area < 100000)
					System.out.println("syo-kichi");
				else
					System.out.println("kyo");
			} else {
				System.out.println("kyo");
			}
		}
	}

	public static double calcArea(TPoint A, TPoint B, TPoint C) {
		return Math.abs((B.x - A.x) * (C.y - A.y) - (C.x - A.x) * (B.y - A.y)) / 2.0;
	}
}

class TPoint {

	double x, y;

	public TPoint(TPoint poi) {
		x = poi.x;
		y = poi.y;
	}

	public TPoint() {
	};

	public TPoint(double _x, double _y) {
		x = _x;
		y = _y;
	}

	void set(double _x, double _y) {
		x = _x;
		y = _y;
	}

	// 仮の距離を計算する
	static double fdist(TPoint p1, TPoint p2) {

		return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
	}

	public void print(PrintStream os) {

		os.print("(" + x + "," + y + ")");
	}

	public void read(DataInputStream is) throws IOException {

		x = is.readDouble();
		y = is.readDouble();
	}

}

/**
 * 直線を管理するクラス
 *
 */

class TLine {

	double a, b, c;

	TLine(double _a, double _b, double _c) {
		a = _a;
		b = _b;
		c = _c;
	}

	TLine() {
	}

	TLine(TPoint p1, TPoint p2) {

		assign(p1, p2);
	}

	TLine(TPoint p1, double dx, double dy) {

		assign(p1, dx, dy);
	}

	// 2点を通る直線を計算する
	public void assign(TPoint p1, TPoint p2) {

		a = p2.y - p1.y;
		b = p1.x - p2.x;
		c = p2.x * p1.y - p1.x * p2.y;

	}

	// 1点と傾きが与えられたときの直線を計算する
	public void assign(TPoint p1, double dx, double dy) {

		a = dy;
		b = -dx;
		c = p1.y * dx - p1.x * dy;

	}

	// 直線同士の交点を求める
	public int calcIntersection(TPoint p1, TLine li) {

		double D = a * li.b - li.a * b;

		if (D == 0)
			return 0;

		p1.x = (b * li.c - li.b * c) / D;
		p1.y = (li.a * c - a * li.c) / D;

		return 1;
	}

	// 傾きに逆変換する
	public void getKata(double d[]) {

		d[0] = -b;
		d[1] = a;
	}

	// 表示する
	public void print(PrintStream os) {

		os.print("(" + a + "," + b + "," + c + ")");
	}
}

class TSegment {

	TPoint p1, p2;

	TSegment(TPoint p1_, TPoint p2_) {

		assign(p1_, p2_);
	}

	public void assign(TPoint p1_, TPoint p2_) {

		p1 = new TPoint(p1_);
		p2 = new TPoint(p2_);
	}

	// 線分と直線の交点を求める
	public int calcIntersection(TPoint p3, TLine li) {

		if (li.calcIntersection(p3, new TLine(p1, p2)) > 0) {

			// 誤差をさけるため
			if (Math.abs(p1.x - p2.x) > Math.abs(p1.y - p2.y)) {

				if (Math.min(p1.x, p2.x) <= p3.x
						&& p3.x <= Math.max(p1.x, p2.x))
					return 1;
			} else {
				if (Math.min(p1.y, p2.y) <= p3.y
						&& p3.y <= Math.max(p1.y, p2.y))
					return 1;
			}
		}

		return 0;
	}

	// 線分同士の交点を求める
	public int calcIntersection(TPoint p3, TSegment li) {

		if (li.calcIntersection(p3, new TLine(p1, p2)) > 0) {

			// 誤差をさけるため
			if (Math.abs(p1.x - p2.x) > Math.abs(p1.y - p2.y)) {

				if (Math.min(p1.x, p2.x) <= p3.x
						&& p3.x <= Math.max(p1.x, p2.x))
					return 1;
			} else {
				if (Math.min(p1.y, p2.y) <= p3.y
						&& p3.y <= Math.max(p1.y, p2.y))
					return 1;
			}
		}

		return 0;
	}

	// 直線上での反射を計算する
	public void reflect(double d[]) {

		// 回転する
		double theta = -Math.atan2(p2.y - p1.y, p2.x - p1.x);

		double dx2 = d[0] * Math.cos(theta) - d[1] * Math.sin(theta);
		double dy2 = d[0] * Math.sin(theta) + d[1] * Math.cos(theta);

		// 反射処理
		dy2 = -dy2;

		// 逆回転
		d[0] = dx2 * Math.cos(-theta) - dy2 * Math.sin(-theta);
		d[1] = dx2 * Math.sin(-theta) + dy2 * Math.cos(-theta);
	}

	// 表示する
	public void print(PrintStream os) {

		p1.print(os);
		os.print("-");
		p2.print(os);
	}
}