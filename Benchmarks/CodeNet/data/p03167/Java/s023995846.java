
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static final int module = (int) 1e9 + 7;
	static int w, h;
	static StringBuilder[] graph;
	static int[][] memo;

	public static int dp(int i, int j) {
		if (i == h - 1 && j == w - 1)
			return 1;
		if (i >= h || j >= w || graph[i].charAt(j)=='#')
			return 0;
		if (memo[i][j] != -1)
			return memo[i][j];
		return memo[i][j] = (dp(i+1,j)+dp(i,j+1)) % module;

	}

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		graph = new StringBuilder[h];
		memo = new int[h][w];
		for (int i = 0; i < h; i++) {
			graph[i] = new StringBuilder(sc.nextLine());
			Arrays.fill(memo[i], -1);
		}
		pw.print(dp(0,0));
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
