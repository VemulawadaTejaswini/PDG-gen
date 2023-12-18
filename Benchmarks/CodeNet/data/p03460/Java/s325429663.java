import java.util.*;
import java.io.*;

public class Main {
	int[][] a;
	int k;

	void addRect(int r1, int r2, int c1, int c2) {
//		System.err.println(r1 + " " + r2 + " " + c1 + " " + c2);
		if (r2 < 0) {
			addRect(r1 + 2 * k, r2 + 2 * k, c1, c2);
			return;
		}
		if (c2 < 0) {
			addRect(r1, r2, c1 + 2 * k, c2 + 2 * k);
			return;
		}
		if (r1 < 0) {
			addRect(0, r2, c1, c2);
			addRect(r1 + 2 * k, 2 * k,c1, c2);
			return;
		}
		if (c1 < 0) {
			addRect(r1, r2, 0, c2);
			addRect(r1, r2, c1 + 2 * k, 2 * k);
			return;
		}
		add(r1, c1, r2, c2);
	}

	void add(int r1, int c1, int r2, int c2) {
		a[r1][c1]++;
		a[r2][c1]--;
		a[r1][c2]--;
		a[r2][c2]++;
	}

	void solve() {
		int n = in.nextInt();
		k = in.nextInt();
		a = new int[2 * k + 1][2 * k + 1];
		for (int i = 0; i < n; i++) {
			int x = in.nextInt() % (2 * k);
			int y = in.nextInt() % (2 * k);
			char c = in.nextToken().charAt(0);
			if (c == 'B') {
				addRect(x - k + 1, x + 1, y - k + 1, y + 1);
				addRect(x - 2 * k + 1, x - k + 1, y - 2 * k + 1, y - k + 1);
			} else {
				addRect(x - k + 1, x + 1, y - 2 * k + 1, y - k + 1);
				addRect(x - 2 * k + 1, x - k + 1, y - k + 1, y + 1);
			}
		}
		int max = 0;
		for (int i = 0; i <= 2 * k; i++) {
			for (int j = 0; j <= 2 * k; j++) {
				if (i > 0){
					a[i][j] += a[i - 1][j];
				}
				if (j > 0) {
					a[i][j] += a[i][j - 1];
				}
				if (i > 0 && j > 0) {
					a[i][j] -= a[i - 1][j - 1];
				}
				max = Math.max(a[i][j], max);
			}
		}
		out.println(max);
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
