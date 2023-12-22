import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int x = scanner.nextInt(), y = scanner.nextInt();
				(x != 0) || (y != 0);
				x = scanner.nextInt(), y = scanner.nextInt()) {
			if (x < y) {
				System.out.println("" + x + " " + y);
			} else {
				System.out.println("" + y + " " + x);
			}
		}
		scanner.close();
	}

}