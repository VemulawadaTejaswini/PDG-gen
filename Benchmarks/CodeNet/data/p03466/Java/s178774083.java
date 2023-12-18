import java.io.*;
import java.util.*;

public class Main {

	void preCalc() {

	}

	void stress() {

	}

	int fastVal(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		return ceilDiv(a, b + 1);
	}

	String fastF(int a, int b) {
		return fastF(a, b, fastVal(a, b));
	}

	String fastF(int a, int b, int k) {
		if (a < b) {
			return negate(fastF(b, a, k));
		}
		String ret = "";
		if (b == 0) {
			for (int i = 0; i < a; i++) {
				ret += "A";
			}
			return ret;
		}
		while (a >= b && b > 0) {
			for (int i = 0; i < k && i < a; i++) {
				ret += "A";
			}
			ret += "B";
			a -= k;
			if (a < 0) {
				a = 0;
			}
			b--;
		}
		return ret + negate(fastF(b, a, k));
	}

	String negate(String s) {
		char[] b = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			b[i] = (char) (s.charAt(s.length() - 1 - i) ^ 'A' ^ 'B');
		}
		return new String(b);
	}

	String f(int a, int b) {
		int[] p = new int[a];
		for (int i = 0; i < a; i++) {
			p[i] = i;
		}
		char[] buf = new char[a + b];

		int lookVal = fastVal(a, b);

		outer: do {
			Arrays.fill(buf, 'B');
			for (int i : p) {
				buf[i] = 'A';
			}

			// String tmp = new String(tmp);

			int cur = 1;
			for (int i = 1; i < a + b; i++) {
				if (buf[i] != buf[i - 1]) {
					cur = 1;
				} else {
					cur++;
				}
				if (cur > lookVal) {
					continue outer;
				}
			}

			return new String(buf);

		} while (nextCombination(p, a + b));

		throw new AssertionError();
	}

	static boolean nextCombination(int[] a, int n) {
		int k = a.length;
		int ptr = k - 1;
		while (ptr >= 0 && a[ptr] == ptr - k + n) {
			ptr--;
		}
		if (ptr < 0) {
			return false;
		}
		a[ptr]++;
		for (int i = ptr + 1; i < k; i++) {
			a[i] = a[ptr] + i - ptr;
		}
		return true;
	}

	void test() {

		// int C = 18;

		// System.err.println(f(3, 5));
		// System.err.println(fastF(3, 5));

		// for (int a = 1; a <= C; a++) {
		// for (int b = 1; b <= C; b++) {
		// System.err.println(a + " " + b);
		// // System.err.println(fastF(a, b));
		// if (!f(a, b).equals(fastF(a, b))) {
		// throw new AssertionError(a + " " + b);
		// }
		// }
		// }

		// for (int a = 1; a < C; a++) {
		// System.err.println(f(a, C));
		// System.err.println(f(C, a));
		// }

		// for (int i = 1; i <= C; i++) {
		// for (int j = i + 1; j <= C; j++) {
		// String one = f(i, j);
		// String two = f(j, i);
		//
		// for (int k = 0; k < one.length(); k++) {
		// if (one.charAt(k) == two.charAt(i + j - 1 - k)) {
		// throw new AssertionError();
		// }
		// }
		// }
		// }

		// for (int a = 1; a <= C; a++) {
		// for (int b = 1; b <= a; b++) {
		// System.err.println(a + " " + b);
		// System.err.println(f(a, b));
		// }
		// }

//		System.err.println(f(3, 5));
//		System.err.println(solve(3, 5, 0, 0));
		
//		int C = 10;
//		
//		for (int a = 1; a <= C; a++) {
//			for (int b = 1; b <= C; b++) {
//				String s = f(a, b);
//
//				for (int j = 0; j < s.length(); j++) {
//					for (int k = j; k < s.length(); k++) {
//						String fast = solve(a, b, j, k);
//						String slow = s.substring(j, k + 1);
//						if (!fast.equals(slow)) {
//							throw new AssertionError(a + " " + b + " " + j
//									+ " " + k);
//						}
//					}
//				}
//
//			}
//		}

	}

	// if (a < b) {
	// return negate(fastF(b, a, k));
	// }
	// String ret = "";
	// if (b == 0) {
	// for (int i = 0; i < a; i++) {
	// ret += "A";
	// }
	// return ret;
	// }
	// while (a >= b && b > 0) {
	// for (int i = 0; i < k && i < a; i++) {
	// ret += "A";
	// }
	// ret += "B";
	// a -= k;
	// if (a < 0) {
	// a = 0;
	// }
	// b--;
	// }
	// return ret + negate(fastF(b, a, k));

	String solve(int a, int b, int from, int to, char ca, char cb, int k) {

		if (a < b) {
			return negate(solve(b, a, a + b - 1 - to, a + b - 1 - from, ca, cb,
					k));
		}
		StringBuilder sb = new StringBuilder();
		if (b == 0) {
			for (int i = from; i <= to; i++) {
				sb.append(ca);
			}
			return sb.toString();
		}

		if (a >= (long) k * b) {
			for (int i = from; i <= to; i++) {
				sb.append(i % (k + 1) == k ? cb : ca);
			}
			return sb.toString();
		}

		
		int full = (a - b) / (k - 1) + 1;
		if (k * full > a) {
			full--;
		}
		int mid = full * (k + 1);

		if (full == 0) {
			for (int i = from; i <= to; i++) {
				sb.append(i == a + b - 1 ? cb : ca);
			}
			return sb.toString();
		}
		

		if (to < mid) {
			for (int i = from; i <= to; i++) {
				sb.append(i % (k + 1) == k ? cb : ca);
			}
			return sb.toString();
		}

		if (from >= mid) {

			int newFrom = from - mid;
			int newTo = to - mid;

			a -= full * k;
			b -= full;
			return reverse(solve(b, a, a + b - 1 - newTo, a + b - 1 - newFrom,
					cb, ca, k));
		}

		for (int i = from; i < mid; i++) {
			sb.append(i % (k + 1) == k ? cb : ca);
		}

		a -= full * k;
		b -= full;

		int symbs = to - mid + 1;

		sb.append(reverse(solve(b, a, a + b - symbs, a + b - 1, cb, ca, k)));
		return sb.toString();
	}

	String reverse(String a) {
		return new StringBuilder(a).reverse().toString();
	}

	int ceilDiv(int a, int b) {
		return (a + b - 1) / b;
	}

	String solve(int a, int b, int c, int d) {
		return solve(a, b, c, d, 'A', 'B', fastVal(a, b));
	}

	void submit() {
		int q = nextInt();
		while (q-- > 0) {
			int a = nextInt();
			int b = nextInt();
			int c = nextInt() - 1;
			int d = nextInt() - 1;
			out.println(new String(solve(a, b, c, d)));
		}
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		// System.err.println(f(8, 10));
		// System.err.println(f(8, 10));
		// System.err.println(fastF(8, 10));
		// System.err.println(fastF(10, 8));
		// System.err.println(solve(8, 10, 4, 7));
		 submit();
		// stress();
//		test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
