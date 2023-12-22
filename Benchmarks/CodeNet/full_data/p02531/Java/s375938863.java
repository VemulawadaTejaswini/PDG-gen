import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>();

		while (true) {
			String order = sc.next();
			if (order.equals("quit"))
				break;
			else if (order.equals("pop"))
				s.pop();
			else
				s.push(sc.next());
		}

		while (!s.isEmpty())
			System.out.println(s.pop());

	}

}