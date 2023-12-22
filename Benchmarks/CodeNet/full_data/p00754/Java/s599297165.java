import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Stack<Character> waitStack;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			String n = sc.nextLine();

			if(n.equals(".")) {
				break;
			}

			 waitStack = new Stack<>();

			String ans = "yes";

			for(int i = 0; i < n.length(); i++) {
				Character c = n.charAt(i);
				if(c == '[') {
					waitStack.push(']');
				}else if(c == '('){
					waitStack.push(')');
				}else if(c==']' || c==')') {

					if(waitStack.isEmpty() || waitStack.pop()!=c) {
						ans = "no";
						break;
					}
				}
			}

			if(waitStack.size() != 0) {
				ans ="no";
			}
			System.out.println(ans);
		}
	}
}

