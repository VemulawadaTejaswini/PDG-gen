import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedSet;

class NodeMaster {
	public static final int INF = (int) 10e6;
	public LinkedList<Node> nodeList;

	public NodeMaster() {
		nodeList = new LinkedList<NodeMaster.Node>();
	}

	public void start(int no) {
		Node start = nodeList.get(no);

		Queue<Node> que = new LinkedList<NodeMaster.Node>();

		start.cost = 0;
		que.add(start);

		while (true) {
			Node n = que.peek();
			if (n == null) {
				break;
			}

			LinkedList<Integer> list = n.toList;
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();

				Node toNode = nodeList.get(integer);
				toNode.cost = n.cost + 1;
				que.add(toNode);
			}

		}

	}

	class Node {
		public int cost;
		public LinkedList<Integer> toList;

		public Node() {
			cost = INF;
			toList = new LinkedList<Integer>();
		}
	}

	class Set {
		public int toId;
		public int toCost;
	}
}

class A1500 {
	int count1500 = 0;

	public void ans(Scanner sc) {
		int len = sc.nextInt();
		sc.nextLine();
		String id = sc.nextLine();
		int x = sc.nextInt();
		ArrayList<Integer> pa = new ArrayList<Integer>();
		ArrayList<Integer> po = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			pa.add(sc.nextInt());
			if (pa.get(i) % 2 == 0) {

			} else {
				po.add(pa.get(i));
			}
		}

		int sum = 0;
		int even = 0;
		int odd = 0;

		for (int i = 0; i < id.length(); i++) {
			int t = id.length() - i - 1;

			char c = id.charAt(t);
			if (c == '*') {
				if (t % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				int d = Integer.parseInt(String.valueOf(c));
				if (t % 2 == 0) {
					sum += (d / 10) + (d % 10);
				} else {
					sum += d;
				}
			}
		}

		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);

		System.out.println(id);
	}

	void re1500(int sum, int even, int odd, ArrayList<Integer> pa,
			ArrayList<Integer> po) {
		if (even == 0 && odd == 0) {

		} else {
			if (sum % 2 == 0) {

			} else {
				if (odd > 0) {
					for (Iterator iterator = po.iterator(); iterator.hasNext();) {
						Integer integer = (Integer) iterator.next();
						re1500(sum + integer, even, odd - 1, pa, po);
					}
				}
			}
		}
	}

}

class A1129 {

	public void ans(Scanner sc) {

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			if (n == 0) {
				break;
			}
			LinkedList<Integer> yama = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				yama.addFirst(i + 1);
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();

				for (int j = 0; j < c; j++) {
					yama.add(j, yama.remove(p + j - 1));
				}
			}
			System.out.println(yama.getFirst());
		}

	}

}

class A1135 {

	public void ans(Scanner sc) {
		int M = sc.nextInt();

		for (int m = 0; m < M; m++) {
			int money = sc.nextInt();
			int year = sc.nextInt();

			int n = sc.nextInt();
			int max = 0;
			for (int i = 0; i < n; i++) {
				int me = sc.nextInt();
				double ri = sc.nextDouble();
				int te = sc.nextInt();

				int A = money;
				if (me == 1) {
					for (int y = 0; y < year; y++) {
						A = A + (int) (A * ri) - te;
					}
				} else {
					int Risi = 0;
					for (int y = 0; y < year; y++) {
						Risi += (int) (A * ri);
						A = A - te;
					}
					A += Risi;
				}
				max = Math.max(max, A);
			}

			System.out.println(max);
		}

	}

}

class A1159 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();
			int P = sc.nextInt();

			LinkedList<Integer> member = new LinkedList<Integer>();

			if (N == 0) {
				break;
			}
			for (int i = 0; i < N; i++) {
				member.add(0);
			}

			int i = 0;
			int p = P;
			while (true) {

				if (0 < p) {
					member.set(i, member.get(i) + 1);
					p--;
					if (member.get(i) == P) {
						break;
					}
				} else {
					p += member.get(i);
					member.set(i, 0);
				}
				i = (i + 1) % member.size();
			}

			System.out.println(i);
		}

	}

}

