import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		int n = cin.nextInt();
		int[][] xys = new int[n][];
		for (int i = 0; i < n; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt(), i };

		long ans = solve(n, xys);
		cout.println(ans);
	}

	private static long solve(int n, int[][] xys) {
		// editorial後

		ArrayList<int[]> xordered = new ArrayList<>();
		ArrayList<int[]> yordered = new ArrayList<>();
		for (int[] xy : xys) {
			xordered.add(xy);
			yordered.add(xy);
		}
		Collections.sort(xordered, (xy1, xy2) -> Integer.compare(xy1[0], xy2[0]));
		Collections.sort(yordered, (xy1, xy2) -> Integer.compare(xy1[1], xy2[1]));
		ArrayList<int[]> edges = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			int fr = xordered.get(i - 1)[2];
			int to = xordered.get(i)[2];
			int[] nfr = xys[fr];
			int[] nto = xys[to];
			int w = Math.abs(nfr[0] - nto[0]);
			edges.add(new int[] { w, fr, to });
		}
		for (int i = 1; i < n; i++) {
			int fr = yordered.get(i - 1)[2];
			int to = yordered.get(i)[2];
			int[] nfr = xys[fr];
			int[] nto = xys[to];
			int w = Math.abs(nfr[1] - nto[1]);
			edges.add(new int[] { w, fr, to });
		}

		// 最小全域木
		// https://ja.wikipedia.org/wiki/%E5%85%A8%E5%9F%9F%E6%9C%A8
		// クラスカル法
		// https://en.wikipedia.org/wiki/Kruskal%27s_algorithm
		long ans = 0;

		Collections.sort(edges, (e1, e2) -> Integer.compare(e1[0], e2[0]));
		class Group {
			int no;

			public Group(int no) {
				super();
				this.no = no;
			}
		}
		Group[] vis = new Group[n];
		int group = 0;
		for (int[] e : edges) {
			int w = e[0];
			int fr = e[1];
			int to = e[2];
			Group g;
			if (vis[fr] == null && vis[to] == null) {
				group += 1;
				g = new Group(group);
			} else if (vis[fr] == null ^ vis[to] == null) {
				g = vis[fr];
				if (vis[fr] == null)
					g = vis[to];
			} else if (vis[fr].no == vis[to].no) {
				continue;
			} else {
				// マージ
				g = vis[fr];
				vis[fr].no = vis[to].no;
				// 技術的に言って、グループfrの全ノードは単一のGroup(fr)を参照している。
				// 実質的にグループfrの全ノードをグループtoに変更する効果がある。
			}
			// System.out.println(fr + " " + to);
			vis[fr] = g;
			vis[to] = g;
			ans += w;
		}
		return ans;
	};

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
