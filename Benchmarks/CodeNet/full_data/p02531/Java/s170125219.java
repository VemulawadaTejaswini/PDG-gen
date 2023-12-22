import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Stack<String> s = new Stack<String>();
		ArrayList<String> answer = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String order = scanner.next();
			if (order.equals("push")) {
				String color = scanner.next();
				s.push(color);
			} else if (order.equals("pop")) {
				String color = s.pop();
				answer.add(color);
			} else {
				break;
			}
		}
		for (String c : answer) {
			System.out.println(c);
		}
	}
}