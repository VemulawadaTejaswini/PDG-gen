import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H, W;

		while (true) {
			H = scanner.nextInt();
			W = scanner.nextInt();

			if (H == 0 && W == 0)
				break;

			for (int i = 0; i < H; i++) {
				if (i == 0 || i == H - 1) {
					for (int i2 = 0; i2 < W; i2++) {
						System.out.print("#");
					}
				} else {
					for (int i2 = 0; i2 < W; i2++) {
						if (i2 == 0 || i2 == W - 1) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
				}

				System.out.println();
			}

			System.out.println();
		}
	}
}