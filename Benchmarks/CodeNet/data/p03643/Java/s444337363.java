import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = String.valueOf(n);

		if (n < 100) {
			s = "0" + s;
		}
		System.out.println("ABC" + s);

	}
}
