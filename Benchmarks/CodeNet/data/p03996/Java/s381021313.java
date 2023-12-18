import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	void solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = in.nextInt() - 1;
		}
		int[] pos = new int[m];
		Arrays.fill(pos, -1);
		int nowPos = 0;
		int[] vals = new int[m];
		int[] num = new int[m + 1];
		num[0] = n;
		for (int i = q - 1; i >= 0; i--) {
			int id = a[i];
			if (pos[id] == -1) {
				vals[nowPos] = id;
				pos[id] = nowPos;
				nowPos++;
			}
			if (num[pos[id]] > 0) {
				num[pos[id]]--;
				num[pos[id] + 1]++;
			}
		}
		for (int i = 0; i < m; i++) {
			if (num[i] !=0) {
				boolean[] all = new boolean[m];
				Arrays.fill(all, true);
				for (int j = 0; j < m; j++) {
					if (pos[j] != -1 && pos[j] < i) {
						all[j] = false;
					}
				}
				int it = 0;
				boolean ok = true;
				for (int j = i; j < nowPos; j++) {
					while (!all[it]) {
						it++;
					}
					if (it != vals[j]) {
						ok = false;
						break;
					}
					it++;
				}
				out.println(ok ? "Yes" : "No");
				return;
			}
		}
		out.println("Yes");
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