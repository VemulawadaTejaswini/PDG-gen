import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] z) throws Exception{
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		for (;;) {
			int w = s.nextInt(), h = s.nextInt();
			if (w < 1) {
				break;
			}
			int[][] a = new int[h + 2][w + 2];
			adj = new ArrayList<List<Integer>>();
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					a[i][j] = 1 - s.nextInt();
					adj.add(new ArrayList<Integer>());
				}
			}
			Set<Integer> vx = new HashSet<Integer>();
			int startIndex = 0, end = 0;
			for (int i = 1; i <= h; ++i) {
				for (int j = 1; j <= w; ++j) {
					for (int[] d : e) {
						if (a[i][j] == 1 && a[i + d[0]][j + d[1]] == 1) {
							int u = i * w + j - w - 1;
							int v = (i + d[0]) * w + j + d[1] - w - 1;
							vx.add(u);
							adj.get(u).add(v);
							startIndex = u;
							end = v;
						}
					}
				}
			}
			int n = vx.size();
			List<Integer> hamilton = new ArrayList<Integer>();
			hamilton.add(startIndex);
			hamilton.add(end);
			Arrays.fill(used, false);
			used[startIndex] = used[end] = true;
			for (int i = 0; i < hamilton.size() - 1; ++i) {
				startIndex = i + 1;
				Arrays.fill(pathused, false);
				int st = hamilton.get(i + 1), ed = hamilton.get(i);
				if (isH(st, st, ed)) {
					while (p > 0) {
						Integer x = q[--p];
						hamilton.add(i + 1, x);
						used[x] = true;
					}
				}
			}
			pw.println(hamilton.size() == n ? "Yes" : "No");
		}
		pw.close();
	}

	static List<List<Integer>> adj;
	static int p = 0, q[] = new int[50];
	static boolean[] used = new boolean[50], pathused = new boolean[50];
	static int[][] e = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

	static boolean isH(int start, int u, int v) {
		for (int next : adj.get(u)) {
			if (next == v && u != start) {
				return true;
			}
			if (!used[next] && !pathused[next]) {
				pathused[q[p++] = next] = true;
				if (isH(start, next, v)) {
					return true;
				}
				pathused[q[--p]] = false;
			}
		}
		return false;
	}

	static class Scanner {
		java.io.BufferedInputStream bis;

		public Scanner(java.io.InputStream is) {
			bis = new java.io.BufferedInputStream(is);
		}

		public String next() {
			StringBuilder sb = new StringBuilder();
			int b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				for (; !Character.isWhitespace(b); b = bis.read()) {
					sb.append((char) b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sb.toString();
		}

		public int nextInt() {
			int r = 0, s = 1, b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				if ((s = b == '-' ? -1 : 1) < 0) {
					b = bis.read();
				}
				for (; Character.isDigit(b); b = bis.read())
					r = r * 10 + b - '0';
			} catch (Exception e) {
			}
			return s * r;

		}
	}
}