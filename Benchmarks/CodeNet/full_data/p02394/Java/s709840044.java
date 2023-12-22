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
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		
		if (((0 + r) <= x) && (x <= (W - 1))
				&& ((0 + r) <= y) && (y <= (H - 1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}