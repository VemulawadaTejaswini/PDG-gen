import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		while(true) {
			String order = in.next();
			if("quit".equals(order)) break;
			if("push".equals(order)) stack.push(in.next());
			else if("pop".equals(order)) System.out.println(stack.pop());
		}
	}
}