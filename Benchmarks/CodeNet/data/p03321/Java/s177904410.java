import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<int[]> a;
	static int n;
	static int[][] dp;

	public static int dp(int idx, int v) {
		if (idx == a.size()) {
			int u = n - v;
			return u * (u - 1) / 2 + v * (v - 1) / 2;
		}
		if (dp[idx][v] != -1) {
			return dp[idx][v];
		}
		return dp[idx][v] = Math.min(dp(idx + 1, v + a.get(idx)[1]), dp(idx + 1, v + a.get(idx)[2]));
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] adjMatrix = new boolean[n][n];
		while (m-- > 0) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			adjMatrix[u][v] = adjMatrix[v][u] = true;
		}
		int[] clr = new int[n];
		boolean valid = true;
		a = new ArrayList<int[]>();
		for (int i = 0; i < clr.length; i++) {
			
			if (clr[i] == 0) {
				int[] cnt = { 0, 0, 0 };
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(i);
				clr[i] = 1;
				cnt[1]++;
				while (!q.isEmpty()) {
					int cur = q.poll();
					for (int j = 0; j < n; j++) {
						if (cur == j)
							continue;
						if (!adjMatrix[cur][j]) {
							if (clr[j] == 0) {
								clr[j] = 3 - clr[cur];
								cnt[clr[j]]++;
								q.add(j);
							} else if (clr[cur] == clr[j]) {
								valid = false;
								
							}
						}
					}
				}
				a.add(cnt);
			}
		}
		if (valid) {
			dp = new int[a.size()][n + 1];
			for (int[] x : dp)
				Arrays.fill(x, -1);
			pw.println(dp(0, 0));
		} else {
			pw.println(-1);
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
