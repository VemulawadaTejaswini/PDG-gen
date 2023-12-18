import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {
		int d = ni();
		long g = nl() / 100;
		int[][] a = nia(d, 2);
		TreeMap<Long, Integer> m = new TreeMap<Long, Integer>(Collections.reverseOrder());
		m.put(0L, 0);

		for (int i = 0; i < d; i++) {
			Long[] keys = m.keySet().toArray(new Long[0]);
			TreeMap<Long, Integer> m2 = new TreeMap<Long, Integer>(Collections.reverseOrder());
			for (Long s : keys) {
				if (s >= g)
					continue;
				for (int k = a[i][0]; k > 0; k--) {
					Long ns = s + (i + 1) * k;
					if (k == a[i][0])
						ns += a[i][1] / 100;
					if (ns > g)
						ns = g;
					int v = m.get(s) + k;
					add(m2, ns, v);
				}
			}
			for (Entry<Long, Integer> en : m2.entrySet())
				add(m, en.getKey(), en.getValue());
//			Helper.tr(m);
		}

		out.println(m.get(g));
	}

	private void add(TreeMap<Long, Integer> m, Long ns, int v) {
		Entry<Long, Integer> en = m.ceilingEntry(ns);
		while ((en = m.ceilingEntry(ns)) != null) {
			if (en.getValue() > v)
				m.remove(en.getKey());
			else
				break;
		}
		m.put(ns, Math.min(m.getOrDefault(ns, Integer.MAX_VALUE), v));
	}

	String ns() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " ");
		}
		return tok.nextToken();
	}

	int ni() throws IOException {
		return Integer.parseInt(ns());
	}

	long nl() throws IOException {
		return Long.parseLong(ns());
	}

	double nd() throws IOException {
		return Double.parseDouble(ns());
	}

	String[] nsa(int n) throws IOException {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = ns();
		}
		return res;
	}

	int[] nia(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = ni();
		}
		return res;
	}

	int[][] nia(int n, int m) throws IOException {
		int[][] res = new int[n][];
		for (int i = 0; i < n; i++) {
			res[i] = nia(m);
		}
		return res;
	}

	long[] nla(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = nl();
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}
}