import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long MOD = 1000000007;
	static char[] exp;

	public static void main(String[] args) {
		exp = sc.next().toCharArray();
		int v = sc.nextInt();
		int r1 = calc1();
		int r2 = calc2();
		if (v == r1) {
			System.out.println(v == r2 ? 'U' : 'M');
		} else {
			System.out.println(v == r2 ? 'L' : 'I');
		}
	}

	static int calc1() {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		stack.add(exp[0] - '0');
		for (int i = 1; i < exp.length; i += 2) {
			if (exp[i] == '+') {
				stack.add(exp[i + 1] - '0');
			} else {
				stack.set(stack.size() - 1, stack.get(stack.size() - 1) * (exp[i + 1] - '0'));
			}
		}
		int ret = 0;
		for (int v : stack) {
			ret += v;
		}
		return ret;
	}

	static int calc2() {
		int v = exp[0] - '0';
		for (int i = 1; i < exp.length; i += 2) {
			if (exp[i] == '+') {
				v += exp[i + 1] - '0';
			} else {
				v *= exp[i + 1] - '0';
			}
		}
		return v;
	}

}