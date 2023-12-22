
import java.util.*;

class Card {
	Card(String mark, int number, int order) {
		this.mark = mark;
		this.number = number;
		this.order = order;
	}
	@Override
	public String toString() {
		return mark + number;
	}
	public String mark;
	public int number;
	public int order;
}

public class Main {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Card[] cards = new Card[n];
		for (int i = 0; i < n; i++) {
			cards[i] = new Card(scanner.next(), scanner.nextInt(), i);
		}
		quickSort(cards, 0, n - 1);
		System.out.println(isStable(cards, n) ? "Stable" : "Not stable");
		for (int i = 0; i < n; i++) {
			System.out.println(cards[i]);
		}
	}
	public static boolean isStable(Card[] c, int n) {
		for (int i = 1; i < n; i++) {
			if (c[i - 1].number == c[i].number && c[i - 1].order > c[i].order) {
				return false;
			}
		}
		return true;
	} 
	public static void quickSort(Card[] c, int p, int r) {
		if (p < r) {
			int q = partation(c, p, r);
			quickSort(c, p, q - 1);
			quickSort(c, q + 1, r);
		}
	}
	public static int partation(Card[] c, int p, int r) {
		int x = c[r].number;
		int i = p - 1;
		Card t;
		for (int j = p; j < r; j++) {
			if (c[j].number <= x) {
				i++;
				t = c[i];
				c[i] = c[j];
				c[j] = t;
			}
		}
		t = c[r];
		c[r] = c[i + 1];
		c[i + 1] = t;
		return i + 1;
	}	
}