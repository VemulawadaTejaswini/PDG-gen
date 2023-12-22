import java.util.Scanner;

public class lesson2_1 {
	public static void main(String[] args) {
		int i, j, x, y;
		Scanner sc = new Scanner(System.in);
		do {
			i = sc.nextInt();
			j = sc.nextInt();

			for (x = 1; x <= i; x++) {
				for (y = 1; y <= j; y++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		} while (i != 0 && j != 0);
	}
}