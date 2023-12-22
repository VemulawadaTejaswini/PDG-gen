import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0)
				break;
			for (int p = 0; p < y; p++) {
				System.out.printf("#");
			}
			System.out.printf("\n");
			for (int j = 0; j < x - 2; j++) {
				System.out.printf("#");
				for (int k = 0; k < y - 2; k++) {
					System.out.printf(".");
				}
				System.out.printf("#\n");
			}
			for (int m = 0; m < y; m++) {
				System.out.printf("#");
			}
			System.out.printf("\n");
		}
	}
}