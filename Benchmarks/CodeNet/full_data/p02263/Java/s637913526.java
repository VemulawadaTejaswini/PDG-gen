import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		String[] input = scin.nextLine().split(" ");
		
		Stack<Integer> polishStack = new Stack<>();
		
		for (int i = 0; i < input.length; i++) {
			//System.out.println("char is " + input[i]);
			try {
				int num = Integer.parseInt(input[i]);
				polishStack.push(num);
			}catch (Exception e) {
				//now we know it is an operation
				int num1 = polishStack.pop();
				int num2 = polishStack.pop();
				
				if (input[i].equals("*")) {
					polishStack.push(num1 * num2);
				}else if (input[i].equals("+")) {
					polishStack.push(num1 + num2);
				}else {
					//subtraction
					polishStack.push(num2 - num1);
				}
			}
			//System.out.println("Stack is " + polishStack);
		}
		
		System.out.println(polishStack.pop());
		
	}
}
