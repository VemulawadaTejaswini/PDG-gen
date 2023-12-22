import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	

	private class Card {
		String mark;
		int num;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Card[] cards1 = new Card[n];
		Card[] cards2 = new Card[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			cards1[i] = new Card();
			cards1[i].mark = st.nextToken();
			cards1[i].num = Integer.parseInt(st.nextToken());
			cards2[i] = cards1[i];
		}
		reader.close();

		quickSort(cards1, 0, n - 1);
		mergeSort(cards2, 0, n);
		
		if (isStable(cards1, cards2)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(cards1[i].mark + " " + cards1[i].num);
		}
	}

	private boolean isStable(Card[] cards1, Card[] cards2) {
		for (int i = 0; i < cards1.length; i++) {
			if (cards1[i].mark != cards2[i].mark || cards1[i].num != cards2[i].num) {
				return false;
			}
		}
		return true;
	}

	private void mergeSort(Card[] cards, int left, int right) {
		if (left + 1 < right) {
			int mid = left + (right - left) / 2;
			mergeSort(cards, left, mid);
			mergeSort(cards, mid, right);
			merge(cards, left, mid, right);
		}
	}

	private void merge(Card[] cards, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		Card[] L = new Card[n1+1];
		Card[] R = new Card[n2+1];
		for(int i = 0; i < n1; i ++) L[i] = cards[left+i];
		for(int i = 0; i < n2; i ++) R[i] = cards[mid+i];
		Card sentinel = new Card();
		sentinel.num = 1 << 30;
		L[n1] = sentinel;
		R[n2] = sentinel;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i].num <= R[j].num) {
				cards[k] = L[i++];
			} else {
				cards[k] = R[j++];
			}
		}
	}

	private void quickSort(Card[] cards, int p, int r) {
		if (p < r) {
			int q = partition(cards, p, r);
			quickSort(cards, p, q - 1);
			quickSort(cards, q + 1, r);
		}
	}

	private int partition(Card[] cards, int p, int r) {
		int x = cards[r].num;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (cards[j].num <= x) {
				i++;
				swap(cards, i, j);
			}
		}
		swap(cards, i + 1, r);
		return i + 1;
	}
	
	private void swap(Card[] cards, int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
}

