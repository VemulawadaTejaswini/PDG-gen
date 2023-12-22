import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();

	}

	void solve(ArrayList<Integer>[] g, int h, int w) {
		class P implements Comparable<P> {
			int e;
			int cur;
			int dist;

			public P(int cur, int e, int dist) {
				this.cur = cur;
				this.e = e;
				this.dist = dist;
			}

			public int compareTo(P o) {
				return Integer.compare(e, o.e);
			};

		}
		int[] d = dist(g, h, w, 0, -1, -1);
		if (d[h * w - 1] > 1000) {
			System.out.println(-1);
			return;
		}

		int[] e = new int[h * w];// e[i]:=??????(i)?????°????????????????????????????????????????????§?????°???????°????
		int[] dist = new int[h * w];
		Arrays.fill(e, Integer.MAX_VALUE / 16);
		Arrays.fill(dist, Integer.MAX_VALUE / 16);
		e[0] = 0;
		dist[0] = 0;
		PriorityQueue<P> pq = new PriorityQueue<>();
		pq.add(new P(0, 0, 0));
		while (!pq.isEmpty()) {
			P p = pq.poll();
			if (p.cur == h * w - 1) {
				if (p.e < 1000) {
					System.out.println(p.e);
				} else {
					System.out.println(-1);
				}
				return;
			}
			if (dist[p.cur] < p.dist)
				continue;
			for (int dst : g[p.cur]) {
				// ???????????¨?????????????????????????????´???
				int ne = Math.max(p.e, p.dist + dist(g, h, w, p.cur, p.cur, dst)[h * w - 1]);
				// ???????????´???
				ne = Math.max(ne, p.dist + 1);
				if (e[dst] > ne) {
					e[dst] = ne;
				}
				if (dist[dst] > p.dist + 1) {
					pq.add(new P(dst, ne, p.dist + 1));
					dist[dst] = p.dist + 1;
				}
			}
		}
		if (e[h * w - 1] > 1000)

		{
			System.out.println(-1);
			return;
		}
		System.out.println(e[h * w - 1]);
	}

	// e=(bs,bd)??????????????????
	// ????????????s??????h*w-1???????????????????????\????????????
	int[] dist(ArrayList<Integer>[] g, int h, int w, int s, int bs, int bd) {
		int[] d = new int[h * w];
		Arrays.fill(d, Integer.MAX_VALUE / 16);
		d[s] = 0;
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.add(s);
		while (!que.isEmpty()) {
			int v = que.poll();
			for (int dst : g[v]) {
				if (dst == bs && v == bd)
					continue;
				if (dst == bd && v == bs)
					continue;
				if (d[dst] > d[v] + 1) {
					d[dst] = d[v] + 1;
					que.add(dst);
				}
			}
		}
		return d;
	}

	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			DJSet ds = new DJSet(h * w);
			if (h == 0 && w == 0)
				break;
			ArrayList<Integer>[] g = new ArrayList[h * w];
			for (int i = 0; i < g.length; ++i) {
				g[i] = new ArrayList<>();
			}
			for (int i = 0; i < 2 * h - 1; ++i) {
				if (i % 2 == 0) {
					int[] a = new int[w - 1];
					// a[j]=0???????????????(i/2*h+j)?????????(i/2*h+j+1)??¨??\?¶????
					for (int j = 0; j < a.length; ++j) {
						a[j] = sc.nextInt();
						if (a[j] == 0) {
							g[i / 2 * w + j].add(i / 2 * w + j + 1);
							g[i / 2 * w + j + 1].add(i / 2 * w + j);
						}
					}
				} else {
					int[] a = new int[w];
					// a[j]=0???????????????(i/2*h+j)?????????((i/2+1)*h+j)??¨??\?¶????
					for (int j = 0; j < a.length; ++j) {
						a[j] = sc.nextInt();
						if (a[j] == 0) {
							g[i / 2 * w + j].add((i / 2 + 1) * w + j);
							g[(i / 2 + 1) * w + j].add(i / 2 * w + j);
						}
					}
				}
			}
			solve(g, h, w);
		}
	}

	class DJSet {
		int n;
		int[] upper;

		public DJSet(int n) {
			this.n = n;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		void setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y) {
				return;
			}

			if (upper[x] < upper[y]) {
				int tmp = x;
				x = y;
				y = tmp;
			}

			upper[y] += upper[x];
			upper[x] = y;
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}