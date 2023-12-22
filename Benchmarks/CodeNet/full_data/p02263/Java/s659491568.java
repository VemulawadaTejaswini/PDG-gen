
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		Scanner in = new Scanner(line);
		Stack<String> stack = new Stack<String>();
		
		while(in.hasNext()) {
			String str = in.next();
			
			if(str.equals("+")) {
				int x = Integer.parseInt(stack.pop());
				int y = Integer.parseInt(stack.pop());
				String xy = String.valueOf(y+x);
				stack.push(xy);
			}
			
			else if(str.equals("-")) {
				int x = Integer.parseInt(stack.pop());
				int y = Integer.parseInt(stack.pop());
				String xy = String.valueOf(y-x);
				stack.push(xy);
			}
			
			else if(str.equals("*")) {
				int x = Integer.parseInt(stack.pop());
				int y = Integer.parseInt(stack.pop());
				String xy = String.valueOf(y*x);
				stack.push(xy);
			}
			
			else if(str.equals("/")) {
				int x = Integer.parseInt(stack.pop());
				int y = Integer.parseInt(stack.pop());
				String xy = String.valueOf(y/x);
				stack.push(xy);
			}
			
			else {
				stack.push(str);
			}
		}
		input.close();
		in.close();
		System.out.println(stack.pop());
	}
}
