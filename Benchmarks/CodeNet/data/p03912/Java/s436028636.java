import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	int getAns(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a.size() > b.size()) {
			return getAns(b, a);
		}
		int res = a.size();
		int more = b.size() - a.size();
		for (int i = 0; i + 1 < b.size(); i++) {
			if (b.get(i) - b.get(i + 1) == 0 && more >= 2) {
				res++;
				i++;
				more -= 2;
			}
		}
		return res;
	}

	void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<Integer>[] g = new ArrayList[m];
		for (int i = 0; i < m; i++) {
			g[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			int id = in.nextInt();
			g[id % m].add(id);
		}
		for (int i = 0; i < m; i++) {
			Collections.sort(g[i]);
		}
		int res = g[0].size() / 2;
		for (int i = 1, j = m - 1; i < j; i++, j--) {
			res += getAns(g[i], g[j]);
		}
		if (m % 2 == 0) {
			res += g[m / 2].size() / 2;
		}
		out.println(res);
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