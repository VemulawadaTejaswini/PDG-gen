import java.util.*;

public class Main {
	private static class Point {
		public int x, y, h;

		public Point(String[] tokens) {
			this.x = Integer.parseInt(tokens[0]);
			this.y = Integer.parseInt(tokens[1]);
			this.h = Integer.parseInt(tokens[2]);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		List<Point> points = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.nextLine().split(" ");
			points.add(new Point(tokens));
		}
		Collections.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if (o1.h > o2.h) {
					return -1;
				} else if (o1.h < o2.h) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		// 最初の要素で高さを求める
		Point refer = points.get(0);
		int resultcx = -1, resultcy = -1, resultheight = -1;
		List<Point> validatePoints = points.subList(1, points.size());
		for (int cy = 0; cy <= 100; ++cy) {
			for (int cx = 0; cx <= 100; ++cx) {
				int height = getHeight(refer, cx, cy);
				if (validate(validatePoints, cx, cy, height)) {
					resultcx = cx;
					resultcy = cy;
					resultheight = height;
					break;
				}
			}
			if (resultheight > 0) {
				break;
			}
		}
		System.out.println(resultcx + " " + resultcy + " " + resultheight);

		in.close();
	}

	private static int getHeight(Point point, int cx, int cy) {
		return point.h + Math.abs(point.x - cx) + Math.abs(point.y - cy);
	}

	private static boolean validate(List<Point> points, int cx, int cy, int height) {
		for (Point point : points) {
			if (Math.max(height - Math.abs(point.x - cx) - Math.abs(point.y - cy), 0) != point.h) {
				return false;
			}
		}
		return true;
	}
}
