import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double w = scan.nextInt();
		double h = scan.nextInt();
		double x = scan.nextInt();
		double y = scan.nextInt();


		//縦長
		double tate1 = x * h;
		double tate2 = (w - x) * h;
		double tate = Math.min(tate1, tate2);

		//横長
		double yoko1 = y * w;
		double yoko2 = (h - y) * w;
		double yoko = Math.min(yoko1, yoko2);

		if (x == w && y == h) {
			System.out.println(w * h / 2 + " " + 0);

		} else if (x == 0) {
			System.out.println(yoko + " " + 0);

		} else if (y == 0) {
			System.out.println(tate + " " + 0);

		} else if (tate > yoko) {
			System.out.println(tate + " " + 0);

		} else if (yoko > tate) {
			System.out.println(yoko + " " + 0);

		} else {
			System.out.println(tate + " " + 1);

		}

	}
}