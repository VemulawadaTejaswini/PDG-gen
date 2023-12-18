import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		int[] comp;
		SortedSet<Item>[] inComp;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (m == n - 1) {
				out.println(0);
				return;
			}
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			comp = new int[n];
			inComp = new SortedSet[n];
			Item[] items = new Item[n];
			for (int i = 0; i < n; i++) {
				comp[i] = i;
				inComp[i] = new TreeSet<>();
				items[i] = new Item();
				items[i].value = a[i];
				items[i].id = i;
				inComp[i].add(items[i]);
			}

			for (int i = 0; i < m; i++) {
				int u = in.nextInt();
				int v = in.nextInt();
				merge(u, v);
			}

			long ans = 0;
			List<Item> all = new ArrayList<>();
			int comps = 0;
			for (int i = 0; i < n; i++) {
				if (comp[i] == i) {
					Item f = inComp[i].first();
					ans += f.value;
					inComp[i].remove(f);
					all.addAll(inComp[i]);
					++comps;
				}
			}

			int need = n - 1 - m - comps / 2;
			if (need > all.size()) {
				out.println("Impossible");
				return;
			}

			Collections.sort(all);
			for (int i = 0; i < need; i++) {
				ans += all.get(i).value;
			}

			out.println(ans);
		}

		int merge(int a, int b) {
			int ca = comp[a];
			int cb = comp[b];
			if (ca == cb) {
				return ca;
			}
			if (inComp[ca].size() > inComp[cb].size()) {
				int t = ca;
				ca = cb;
				cb = t;
			}
			for (Item it : inComp[ca]) {
				comp[it.id] = cb;
				inComp[cb].add(it);
			}
			return cb;
		}

		class Item implements Comparable<Item> {
			int value;
			int id;

			public int compareTo(Item o) {
				if (value != o.value) {
					return value < o.value ? -1 : 1;
				}
				return id - o.id;
			}

		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

