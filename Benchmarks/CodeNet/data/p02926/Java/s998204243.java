import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN  = scan.nextInt();

		List<Point> list = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			Point p = new Point(x, y);
			list.add(p);

			if (p.degree < 0) {
				Point p1 = new Point(x, y);
				p1.degree += 360;
				list.add(p1);
			}
		}

		Collections.sort(list);

		List<Double> list2 = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			double base = list.get(i).degree;
			double x = 0.0;
			double y = 0.0;
			for (Point p: list) {
				if (p.degree >= base && p.degree < base + 180) {
					x += p.x;
					y += p.y;
				}
			}

			double length = Math.sqrt(x * x + y * y);

			list2.add(length);
		}

		Collections.sort(list2, Comparator.reverseOrder());
		System.out.println(list2.get(0));
	}
}
class Point implements Comparable<Point>{
	int x;
	int y;
	double degree;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.degree = Math.toDegrees(Math.atan2(y, x));
	}

	public int compareTo(Point p) {

		return Double.compare(this.degree, p.degree);
	}
}