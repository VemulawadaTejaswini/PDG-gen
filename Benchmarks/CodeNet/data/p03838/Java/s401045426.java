import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x <= y) {
			if (x >= 0 == y >= 0) {
				System.out.println(y - x);
			} else {
				System.out.println(y + x + 1);
			}
		} else {
			if (x > 0 == y > 0) {
				System.out.println(Math.abs(y - x) + 2);
			} else {
				System.out.println(x + y + 1);
			}
		}
	}
}
