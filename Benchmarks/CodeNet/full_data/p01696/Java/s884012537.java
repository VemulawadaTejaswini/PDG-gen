import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		for (;;) {
			String input = sc.next();
			String out = "";
			if (input.equals(".")) {
				return;
			}
			int move = 0;
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (Character.isLetter(c)) {
					if (move != 0) {
						c += move;
						if (c > 90) {
							c %= 90;
							c %= 26;
							c = (char) (64 + c);
						} else if (c < 65) {
							c = (char) ((65 - c) % 26);
							c = (char) (91 - c);
						}
						move = 0;
					}
					out += c;
				} else if (c == '+' || c == '-') {
					while (input.charAt(i) == '+') {
						move++;
						i++;
					}
					while (input.charAt(i) == '-') {
						move--;
						i++;
					}
					i--;
				} else if (c == '?') {
					out += 'A';
					move = 0;
				} else {
					out += c;
				}
			}
			StringBuilder sb = new StringBuilder(out);
			Stack<Integer> ss = new Stack<Integer>();
			for (int i = 0; i < out.length(); i++) {
				if (out.charAt(i) == '[') {
					ss.add(i);
				}
				if (out.charAt(i) == ']') {
					int s = ss.pop();
					String tmp = "";
					tmp = sb.substring(s, i + 1);
					StringBuilder t = new StringBuilder(tmp);
					t.reverse();
					t.setCharAt(0, '[');
					t.setCharAt(t.length() - 1, ']');
					sb.replace(s, i + 1, t + "");
				}
			}
			String ans = "";
			for (int i = 0; i < sb.length(); i++) {
				if (Character.isLetter(sb.charAt(i))) {
					ans += sb.charAt(i);
				}
			}
			System.out.println(ans);
		}
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

		long nextLong() {
			return Long.parseLong(next());
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