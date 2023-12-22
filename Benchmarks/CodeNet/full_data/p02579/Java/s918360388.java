// Utilities
import java.io.*;
import java.util.*;

public class Main {
	static int H, W;
	static int sr, sc, er, ec;
	static char[][] grid;
	static boolean[][] vis;
	static Stack<Pair> stk, nstk;
	static int magic = -1;
	
	public static void main(String[] args) throws IOException {
		H = in.iscan(); W = in.iscan();
		sr = in.iscan()-1; sc = in.iscan()-1; er = in.iscan()-1; ec = in.iscan()-1;
		grid = new char[H][W];
		for (int i = 0; i < H; i++) {
			grid[i] = in.sscan().toCharArray();
		}
		vis = new boolean[H][W];
		while (!vis[er][ec]) {
			magic++;
			if (magic == 0) {
				stk = new Stack<Pair>();
				bfs(sr, sc);
			}
			else {
				nstk = new Stack<Pair>();
				while (!stk.isEmpty()) {
					Pair pi = stk.pop();
					for (int i = Math.max(0, pi.r - 2); i <= Math.min(H-1, pi.r + 2); i++) {
						for (int j = Math.max(0, pi.c - 2); j <= Math.min(W-1, pi.c + 2); j++) {
							if (!vis[i][j] && grid[i][j] == '.') {
								bfs(i, j);
							}
						}
					}
				}
				for (Pair pi : nstk) stk.push(new Pair(pi.r, pi.c));
				if (stk.isEmpty() && !vis[er][ec]) {
					out.println(-1);
					out.close();
					System.exit(0);
				}
			}
		}
		out.println(magic);
		out.close();
	} 
	
	static int[][] d = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	static void bfs(int r, int c) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(r, c));
		if (magic == 0) stk.push(new Pair(r, c));
		else nstk.push(new Pair(r, c));
		vis[r][c] = true;
		while (!q.isEmpty()) {
			Pair p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nr = p.r + d[i][0], nc = p.c + d[i][1];
				if (nr >= 0 && nr < H && nc >= 0 && nc < W && grid[nr][nc] == '.' && !vis[nr][nc]) {
					vis[nr][nc] = true;
					q.add(new Pair(nr, nc));
					if (magic == 0) stk.push(new Pair(nr, nc));
					else nstk.push(new Pair(nr, nc));
				}
			}
		}
	}
	
	static class Pair {
		int r, c;
		Pair(int r, int c){ this.r = r; this.c = c; }
	}
	
	static INPUT in = new INPUT(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	private static class INPUT {

		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar, numChars;

		public INPUT (InputStream stream) {
			this.stream = stream;
		}

		public INPUT (String file) throws IOException {
			this.stream = new FileInputStream (file);
		}

		public int cscan () throws IOException {
			if (curChar >= numChars) {
				curChar = 0;
				numChars = stream.read (buf);
			}
			
			if (numChars == -1)
				return numChars;

			return buf[curChar++];
		}

		public int iscan () throws IOException {
			int c = cscan (), sgn = 1;
			
			while (space (c))
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			int res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
			}
			while (!space (c));

			return res * sgn;
		}

		public String sscan () throws IOException {
			int c = cscan ();
			
			while (space (c))
				c = cscan ();

			StringBuilder res = new StringBuilder ();

			do {
				res.appendCodePoint (c);
				c = cscan ();
			}
			while (!space (c));

			return res.toString ();
		}

		public double dscan () throws IOException {
			int c = cscan (), sgn = 1;
			
			while (space (c))
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			double res = 0;

			while (!space (c) && c != '.') {
				if (c == 'e' || c == 'E')
					return res * UTILITIES.fast_pow (10, iscan ());
				
				res *= 10;
				res += c - '0';
				c = cscan ();
			}

			if (c == '.') {
				c = cscan ();
				double m = 1;

				while (!space (c)) {
					if (c == 'e' || c == 'E')
						return res * UTILITIES.fast_pow (10, iscan ());

					m /= 10;
					res += (c - '0') * m;
					c = cscan ();
				}
			}

			return res * sgn;
		}

		public long lscan () throws IOException {
			int c = cscan (), sgn = 1;
			
			while (space (c))
				c = cscan ();

			if (c == '-') {
				sgn = -1;
				c = cscan ();
			}

			long res = 0;

			do {
				res = (res << 1) + (res << 3);
				res += c - '0';
				c = cscan ();
			}
			while (!space (c));

			return res * sgn;
		}

		public boolean space (int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}

	public static class UTILITIES {

		static final double EPS = 10e-6;

		public static int lower_bound (int[] arr, int x) {
			int low = 0, high = arr.length, mid = -1;

			while (low < high) {
				mid = (low + high) / 2;

				if (arr[mid] >= x)
					high = mid;
				else
					low = mid + 1;
			}

			return low;
		}

		public static int upper_bound (int[] arr, int x) {
			int low = 0, high = arr.length, mid = -1;

			while (low < high) {
				mid = (low + high) / 2;

				if (arr[mid] > x)
					high = mid;
				else
					low = mid + 1;
			}

			return low;
		}

		public static int gcd (int a, int b) {
			return b == 0 ? a : gcd (b, a % b);
		}

		public static int lcm (int a, int b) {
			return a * b / gcd (a, b);
		}

		public static long fast_pow_mod (long b, long x, int mod) {
			if (x == 0) return 1;
			if (x == 1) return b;
			if (x % 2 == 0) return fast_pow_mod (b * b % mod, x / 2, mod) % mod;

			return b * fast_pow_mod (b * b % mod, x / 2, mod) % mod;
		}

		public static int fast_pow (int b, int x) {
			if (x == 0) return 1;
			if (x == 1) return b;
			if (x % 2 == 0) return fast_pow (b * b, x / 2);

			return b * fast_pow (b * b, x / 2);
		}

		public static long choose (long n, long k) {
			k = Math.min (k, n - k);
			long val = 1;

			for (int i = 0; i < k; ++i)
				val = val * (n - i) / (i + 1);

			return val;
		}

		public static long permute (int n, int k) {
			if (n < k) return 0;
			long val = 1;

			for (int i = 0; i < k; ++i)
				val = (val * (n - i));

			return val;
		}
	}
}
