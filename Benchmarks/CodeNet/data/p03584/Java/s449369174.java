import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt(), k = in.nextInt();
		k++;
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		long result = 0;
		for (int bit = 30; bit >= 0; bit--) {
			if ((k & (1 << bit)) != 0) {
				int m = k ^ (1 << bit);
				m >>>= bit;
				long sum = 0;
				for (int i = 0; i < n; i++) {
					if (((a[i] >> bit) | m) == m) {
						sum += b[i];
					}
				}
				result = Math.max(sum, result);
			}
		}
		out.println(result);
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
