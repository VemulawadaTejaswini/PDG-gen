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
				for (int i2 = 0; i2 < W; i2++) {
					System.out.print("#");
				}

				System.out.println();
			}

			System.out.println();
		}
	}
}