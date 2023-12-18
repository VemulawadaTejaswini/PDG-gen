import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SuppressWarnings("unchecked")
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[][] a = new int[n][n - 1];
		int[] idx = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = sc.nextInt() - 1;
			}
		}


		int days = 0;
		int remain = n * (n - 1) / 2;
		while (remain > 0) {
			boolean[] marked = new boolean[n];

			int count = 0;
			for (int i = 0; i < n; i++) {
				if (marked[i] || idx[i] >= n - 1) continue;
				int opponent = a[i][idx[i]];
				if (marked[opponent] || idx[opponent] >= n - 1) continue;
				if (a[opponent][idx[opponent]] != i) continue;

				marked[i] = true;
				marked[opponent] = true;
				idx[i]++;
				idx[opponent]++;
				remain--;
				count += 2;
				if (count == n) break;
			}

			if (count == 0) {
				System.out.println(-1);
				return;
			}

			days++;
		}

		System.out.println(days);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
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

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
