import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String o = scanner.next();
		String e = scanner.next();

		for (int i = 0; i < o.length(); i++) {
			System.out.print(o.charAt(i));
			try {
				System.out.print(e.charAt(i));
			} catch (Exception ex) {
				return;
			}
		}
	}
}