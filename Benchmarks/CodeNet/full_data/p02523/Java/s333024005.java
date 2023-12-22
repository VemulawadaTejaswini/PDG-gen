import java.util.*;

class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Point[] points = new Point[2];
		for (int i = 0; i < 2; i++) {
			points[i] = new Point(sc.nextDouble(),sc.nextDouble());
		}

		double x = points[0].getX() - points[1].getX();
		double y = points[0].getY() - points[1].getY();
		double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

		System.out.printf("%.6f \n",distance);
	}
}