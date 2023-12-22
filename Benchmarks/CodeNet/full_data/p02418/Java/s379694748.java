import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String s = input();
		String p = input();

		s += s;

		if (s.indexOf(p) != -1) {

			System.out.println("Yes");

		} else {

			System.out.println("No");

		}

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}