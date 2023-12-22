import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static int evaluate(String[] strArray) {
		int answer = 0;
		String operators = "+-*";
 
		Stack<String> stack = new Stack<String>();
 
		for (int i = 0; i < strArray.length; i++) {
			String elem = strArray[i];
			if (!operators.contains(elem)) {
				stack.push(elem);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (elem) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
		
		answer = Integer.valueOf(stack.pop());
 
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String[] strList = input.split(" ");
		
		
		
		System.out.println(evaluate(strList));
		
		
	}
}