class A1165 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();

			LinkedList<Integer> xl = new LinkedList<Integer>();
			LinkedList<Integer> yl = new LinkedList<Integer>();

			if (N == 0) {
				break;
			}

			xl.add(0);
			yl.add(0);

			for (int i = 1; i < N; i++) {
				int n = sc.nextInt();
				int a = sc.nextInt();

				int dx = 0;
				int dy = 0;
				switch (a) {
				case 0:
					dx = -1;
					break;
				case 1:
					dy = -1;
					break;
				case 2:
					dx = 1;
					break;
				case 3:
					dy = 1;
					break;

				}
				xl.add(xl.get(n) + dx);
				yl.add(yl.get(n) + dy);
			}

			int xx = Collections.max(xl);
			int yx = Collections.max(yl);
			int xs = Collections.min(xl);
			int ys = Collections.min(yl);

			System.out.printf("%d %d\n", xx - xs + 1, yx - ys + 1);
		}

	}

}

class A1179 {

	public void ans(Scanner sc) {
		int N = sc.nextInt();
		int n = 0;
		while (n < N) {
			n++;

			int Y = sc.nextInt();
			int M = sc.nextInt();
			int D = sc.nextInt();

			int count = 0;
			for (int y = Y + 1; y < 1000; y++) {
				if (y % 3 == 0) {
					count += (20 * 10);
				} else {
					count += (20 * 5 + 19 * 5);
				}
			}
			for (int m = M + 1; m <= 10; m++) {
				if (Y % 3 == 0) {
					count += 20;
				} else {
					if (m % 2 == 0) {
						count += 19;
					} else {
						count += 20;
					}
				}
			}
			if (M % 2 == 0 && Y % 3 != 0) {
				count += (19 - D);

			} else {
				count += (20 - D);
			}

			System.out.printf("%d\n", count + 1);
		}

	}

}

class A1136 {

	public void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}

			LinkedList<LinkedList<At>> ats = new LinkedList<LinkedList<At>>();

			for (int n = 0; n < N + 1; n++) {
				ats.add(new LinkedList<A1136.At>());
				int M = sc.nextInt();

				int x = sc.nextInt();
				int y = sc.nextInt();
				int d = -1;
				for (int m = 1; m < M; m++) {
					int nx = sc.nextInt();
					int ny = sc.nextInt();

					switch (d) {
					case -1:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, 0));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, 0));
							d = 2;
						}
						if (ny < y) {
							ats.getLast().add(new At(y - ny, 0));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, 0));
							d = 3;
						}
						break;
					case 0:
						if (ny < y) {
							ats.getLast().add(new At(y - ny, -1));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, 1));
							d = 3;
						}
						break;
					case 2:
						if (ny < y) {
							ats.getLast().add(new At(y - ny, 1));
							d = 1;
						}
						if (y < ny) {
							ats.getLast().add(new At(ny - y, -1));
							d = 3;
						}
						break;
					case 1:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, 1));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, -1));
							d = 2;
						}
						break;
					case 3:
						if (nx < x) {
							ats.getLast().add(new At(x - nx, -1));
							d = 0;
						}
						if (x < nx) {
							ats.getLast().add(new At(nx - x, 1));
							d = 2;
						}
						break;
					}

					x = nx;
					y = ny;
				}
			}

			LinkedList<At> ahead;
			LinkedList<At> atail = new LinkedList<A1136.At>();

			ahead = ats.get(0);
			for (int i = 0; i < ahead.size() - 1; i++) {
				atail.addFirst(new At(ahead.get(i).x, -(ahead.get(i + 1).y)));
			}
			atail.addFirst(new At(ahead.getLast().x, 0));
			// System.out.println(ats);
			// System.out.println(ahead);
			// System.out.println(atail);

			for (int i = 1; i < ats.size(); i++) {
				boolean b = true;

				LinkedList<At> atmp = ats.get(i);
				if (atmp.size() == ahead.size()) {
					for (int j = 0; j < atmp.size(); j++) {
						if (atmp.get(j).equals(ahead.get(j))) {

						} else {
							b = false;
							break;
						}
					}
				}

				if (b) {
				} else {
					b = true;

					if (atmp.size() == atail.size()) {
						for (int j = 0; j < atmp.size(); j++) {
							if (atmp.get(j).equals(atail.get(j))) {

							} else {
								b = false;
								break;
							}
						}
					}
				}
				if (b) {
					System.out.println(i);
				}
			}

			System.out.println("+++++");
		}

	}

	public class At {
		public int x;
		public int y;

		public At(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return String.format("x%3d:y%3d", x, y);
		}

		@Override
		public boolean equals(Object obj) {
			At tmp = (At) obj;

			if (this.x == tmp.x && this.y == tmp.y) {
				return true;
			} else {
				return false;
			}
		}
	}

}

