import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
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
			}

		}

	}
}

