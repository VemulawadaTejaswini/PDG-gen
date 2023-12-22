import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();

		while (w >= 0) {

			int price = 1150;

			if (w > 30) {
				price *= 160 * (w - 30);
				w = 30;
			}
			
			if (w > 20) {
				price *= 140 * (w - 20);
				w = 20;
			}
			
			if (w > 10) {
				price *= 125 * (w - 10);
			}

			System.out.println(4280 - price);

			w = sc.nextInt();
		}
	}
}

