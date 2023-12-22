import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String args[]) {
		new Main().solve();
	}
	void solve() {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int x = -1,y = -1;
		String[] strArray = scan.nextLine().split(" ");
		for (int i = 0; i < strArray.length; i++) {
			String str = strArray[i];
			switch(str.charAt(0)) {
			case '+':
				if (y == -1) {
					y = stack.pop();
				}
				if (x == -1) {
					x = stack.pop();
				}
				stack.add(x + y);
				x = -1;
				y = -1;
				break;
			case '-':
				if (y == -1) {
					y = stack.pop();
				}
				if (x == -1) {
					x = stack.pop();
				}
				stack.add(x - y);
				x = -1;
				y = -1;
				break;
			case '*':
				if (y == -1) {
					y = stack.pop();
				}
				if (x == -1) {
					x = stack.pop();
				}
				stack.add(x * y);
				x = -1;
				y = -1;
				break;
			default:
				if (x == -1) {
					x = Integer.parseInt(str);
					break;
				}
				y = Integer.parseInt(str);
				break;
			}
		}
		System.out.println(stack.pop());
	}
}

