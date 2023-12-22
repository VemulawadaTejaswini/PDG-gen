import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;
	int index = 0;

	void run() {
		int N = sc.nextInt();
		while (N-- > 0) {
			index = 0;
			String input = sc.next();
			System.out.println(expression(new StringBuilder(input)));
		}
	}

	int number(StringBuilder sb) {
		int res = 0;
		while (index < sb.length() && Character.isDigit(sb.charAt(index))) {
			res *= 10;
			res += sb.charAt(index) - '0';
			index++;
		}
		return res;
	}

	int term(StringBuilder sb) {
		int res = number(sb);
		for (; index < sb.length();) {
			if (sb.charAt(index) == '*') {
				index++;
				res *= factor(sb);
			} else if (sb.charAt(index) == '/') {
				index++;
				res /= factor(sb);
			} else {
				break;
			}
		}
		return res;
	}

	int factor(StringBuilder sb) {
		int res = 0;
		if (sb.charAt(index) == '(') {
			index++;
			res = expression(sb);
			index++;
		} else {
			res = number(sb);
		}
		return res;
	}

	int expression(StringBuilder sb) {
		int res = term(sb);
		for (; index < sb.length();) {
			if (sb.charAt(index) == '+') {
				index++;
				res += term(sb);
			} else if (sb.charAt(index) == '-') {
				index++;
				res -= term(sb);
			} else {
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}