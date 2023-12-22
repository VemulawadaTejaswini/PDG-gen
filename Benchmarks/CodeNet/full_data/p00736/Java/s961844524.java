import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int p, q, r;
	static String s;

	static int and(int x, int y) {
		return x < y ? x : y;
	}

	static int or(int x, int y) {
		return x > y ? x : y;
	}

	static int not(int x) {
		return x == 1 ? 1 : (x == 0 ? 2 : 0);
	}

	static int factor(int l) {
		if ('0' <= s.charAt(l) && s.charAt(l) <= '2') {
			return s.charAt(l) - '0';
		}
		if (s.charAt(l) == 'P') {
			return p;
		} else if (s.charAt(l) == 'Q') {
			return q;
		} else {
			return r;
		}
	}

	static int formula(int l, int r) {
		if (l == r) return factor(l);
		if (s.charAt(l) == '-') {
			return not(formula(l+1, r));
		}
		int lv = 0;
		for (int i=l; i<=r; i++) {
			if (s.charAt(i) == '(') {
				lv++;
			} else if (s.charAt(i) == ')') {
				lv--;
			}

			if (lv == 1 && s.charAt(i) == '*') {
				return and(formula(l+1, i-1), formula(i+1, r-1));
			} else if (lv == 1 && s.charAt(i) == '+') {
				return or(formula(l+1, i-1), formula(i+1, r-1));
			}
		}

		return -1;
	}

	static boolean solve() {
		s = in.next();
		if (s.equals(".")) return false;

		int ans = 0;

		for (p=0; p<=2; p++) {
			for (q=0; q<=2; q++) {
				for (r=0; r<=2; r++) {
					if (formula(0, s.length()-1) == 2) {
						ans++;
					}
				}
			}
		}

		out.println(ans);

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.currentTimeMillis();

		while (solve());
		out.flush();

		long end = System.currentTimeMillis();
		dump((end-start) + "ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}