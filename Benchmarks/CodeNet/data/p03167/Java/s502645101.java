import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	final static int MOD = 1000000007;
	public static void main(String[] args) {
		Reader in = new Reader();
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] v = new char[n][m];
		int[][] dp = new int[n][m];
		for(int i  = 0; i<n; i++) {
			char[] a = in.next().toCharArray();
			for(int j = 0; j<m; j++)  v[i][j] = a[j];
		}
		dp[0][0] = 1;
		for(int i = 1; i<n; i++) if(v[i][0]=='#') dp[i][0] = 0; else dp[i][0] = dp[i-1][0];
		for(int j = 1; j<m; j++) if(v[0][j]=='#') dp[0][j] = 0; else dp[0][j] = dp[0][j-1];
			
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<m; j++) {
				dp[i][j] += dp[i-1][j];
				dp[i][j]%=MOD;
				dp[i][j] += dp[i][j-1];
				dp[i][j]%=MOD;
				if(v[i][j]=='#') dp[i][j] = 0;
			}
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) System.out.print(dp[i][j]+" ");
			System.out.println();
		}
		System.out.println(dp[n-1][m-1]);
	}
	
	static class Reader {
		static BufferedReader br;
		static StringTokenizer st;
		private int charIdx = 0;
		private String s;

		public Reader() {
			this.br = new BufferedReader(new InputStreamReader(System.in));
		}

		public int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public char nextChar() {
			if (s == null || charIdx >= s.length()) {
				if (st == null || !st.hasMoreTokens())
					try {
						readLine();
					} catch (Exception e) {
					}
				s = st.nextToken();
				charIdx = 0;
			}
			return s.charAt(charIdx++);
		}

		public long[] nl(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[] nca() {
			return next().toCharArray();
		}

		public String[] nS(int n) {
			String[] a = new String[n];
			for (int i = 0; i < n; i++)
				a[i] = next();
			return a;
		}

		public int nextInt() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Integer.parseInt(st.nextToken());
		}

		public double nextDouble() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Double.parseDouble(st.nextToken());
		}

		public Long nextLong() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return Long.parseLong(st.nextToken());
		}

		public String next() {
			if (st == null || !st.hasMoreTokens())
				try {
					readLine();
				} catch (Exception e) {
				}
			return st.nextToken();
		}

		public static void readLine() {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
			}
		}
	}
}