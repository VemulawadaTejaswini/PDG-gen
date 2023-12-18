import java.util.*;
import java.io.*;

public class Main {
	
	class Point {
		double x, y;

		public Point(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	class Line {
		double a, b, c;

		public Line(double a, double b, double c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}
		Point intersect(Line other) {
			double d = a * other.b - b * other.a;
			double dx = b * other.c - c * other.b;
			double dy = c * other.a - a * other.c;
			return new Point(dx / d, dy / d);
		}
		@Override
		public String toString() {
			return "Line [a=" + a + ", b=" + b + ", c=" + c + "]";
		}
		
		
	}

	void solve() {
		int n = in.nextInt();
		Line[] lines = new Line[n];
		for (int i = 0; i < n; i++) {
			lines[i] = new Line(in.nextDouble(), in.nextDouble(), -in.nextDouble());
		}
		
		double x = find(lines);
		for (int i = 0; i < n; i++) {
			double tmp = lines[i].a;
			lines[i].a = lines[i].b;
			lines[i].b = tmp;
		}
		double y = find(lines);
		out.println(x + " " + y);
	}

	class Pair implements Comparable<Pair> {
		double val;
		int id;
		public Pair(double val, int id) {
			super();
			this.val = val;
			this.id = id;
		}
		@Override
		public int compareTo(Pair o) {
			return Double.compare(val, o.val);
		}
		@Override
		public String toString() {
			return "Pair [val=" + val + ", id=" + id + "]";
		}
		
	}
	double find(Line[] lines) {
		int n =lines.length;
		double left = -1e10, right = 1e10;
		Pair[] p = new Pair[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Pair(0, 0);
		}
		fill(p, lines, left);
		Line[] l = new Line[n];
		for (int i = 0; i < n; i++) {
			l[i] = lines[p[i].id];
		}
		lines = l;
		BIT tree = new BIT(n);
		for (int IT = 0; IT < 100; IT++) {
			double mid = (left + right) / 2;
			if (mid == left || mid == right) {
				break;
			}
			
			fill(p, lines, mid);
			Arrays.fill(tree.tree, 0);
			long inv = 0;
			for (int i = 0; i < n; i++) {
				inv += i - tree.get(p[i].id - 1);
				tree.add(p[i].id, 1);
			}
			
					
			if (inv * 4 >= 1L * n * (n - 1)) {
				right = mid;
			} else {
				left = mid;
			}
		}
		return (left + right) / 2;
	}
	
	class BIT {
		int[] tree;
		public BIT(int n) {
			tree = new int[n];
		}
		int get(int r) {
			int res  = 0;
			while (r >= 0) {
				res += tree[r];
				r = (r & (r + 1)) - 1;
			}
			return res;
		}
		void add(int pos, int val) {
			while (pos < tree.length) {
				tree[pos] += val;
				pos |= pos + 1;
			}
		}
	}

	private void fill(Pair[] p, Line[] lines, double x) {
		for (int i = 0; i < p.length; i++) {
			p[i].val = (-lines[i].c - lines[i].a * x) / lines[i].b;
			p[i].id = i;
		}
		Arrays.sort(p);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
