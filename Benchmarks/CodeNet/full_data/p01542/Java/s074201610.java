// Lost Number
import java.util.*;

public class Main {
	static String formula;
	static int pos;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		formula = sc.next();
		int result = replaceAndSearch();
		System.out.println(result);
		sc.close();
	}

	static int replaceAndSearch() {
		String[] replaces = { "0", "1", "+", "-", "*", "(", ")" };
		StringBuilder sb = new StringBuilder(formula);
		int result = -1;
		if (formula.contains(".")) {
			int p = formula.indexOf(".");
			for (int i = 0; i < replaces.length; i++) {
				formula = sb.replace(p, p + 1, replaces[i]).toString();
				result = Math.max(result, replaceAndSearch());
				formula = sb.replace(p, p + 1, ".").toString();
			}
		} else {
			pos = 0;
			if (isExp()) {
				pos = 0;
				result = exp();
			} else
				pos = 0;
		}
		return result;
	}

	static boolean isExp() {
		if (!isTerm())
			return false;
		while (pos < formula.length()) {
			char op = formula.charAt(pos++);
			if (op != '+' && op != '-' && op != '*')
				return false;
			if (!isTerm())
				return false;
		}
		return true;
	}

	static boolean isTerm() {
		if (pos >= formula.length())
			return false;
		char c = formula.charAt(pos);
		if (c == '(') {
			pos++;
			return isParExp();
		}
		if (Character.isDigit(c)) {
			number();
			return true;
		}
		return false;
	}

	static boolean isParExp() {
		if (!isTerm())
			return false;
		if (pos >= formula.length())
			return false;
		char op = formula.charAt(pos++);
		if (op != '+' && op != '-' && op != '*')
			return false;
		if (!isTerm())
			return false;
		while (pos < formula.length() && formula.charAt(pos) != ')') {
			op = formula.charAt(pos++);
			if (op != '+' && op != '-' && op != '*')
				return false;
			if (!isTerm())
				return false;
		}
		if (pos >= formula.length() || formula.charAt(pos++) != ')')
			return false;
		return true;
	}

	static int number() {
		int result = 0;
		while (pos < formula.length() && Character.isDigit(formula.charAt(pos))) {
			result *= 2;
			result += formula.charAt(pos++) - '0';
		}
		return result;
	}

	static int exp() {
		int result = term();
		while (pos < formula.length() && formula.charAt(pos) != ')') {
			char op = formula.charAt(pos++);
			if (op == '+')
				result += term();
			else
				result -= term();
		}
		pos++;
		return result;
	}

	static int term() {
		int result = mul();
		while (pos < formula.length() && formula.charAt(pos) == '*') {
			pos++;
			result *= mul();
		}
		return result;
	}

	static int mul() {
		if (formula.charAt(pos) == '(') {
			pos++;
			return exp();
		}
		return number();
	}
}