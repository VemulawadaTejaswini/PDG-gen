import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		final long MAX_COORD = (int) 1e20;
		final double eps = 1e-8;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
			}

			for (int i = 0; i < n; i++) {
				Line[] lines = new Line[n - 1];
				int p = 0;
				for (int j = 0; j < n; j++) {
					if (j == i) {
						continue;
					}
					Point a = new Point(x[i], y[i]);
					Point b = new Point(x[j], y[j]);
					Point d = b.sub(a).rotate90();
					Point m = a.add(b).scale(0.5);
					lines[p] = new Line(m, m.add(d));
					++p;
				}

				double u = area(intersectSemiplanes(lines));
//			double v = Math.pow(2 * MAX_COORD, 2.0);
				double v = Math.PI * Math.pow(MAX_COORD, 2.0);
				out.printf("%.15f\n", u / v);
			}
		}

		private Point[] intersectSemiplanes(Line[] input) {
			List<Line> correctedInput = new ArrayList<>();
			for (Line L : input) {
				correctedInput.add(L);
			}
			Point[] corners = new Point[30000];
			for (int i = 0; i < corners.length; i++) {
				double alpha = 2 * Math.PI * i / corners.length;
				double x = Math.cos(alpha) * MAX_COORD;
				double y = Math.sin(alpha) * MAX_COORD;
				corners[i] = new Point(x, y);
			}
			for (int i = 0; i < corners.length; i++) {
				correctedInput.add(new Line(corners[i], corners[(i + 1) % corners.length]));
			}

			Collections.sort(correctedInput, (L1, L2) -> {
				double ax = -L1.b, ay = L1.a;
				double bx = -L2.b, by = L2.a;
				boolean au = ay > 0 || (ay == 0 && ax > 0);
				boolean bu = by > 0 || (by == 0 && bx > 0);
				if (au != bu) {
					return au ? 1 : -1;
				}
				int s = -sign(ax * by - ay * bx);
				if (s != 0) {
					return s;
				}
				return -sign(side(L1.p1, L2));
			});

			{
				boolean[] dead = new boolean[correctedInput.size()];
				for (int i = correctedInput.size() - 1; i > 0; i--) {
					Line L1 = correctedInput.get(i);
					Line L2 = correctedInput.get(i - 1);
					double ax = -L1.b, ay = L1.a;
					double bx = -L2.b, by = L2.a;
					int d = sign(ax * bx + ay * by);
					int s = -sign(ax * by - ay * bx);
					if (d >= 0 && s == 0) {
						dead[i] = true;
					}
				}
				List<Line> list = new ArrayList<>();
				for (int i = 0; i < correctedInput.size(); i++) {
					if (!dead[i]) {
						list.add(correctedInput.get(i));
					}
				}
				correctedInput = list;
			}


			Line[] borders = correctedInput.toArray(new Line[0]);
			List<Object> list = new ArrayList<>();
			list.add(borders[0]);
			list.add(intersect(borders[0], borders[1]));
			list.add(borders[1]);

			for (int i = 2; i < 2 * borders.length; i++) {
				Line L = borders[i % borders.length];
				while (list.size() >= 2) {
					Object o1 = list.get(list.size() - 2);
					Object o2 = list.get(list.size() - 1);
					if ((o1 instanceof Point) && (o2 instanceof Line)) {
						Point p = (Point) o1;
						if (side(p, L) > 0) {
							break;
						}
						list.remove(list.size() - 1);
						list.remove(list.size() - 1);
					} else {
						throw new AssertionError();
					}
				}
				Object obj = list.get(list.size() - 1);
				if (obj instanceof Line) {
					Line v = (Line) obj;
					if (sign(v.a * L.b - v.b * L.a) <= 0) {
						return null;
					}
					Point p = intersect(v, L);
					list.add(p);
					list.add(L);
				} else {
					throw new AssertionError();
				}
			}

			Map<Line, Integer> where = new HashMap<>();
			List<Line> allLines = new ArrayList<>();
			List<Point> res = new ArrayList<>();
			for (int i = 0; i < list.size(); i += 2) {
				Line L = (Line) list.get(i);
				allLines.add(L);
				if (where.containsKey(L)) {
					for (int j = where.get(L); j + 1 < allLines.size(); j++) {
						res.add(intersect(allLines.get(j), allLines.get(j + 1)));
					}
					break;
				}
				where.put(L, i / 2);
			}
			return res.toArray(new Point[0]);
		}

		private double area(Point[] p) {
			if (p == null) {
				return 0;
			}
			double res = 0;
			for (int i = 0; i < p.length; i++) {
				int j = i + 1;
				if (j == p.length) {
					j = 0;
				}
				res += (p[j].x - p[i].x) * (p[i].y + p[j].y);
			}
			return 0.5 * Math.abs(res);
		}

		private int compare(double a, double b) {
			if (Math.abs(a - b) < eps) {
				return 0;
			}
			return Double.compare(a, b);
		}

		private int sign(double x) {
			return compare(x, 0);
		}

		private double side(Point p, Line L) {
			return compare(p.x * L.a + p.y * L.b + L.c, 0);
		}

		private Point intersect(Line L1, Line L2) {
			double det = L1.a * L2.b - L2.a * L1.b;
			if (compare(det, 0) == 0) {
				return null;
			}
			double x = -(L1.c * L2.b - L2.c * L1.b) / det;
			double y = -(L1.a * L2.c - L2.a * L1.c) / det;
			return new Point(x, y);
		}

		class Point {
			double x;
			double y;

			Point(double x, double y) {
				this.x = x;
				this.y = y;
			}

			public String toString() {
				return String.format("(%.4f %.4f)", x, y);
			}

			public Point sub(Point o) {
				return new Point(x - o.x, y - o.y);
			}

			public Point add(Point o) {
				return new Point(x + o.x, y + o.y);
			}

			public Point rotate90() {
				return new Point(-y, x);
			}

			public Point scale(double f) {
				return new Point(f * x, f * y);
			}

		}

		class Line {
			double a;
			double b;
			double c;
			Point p1;
			Point p2;

			Line(Point p1, Point p2) {
				this.p1 = p1;
				this.p2 = p2;
				a = p1.y - p2.y;
				b = p2.x - p1.x;
				c = -a * p1.x - b * p1.y;
//			normalize();
			}

			Line(double a, double b, double c) {
				this.a = a;
				this.b = b;
				this.c = c;

				double x1, y1, x2, y2;
				if (Math.abs(a) >= eps) {
					x1 = 0;
					x2 = 1;
					y1 = (-a * x1 - c) / b;
					y2 = (-a * x2 - c) / b;
				} else {
					y1 = 0;
					y2 = 1;
					x1 = (-b * y1 - c) / a;
					x2 = (-b * y2 - c) / a;
				}
				p1 = new Point(x1, y1);
				p2 = new Point(x2, y2);
			}

			public String toString() {
				return a + " " + b + " " + c;
			}

		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

