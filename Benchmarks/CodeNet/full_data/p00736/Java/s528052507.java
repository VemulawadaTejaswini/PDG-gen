
import java.util.Scanner;

public class Main {
	static int and[][] = { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 1, 2 } };// i*j
	static int or[][] = { { 0, 1, 2 }, { 1, 1, 2 }, { 2, 2, 2 } };

	static boolean isNum(char c) {
		return '0' <= c && c <= '9';
	}

	static void replace(StringBuilder sb, int p, int q, int r) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'P') {
				sb.setCharAt(i, (char) (p + '0'));
			} else if (sb.charAt(i) == 'Q') {
				sb.setCharAt(i, (char) (q + '0'));
			} else if (sb.charAt(i) == 'R') {
				sb.setCharAt(i, (char) (r + '0'));
			}
		}
	}

	static void negRemove(StringBuilder sb) {
		for (int i = 0; i + 1 < sb.length(); i++) {
			if (sb.charAt(i) == '-' && sb.charAt(i + 1) == '-') {
				sb.delete(i, i + 2);
			}
		}
	}

	static void negate(StringBuilder sb) {
		for (int i = 0; i + 1 < sb.length(); i++) {
			if (sb.charAt(i) == '-' && isNum(sb.charAt(i + 1))) {
				// -0 -> 2
				// -1 -> 1
				// -2 -> 0
				char c = sb.charAt(i + 1);
				if (c == '0') {
					sb.setCharAt(i + 1, '2');
					sb.delete(i, i + 1);
				} else if (c == '1') {
					sb.delete(i, i + 1);
				} else {
					sb.setCharAt(i + 1, '0');
					sb.delete(i, i + 1);
				}
			}
		}
	}

	static void calc(StringBuilder sb) {
		for (int i = 0; i + 2 < sb.length(); i++) {
			char l, m, r;
			l = sb.charAt(i);
			m = sb.charAt(i + 1);
			r = sb.charAt(i + 2);
			char c;// ?¨??????????, c=l+r, c=l*r
			if (isNum(l) && isNum(r)) {
				if (m == '+') {
					c = (char) (or[l - '0'][r - '0'] + '0');
					sb.setCharAt(i, c);
					sb.delete(i + 1, i + 1 + 2);
				} else if (m == '*') {
					c = (char) (and[l - '0'][r - '0'] + '0');
					sb.setCharAt(i, c);
					sb.delete(i + 1, i + 1 + 2);
				}
			}
		}
	}

	static void removeNest(StringBuilder sb) {
		for (int i = 0; i + 2 < sb.length(); i++) {
			char l, m, r;
			l = sb.charAt(i);
			m = sb.charAt(i + 1);
			r = sb.charAt(i + 2);
			char c;// ?¨??????????, c=l+r, c=l*r
			if (l == '(' && r == ')' && isNum(m)) {
				sb.delete(i, i + 1);
				sb.delete(i + 1, i + 1 + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			StringBuilder f = new StringBuilder(in.next());
			StringBuilder origin = new StringBuilder(f.toString());
			if (f.toString().equals(".")) {
				return;
			}
			int ans = 0;
			for (int p = 0; p <= 2; p++) {
				for (int q = 0; q <= 2; q++) {
					for (int r = 0; r <= 2; r++) {
						f = new StringBuilder(origin.toString());
						while (f.length() > 1) {
							replace(f, p, q, r);
							// System.out.println(f.toString());
							negRemove(f);
							// System.out.println(f.toString());
							negate(f);
							// System.out.println(f.toString());
							calc(f);
							// System.out.println(f.toString());
							removeNest(f);
							// System.out.println(f.toString());
						}
						// System.out.printf("p,q,r = %d %d %d -> %s\n", p, q,
						// r,
						// f.toString());
						if (f.charAt(0) == '2') {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}