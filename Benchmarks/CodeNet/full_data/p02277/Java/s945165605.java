import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Card {
		String mark;
		int num;
		public Card(String mark, int num) {
			this.mark = mark;
			this.num = num;
		}
		public String toString() {
			return String.format("%s %d", mark, num);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Card[] cards1 = new Card[n];
		Card[] cards2 = new Card[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String mark = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			cards1[i] = new Card(mark, num);
			cards2[i] = new Card(mark, num);
		}
		reader.close();
		
		quickSort(cards1, 0, n - 1);
		mergeSort(cards2, 0, n);
		boolean stable = checkStability(cards1, cards2);
		if (stable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}		
		for (Card card : cards1) {
			System.out.println(card);
		}
	}

	private static boolean checkStability(Card[] cards1, Card[] cards2) {
		for (int i = 0; i < cards1.length; i++) {
			if (cards1[i].num == cards2[i].num) {
				if (!cards1[i].mark.equals(cards2[i].mark)) {
					return false;
				}
 			}
		}
		return true;
	}

	private static void mergeSort(Card[] cards, int left, int right) {
		if (left + 1 < right) {
			int mid = left + (right - left) / 2;
			mergeSort(cards, left, mid);
			mergeSort(cards, mid, right);
			merge(cards, left, mid, right);
		}
	}

	private static void merge(Card[] cards, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		Card[] L = new Card[n1 + 1];
		Card[] R = new Card[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = cards[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = cards[mid + i];
		}
		L[n1] = new Card("X", Integer.MAX_VALUE);
		R[n2] = new Card("X", Integer.MAX_VALUE);
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i].num <= R[j].num) {
				cards[k] = L[i];
				i++;
			} else {
				cards[k] = R[j];
				j++;
			}
		}
	}

	private static void quickSort(Card[] cards, int p, int r) {
		if (p < r) {
			int q = partition(cards, p, r);
			quickSort(cards, p, q - 1);
			quickSort(cards, q + 1, r);
		}
	}

	private static int partition(Card[] cards, int p, int r) {
		int x = cards[r].num;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (cards[j].num <= x) {
				i ++;
				swap(cards, i, j);
			}
		}
		swap(cards, i + 1, r);
		return i + 1;
	}

	private static void swap(Card[] cards, int i, int j) {
		Card tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
	}	
}

