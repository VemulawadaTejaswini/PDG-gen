import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Miscalculation - Accepted
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		String exp = br.readLine();
		int ans = parseInt(br.readLine());

		int M, L;
		M = M(exp);
		L = L(exp);

		if (ans == M && ans == L) System.out.println('U');
		else if (ans == M) System.out.println('M');
		else if (ans == L) System.out.println('L');
		else System.out.println('I');
	}

	static int M(String exp) {
		char[] pri = new char[127];
		Arrays.fill(pri, (char) 3);
		pri['*'] = 2;
		pri['+'] = 1;
		pri[0] = 0;
		return eval(exp, pri);
	}

	static int L(String exp) {
		char[] pri = new char[127];
		Arrays.fill(pri, (char) 3);
		pri['*'] = 1;   //change pri
		pri['+'] = 1;
		pri[0] = 0;
		return eval(exp, pri);
	}

	static int eval(String exp, char[] pri) {

		Deque<Character> stack = new ArrayDeque<>();
		String rpn = "";

		stack.push('\0');
		for (char c : exp.toCharArray()) {
			if (pri[c] > pri[stack.peek()]) {
				stack.push(c);
			} else {
				while (pri[c] <= pri[stack.peek()]) {
					rpn += String.valueOf(stack.pop());
				}
				stack.push(c);
			}
		}
		while (stack.peek() != '\0') {
			rpn += String.valueOf(stack.pop());
		}

		//
		Deque<Integer> ans = new ArrayDeque<>();

		for (char c : rpn.toCharArray()) {
			int a, b;
			switch (c) {
				case '*':
					b = ans.pop();
					a = ans.pop();
					ans.push(a * b);
					break;
				case '+':
					b = ans.pop();
					a = ans.pop();
					ans.push(a + b);
					break;
				default:
					ans.push(c - '0');
			}
		}
		return ans.peek();
	}
}