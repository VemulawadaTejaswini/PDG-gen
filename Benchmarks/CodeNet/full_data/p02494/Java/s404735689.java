import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0)
				break;
			for (i = 0; i < x; i++) {
				for (i = 0; i < y; i++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}