import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Character> q;
		String input = "";
		while (scanner.hasNext()) {
			input = scanner.nextLine();
			if (input.equals(".")) {
				break;
			}
			q = new Stack<Character>();
			boolean badFormat = false;
			char[] ch = input.toCharArray();
			int i = 0;
			while (i < ch.length) {
				char c = ch[i];
				switch (c) {
				case '(':
				case '[':
					q.push(c);
					break;
				case ')':
					if (!q.isEmpty()) {
						if (q.peek() == '(') {
							q.pop();
						} else {
							badFormat = true;
						}
					} else {
						badFormat = true;
					}
					break;
				case ']':
					if (!q.isEmpty()) {
						if (q.peek() == '[') {
							q.pop();
						} else {
							badFormat = true;
						}
					} else {
						badFormat = true;
					}
					break;
				default:
					break;
				}
				i++;
			}
			System.out.println((q.isEmpty() && !badFormat) ? "yes" : "no");
		}
	}
}