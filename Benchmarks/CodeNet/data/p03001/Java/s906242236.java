import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();


		//縦長
		int tate1 = x * h;
		int tate2 = (w - x) * h;
		int tate = Math.min(tate1, tate2);

		//横長
		int yoko1 = y * w;
		int yoko2 = (h - y) * w;
		int yoko = Math.min(yoko1, yoko2);

		if (tate > yoko) {
			System.out.println(tate + " " + 0);

		} else if (yoko > tate) {
			System.out.println(yoko + " " + 0);

		} else {
			System.out.println(tate + " " + 1);

		}

	}
}