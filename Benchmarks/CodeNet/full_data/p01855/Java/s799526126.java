import java.util.Scanner;

/**
 * D : ???????¨??§? / Checkered Pattern
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			if ((h + w) % 2 == 0) {
				System.out.println("1:0");
			} else {
				System.out.println("1:1");
			}
		}
	}
}