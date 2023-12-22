import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	String s;
	int[] map;

	void run() {
		for (;;) {
			s = sc.next();
			if (s.equals(".")) {
				break;
			}
			solve();
		}
	}

	void solve() {
		map = new int[256];
		map['0'] = 0;
		map['1'] = 1;
		map['2'] = 2;
		int ans = 0;

		/*
		map['P'] = 0;
		map['Q'] = 0;
		map['R'] = 1;

		debug(f(0).value);

		if (5 == 5) {
			return;
		}*/

		for (int p = 0; p < 3; p++) {
			for (int q = 0; q < 3; q++) {
				for (int r = 0; r < 3; r++) {
					map['P'] = p;
					map['Q'] = q;
					map['R'] = r;
					Result res = f(0);
					//debug(p, q, r, res.value);
					if (res.value == 2) {
						ans++;
					}
				}
			}
		}
		println(ans + "");
	}

	Result f(int p) {
		// debug("f",p);
		if (Character.isDigit(s.charAt(p))
				|| Character.isUpperCase(s.charAt(p))) {
			return new Result(p + 1, map[s.charAt(p)]);
		} else if (s.charAt(p) == '-') {
			Result r = f(p + 1);
			r.value = 2 - r.value;
			return r;
		} else {
			Result r = f(p + 1);
			Result r2 = f(r.p + 1); // skip '*' or '+'

			// debug("res1",r.p, r.value);
			// debug("res2",r2.p, r2.value);
			// debug(s.charAt(r.p));
			
			if (s.charAt(r.p) == '*') {
				r.value = min(r.value, r2.value);
			} else {
				// '+'
				r.value = max(r.value, r2.value);
			}
			r.p=r2.p+1;
			return r;
		}
	}

	class Result {
		int p, value;

		Result(int p, int value) {
			this.p = p;
			this.value = value;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s) {
		System.out.print(s);
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}