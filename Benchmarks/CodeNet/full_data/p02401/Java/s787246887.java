import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = null;
		boolean con = true;
		while (con) {

			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if (op.equals("+")) {
				System.out.println(a + b);

			} else if (op.equals("-")) {
				System.out.println(a - b);

			} else if (op.equals("*")) {
				System.out.println(a * b);

			} else if (op.equals("/")) {
				System.out.println(a / b);

			} else if (op.equals("?")) {
				sc.close();
				con = false;
			}
		}
	}
}