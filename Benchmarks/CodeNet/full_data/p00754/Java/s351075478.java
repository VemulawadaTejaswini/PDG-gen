import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Character> q;
		String input = "";
		while (!(input = scanner.nextLine()).equals(".")) {
			q = new LinkedList<Character>();
			boolean procFlag = false;
			char[] ch = input.toCharArray();
			int i = 0;
			while (i < ch.length) {
				char c = ch[i];
				switch (c) {
				case '(':
				case '[':
					procFlag = true;
					q.push(c);
					break;
				case ')':
					if (q.peek() == '(') {
						q.pop();
					} else {

					}
					break;
				case ']':
					if (q.peek() == '[') {
						q.pop();
					} else {

					}
				default:
					break;
				}
				i++;
			}
			if (q.isEmpty() && procFlag || !procFlag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}