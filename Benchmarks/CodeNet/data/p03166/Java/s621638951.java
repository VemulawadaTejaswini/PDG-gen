import java.util.*;

import java.io.*;
import java.math.BigInteger;

public class Main {
	FastScanner in;
	PrintWriter out;
	boolean systemIO = true;
	
	public long pow(long x, long p, long mod) {
		if (p <= 0) {
			return 1;
		}
		long th = pow(x, p / 2, mod);
		th *= th;
		th %= mod;
		if (p % 2 == 1) {
			th *= x;
		}
		return th;
	}

	public class Fraction implements Comparable<Fraction> {
		long x;
		long y;

		public Fraction(long x, long y) {
			this.x = x;
			this.y = y;
		}

		public void norm() {
			long gcd = gcd(x, y);
			x /= gcd;
			y /= gcd;
		}

		@Override
		public int compareTo(Fraction o) {
			if (x > o.x) {
				return 1;
			}
			if (x < o.x) {
				return -1;
			}
			if (y > o.y) {
				return 1;
			}
			if (y < o.y) {
				return -1;
			}
			return 0;
		}
	}

	public Fraction sum(Fraction a, Fraction b) {
		Fraction c = new Fraction(a.x * b.y + a.y * b.x, a.y * b.y);
		c.norm();
		return c;
	}

	public long gcd(long x, long y) {
		if (y == 0) {
			return x;
		}
		if (x == 0) {
			return y;
		}
		return gcd(y, x % y);
	}

	public class Pair implements Comparable<Pair> {
		long x;
		long y;

		public Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			// if (x != o.x) {
			// return x - o.x;
			// }
			// return y - o.y;
			return 0;
		}
	}

	// public class Vertex {
	// Vertex father;
	// Vertex l;
	// Vertex r;
	// int sz;
	// long y;
	// long x;
	// int time;
	// int mintime;
	// int value;
	//
	// public Vertex(Vertex father, Vertex l, Vertex r, int sz, long y, long x, int
	// time, int mintime, int value) {
	// this.father = father;
	// this.l = l;
	// this.r = r;
	// this.sz = sz;
	// this.y = y;
	// this.x = x;
	// this.time = time;
	// this.mintime = mintime;
	// this.value = value;
	// }
	//
	// public Vertex(long x, int time, int value) {
	// this.father = null;
	// this.l = null;
	// this.r = null;
	// this.sz = 1;
	// this.y = random.nextLong();
	// this.x = x;
	// this.time = time;
	// this.mintime = time;
	// this.value = value;
	// }
	//
	// public void update() {
	// sz = 1;
	// mintime = time;
	// if (l != null) {
	// sz += l.sz;
	// mintime = Math.min(time, mintime);
	// }
	// if (r != null) {
	// sz += r.sz;
	// mintime = Math.min(time, mintime);
	// }
	// }
	// }
	//
	// public void add0(Vertex v, Vertex v1, Vertex father) {
	// if (v == null) {
	// v1.father = father;
	// father.r = v1;
	// father.update();
	// return;
	// }
	// if (v.y >= v1.y) {
	// add0(v.r, v1, v);
	// father.update();
	// return;
	// }
	// father.r = v1;
	// v1.father = father;
	// v.father = v1;
	// v1.l = v;
	// v1.update();
	// father.update();
	// }
	//
	// public Vertex pop(Vertex v, Vertex father, int h) {
	// if (v.l == null) {
	// if (h == 0) {
	// father.r = v.r;
	// } else {
	// father.l = v.r;
	// }
	// if (v.r != null) {
	// v.r.father = father;
	// v.r.update();
	// }
	// father.update();
	// v.father = null;
	// v.r = null;
	// v.update();
	// return v;
	// }
	// Vertex ans = pop(v.l, v, h + 1);
	// father.update();
	// return ans;
	// }
	//
	// public void cut(Vertex rl, Vertex rr, Vertex v, int mint) {
	//
	// }
	//
	// public int push(Vertex v, Vertex v1, Vertex father, boolean rson, int szl) {
	//
	// }
	//
	// Vertex root0;
	
	ArrayList<Integer>[] to;

	public void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		to = new ArrayList[n];
		for (int i = 0; i < to.length; i++) {
			to[i] = new ArrayList<>();
		}
		int[] sz = new int[n];
		for (int i = 0; i < m; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			to[x].add(y);
			sz[y]++;
		}
		Queue<Integer> q = new ArrayDeque<>();
		int[] ans = new int[n];
		for (int i = 0; i < sz.length; i++) {
			if (sz[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int v = q.poll();
			for (int x : to[v]) {
				ans[x] = Math.max(ans[x], ans[v] + 1);
				sz[x]--;
				if (sz[x] == 0) {
					q.add(x);
				}
			}
		}
		int answer = 0;
		for (int i = 0; i < ans.length; i++) {
			answer = Math.max(answer, ans[i]);
		}
		out.print(answer);
	}
	
	public void solve1() {
		String s = in.next();
		String t = in.next();
		int[][] ans = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i < ans.length - 1; i++) {
			for (int j = 0; j < ans[0].length - 1; j++) {
				if (s.charAt(i) == t.charAt(j)) {
					ans[i + 1][j + 1] = ans[i][j] + 1;
				}
			}
		}
		String answer = "";
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				if (ans[i][j] > answer.length()) {
					answer = s.substring(i - ans[i][j], i);
				}
			}
		}
		out.print(answer);
	}

	public void run() {
		try {
			if (systemIO) {
				in = new FastScanner(System.in);
				out = new PrintWriter(System.out);
			} else {
				in = new FastScanner(new File("input.txt"));
				out = new PrintWriter(new File("output.txt"));
			}
			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
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

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	public static void main(String[] arg) {
		new Main().run();
	}
}