import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static char[][] grid;
	static long[][] dp;
	static int h, w;

	public static void main(String[] args) throws IOException {
		PrintWriter pw= new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
 int mod=(int)1e9+7;
		h = sc.nextInt();
		w = sc.nextInt();
		grid = new char[h][w];
		for (int i = 0; i < grid.length; i++) {
			grid[i] = sc.next().toCharArray();
		}
		dp = new long[h][w];

		for (int i = 0; i < h; i++) {
			if (grid[i][0] == '#')
				break;
			dp[i][0] = 1;
		}

		for (int i = 0; i < w; i++) {
			if (grid[0][i] == '#')
				break;
			dp[0][i] = 1;
		}

		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (grid[i][j] != '#') {
					dp[i][j] = (dp[i - 1][j] + dp[i][j - 1])%mod;
				}
			}
		}
		pw.println(dp[h-1][w-1]);
		pw.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
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
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
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
