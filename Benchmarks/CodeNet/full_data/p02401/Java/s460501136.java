import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a,b;
		String op = "+";
		while (!op.equals("?")) {
		a = scan.nextInt();
		op = scan.next();
		b = scan.nextInt();

		if (0 <= a && a <= 20000 && 0 <= b && b <= 20000) {

				if (op.equals("/") && b == 0) {
					break;
				}
				switch (op) {
				case "+":
					System.out.println(a + b);
					break;

				case "-":
					System.out.println(a - b);
					break;
				case "*":
					System.out.println(a * b);
					break;

				case "/":
					System.out.println(a / b);
					break;
				}
			}
		}

	}

}