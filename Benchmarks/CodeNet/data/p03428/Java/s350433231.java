import java.io.*;
import java.util.*;

public class Main {
	
	static class Point implements Comparable<Point> {
		static final Point ZERO = new Point(0, 0, -1);
		int x, y;
		int id;

		public Point(int x, int y, int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
		
		Point to(Point p) {
			return new Point(p.x - x, p.y - y, -1);
		}

		@Override
		public int compareTo(Point o) {
			if (y != o.y)
				return y < o.y ? -1 : 1;
			if (x != o.x)
				return x < o.x ? -1 : 1;
			return 0;
		}

		long cross(Point p) {
			return (long) x * p.y - (long) y * p.x;
		}
		
		long dot(Point p) {
			return (long)x * p.x + (long)y * p.y;
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ")";
		}

		public boolean equals(Point p) {
			return x == p.x && y == p.y;
		}
	}

	static int getTurn(Point A, Point B, Point C) {
		// angle between AB and AC
		long p1 = (long) (B.x - A.x) * (C.y - A.y);
		long p2 = (long) (B.y - A.y) * (C.x - A.x);
		if (p1 == p2)
			return 0;
		else
			return p1 < p2 ? -1 : 1;
	}

	/**
	 * PERMUTES POINTS IN ARRAY, consider using convexHull(a.clone()) Points
	 * themselves are modified inside method too, but changes are reverted at the end
	 * 
	 * @param a
	 *            - array of points
	 * @return convexHull of these point in CCW order, no duplicates, no three
	 *         points on one side
	 */
	static Point[] convexHull(Point[] a) {

		if (a == null)
			return null;
		if (a.length == 0)
			return new Point[] {};

		int st = 0;
		for (int i = 1; i < a.length; i++)
			if (a[i].compareTo(a[st]) < 0)
				st = i;

		Point tmp = a[0];
		a[0] = a[st];
		a[st] = tmp;

		int sx = a[0].x;
		int sy = a[0].y;

		for (int i = 0; i < a.length; i++) {
			a[i].x -= sx;
			a[i].y -= sy;
		}

		Arrays.sort(a, 1, a.length, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				if (o1.equals(o2))
					return 0;
				if (o1.equals(Point.ZERO)) {
					return -1;
				}
				if (o2.equals(Point.ZERO)) {
					return 1;
				}
				long val = o1.cross(o2);
				if (val != 0)
					return val > 0 ? -1 : 1;
				if (o1.y == 0) {
					return o1.x < o2.x ? -1 : 1;
				} else {
					return o1.y < o2.y ? -1 : 1;
				}
			}
		});

		Point[] h = new Point[a.length];
		int sz = 0;
		h[sz++] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].equals(h[sz - 1]))
				continue;
			while (sz > 1 && getTurn(h[sz - 2], h[sz - 1], a[i]) <= 0)
				sz--;
			h[sz++] = a[i];
		}

		for (int i = 0; i < a.length; i++) {
			a[i].x += sx;
			a[i].y += sy;
		}

		return Arrays.copyOf(h, sz);
	}

	void submit() {
		int n = nextInt();
		Point[] a = new Point[n];
		for (int i = 0; i < n; i++) {
			a[i] = new Point(nextInt(), nextInt(), i);
		}
		
		Point[] h = convexHull(a);
		double[] ans = new double[n];
		if (h.length == 1) {
			ans[h[0].id] = 1;
		} else if (h.length == 2) {
			ans[h[0].id] = ans[h[1].id] = 0.5; 
		} else {
			int m = h.length;
			for (int i = 0; i < m; i++) {
				int prv = (i + m - 1) % m;
				int nxt = (i + 1) % m;
				Point v1 = h[prv].to(h[i]);
				Point v2 = h[i].to(h[nxt]);
				ans[h[i].id] = getAngle(v1, v2) / (2 * Math.PI);
			}
		}
		
		for (double x : ans) {
			out.println(x);
		}
	}
	
	double getAngle(Point p, Point q) {
		return Math.atan2(p.cross(q), p.dot(q));
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
