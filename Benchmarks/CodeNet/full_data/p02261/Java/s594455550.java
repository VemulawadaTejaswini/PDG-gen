import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Card[] a = new Card[n];
		Card[] b = new Card[n];
		for (int i = 0; i < n; i++) {
			String card = sc.next();
			char suit = card.charAt(0);
			int value = Character.getNumericValue(card.charAt(1));
			a[i] = new Card(suit, value);
			b[i] = new Card(suit, value);

		}

		Main main = new Main();
		main.bubbleSort(a, n);
		main.selectionSort(b, n);
		main.printCard(a, n);
		System.out.println("Stable");
		main.printCard(b, n);
		String ans = main.isStable(a, b, n) ? "Stable" : "Not Stable";
		System.out.println(ans);

	}

	private boolean isStable(Card[] a, Card[] b, int n) {
		for (int i = 0; i < n; i++) {
			if (a[i].suit != b[i].suit) {
				return false;
			}
		}
		return true;
	}

	private void bubbleSort(Card[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i + 1; j--) {
				if (a[j].value < a[j - 1].value) {
					Card tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}

	}

	private void selectionSort(Card[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int minj = i;
			for (int j = i; j < n; j++) {
				if (a[j].value < a[minj].value) {
					minj = a[j].value;
				}
			}
			if (minj != i) {
				Card tmp = a[i];
				a[i] = a[minj];
				a[minj] = tmp;
			}
		}

	}

	private void printCard(Card[] a, int n) {
		for (int i = 0; i < n; i++) {
			String card = "" + a[i].suit + a[i].value;
			if (i != n - 1) {
				System.out.print(card + " ");
			} else {
				System.out.println(card);
			}
		}
	}

}

class Card {
	char suit;
	int value;

	public Card(char suit, int value) {
		this.suit = suit;
		this.value = value;
	}

}
