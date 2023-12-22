// Utilities
import java.io.*;
import java.util.*;

public class Main {
	static int N, K;
	static int[] p, c;
	static boolean[] vis;
	static Stack<ArrayList<Integer>> cycle = new Stack<ArrayList<Integer>>();
	static long sumCycle, cycleLength;
	static long cmp, maxAdd, tmp;
	static long nK;
	static long res = -Long.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		N = in.iscan(); K = in.iscan();
		p = new int[N]; c = new int[N];
		for (int i = 0; i < N; i++) p[i] = in.iscan()-1;
		for (int i = 0; i < N; i++) c[i] = in.iscan();
		vis = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (!vis[i]) {
				cycle.push(new ArrayList());
				dfs(i);
			}
		}
		while (!cycle.isEmpty()) {
			ArrayList<Integer> arr = cycle.pop();
			cmp = 0;
			sumCycle = 0;
			for (int xx : arr) sumCycle += xx;
			boolean usedOne = false;
			cycleLength = arr.size();
			if (sumCycle >= 0) {
				cmp += sumCycle*(K/cycleLength);
				if (K/cycleLength >= 1) usedOne = true;
			}
			if (usedOne) {
				nK = K % cycleLength;
				maxAdd = 0;
			}
			else {
				nK = 1;
				maxAdd = -Long.MAX_VALUE;
			}
			for (int i = 0; i < cycleLength; i++) {
				tmp = 0;
				for (int j = i, cx = 0; cx < nK; j = j != 0 ? j-1 : (int)cycleLength-1, cx++) {
					tmp += arr.get(j);
					maxAdd = Math.max(maxAdd, tmp);
				}
			}
			cmp += maxAdd;
			res = Math.max(res, cmp);
		}
		out.println(res);
		out.close();
	} 
	
	static void dfs(int idx) {
		vis[idx] = true;
		cycle.peek().add(c[idx]);
		if (!vis[p[idx]]) {
			dfs(p[idx]);
		}
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