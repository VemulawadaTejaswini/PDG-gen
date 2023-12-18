import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String in = scanner.next();
		System.out.println(in.substring(0, 4) + " " + in.substring(4, in.length()));
	}
}
