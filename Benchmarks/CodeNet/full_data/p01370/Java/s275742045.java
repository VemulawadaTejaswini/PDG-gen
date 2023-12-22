package p2253;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class Main {
	public static void pr(Object o) {
		System.out.println(o);
	}

	static class Point {
		int x;
		int y;

		public Point() {

		}

		public Point(int x, int y) {
			this.x = Math.max(Math.min(x, 30), -30);
			this.y = Math.max(Math.min(y, 30), -30);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Point) {
				Point p = (Point) obj;
				return x == p.x && y == p.y;
			}
			return false;
		}

		public int hashCode() {
			return x + 37 * y;
		}

		public String toString() {
			return x + "," + y;
		}
	}

	HashMap<Point, Integer> pmap;

	static Point[] dir;
	static {
		dir = new Point[] { new Point(1, 0), new Point(1, 1), new Point(0, 1),
				new Point(-1, 0), new Point(-1, -1), new Point(0, -1) };
	}
	int x, y;
	int t, n;
	int count;

	void move(Point p, int turn) {
		if ((pmap.get(p) == null || pmap.get(p) > turn) && turn <= t) {
			for (int i = 0; i < 6; i++) {
				Point _p = new Point();
				_p.x = p.x + dir[i].x;
				_p.y = p.y + dir[i].y;
				move(_p, turn + 1);
			}
			pmap.put(p, turn);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = 0;
			pmap = new HashMap<Point, Integer>();
			t = sc.nextInt();
			n = sc.nextInt();
			if (t == 0 && n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				Point p = new Point();
				p.x = sc.nextInt();
				p.y = sc.nextInt();
				pmap.put(p, -2);
			}
			Point zero = new Point();
			zero.x = sc.nextInt();
			zero.y = sc.nextInt();
			move(zero, 0);
			count = 0;
			if (pmap.size() > 0) {
				for (Entry<Point, Integer> p : pmap.entrySet()) {
					if (p.getValue() >= 0) {
						count++;
					}
				}
			}
			pr(count);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}