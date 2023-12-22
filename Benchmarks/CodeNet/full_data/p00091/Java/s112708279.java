import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	boolean[][] possible;
	int[][] a;
	List<Cand> cands;
	Deque<Cand> ans;
	void solve() {
		int n = sc.nextInt();
		a = new int[10][10];
		for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) a[i][j] = sc.nextInt();

		int remain = 0;
		for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) remain += a[i][j];

		cands = new java.util.ArrayList<Cand>();
		for (int i = 0; i < 10; i++) for (int j = 0; j < 10; j++) for (int size = 1; size <= 3; size++) {
			if (can(a, i, j, size)) {
				cands.add(new Cand(i, j, size));
			}
		}


		tr(n, remain, "kkkkk");
		possible = new boolean[n + 1][remain + 1];
		possible[0][0] = true;
		for (int j = 0; j + 1 <= n; j++) {
			for (int i = 0; i <= remain; i++) {
				if (possible[j][i]) {
					if (i + 5 <= remain) possible[j+1][i + 5] = true;
					if (i + 9 <= remain) possible[j+1][i + 9] = true;
					if (i +13 <= remain) possible[j+1][i + 13] = true;
				}
			}
		}

		try {
			ans = new ArrayDeque<Cand>();
			dfs(n, remain, 0);
		} catch (Exception e) {
			// print answer...
			for (Cand s : ans) {
				out.println(s.c + " " + s.r + " " + s.size);
			}
		}
	}

	void dfs(int depth, int remain, int start) throws Exception {
		if (depth == 0) {
			if (remain == 0) {
				throw new Exception("success");
			}
		}
		if (!possible[depth][remain]) return ;
		for (int i = start; i < cands.size(); i++) {
			Cand s = cands.get(i);
			if (can(a, s.r, s.c, s.size)) {
				remain += add(a, s, -1);
				ans.add(s);
				dfs(depth - 1, remain, i);
				ans.removeLast();
				remain += add(a, s, +1);
			}
		}

	}

	class Cand {
		int r, c, size;
		public Cand(int r, int c, int size) {
			this.r = r;
			this.c = c;
			this.size = size;
		}
	}

	int[] dr1 = {0, 0, 0, -1, 1};
	int[] dc1 = {0, 1, -1, 0, 0};
	int[] dr2 = {0, 0, 0, 1, 1, 1, -1, -1, -1};
	int[] dc2 = {0, -1, 1, 0, -1, 1, 0, -1, 1};
	int[] dr3 = {0, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 2, -2};
	int[] dc3 = {0, -1, 1, 0, -1, 1, 0, -1, 1, 2, -2, 0, 0};

	int[] getdr(int size) {
		if (size == 1) return dr1;
		if (size == 2) return dr2;
		if (size == 3) return dr3;
		return null;
	}
	int[] getdc(int size) {
		if (size == 1) return dc1;
		if (size == 2) return dc2;
		if (size == 3) return dc3;
		return null;
	}

	boolean can(int[][] table, int r, int c, int size) {
		int[] dr = getdr(size);
		int[] dc = getdc(size);
		for (int i = 0; i < dr.length; i++) {
			int r1 = r + dr[i];
			int c1 = c + dc[i];
			if (r1 < 0 || 10 <= r1) return false;
			if (c1 < 0 || 10 <= c1) return false;
			if (table[r1][c1] <= 0) return false;
		}
		return true;
	}

	int add(int[][] table, Cand s, int val) {
		int sum = 0;
		int[] dr = getdr(s.size);
		int[] dc = getdc(s.size);
		for (int i = 0; i < dr.length; i++) {
			int r1 = s.r + dr[i];
			int c1 = s.c + dc[i];
			table[r1][c1] += val;
			sum += val;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}