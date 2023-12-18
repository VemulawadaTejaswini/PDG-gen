import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		int n = in.nextInt();
		int xor = 0;
		TreeSet<Integer> hs = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			xor ^= x;
			hs.add(x ^ (x - 1));
		}
		ArrayList<Integer> all = new ArrayList<Integer>();
		for (int x : hs) {
			all.add(x);
		}
		int res = 0;
		for (int i = all.size() - 1; i >= 0; i--) {
			int cur = all.get(i);
			int maxBit = (cur + 1) >> 1;
			if (0 != (xor & maxBit)) {
				res++;
				xor ^= cur;
			}
		}
		out.println(xor != 0 ? -1 : res);
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