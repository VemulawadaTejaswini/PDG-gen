import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			switch (op) {
			case "+":
				System.out.println((a + b));
				break;
			case "-":
				System.out.println((a - b));
				break;
			case "*":
				System.out.println((a * b));
				break;
			case "/":
				System.out.println((a / b));
				break;
			case "?":
				flag = false;
				break;
			default:
				flag = false;
				break;
			}
		}

	}
}
