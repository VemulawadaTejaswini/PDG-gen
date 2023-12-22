import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();
			int r = sc.nextInt();
			int counter = 1;

			if (n == 0 && r == 0) {
				break;
			}

			int[] cards = new int[n + 1];
			for (int i = 1; i <= n; i++) { // ?????????
				cards[i] = n + 1 - i;
			}

			int[] tmps = new int[n + 1];

			while (counter <= r) {
				counter++;
				int p = sc.nextInt();
				int c = sc.nextInt();

				for (int i = 1; i <= c; i++) {
					tmps[i] = cards[p + i - 1];
				}
				for (int i = 1; i <= p + c - 1; i++) {
					if (p - i <= 0) {
						cards[p + c - i] = 0;
					} else {
						cards[p + c - i] = cards[p - i];
					}
				}
				for (int i = 1; i <= c; i++) {
					cards[i] = tmps[i];
				}
			}
			System.out.println(cards[1]);
		}
	}
}