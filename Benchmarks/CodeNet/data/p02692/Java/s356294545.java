import java.util.*;
import java.io.*;

public class Main {

	static String[] arr;
	static int[][][] dp;

	public static int dp(int idx, int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0)
			return 0;
		if (idx == arr.length)
			return 1;
		if (dp[idx][a][b] != -1) {
			return dp[idx][a][b];
		}
		int ans;
		if (arr[idx].equals("AB")) {
			ans = dp(idx + 1, a - 1, b + 1, c) | dp(idx + 1, a + 1, b - 1, c);
		} else if (arr[idx].equals("AC")) {
			ans = dp(idx + 1, a - 1, b, c + 1) | dp(idx + 1, a + 1, b, c - 1);
		} else
			ans = dp(idx + 1, a, b - 1, c + 1) | dp(idx + 1, a, b + 1, c - 1);
		return dp[idx][a][b] = ans;
	}

	public static void trace(int idx, int a, int b, int c) {
		if (idx == arr.length)
			return;
		if (arr[idx].equals("AB")) {
			if (dp(idx + 1, a - 1, b + 1, c) == 1) {
				trace(idx + 1, a - 1, b + 1, c);
				sb.append("B\n");
			} else {
				sb.append("A\n");
				trace(idx + 1, a + 1, b - 1, c);
			}
		} else if (arr[idx].equals("AC")) {
			if (dp(idx + 1, a - 1, b, c + 1) == 1) {
				sb.append("C\n");
				trace(idx + 1, a - 1, b, c + 1);
			} else {
				sb.append("A\n");
				trace(idx + 1, a + 1, b, c - 1);
			}
		} else {
			if (dp(idx + 1, a, b + 1, c - 1) == 1) {
				sb.append("B\n");
				trace(idx + 1, a, b + 1, c - 1);
			} else {
				sb.append("C\n");
				trace(idx + 1, a, b - 1, c + 1);
			}
		}

	}

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		if (a + b + c <= 10) {
			dp = new int[n][11][11];
			for (int[][] x : dp)
				for (int[] y : x)
					Arrays.fill(y, -1);
			for (int i = n; i >= 0; i--) {
				for (int j = 0; j < 11; j++) {
					for (int k = 0; k < 11; k++)
						dp(i, j, k, a + b + c - j - k);
				}
			}
			boolean yes = dp(0, a, b, c) == 1;
			if (yes) {
				pw.println("Yes");
				trace(0, a, b, c);
				pw.print(sb);
			} else {
				pw.println("No");
			}
		} else {
			int[] cnt = { a, b, c };
			for (int i = 0; i < arr.length; i++) {
				if (cnt[arr[i].charAt(0) - 'A'] == 0 && cnt[arr[i].charAt(1) - 'A'] == 0) {
					pw.println("No");
					pw.close();
					return;
				} else if (cnt[arr[i].charAt(0) - 'A'] > cnt[arr[i].charAt(1) - 'A']) {
					cnt[arr[i].charAt(0) - 'A']--;
					cnt[arr[i].charAt(1) - 'A']++;
					sb.append(arr[i].charAt(1) + "\n");
				} else {
					cnt[arr[i].charAt(0) - 'A']++;
					cnt[arr[i].charAt(1) - 'A']--;
					sb.append(arr[i].charAt(0) + "\n");
				}
			}
			pw.println("Yes");
			pw.print(sb);
		}
		pw.close();
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
