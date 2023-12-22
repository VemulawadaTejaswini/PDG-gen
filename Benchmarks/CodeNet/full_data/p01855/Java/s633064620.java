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

			if (h == w) {
				System.out.println("1:0");
			} else if (h % 2 == 0 || w % 2 == 0) {
				System.out.println("1:1");
			} else {
				int a, b;
				a = (h * w) / 2 + 1;
				b = (h * w) / 2;
				System.out.println(a + ":" + b);
			}
		}
	}
}