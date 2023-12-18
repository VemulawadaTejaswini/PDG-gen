import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static long count = 0;
	static int r;
	static int c;
	static char[][] a;
	static long mod = (long) 1e9 + 7;

	public static long dp(int row, int col, int i, int j) {
		if (!valid(row, col)) {
			return 0;
		}
		if (a[i][j] == '#') {
			return 0;
		}
		if (row == r) {
			return 0;
		}
		if (row == r - 1 && col == c - 1) {
			count++;
		}
		long right = dp(row, col + 1, i, j + 1);
		long down = dp(row + 1, col, i + 1, j);
		return count % mod;

	}

	public static boolean valid(int row, int col) {
		return row < r && col < c;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		r = sc.nextInt();
		c = sc.nextInt();
		a = new char[r][c];
		for (int i = 0; i < r; i++) {

			a[i] = sc.next().toCharArray();

		}
		System.out.println(dp(0, 0, 0, 0));
		

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

	}


}
