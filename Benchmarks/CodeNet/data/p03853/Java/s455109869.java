import java.util.Scanner;

public class Main {
	/**
	 * Thin
	 * @param 1 ≦ H,W ≦ 100
	 * @param Cij . or *
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			String c[] = new String[H];
			for (int i = 0; i < H; i++) {
				c[i] = sc.next();
			}
			for (int i = 0; i < H; i++) {
				System.out.println(c[i]);
				System.out.println(c[i]);
			}
		}
	}
}
