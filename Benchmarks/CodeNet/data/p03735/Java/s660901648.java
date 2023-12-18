import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } }) == 15;
		assert solve(new int[][] { { 1010, 10 }, { 1000, 1 }, { 20, 1020 } }) == 380;
		assert solve(new int[][] { { 1, 1 }, { 1000000000, 1000000000 } }) == 999999998000000001L;
		int n = cin.nextInt();
		int[][] xys = new int[n][];
		for (int i = 0; i < n; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt() };
		long ans = -1;
		ans = solve(xys);
		cout.println(ans);
	}

	private static long solve(int[][] xys) {
		Arrays.sort(xys, (xy1, xy2) -> Integer.compare(xy1[0], xy2[0]));
		ArrayDeque<State> buf = new ArrayDeque<>();
		State start = new State(xys[0][0], xys[0][0], xys[0][1], xys[0][1]);
		buf.add(start);
		for (int i = 1; i < xys.length; i++) {
			int[] xy = xys[i];
			ArrayDeque<State> temp = new ArrayDeque<>();
			HashSet<State> vis = new HashSet<>();
			while (!buf.isEmpty()) {
				State s = buf.pop();
				State ns1 = new State(Math.min(s.rmin, xy[0]), Math.max(s.rmax, xy[0]), Math.min(s.bmin, xy[1]),
						Math.max(s.bmax, xy[1]));
				State ns2 = new State(Math.min(s.rmin, xy[1]), Math.max(s.rmax, xy[1]), Math.min(s.bmin, xy[0]),
						Math.max(s.bmax, xy[0]));
				for (State ns : new State[] { ns1, ns2 }) {
					if (vis.contains(ns))
						continue;
					vis.add(ns);
					temp.add(ns);
				}
			}
			buf = temp;
		}
		long ans = Long.MAX_VALUE;
		while (!buf.isEmpty())
			ans = Math.min(ans, eval(buf.pop()));
		return ans;
	}

	private static long eval(State s) {
		return (s.rmax - s.rmin) * (s.bmax - s.bmin);
	}

	private static class State {
		long rmin;
		long rmax;
		long bmin;
		long bmax;

		public State(long rmin, long rmax, long bmin, long bmax) {
			super();
			this.rmin = rmin;
			this.rmax = rmax;
			this.bmin = bmin;
			this.bmax = bmax;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (bmax ^ (bmax >>> 32));
			result = prime * result + (int) (bmin ^ (bmin >>> 32));
			result = prime * result + (int) (rmax ^ (rmax >>> 32));
			result = prime * result + (int) (rmin ^ (rmin >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			State other = (State) obj;
			if (bmax != other.bmax)
				return false;
			if (bmin != other.bmin)
				return false;
			if (rmax != other.rmax)
				return false;
			if (rmin != other.rmin)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "State [rmin=" + rmin + ", rmax=" + rmax + ", bmin=" + bmin + ", bmax=" + bmax + "]";
		}

	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
