import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int index = 0;

	void run() {
		String input = sc.next();
		int ans = sc.nextInt();
		boolean M = false;
		boolean L = false;

		int s = Integer.valueOf(input.charAt(0) - '0');
		int sum = s;
		// L
		for (int i = 1; i < input.length() - 1; i++) {
			char c = input.charAt(i);
			char n = input.charAt(i + 1);
			if (!Character.isDigit(c)) {
				if (c == '*') {
					sum *= Integer.valueOf(n - '0');
				} else {
					sum += Integer.valueOf(n - '0');
				}
				i++;
			}
		}
		if (sum == ans) {
			L = true;
		}
		// M
		if (expression(input) == ans) {
			M = true;
		}
		if (L && M) {
			System.out.println("U");
		} else if (L) {
			System.out.println("L");
		} else if (M) {
			System.out.println("M");
		} else {
			System.out.println("I");
		}
	}

	int expression(String sb) {
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

	int term(String sb) {
		int res = factor(sb);
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

	int factor(String sb) {
		int res = 0;
		if (index < sb.length() && sb.charAt(index) == '(') {
			index++;
			res = expression(sb);
			index++;
		} else {
			res = number(sb);
		}
		return res;
	}

	int number(String sb) {
		int res = 0;
		while (index < sb.length() && Character.isDigit(sb.charAt(index))) {
			res *= 10;
			res += sb.charAt(index) - '0';
			index++;
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debu(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}