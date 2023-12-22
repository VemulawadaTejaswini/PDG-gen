import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w;
		while ((w = in.nextInt()) >= 0) {
			System.out.println(4280 - price(w));
		}
		in.close();
	}

	private static int price(int w) {
		if (w <= 10) {
			return 1150;
		}
		if (w <= 20) {
			return 1150 + 125 * (w - 10);
		}
		if (w <= 30) {
			return 2400 + 140 * (w - 20);
		}
		return 3800 + 160 * (w - 30);
	}

}