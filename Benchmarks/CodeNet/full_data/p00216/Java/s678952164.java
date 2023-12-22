import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();

		while (w >= 0) {
			int price = 1150;
			
			switch ((w - 1) / 10) {
				case 3:
					price += 160 * (w - 30);
					w = 30;
				case 2:
					price += 140 * (w - 20);
					w = 20;
				case 1:
					price += 125 * (w - 10);
			}
			
			System.out.println(4280 - price);

			w = sc.nextInt();
		}
	}
}

