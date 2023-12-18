import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] t = String.valueOf(n).split("");

		for (int i = 0; i < t.length; i++) {
			if (!t[i].equals(t[t.length - 1 - i])) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}
}
