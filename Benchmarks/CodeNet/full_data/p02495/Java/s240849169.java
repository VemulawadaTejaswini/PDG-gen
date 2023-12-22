import java.util.Scanner;

public class Main_10014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				if (i % 2 == 1) {
					for (int j = 0; i < W; j++) {
						if (j % 2 == 0) {
							System.out.printf("#");
						} else {
							System.out.printf(".");
						}
					}
					System.out.printf("\n");
				} else {
					for (int j = 0; i < W; j++) {
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
		System.out.printf("\n");
	}
}