import java.util.Scanner;

public class Main {
	public static void main(String[] aregs) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		if (H != 0 && W != 0) {

			for (int i = 0; i < H; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < W; j++) {
						if (j % 2 == 0) {
							System.out.printf("#");
						} else {
							System.out.printf(".");
						}
					}
					System.out.printf("\n");
				} else {
					for (int j = 0; j < W; j++) {
						if (j % 2 == 0) {
							System.out.printf(".");
						} else {
							System.out.printf("#");
						}
					}
					System.out.printf("\n");

				}
			}

		}

	}

}