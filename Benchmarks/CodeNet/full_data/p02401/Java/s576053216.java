import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a, b;
			String op1;
			a = sc.nextInt();
			op1 = sc.next();
			b = sc.nextInt();
			char op = op1.charAt(0);

			if (op == '+') {
				System.out.println(a + b);
			} else if (op == '-') {
				System.out.println(a - b);
			} else if (op == '*') {
				System.out.println(a * b);
			} else if (op == '/') {
				System.out.println(a / b);
			} else {
				break;
			}
		}
	}
}

