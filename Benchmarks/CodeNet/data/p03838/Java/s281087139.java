import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int diff = Math.abs(y) - Math.abs(x);
		if (diff >= 0) {
			if (y >= 0) {

			}
		}

		if (x == y) {
			System.out.println(0);
		} else {
			if (x >= 0) {
				if (y > 0) {
					if (x <= y) {
						System.out.println(y - x);
					} else {
						System.out.println(x - y + 2);
					}
				} else {
					System.out.println(y + x + 1);
				}
			} else {
				if (y >= 0) {
					System.out.println(y + x + 1);
				} else {
					if (x <= y) {
						System.out.println(y - x);
					} else {
						System.out.println(x - y + 2);
					}
				}
			}
		}
	}
}
