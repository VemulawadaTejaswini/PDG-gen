import java.util.Scanner;

public class Main {

	static int a = 0;
	static int b = 0;
	static int c = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loopNum = scanner.nextInt();
		for (int i = 0; i < loopNum; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();

			if (isTriangle(a, b, c)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isTriangle(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a * a == b * b + c * c;
		} else {
			if (b >= c) {
				return b * b == a * a + c * c;
			} else {
				return c * c == a * a + b * b;
			}
		}
	}
}