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
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}