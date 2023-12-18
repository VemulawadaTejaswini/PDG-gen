import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();

		if (a.equals("H")) {
			System.out.println(b);
		} else {
			if (b.equals("H")) {
				System.out.println("D");
			}
			if (b.equals("D")) {
				System.out.println("H");
			}
		}

	}
}
