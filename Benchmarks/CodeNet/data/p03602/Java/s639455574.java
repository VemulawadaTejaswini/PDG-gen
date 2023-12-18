import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		long[][] a=  new long[n][n];
		long INF = Long.MAX_VALUE / 3;
		long result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextLong();
				result += a[i][j];
			}
		}
		result /= 2;
		
		long[][] b = new long[n][n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i].clone();
		}
		
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j && i != k && k != j && b[i][j] == b[i][k] + b[k][j]) {
						result -= b[i][j];
						b[i][j] = b[j][i] = INF;
					}
				}
			}
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					b[i][j] = Math.min(b[i][j], b[i][k] + b[k][j]);
				}
			}
		}
		for (int i = 0; i < n; i++){ 
			if (!Arrays.equals(a[i], b[i])) {
				out.println(-1);
				return;
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
