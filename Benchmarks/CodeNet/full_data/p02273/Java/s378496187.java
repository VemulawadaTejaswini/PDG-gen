import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static class Point {
		double x;
		double y;
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return String.format("%.8f %.8f", x, y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		reader.close();
		Point start = new Point(0, 0);
		Point end = new Point(100, 0);
		System.out.println(start);
		getKochCurve(0, n, start, end);
		System.out.println(end);
	}

	private static void getKochCurve(int i, int n, Point start, Point end) {		
		if (i < n) {
			Point firstPoint = getPoint(start, end, 1.0/3.0);
			Point thirdPoint = getPoint(start, end, 2.0/3.0);
			Point secondPoint = getSecondPoint(start, end, firstPoint, thirdPoint);
			getKochCurve(i + 1, n, start, firstPoint);
			System.out.println(firstPoint);
			getKochCurve(i + 1, n, firstPoint, secondPoint);
			System.out.println(secondPoint);
			getKochCurve(i + 1, n, secondPoint, thirdPoint);
			System.out.println(thirdPoint);
			getKochCurve(i + 1, n, thirdPoint, end);
		}
	}

	private static Point getPoint(Point start, Point end, double multi) {
		double deltaX = (end.x - start.x) * multi;
		double deltaY = (end.y - start.y) * multi;
		return new Point(start.x + deltaX, start.y + deltaY);
	}

	private static Point getSecondPoint(Point start, Point end, Point first, Point third) {
		double x, y;
		if (first.y == third.y) {
			double deltaX = third.x - first.x;
			double len = Math.sqrt(Math.pow(deltaX, 2));		
			double height = Math.sqrt((Math.pow(len, 2) - Math.pow(len / 2.0, 2)));
			x = start.x + (end.x - start.x) / 2;
			if (start.x < end.x) {
				y = first.y + height;
			} else {
				y = first.y - height;
			}
		} else if (start.x < end.x && start.y < end.y) {
			x = start.x;
			y = third.y;
		} else if (start.x < end.x && start.y > end.y) {
			x = end.x;
			y = first.y;
		} else if (start.x > end.x && start.y < end.y) {
			x = end.x;
			y = first.y;
		} else {
			x = start.x;
			y = third.y;
		}
		return new Point(x, y);
	}
}
