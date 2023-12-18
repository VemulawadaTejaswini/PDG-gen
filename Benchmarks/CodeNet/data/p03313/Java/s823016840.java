import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
	int[] a;

	private void solve(int n) throws IOException {
		int N = 1 << n;

		a = new int[N];
		max = new int[N][2];
		for (int i = 0; i < N; i++) {
			a[i] = ni();
			Arrays.fill(max[i], -1);
		}

		for (int i = 0; i < N; i++) {
//			Helper.tr("->", i);
			merge(i, i);
			for (int bit = 0; bit < n; bit++) {
				if ((i & (1 << bit)) == 0) {
					merge(i ^ (1 << bit), max[i][1]);
					merge(i ^ (1 << bit), max[i][0]);
				}
			}
		}
//		Helper.tr(a);
//		Helper.tr(max);
		int ans = 0;
		for (int i = 1; i < max.length; i++) {
			ans = Math.max(ans, a[max[i][0]] + a[max[i][1]]);
			out.println(ans);
		}
	}

	private void merge(int i, int j) {
		if (j < 0)
			return;
//		Helper.tr(i, j, max[i][1], max[i][0], a[j]);
		if (j == max[i][1] || j == max[i][0])
			return;
		if (max[i][1] < 0 || a[max[i][1]] < a[j]) {
			max[i][0] = max[i][1];
			max[i][1] = j;
		} else if (max[i][0] < 0 || a[max[i][0]] < a[j]) {
			max[i][0] = j;
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