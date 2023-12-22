import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_6_C
public class Main {
	Card SENTINEL = new Card("F", 1234567890);
	int sum = 0;
	void merge(Card[]A, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		Card[] L = new Card[n1 + 1];
		Card[] R = new Card[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + 1 + i];
		}
		L[n1] = SENTINEL;
		R[n2] = SENTINEL;
		int i = 0;
		int j = 0;
		for (int k = left; k <= right; k++) {
			sum += 1;
			if (L[i].value <= R[j].value) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;
			}
	    }
	}

	void mergeSort(Card[] A, int left, int right) {
	    	if (left < right) {
	    		int mid = (left + right)/2;
	    		mergeSort(A, left, mid);
	    		mergeSort(A, mid + 1, right);
	    		merge(A, left, mid, right);
	  	}
	}
	
	int partition(Card[] A, int p, int r) {
		int x = A[r].value;
		int i = p-1;
		for (int j = p; j < r; j++) {
			if (A[j].value <= x) {
				i = i + 1;
				Card tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		Card tmp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tmp;
		return i + 1;
	}
	
	void quickSort(Card[] A, int p, int r) {
		 if (p < r) {
			 int q = partition(A, p, r);
			 quickSort(A, p, q-1);
			 quickSort(A, q+1, r);
		 }
	 }
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Card[] A = new Card[n];
		Card[] B = new Card[n];
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			A[i] = new Card(str[0], Integer.parseInt(str[1]));
			B[i] = new Card(str[0], Integer.parseInt(str[1]));
		}
		quickSort(A, 0, n-1);
		mergeSort(B, 0, n-1);
		boolean stable = true;
		for (int i = 0; i < n; i++) {
			if (A[i].suit.equals(B[i].suit)) {
				stable = false;
				break;
			}
		}
		if (stable) System.out.println("Stable");
		else System.out.println("Not stable");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i].suit + " " + A[i].value);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Card {
	String suit;
	int value;
	Card(String s, int v) {
		this.suit = s;
		this.value = v;
	}
}
