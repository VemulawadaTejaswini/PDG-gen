import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static class StringPair {
		final String a, b;

		StringPair(String a, String b) {
			this.a = a;
			this.b = b;
		}

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((a == null) ? 0 : a.hashCode());
			result = prime * result + ((b == null) ? 0 : b.hashCode());
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StringPair other = (StringPair) obj;
			if (a == null) {
				if (other.a != null)
					return false;
			} else if (!a.equals(other.a))
				return false;
			if (b == null) {
				if (other.b != null)
					return false;
			} else if (!b.equals(other.b))
				return false;
			return true;
		}
	}

	static int n;
	static String s;
	static StringBuilder sbA, sbB;
	static Map<StringPair, Integer> cnts;
	static long ans;

	static void solve() throws Exception {
		n = scanInt();
		s = scanString();
		sbA = new StringBuilder();
		sbB = new StringBuilder();
		cnts = new HashMap<>();
		go1(0);
		ans = 0;
		go2(2 * n);
		out.print(ans);
	}

	static void go1(int i) {
		if (i == n) {
			StringPair key = new StringPair(sbA.toString(), sbB.toString());
			Integer val = cnts.get(key);
			val = val == null ? 1 : val + 1;
			cnts.put(key, val);
		} else {
			char c = s.charAt(i);
			sbA.append(c);
			go1(i + 1);
			sbA.setLength(sbA.length() - 1);
			sbB.append(c);
			go1(i + 1);
			sbB.setLength(sbB.length() - 1);
		}
	}

	static void go2(int i) {
		if (i == n) {
			StringPair key = new StringPair(sbA.toString(), sbB.toString());
			Integer val = cnts.get(key);
			if (val != null) {
				ans += val;
			}
		} else {
			char c = s.charAt(--i);
			sbA.append(c);
			go2(i);
			sbA.setLength(sbA.length() - 1);
			sbB.append(c);
			go2(i);
			sbB.setLength(sbB.length() - 1);
		}
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}