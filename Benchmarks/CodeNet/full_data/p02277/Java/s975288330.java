import java.util.Scanner;

class Card {
	int number;
	String design;
	int value;
	
	Card(int n, String d, int v) {
		this.number = n;
		this.design = d;
		this.value = v;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Card[] A = new Card[n];
		for (int i = 0; i < n; i++) {
			A[i] = new Card(i, sc.next(), sc.nextInt());
		}
		quicksort(A, 0, n - 1);
		int i = 1, j, f = 1;
		while (i < n) {
			j = 0;
			while((f > 0) && (j < i)) {
				if (A[i].number < A[j].number) {
					f = 0;
					System.out.println("Not stable");
				}
				j++;
			}
			i++;
		}
		if (f > 0) {
			System.out.println("Stable");
		}
		for (i = 0; i < n; i++) {
			System.out.println(A[i].design + " " + A[i].value);
		}
	}
	
	public static void quicksort(Card[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quicksort(A, p, q - 1);
			quicksort(A, q + 1, r);
		}
	}
	public static int partition(Card[] A, int p, int r){
		int x = A[r].value;
		int i = p - 1;
		for (int j = p; j < r; j++){
			if (A[j].value <= x){
				i++;
				Card m = A[i];
				A[i] = A[j];
				A[j] = m;
			}
		}
		Card m = A[i + 1];
		A[i + 1] = A[r];
		A[r] = m;
		return i + 1;
	}

}

