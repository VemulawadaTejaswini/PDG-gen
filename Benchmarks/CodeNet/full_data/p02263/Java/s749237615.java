import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();

		char[] input = c.toCharArray();
		Deque<Integer> stack = new ArrayDeque<Integer>();

		for(int i = 0; i < input.length; i++) {
			if(input[i] >= '0' && input[i] <= '9') {
				stack.add(input[i] - '0');
			} else {
				switch(input[i]) {
				case '+':
					stack.add(stack.pop() + stack.pop());
					break;
				case '-':
					stack.add(stack.pop() - stack.pop());
					break;
				case '*':
					stack.add(stack.pop() * stack.pop());
					break;
				case '/':
					stack.add(stack.pop() / stack.pop());
					break;
				}
			}
		}
		System.out.println(stack.pop());
		scan.close();
	}
}
