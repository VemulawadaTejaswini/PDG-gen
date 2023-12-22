import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String target = scanner.nextLine();
		for (int i = target.length() - 1; i > 0; i--) {
			System.out.print(target.charAt(i));
		}
		System.out.println(target.charAt(0));
	}
}