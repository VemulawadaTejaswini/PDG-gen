import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt() - 1, d = in.nextInt();
			needAns = getAns(a, b, 0, 0);
			out.println(getString(a, b, c, d));
		}
	}

	int needAns;
	
	String get(int a, int b) {
		sb.setLength(0);
		stupid(a, b, 0, 0, getAns(a, b, 0, 0));
		return sb.toString();
	}
	
	String getString(int a, int b, int c, int d) {
		c = Math.max(c, 0);
		d = Math.min(d, a + b);
		if (c >= d) {
			return "";
		}
		if (a + b <= 10) {
			return get(a, b).substring(c, d);
		}
		if (a < b) {
			return modify(getString(b, a, a + b - d, a + b - c));
		}
		if (needAns * (b + 1) <= a) {
			return easyGet(a, b, c, d);
		}

		int left = 0, right = Math.min(b, a / needAns) + 1;
		while (left < right - 1) {
			int mid = (left + right) >>> 1;

			if (getAns(a - mid * needAns, b - mid, 0, 1) > needAns) {
				right = mid;
			} else {
				left = mid;
			}
		}

		int L = 0, R = left * (needAns + 1);
		int newA = b - left;
		int newB = a - left * needAns;
		int newC = c - R;
		int newD = d - R;
		return easyGet(a, b, Math.max(L, c), Math.min(R, d)) + modify(getString(newA, newB, newA + newB - newD, newA + newB - newC));
	}

	String easyGet(int a, int b, int c, int d) {
		c = Math.max(c, 0);
		d = Math.min(d, a + b);
		if (c >= d) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		for (int i = c; i < d; i++) {
			result.append(i % (needAns + 1) == needAns ? "B" : "A");
		}
		return result.toString();

	}

	String modify(String a) {
		char[] c = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			c[i] = (char) ('A' + 'B' - a.charAt(a.length() - i - 1));
		}
		return new String(c);
	}

	StringBuilder sb = new StringBuilder();

	void stupid(int a, int b, int prevA, int prevB, int needAns) {
		if (a + b == 0) {
			return;
		}
		if (a > 0) {
			if (getAns(a - 1, b, (prevB == 0) ? prevA + 1 : 1, 0) <= needAns) {
				sb.append("A");
				stupid(a - 1, b, (prevB == 0) ? prevA + 1 : 1, 0, needAns);
				return;
			}
		}
		sb.append("B");
		stupid(a, b - 1, 0, (prevA == 0) ? prevB + 1 : 1, needAns);
	}

	private int getAns(int a, int b, int prevA, int prevB) {
		int result = Math.max(prevA, prevB);
		result = Math.max(result, (a + prevA + b) / (b + 1));
		result = Math.max(result, (b + prevB + a) / (a + 1));
		return result;
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
