import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		String op = scanner.next();
		int B = scanner.nextInt();
		int result = 0;

		if (op.equals("+")) {
			result = A + B;
		} else if (op.equals("-")) {
			result = A - B;
		}
		System.out.println(result);
	}

}