import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, op;
		String tmp;
		Stack<String> s = new Stack<>();

		while (sc.hasNext()) {
			tmp = sc.next();
			s.push(tmp);

			if (tmp == "+" || tmp == "-" || tmp == "*") {
				op = s.pop().charAt(0);
				a = Integer.parseInt(s.pop());
				b = Integer.parseInt(s.pop());
				switch (op) {
				case '+':
					s.push(String.valueOf(a + b));
					break;
				case '-':
					s.push(String.valueOf(a - b));
					break;
				case '*':
					s.push(String.valueOf(a * b));
					break;
				default:
					System.out.println("err");
					break;
				}
			}
		}
		sc.close();
	}
}

