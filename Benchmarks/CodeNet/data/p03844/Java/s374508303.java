import java.util.Scanner;

public class Main {
	/**
	 * Addition and Subtraction Easy
	 * @param 1 ≦ A, B ≦ 10^9
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if (op.equals("+")) {
				System.out.println(a + b);
			} else {
				System.out.println(a - b);
			}
		}
	}
}