import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		Point[] red = new Point[N];
		Point[] blue = new Point[N];

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			red[i] = new Point(x, y);
		}

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			blue[i] = new Point(x, y);
		}

		Comparator<Point> cmp = new Comparator<Main.Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				if (o1.x == o2.x) {
					return o1.y - o2.y;
				} else {
					return o1.x - o2.x;
				}
			}
		};

		Arrays.sort(red, cmp);
		Arrays.sort(blue, cmp);
		boolean[] matched = new boolean[N];
		int pairs = 0;

		for (int i = 0; i < N; i++) {
			int bx = blue[i].x;
			int j = 0;
			int my = -1;
			int k = -1;
			while (j < red.length && red[j].x < bx) {
				if (!matched[j] && matchable(red[j], blue[i]) && my < red[j].y) {
					my = red[j].y;
					k = j;
				}
				j++;
			}
			if (k >= 0) {
				pairs += 1;
				matched[k] = true;
			}
		}
		System.out.println(pairs);

		sc.close();

	}

	private boolean matchable(Point r, Point b) {
		return (r.x < b.x) && (r.y < b.y);
	}

	class Point {
		public final int x;
		public final int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}