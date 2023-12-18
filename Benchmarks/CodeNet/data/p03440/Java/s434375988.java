import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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

			PriorityQueue<Item> pq = new PriorityQueue<>();
			List<Integer> leaveComps = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if (comp[i] == i) {
					if (inComp[i].size() > 1) {
						pq.offer(inComp[i].first());
					} else {
						leaveComps.add(i);
					}
				}
			}
			long ans = 0;
			while (pq.size() > 1) {
				Item u = pq.poll();
				Item v = pq.poll();
				if (u.id == v.id) {
					throw new AssertionError();
				}
				ans += u.value + v.value;
				int c = merge(u.id, v.id);
				inComp[c].remove(u);
				inComp[c].remove(v);
				if (inComp[c].isEmpty()) {
					out.println("Impossible");
					return;
				}
				if (inComp[c].size() > 1) {
					pq.offer(inComp[c].first());
				} else {
					leaveComps.add(c);
				}
			}

			int bigComp = -1;
			for (int i = 0; i < n; i++) {
				if (comp[i] == i && inComp[i].size() > 1) {
					bigComp = i;
				}
			}

			if (bigComp < 0) {
				if (leaveComps.size() > 2) {
					out.println("Impossible");
					return;
				}
				if (leaveComps.size() == 2) {
					ans += inComp[leaveComps.get(0)].first().value;
					ans += inComp[leaveComps.get(1)].first().value;
				}
				out.println(ans);
				return;
			}

			if (inComp[bigComp].size() < leaveComps.size()) {
				out.println("Impossible");
				return;
			}

			SortedSet<Item> bc = inComp[bigComp];
			for (int c : leaveComps) {
				ans += inComp[c].first().value;
				Item f = bc.first();
				ans += f.value;
				bc.remove(f);
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

