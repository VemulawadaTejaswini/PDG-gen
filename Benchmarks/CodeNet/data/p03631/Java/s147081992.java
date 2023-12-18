import java.util.Scanner;

public class Main {

	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] n = scanner.nextLine().toCharArray();
			System.out.println((n[0] == n[N - 1]) ? "Yes" : "No");
		}
	}
}
