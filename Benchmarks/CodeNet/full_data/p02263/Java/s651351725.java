import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("+")) {
				stack.push(stack.pop() + stack.pop());

			} else if (str[i].equals("-")) {
				stack.push(stack.pop() - stack.pop());

			} else if (str[i].equals("*")) {
				stack.push(stack.pop() * stack.pop());

			} else {
				stack.push(Integer.parseInt(str[i]));
			}
		}
		System.out.println(stack.pop());
	}
}