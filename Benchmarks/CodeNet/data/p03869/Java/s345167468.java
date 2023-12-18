import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	class Point {
		double x, y;

		public Point(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

		Point shift(double dx, double dy) {
			return new Point(x + dx, y + dy);
		}

	}

	class Line {
		double A, B, C;

		Line(Point a, Point b) {
			A = b.y - a.y;
			B = a.x - b.x;
			C = -(a.x * A + a.y * B);
		}

	}

	final double eps = 1e-9;

	int vectMul(Point a, Point b, Point c) {
		double v = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
		if (v >= eps) {
			return 1;
		}
		if (v <= -eps) {
			return -1;
		}
		return 0;
	}

	Point intersect(Line l1, Line l2) {
		double zn = l1.A * l2.B - l2.A * l1.B;
		double x = l2.C * l1.B - l2.B * l1.C;
		double y = l1.C * l2.A - l2.C * l1.A;
		if (Math.abs(zn) <= eps) {
			return null;
		}
		return new Point(x / zn, y / zn);
	}

	int n = 3;

	boolean check(Point[] pts, double r) {
		Line[] lines = new Line[n];
		for (int i = 0; i < n; i++) {
			Point f = pts[i], s = pts[(i + 1) % n];
			double dx = s.x - f.x, dy = s.y - f.y;
			double d = Math.sqrt(dx * dx + dy * dy);
			dx /= d;
			dy /= d;
			lines[i] = new Line(pts[i].shift(-dy * r, dx * r),
					pts[(i + 1) % n].shift(-dy * r, dx * r));
		}
		Point[] ptsNew = new Point[n];
		for (int i = 0; i < n; i++) {
			ptsNew[i] = intersect(lines[i], lines[(i + 1) % n]);
			if (ptsNew[i] == null) {
				return false;
			}
			if (!inside(pts, ptsNew[i])) {
				return false;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double dx = ptsNew[i].x - ptsNew[j].x;
				double dy = ptsNew[i].y - ptsNew[j].y;
				if (dx * dx + dy * dy > 4 * r * r) {
					return true;
				}
			}
		}
		return false;
	}

	boolean inside(Point[] pts, Point p) {
		for (int i = 0; i < n; i++) {
			if (vectMul(pts[i], pts[(i + 1) % n], p) < 0) {
				return false;
			}
		}
		return true;
	}

	void solve() {
		Point[] pts = new Point[n];
		for (int i = 0; i < n; i++) {
			pts[i] = new Point(in.nextInt(), in.nextInt());
		}
		if (vectMul(pts[0], pts[1], pts[2]) < 0) {
			Point tmp = pts[1];
			pts[1] = pts[2];
			pts[2] = tmp;
		}
		double l = 0, right = 4444;
		for (int it = 0; it < 77; it++) {
			double r = (l + right) / 2;
			if (check(pts, r)) {
				l = r;
			} else {
				right = r;
			}
		}
		out.printf("%.12f\n", (l));
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}