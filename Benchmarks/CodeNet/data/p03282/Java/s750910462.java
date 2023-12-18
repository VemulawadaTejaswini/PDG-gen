
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		char[] s = sc.next().toCharArray();
		long k = sc.nextLong();

		final long niti = 5 * 1000000000000000L;
//		final long niti = 1 * 1L;
		char res = '1';
		for (int i = 0; i < s.length; i++) {
			int now = s[i] - 48;
			long mozi = now == 1 ? 1 : now * niti;
			k -= mozi;
			if (k <= 0) {
				res = s[i];
				break;
			}
		}
out.println(res);
		out.flush();

	}

	static class Toi {
		public int x;
		public int y;
		public long h;

		public Toi(int x, int y, long h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}

		@Override public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}

			if (this == obj) {
				return true;
			}

			if (this.getClass() != obj.getClass()) {
				return false;
			}

			Toi toi = (Toi) obj;
			return x == toi.x && y == toi.y && h == toi.h;
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
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
