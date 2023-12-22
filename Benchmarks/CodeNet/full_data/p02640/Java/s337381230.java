import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		boolean check = false;

		if (y % 2 != 0) {
			//false

		} else if (4 * x < y) {
			//false

		} else if (2 * x > y) {
			//false

		} else if (4 * x == y) {
			check = true;

		} else if (2 * x == y) {
			check = true;

		} else {

			int yy = y;
			for (int i = 1; i <= x && yy - 4 >= 2; i++) {
				yy -= 4;
			}
			if (yy == 2 || yy == 4) {
				check = true;

			}
		}

		System.out.println(check ? "Yes" : "No");

	}

}