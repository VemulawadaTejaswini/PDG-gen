import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		int val;
		int val2;
		int result;
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		String expression = in.nextLine();
		String[] arr = expression.split(" ");

		for(String str : arr) {
			
			
			switch(str) {
			case "+" :
				val = stack.pop();
				val2 = stack.pop();
				stack.push(val + val2);
				break;
			case "-":
				val = stack.pop();
				val2 = stack.pop();
				stack.push(val2 - val);
				break;
			case "*":
				val = stack.pop();
				val2 = stack.pop();
				stack.push(val * val2);	
				break;
			case "/":
				val = stack.pop();
				val2 = stack.pop();
				stack.push(val2 / val);
				break;
			default:
				stack.push(Integer.parseInt(str));
				break;
			
			}
			
			
		}
		
		result = stack.pop();
		System.out.println(result);
			
	}
		
}
