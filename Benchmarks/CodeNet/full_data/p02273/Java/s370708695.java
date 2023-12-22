import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		Point point1 = new Point(0, 0);
		Point point2 = new Point(100, 0);
		System.out.println(point1);
		koc(n, point1, point2);
		System.out.println(point2);
	}

	private static void koc(int n, Point point1, Point point2) {
		if (n == 0)
			return;

		Point[] point = new Point[3];
		point[0] = new Point((2 * point1.x + point2.x) / 3, (2 * point1.y + point2.y) / 3);
		point[1] = new Point((point1.x + 2 * point2.x) / 3, (point1.y + 2 * point2.y) / 3);

		double x = (point[1].x - point[0].x) * Math.cos(60 * Math.PI / 180)
				- (point[1].y - point[0].y) * Math.sin(60 * Math.PI / 180) + point[0].x;
		double y = (point[1].x - point[0].x) * Math.sin(60 * Math.PI / 180)
				+ (point[1].y - point[0].y) * Math.cos(60 * Math.PI / 180) + point[0].y;
		point[2] = new Point(x, y);

		koc(n - 1, point1, point[0]);
		System.out.println(point[0]);
		koc(n - 1, point[0], point[2]);
		System.out.println(point[2]);
		koc(n - 1, point[2], point[1]);
		System.out.println(point[1]);
		koc(n - 1, point[1], point2);
	}
}

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return (x + " " + y);
	}
}