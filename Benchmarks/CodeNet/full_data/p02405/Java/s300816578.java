import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int H = scn.nextInt();
			int W = scn.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < W; j = j + 2) {
						System.out.print("#.");
					}
					System.out.println();
				} else {
					for (int j = 0; j < W; j = j + 2) {
						System.out.print(".#");
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}

