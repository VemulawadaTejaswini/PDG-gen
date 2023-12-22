import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			int a = scan.nextInt();
			String op = scan.next();
			int c = scan.nextInt();

			if (op.equals("+")) {
				System.out.println(a + c);
			} else if (op.equals("-")) {
				System.out.println(a - c);
			} else if (op.equals("*")) {
				System.out.println(a * c);
			} else if (op.equals("/")) {
				System.out.println(a / c);
			} else if (op.equals("?")) {
				break;
			}

		}

	}

}