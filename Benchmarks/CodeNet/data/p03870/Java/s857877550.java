import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		int n = in.nextInt();
		int xor = 0;
		boolean[] have = new boolean[1 << 20];
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			xor ^= x;
			have[x ^ (x - 1)] = true;
		}
		ArrayList<Integer> all = new ArrayList<Integer>();
		for (int i = 0; i < have.length; i++) {
			if (have[i]) {
				all.add(i);
			}
		}
		int res = Integer.MAX_VALUE;
		for (int mask = 0; mask < 1 << all.size(); mask++) {
			int nxor = 0;
			for (int i = 0; i < all.size(); i++) {
				if (((1 << i) & mask) != 0) {
					nxor ^= all.get(i);
				}
			}
			if (nxor == xor) {
				int tmp = Integer.bitCount(mask);
				if (tmp < res) {
					res = tmp;
				}
			}
		}
		out.println(res == Integer.MAX_VALUE ? -1 : res);
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