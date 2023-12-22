import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		String input;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner keyboard = new Scanner(System.in);
		
		input = keyboard.nextLine();
		
		Scanner expression = new Scanner(input);
		
		while(expression.hasNext()) {
			
			String nextString;
			
			if(expression.hasNextInt()) {
				nextString = expression.next();
				stack.push(Integer.parseInt(nextString));
			}
			else {
				int first = stack.pop();
				int second = stack.pop();
				String operator = expression.next();
				
				int result = calculate(first, second, operator);
				
				stack.push(result);
				
			}
			
		}
		
		System.out.println(stack.pop());
		
	}
	
	public static int calculate(int a, int b, String operator) {
		
		if(operator.equals("+")) {
			return a + b;
		}
		else if(operator.equals("-")) {
			return b - a;
		}
		else if(operator.equals("*")) {
			return a * b;
		}
		
		return 0;
	}

}
