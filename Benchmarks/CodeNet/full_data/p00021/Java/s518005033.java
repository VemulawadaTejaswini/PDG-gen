import java.io.IOException;
import java.util.Scanner;

/**
 */
class main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			Point p1 = getPoint(in);
			Point p2 = getPoint(in);
			Point p3 = getPoint(in);
			Point p4 = getPoint(in);

//			if(PointUtil.isParallel(p1, p2, p3, p4)) {
				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
		}
	}

	public static Point getPoint(Scanner in) {
		double x = in.nextDouble();
		double y = in.nextDouble();
		return new Point(x, y);
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