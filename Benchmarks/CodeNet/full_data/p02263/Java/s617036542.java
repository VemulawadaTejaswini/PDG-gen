import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String symbol;
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

		while (sc.hasNext()) {
			symbol = sc.next();
			
			if(symbol.equals("+")){
				stack.push(stack.pop() + stack.pop());
			} else if (symbol.equals("-")){
				stack.push((stack.pop() * -1) + stack.pop());
			} else if (symbol.equals("*")){
				stack.push(stack.pop() * stack.pop());
			} else {
				stack.push(Integer.parseInt(symbol));
			}
		}
		System.out.println(stack.pop());
	}
}