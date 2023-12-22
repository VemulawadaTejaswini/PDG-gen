
import java.util.Scanner;

public class Main {
	long count = 0;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Card[] A = new Card[n];
		Card[] B = new Card[n];
		for (int i = 0; i < n; i++) {
			A[i] = B[i] = new Card(scanner.next().charAt(0), scanner.nextInt());
		}
		quicsort(A, 0, n - 1);
		meregsort(B, 0, n);
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (A[i].pic != B[i].pic) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Stable" : "Not stable");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i].pic + " " + A[i].num);
		}
	}

	private void meregsort(Card[] b, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			meregsort(b, mid, right);
			meregsort(b, left, mid);
			merge(b, left, mid, right);
		}

	}

	private void merge(Card[] b, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		Card[] L = new Card[n1 + 1];
		Card[] R = new Card[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = b[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = b[mid + i];
		}
		L[n1] = new Card(' ', Integer.MAX_VALUE);
		R[n2] = new Card(' ', Integer.MAX_VALUE);

		int l = 0;
		int r = 0;
		for (int i = left; i < right; i++) {
			if (L[l].num <= R[r].num) {
				b[i] = L[l++];
			} else {
				b[i] = R[r++];
			}
		}
	}

	private <T> void swap(T[] cards, int a, int b) {
		T tmp = cards[a];
		cards[a] = cards[b];
		cards[b] = tmp;
	}

	private void quicsort(Card[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quicsort(a, q + 1, r);
			quicsort(a, p, q - 1);
		}

	}

	private int partition(Card[] a, int p, int r) {
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j].num <= a[r].num) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, r);
		return i + 1;
	}

	class Card {
		char pic;
		int num;

		public Card(char pic, int num) {
			this.pic = pic;
			this.num = num;
		}

	}
}