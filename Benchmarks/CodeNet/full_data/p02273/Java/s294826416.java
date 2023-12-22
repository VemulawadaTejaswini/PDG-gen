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

	private static Point getPoint(Point start, Point end, double d) {
		double deltaX = end.x - start.x;
		double deltaY = end.y - start.y;
		deltaX = deltaX * d;
		deltaY = deltaY * d;				
		return new Point(start.x + deltaX, start.y + deltaY);
	}

	private static Point getSecondPoint(Point start, Point end, Point second, Point third) {
		double deltaX = third.x - second.x;
		double deltaY = third.y - second.y;
		double len = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));		
		double x;
		double y;
		if (deltaY == 0) {
			x = start.x + (end.x - start.x) / 2;
			double height = Math.sqrt((Math.pow(len, 2) - Math.pow(len / 2.0, 2)));
			if (start.x < end.x) {
				y = second.y + height;
			} else {
				y = second.y - height;
			}
		} else if (start.x < end.x && start.y < end.y) {
			x = start.x;
			y = third.y;
		} else if (start.x < end.x && start.y > end.y) {
			x = end.x;
			y = second.y;
		} else if (start.x > end.x && start.y < end.y) {
			x = end.x;
			y = second.y;
		} else {
			x = start.x;
			y = third.y;
		}
		return new Point(x, y);
	}
}

