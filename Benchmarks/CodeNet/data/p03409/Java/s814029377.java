import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Point> red = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			Point p = new Point(a, b);
			red.add(p);
		}

		List<Point> blue = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			Point p = new Point(a, b);
			blue.add(p);
		}

		red.sort((a, b) -> a.a - b.a);
		blue.sort((a, b) -> a.a - b.a);

		for (Point bp : blue) {
			List<Point> possible = new ArrayList<>();
			for (Point rp : red) {
				if (bp.a < rp.a)
					break;

				if (bp.b > rp.b) {
					possible.add(rp);
				}
			}
			possible.sort((a, b) -> b.b - a.b);

			// System.out.println(possible);
			for (Point point : possible) {
				if (point.paired) {
					continue;
				} else {
					point.paired = true;
					break;
				}
			}
		}

		long count = red.stream().filter(p -> p.paired).count();
		System.out.println(count);
//
//		red.forEach(System.out::println);
//		blue.forEach(System.out::println);

		sc.close();
	}

}

class Point {
	@Override
	public String toString() {
		return "Point [a=" + a + ", b=" + b + ", paired=" + paired + "]";
	}

	int a;
	int b;
	Boolean paired = false;

	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}

}