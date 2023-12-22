import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		while (!(x == 0 && y == 0)) {
			if (x > y) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			System.out.printf("%d %d\n", x, y);
			x = scan.nextInt();
			y = scan.nextInt();
		}
	}
}