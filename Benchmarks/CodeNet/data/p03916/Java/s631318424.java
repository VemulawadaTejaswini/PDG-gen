import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	class Segment implements Comparable<Segment> {
		int from, to;
		int mul, add;

		public Segment(int from, int to, int mul, int add) {
			super();
			this.from = from;
			this.to = to;
			this.mul = mul;
			this.add = add;
		}

		public int compareTo(Segment arg0) {
			return Integer.compare(from, arg0.from);
		}

	}

	void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i + 1 < n; i++) {
			a[i] = in.nextInt();
		}
		int m = in.nextInt();
		ArrayList<Segment> cur = new ArrayList<Main.Segment>();
		cur.add(new Segment(1, (int) 1e9, 1, 0));

		for (int opPos = n - 3; opPos >= 1; opPos--) {
			ArrayList<Segment> next = new ArrayList<Main.Segment>();
			for (Segment s : cur) {
				if (s.from > s.to) {
					throw new AssertionError();
				}
				if (s.mul == 1) {
					if (s.from + s.add >= a[opPos + 1]) {
						s.add -= a[opPos + 1];
						next.add(s);
					} else {
						if (s.to + s.add <= a[opPos + 1]) {
							s.mul = -1;
							s.add = a[opPos + 1] - s.add;
							next.add(s);
						} else {
							int nFrom = a[opPos + 1] - s.add;
							next.add(new Segment(nFrom, s.to, 1, s.add
									- a[opPos + 1]));
							s.to = nFrom - 1;
							s.mul = -1;
							s.add = a[opPos + 1] - s.add;
							next.add(s);
						}
					}
				} else {
					if (-s.to + s.add >= a[opPos + 1]) {
						s.add -= a[opPos + 1];
						next.add(s);
					} else {
						if (-s.from + s.add <= a[opPos + 1]) {
							s.mul = 1;
							s.add = a[opPos + 1] - s.add;
							next.add(s);
						} else {
							int nFrom = -(a[opPos + 1] - s.add);
							next.add(new Segment(nFrom, s.to, 1, a[opPos + 1]
									- s.add));
							s.to = nFrom - 1;
							s.add -= a[opPos + 1];
							next.add(s);
						}
					}
				}
			}
			cur = next;
		}
		Collections.sort(cur);
		for (int i = 0; i < m; i++) {
			int val = in.nextInt();
			int l = 0, r = cur.size();
			while (r - l > 1) {
				int mid = (l + r) >> 1;
				if (cur.get(mid).from <= val) {
					l = mid;
				} else {
					r = mid;
				}
			}
			long ans = cur.get(l).add + cur.get(l).mul * val;
			out.println(a[0] - a[1] + ans);
		}
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