import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String op = sc.nextLine();
		String[] items = op.split(" ");

		Stack<Integer> stack = new Stack<>();
		for (int i=0; i<items.length; i++) {
			char c = items[i].charAt(0);
			if (c>='0'&&c<='9') {
				stack.push(Integer.parseInt(items[i]));
			} else {
				int b = stack.pop();
				int a = stack.pop();
				if (c=='+') {
					stack.push(a+b);
				} else if (c=='-') {
					stack.push(a-b);
				} else {
					stack.push(a*b);
				}
			}
		}

		System.out.println(stack.pop());

		sc.close();
	}

}