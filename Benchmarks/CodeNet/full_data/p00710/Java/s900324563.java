import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();

			int r = sc.nextInt();

			if (n == 0 && r == 0) {
				break;
			}

			int[] deck = new int[n];
			for (int i = 0; i < n; i++) {
				deck[i] = n - i;
			}

			for (int j = 0; j < r; j++) {

				int p = sc.nextInt();

				int c = sc.nextInt();

				int[] new_deck = new int[n];
				int k = 0;
				for (; k < c; k++) {
					new_deck[k] = deck[p - 1 + k];
				}
				for (; k < c + p - 1; k++) {
					new_deck[k] = deck[k - c];
				}
				for (; k < n; k++) {
					new_deck[k] = deck[k];
				}

				deck = new_deck;

			}

			System.out.println(deck[0]);

		}

		sc.close();

	}

}

