import java.util.Scanner;

public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			final String s = scanner.next();
			if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
