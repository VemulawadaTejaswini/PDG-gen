import java.util.Scanner;
import java.util.Stack;

public class Main {
	static boolean tenbin(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '.') break;
			if(c == '(') stack.push('(');
			if(c == '[') stack.push('[');
			if(c == ')') {
				if(stack.isEmpty() || stack.pop() != ('(')) {
					return false;
				}
			}
			if(c == ']') {
				if(stack.isEmpty() || stack.pop() != ('[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				if(str.equals(".")){
					break;
				}
				if(tenbin(str)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}
	}
}