class P37 {
	static final int[] dx = { -1, 0, 1, 0 };
	static final int[] dy = { 0, -1, 0, 1 };
	static final int INF = 1000000;

	public void ans(Scanner sc) {
		char[][] maze;
		int[][] d;
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();

		Queue<P> que = new LinkedList<P37.P>();

		maze = new char[Y][X];
		d = new int[Y][X];

		sc.nextLine();
		for (int y = 0; y < Y; y++) {
			String line = sc.nextLine();
			for (int x = 0; x < X; x++) {
				maze[y][x] = line.charAt(x);
			}
		}

		for (int y = 0; y < Y; y++) {
			for (int x = 0; x < X; x++) {
				d[y][x] = INF;
			}
		}

		d[sy][sx] = 0;
		que.add(new P(sx, sy));

		while (true) {
			P p = que.poll();
			if (p == null) {
				break;
			}
			System.out.println(p.toString());

			if (p.x == gx && p.y == gy) {
				break;
			}

			for (int i = 0; i < dx.length; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if (0 <= nx && nx < X && 0 <= ny && ny < Y) {
					if (maze[ny][nx] != '#' && d[ny][nx] == INF) {
						que.add(new P(nx, ny));
						d[ny][nx] = d[p.y][p.x] + 1;
					}
				}
			}
		}

		System.out.println(d[1][1]);
		System.out.println(d[gy][gx]);

	}

	class P {
		public int x;
		public int y;

		public P(int a, int b) {
			super();
			this.x = a;
			this.y = b;
		}

		@Override
		public String toString() {
			return String.format("%d %d", x, y);
		}

	}
}

class P49 {
	public void ans(Scanner sc) {
		int N = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		PriorityQueue<Integer> li = new PriorityQueue<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
			li.add(list.getLast());
		}

		int ans = 0;
		while (li.size() > 1) {
			int a1 = li.poll();
			int a2 = li.poll();

			ans += a1 + a2;
			li.add(a1 + a2);

		}

		System.out.println(ans);

	}
}

class P85 {
	public void ans(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] T = new int[K];
		int[] X = new int[K];
		int[] Y = new int[K];

		for (int i = 0; i < K; i++) {
			T[i] = sc.nextInt();
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}

		Uni tree = new Uni(N * 3);

		int ans = 0;

		for (int i = 0; i < K; i++) {
			int t = T[i];
			int x = X[i] - 1;
			int y = Y[i] - 1;

			if (x < 0 || N <= x || y < 0 || N <= y) {
				ans++;
				continue;
			}

			if (t == 1) {
				if (tree.same(x, y + N) || tree.same(x, y + 2 * N)) {
					ans++;
				} else {
					tree.unite(x, y);
					tree.unite(x + N, y + N);
					tree.unite(x + 2 * N, y + 2 * N);
				}
			} else {
				if (tree.same(x, y) || tree.same(x, y + 2 * N)) {
					ans++;
				} else {
					tree.unite(x, y + N);
					tree.unite(x + N, y + 2 * N);
					tree.unite(x + 2 * N, y);
				}
			}
		}

		System.out.println(ans);
	}

	class Uni {
		int[] par;
		int[] rank;

		public Uni(int N) {
			par = new int[N];
			rank = new int[N];
			for (int i = 0; i < N; i++) {
				par[i] = i;
				rank[i] = 0;
			}
		}

		int find(int x) {
			if (par[x] == x) {
				return x;
			} else {
				return par[x] = find(par[x]);
			}
		}

		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if (x == y) {
				return;
			}
			if (rank[x] < rank[y]) {
				par[x] = y;
			} else {
				par[y] = x;
				if (rank[x] == rank[y]) {
					rank[x]++;
				}
			}
		}

		boolean same(int x, int y) {
			return find(x) == find(y);
		}

	}
}

