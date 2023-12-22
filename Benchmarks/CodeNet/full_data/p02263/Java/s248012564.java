
import java.util.*;

public class Main {
		 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] reversePolish = s.nextLine().split(" ");
		System.out.println(evaluate(reversePolish));
	}
	 
	public static int evaluate(String[] reversePolish) {
	 
		Stack<String> stack = new Stack<String>();
	 
		for (String t : reversePolish) {
			if (!t.equals("+") && !t.equals("-") && !t.equals("*") && !t.equals("/")) {
				stack.push(t);
			} else {
				int num1 = Integer.valueOf(stack.pop());
				int num2 = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(num1 + num2));
					break;
				case "-":
					stack.push(String.valueOf(num2 - num1));
					break;
				case "*":
					stack.push(String.valueOf(num1 * num2));
					break;
				case "/":
					stack.push(String.valueOf(num2 / num1));
					break;
				}
			}
		}
		int answer = 0;
		answer = Integer.valueOf(stack.pop());
	 
		return answer;
	}
}
