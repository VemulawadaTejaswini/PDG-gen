import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int r = sc.nextInt();
		int w = sc.nextInt();
		long x=(long) 1e9+7;
		long[][] dp = new long[r][w];
		for (int i = 0; i < r; i++) {
			String z = sc.next();
			for (int j = 0; j < w; j++) {
				if (z.charAt(j) == '.') {
					if (i == 0 && j == 0) {
						dp[i][j] = 1;
					} else if (i == 0) {
						dp[i][j] = dp[i][j - 1];
					} else if (j == 0) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = (dp[i][j - 1] + dp[i - 1][j])%x;
					}
				} else {
					dp[i][j] = 0;
				}
			}
		}
		
		long y=dp[r - 1][w - 1];
		System.out.println(y>x?y%x:y);
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

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

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
	}
}
