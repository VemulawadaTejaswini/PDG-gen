import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5 

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int M = sc.nextInt();
			int[] h = new int[H];
			int[] w = new int[W];
			Set<Integer> hset = new HashSet<>();
			Set<Integer> wset = new HashSet<>();
			Set<Point> pset = new HashSet<>();
			for (int i = 0; i < M; i++) {
				int tmph = sc.nextInt() - 1;
				int tmpw = sc.nextInt() - 1;
				h[tmph]++;
				w[tmpw]++;
				hset.add(tmph);
				wset.add(tmpw);
				pset.add(new Point(tmph, tmpw));
			}
			Set<Integer> hmax = new HashSet<>();
			Set<Integer> wmax = new HashSet<>();
			int maxh = 0;
			int maxw = 0;
			for (int hh : hset) {
				int tmp = h[hh];
				if (tmp > maxh) {
					hmax.clear();
					hmax.add(hh);
					maxh = tmp;
				} else if (tmp == maxh) {
					hmax.add(hh);
				}
			}
			for (int ww : wset) {
				int tmp = w[ww];
				if (tmp > maxw) {
					wmax.clear();
					wmax.add(ww);
					maxw = tmp;
				} else if (tmp == maxw) {
					hmax.add(ww);
				}
			}
			boolean flg = false;
			for (int hhh : hmax) {
				for (int www : wmax) {
					if (!pset.contains(new Point(hhh, www))) {
						flg = true;
					}
				}
			}
			if (flg) {
				System.out.println(maxh + maxw);
			} else {
				System.out.println(maxh + maxw - 1);
			}
		}
	}

	static class Point {
		int h;
		int w;

		public Point(int h, int w) {
			this.h = h;
			this.w = w;
		}

		@Override
		public boolean equals(Object o) {
			Point p = (Point) o;
			return this.h == p.h && this.w == p.w;
		}

		@Override
		public int hashCode() {
			int val = 31;
			val = 31 * val + h;
			val = 31 * val + w;
			return val;
		}
	}
}