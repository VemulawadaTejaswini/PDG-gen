import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	static int[][] dp;
	static String s1, s2;

	static int dp(int l1, int l2) {
		if (l1 == s1.length() || l2 == s2.length())
			return 0;
		if (dp[l1][l2] != -1)
			return dp[l1][l2];
		return dp[l1][l2] = s1.charAt(l1) == s2.charAt(l2) ? 1 + dp(l1 + 1, l2 + 1)
				: Math.max(dp(l1, l2 + 1), dp(l1 + 1, l2));
	}

	static StringBuilder trace(int l1, int l2) {
		StringBuilder ans = new StringBuilder();
		while (l1 < s1.length() && l2 < s2.length()) {
			if (s1.charAt(l1) == s2.charAt(l2)) {
				ans.append(s1.charAt(l1++));

				l2++;
			} else {
				if (l1 < s1.length() - 1 && l2 < s2.length() - 1) {
					if (dp[l1][l2 + 1] < dp[l1 + 1][l2]) {
						l1++;
					} else
						l2++;
				} else if (l1 != s1.length() - 1)
					l1++;
				else if (l2 != s2.length() - 1)
					l2++;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		s1 = sc.next();
		s2 = sc.next();
		dp = new int[s1.length()][s2.length()];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		dp(0, 0);
		pw.println(trace(0, 0));
		pw.flush();
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
