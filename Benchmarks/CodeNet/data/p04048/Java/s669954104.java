import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();

		int result = n + f(x, n - x);
		
		System.out.println(result);
	}

	private static int f(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			return f(b, a);
		}

		return 2 * a + f(a, b - a);
	}

}
