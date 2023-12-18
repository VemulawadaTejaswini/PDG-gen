import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	void solve() throws IOException {
		solve(ni());
	}

	int[][] max;

	private void solve(int n) throws IOException {
		int[] a = nia(1 << n);
		max = new int[a.length][2];

		for (int i = 0; i < a.length; i++) {
			for (int bit = 0; bit < n; bit++) {
				if ((i & (1 << bit)) == 0) {
					merge(i ^ (1 << bit), a[i]);
				}
			}
			merge(i, a[i]);
		}
//		Helper.tr(max);
		int ans = 0;
		for (int i = 1; i < max.length; i++) {
			ans = Math.max(ans, max[i][0] + max[i][1]);
			out.println(ans);
		}
	}

	private void merge(int i, int v) {
//		Helper.tr(i,v);
		if (max[i][1] < v) {
			max[i][0] = max[i][1];
			max[i][1] = v;
		} else if (max[i][0] < v) {
			max[i][0] = v;
		}
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