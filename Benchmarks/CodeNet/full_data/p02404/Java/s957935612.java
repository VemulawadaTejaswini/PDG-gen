import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = 1;
		int w = 1;
		while (h != 0 || w != 0) {
			h = scanner.nextInt();
			w = scanner.nextInt();
			for (int i = 0; i < h; ++i) {
				if (i == 0 || i == h - 1) {
					for (int c = 0; c < w; ++c) {
						System.out.print("#");
					}
				} else {
					System.out.print("#");
					for (int c = 0; c < w - 2; ++c) {
						System.out.print(".");
					}
					System.out.print("#");
				}
				System.out.println("");
			}
			if (h != 0 || w != 0) {
				System.out.println("");
			}
		}

	}
}

