import java.util.*;

public class Main { // クラス名はMain
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();

		int h = sc.nextInt();

		int x = sc.nextInt();

		int y = sc.nextInt();

		int r = sc.nextInt();

		int mainasux = x - r;
		int plasx = x + r;

		int mainasuy = y - r;
		int plasy = y + r;

		if (mainasux < 0 || plasx > w || mainasuy < 0 || plasy > h ) {
			System.out.println("No");
		} else if (mainasux >= 0 && plasx <= w) {

			if (mainasuy >= 0 && plasy <= w) {
				System.out.println("Yes");
			}

		}

	}

}