class At14d {
	public void ans(Scanner sc) {
		int ALL = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Boolean> fa = new LinkedList<Boolean>();

		for (int i = 0; i < ALL; i++) {
			fa.add(false);
		}
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt() - 1);
		}

		for (int i = 0; i < M; i++) {
			Collections.fill(fa, false);
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = 0; j < list.size(); j++) {
				int line = list.get(j);

				for (int d = -x; d <= y; d++) {
					int l = line + d;
					if (0 <= l && l < fa.size()) {
						fa.set(l, true);
					}
				}
			}

			int ans = 0;
			for (int j = 0; j < fa.size(); j++) {
				if (fa.get(j)) {
					ans++;
				}
			}
			System.out.println(ans);

		}
	}

}

class P93 {

	void ans(Scanner sc) {
		int N = sc.nextInt();

		LinkedList<Integer> g = new LinkedList<Integer>();

	}
}

class A1144 {
	int[][] map;
	int MX;
	int MY;

	static final int[] dx = { -1, 0, 1, 0 };
	static final int[] dy = { 0, -1, 0, 1 };

	int sx;
	int sy;
	int gx;
	int gy;
	int A;

	void ans(Scanner sc) {
		while (true) {
			A = 11;
			MX = sc.nextInt();
			MY = sc.nextInt();
			if (MX == 0) {
				break;
			}
			map = new int[MY][MX];
			sx = 0;
			sy = 0;
			gx = 0;
			gy = 0;

			for (int y = 0; y < MY; y++) {
				for (int x = 0; x < MX; x++) {
					int t = sc.nextInt();

					switch (t) {
					case 1:
						map[y][x] = 1;
						break;
					case 2:
						sx = x;
						sy = y;
						map[y][x] = 0;
						break;
					case 3:
						gx = x;
						gy = y;
						map[y][x] = 0;
						break;
					default:
						map[y][x] = 0;
						break;
					}
				}
			}

			rec2(sx, sy, 1);

			if (A == 11) {
				System.out.println(-1);
			} else {
				System.out.println(A);
			}
		}
	}

	void rec2(int tox, int toy, int cost) {
		if (cost > 10) {
			return;
		}

		for (int dir = 0; dir < 4; dir++) {
			int t = 0;
			while (true) {
				t++;
				int x = tox + t * dx[dir];
				int y = toy + t * dy[dir];

				// System.out.printf("%4d %4d\n", x, y);

				if (gx == x && gy == y) {
					A = Math.min(A, cost);
					break;
				}

				if (0 <= x && x < MX && 0 <= y && y < MY) {
					if (map[y][x] == 1) {
						if (t > 1) {
							int nx = tox + (t - 1) * dx[dir];
							int ny = toy + (t - 1) * dy[dir];
							map[y][x] = 0;
							rec2(nx, ny, cost + 1);
							map[y][x] = 1;
						}
						break;
					}
				} else {
					break;
				}
			}
		}

	}

	void rec(int tox, int toy, int dir, int cost) {
		if (cost > 10) {
			return;
		}

		int t = 0;
		while (true) {
			t++;
			int x = tox + t * dx[dir];
			int y = toy + t * dy[dir];

			// System.out.printf("%4d %4d\n", x, y);

			if (sx == x && sy == y) {
				A = Math.min(A, cost);
				break;
			}

			if (0 <= x && x < MX && 0 <= y && y < MY) {
				if (map[y][x] == 0) {
					for (int d = 1; d < 4; d += 2) {
						int side = (dir + d) % 4;
						int nx = x + dx[side];
						int ny = y + dy[side];
						if (0 <= nx && nx < MX && 0 <= ny && ny < MY) {
							if (map[ny][nx] == 1) {
								int side_back = (side + 2) % 4;
								map[ny][nx] = 0;
								rec(x, y, 0, cost + 1);
								rec(x, y, 1, cost + 1);
								rec(x, y, 2, cost + 1);
								rec(x, y, 3, cost + 1);
								map[ny][nx] = 1;
							}
						}
					}
				} else {
					if (t > 1) {
						int nx = tox + (t - 1) * dx[dir];
						int ny = toy + (t - 1) * dy[dir];
						map[y][x] = 0;
						rec(nx, ny, 0, cost + 1);
						rec(nx, ny, 1, cost + 1);
						rec(nx, ny, 2, cost + 1);
						rec(nx, ny, 3, cost + 1);
						map[y][x] = 1;
					}
					break;
				}
			} else {
				break;
			}
		}

	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new A1144().ans(sc);

	}

}