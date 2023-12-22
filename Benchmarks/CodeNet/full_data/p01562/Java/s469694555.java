import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	static int N;
	static Point[] a;
	static double[] x, y;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Point> ps = new ArrayList<>();
		N = sc.nextInt();
		a = new Point[N];
		x = new double[N];
		y = new double[N];
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
			ps.add(new Point(x[i], y[i]));
			a[i] = new Point(x[i], y[i]);
		}
		// seg = merge(seg);

		for (int i = 0; i + 1 < a.length; ++i) {
			for (int j = i + 1; j + 1 < a.length; ++j) {
				if (linesProperIntersect(a[i], a[i + 1], a[j], a[j + 1])) {
					Point p = crossPoint(a[i], a[i + 1], a[j], a[j + 1]);
					ps.add(p);
				}
			}
		}
		Collections.sort(ps);
		for (int i = 0; i < ps.size(); ++i) {
			for (int j = i + 1; j < ps.size(); ++j) {
				if ((Math.abs(ps.get(i).x - ps.get(j).x) < 1e-6) && Math.abs(ps.get(i).y - ps.get(j).y) < 1e-6) {
					ps.remove(j);
					j--;
				}
			}
		}

		ArrayList<Integer>[] g = new ArrayList[ps.size()];
		for (int i = 0; i < ps.size(); ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < ps.size(); ++i)
			ps.get(i).id = i;
		for (int i = 0; i + 1 < a.length; ++i) {
			ArrayList<Point> tmp = new ArrayList<>();
			for (Point p : ps) {
				if (ccw(a[i], a[i + 1], p) == 0) {
					tmp.add(p);
				}
			}
			Collections.sort(tmp);
			for (int j = 0; j + 1 < tmp.size(); ++j) {
				g[tmp.get(j).id].add(tmp.get(j + 1).id);
				g[tmp.get(j + 1).id].add(tmp.get(j).id);
			}
		}

		double ans = 0;
		boolean[][] vis = new boolean[ps.size()][ps.size()];
		for (int src = 0; src < ps.size(); ++src) {
			for (int dst : g[src]) {
				int srcId = src;
				int dstId = dst;
				if (vis[srcId][dstId])
					continue;
				vis[srcId][dstId] = true;
				int ne = -1;
				ArrayList<Point> set = new ArrayList<>();
				set.add(ps.get(srcId));
				set.add(ps.get(dstId));
				while (true) {
					ne = chDst(srcId, dstId, ps, g);
					srcId = dstId;
					dstId = ne;
					vis[srcId][dstId] = true;
					if (dstId == src)
						break;
					set.add(ps.get(dstId));
				}
				double tmpArea = 0;
				for (int i = 0; i < set.size(); ++i) {
					double v = area(origin, set.get(i), set.get((i + 1) % set.size()));
					tmpArea += v;
				}
				if (tmpArea > 0)
					ans += tmpArea;

			}
		}
		System.out.printf("%.10f\n", ans);
	}

	static int chDst(int preId, int curId, ArrayList<Point> ps, ArrayList<Integer>[] g) {
		double angle = 0;
		int dstId = preId;
		for (int dst : g[curId]) {
			if (dst == preId)
				continue;
			if (angle < rotationAngle(ps.get(preId), ps.get(curId), ps.get(curId), ps.get(dst))) {
				angle = rotationAngle(ps.get(preId), ps.get(curId), ps.get(curId), ps.get(dst));
				dstId = dst;
			}
		}
		return dstId;
	}

	static final Point origin = new Point(0, 0);

	static class Point implements Comparable<Point> {
		double x, y;
		int id;

		public Point(double x1, double y1) {
			this.x = x1;
			this.y = y1;
		}

		double norm(Point p) {
			double dx = x - p.x;
			double dy = y - p.y;
			return Math.sqrt(dx * dx + dy * dy);
		}

		void show() {
			System.out.println("x:" + x + " y:" + y + " id" + id);
		}

		@Override
		public int compareTo(Point o) {
			if (x != o.x)
				return Double.compare(x, o.x);
			else
				return Double.compare(y, o.y);
		}
	}

	static class State implements Comparable<State> {
		int src, dst;
		double cost;

		public State(int src, int dst, double cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		public int compareTo(State o) {
			return Double.compare(cost, o.cost);
		};

	}

	static Point crossPoint(Point s1, Point d1, Point s2, Point d2) {
		double[][] mx = { { d1.x - s1.x, -(d2.x - s2.x) }, { d1.y - s1.y, -(d2.y - s2.y) } };
		double[] v = { -s1.x + s2.x, -s1.y + s2.y };
		double[][] rev = { { mx[1][1], -mx[0][1] }, { -mx[1][0], mx[0][0] } };
		double determinent = mx[0][0] * mx[1][1] - mx[0][1] * mx[1][0];
		if (determinent == 0)
			throw new AssertionError();
		rev[0][0] /= determinent;
		rev[0][1] /= determinent;
		rev[1][0] /= determinent;
		rev[1][1] /= determinent;
		double[] coe = mulVec(rev, v);
		Point p = new Point((1 - coe[0]) * s1.x + coe[0] * d1.x, (1 - coe[0]) * s1.y + coe[0] * d1.y);
		return p;
	}

	static double[] mulVec(double[][] mx, double[] v) {
		double[] retVec = new double[2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				retVec[i] += mx[i][j] * v[j];
			}
		}
		return retVec;
	}

	static double[][] mul(double[][] m1, double[][] m2) {
		double[][] ret = new double[2][2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				for (int k = 0; k < 2; ++k) {
					ret[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return ret;
	}

	static boolean linesProperIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = ccw(s1, d1, d2) * ccw(s1, d1, s2);
		long prd2 = ccw(s2, d2, s1) * ccw(s2, d2, d1);
		return prd1 < 0 && prd2 < 0;
	}

	static boolean linesIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = ccw(s1, d1, d2) * ccw(s1, d1, s2);
		long prd2 = ccw(s2, d2, s1) * ccw(s2, d2, d1);
		return prd1 <= 0 && prd2 <= 0;
	}

	static long ccw(Point s, Point d, Point p) {
		double cp = crossProduct(s, d, s, p);
		if (Math.abs(cp) > 1e-6)
			return Double.compare(cp, 0);
		else {
			if (dotProduct(s, d, s, p) < 0)
				return -2;
			else if (dotProduct(d, s, d, p) < 0)
				return 2;
			else
				return 0;
		}
	}

	static double angle(Point s1, Point d1, Point s2, Point d2) {
		double dotprd = dotProduct(s1, d1, s2, d2);
		dotprd /= s1.norm(d1);
		dotprd /= s2.norm(d2);
		if (Math.abs(dotprd) > 1 && Math.abs(dotprd) < 1 + 1e-6) {
			dotprd = Math.signum(dotprd);
		}
		double angle = Math.acos(dotprd);
		return angle;
	}

	static double crossProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.y - s2.y) - (d1.y - s1.y) * (d2.x - s2.x);
	}

	static double dotProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.x - s2.x) + (d1.y - s1.y) * (d2.y - s2.y);
	}

	static Point[][] merge(Point[][] seg) {
		ArrayList<Point[]> tmp = new ArrayList<>();
		for (int i = 0; i < seg.length; ++i) {
			if (seg[i][0].compareTo(seg[i][1]) > 0) {
				tmp.add(new Point[] { seg[i][1], seg[i][0] });
			} else {
				tmp.add(new Point[] { seg[i][0], seg[i][1] });
			}
		}

		for (int i = 0; i < tmp.size(); ++i) {
			for (int j = i + 1; j < tmp.size(); ++j) {
				if (isSegmentOnSegment(tmp.get(i)[0], tmp.get(i)[1], tmp.get(j)[0], tmp.get(j)[1])) {
					ArrayList<Point> ps = new ArrayList<>();
					ps.add(tmp.get(i)[0]);
					ps.add(tmp.get(i)[1]);
					ps.add(tmp.get(j)[0]);
					ps.add(tmp.get(j)[1]);
					Collections.sort(ps);
					tmp.add(new Point[] { ps.get(0), ps.get(3) });
					tmp.remove(j);
					--j;
					tmp.remove(i);
					break;
				}
			}
		}
		Point[][] ret = new Point[tmp.size()][2];
		for (int i = 0; i < tmp.size(); ++i) {
			ret[i] = tmp.get(i);
		}
		return ret;

	}

	static boolean isSegmentOnSegment(Point s1, Point d1, Point s2, Point d2) {
		if (!linesIntersect(s1, d1, s2, d2)) {
			return false;
		}
		double[][] mx = { { d1.x - s1.x, -(d2.x - s2.x) }, { d1.y - s1.y, -(d2.y - s2.y) } };
		double determinent = mx[0][0] * mx[1][1] - mx[0][1] * mx[1][0];
		if (determinent == 0) {
			// if()
			return true;
		} else
			return false;
	}

	static double rotationAngle(Point s1, Point d1, Point s2, Point d2) {
		double angle = angle(s1, d1, s2, d2);

		if (crossProduct(s1, d1, s2, d2) > 0) {
			angle = Math.PI + angle;
		} else {
			angle = Math.PI - angle;
		}
		return angle;
	}

	static double area(Point s, Point d1, Point d2) {
		double x1 = d1.x - s.x;
		double y1 = d1.y - s.y;
		double x2 = d2.x - s.x;
		double y2 = d2.y - s.y;
		return 0.5 * (x1 * y2 - x2 * y1);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}