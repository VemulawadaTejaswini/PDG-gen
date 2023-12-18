import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;
	private long ans = Long.MAX_VALUE;

	void solve() throws IOException {
		int[] a = nia(ni());
//		Helper.tr(a);
		long sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		solve(a, 0, 4, sum, new long[4]);
		out.println(ans);
	}

	private void solve(int[] a, int i, int parts, long sum, long[] preSums) {
//		Helper.tr(i, parts, sum, preSums);
		if (parts == 1) {
			preSums[3] = sum;
//			Helper.tr("->", preSums);
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			for (int j = 0; j < 4; j++) {
				min = Math.min(preSums[j], min);
				max = Math.max(preSums[j], max);
			}
			ans = Math.min(ans, max - min);
//			Helper.tr("->>", ans);
			return;
		}
		long s = 0;
		int j = i;
		while (j <= a.length - parts && (s + a[j]) * parts < sum) {
			s += a[j];
			j++;
		}
		preSums[4 - parts] = s;
		if (j > i)
			solve(a, j, parts - 1, sum - s, preSums);
		if (j < a.length - 1) {
			s += a[j];
			preSums[4 - parts] = s;
			solve(a, j + 1, parts - 1, sum - s, preSums);
			if (j + 1 < a.length - 1) {
				s += a[j + 1];
				preSums[4 - parts] = s;
				solve(a, j + 2, parts - 1, sum - s, preSums);
			}
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