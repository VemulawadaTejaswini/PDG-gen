import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Card []C1 = new Card[N];
		Card []C2 = new Card[N];
		for(int i = 0; i < N; i++) {
			String s = scan.next();
			int t = Integer.parseInt(s.substring(1, 2));
			C1[i] = new Card(s.substring(0, 1), t);
			C2[i] = new Card(s.substring(0, 1), t);
		}
		scan.close();
		bubbleSort(C1, N);
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
				System.out.println(C1[i].getSuit() + C1[i].getN());
			}else {
				System.out.print(C1[i].getSuit() + C1[i].getN() + " ");
			}
		}
		System.out.println("Stable");
		selectionSort(C2, N);
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
				System.out.println(C2[i].getSuit() + C2[i].getN());
			}else {
				System.out.print(C2[i].getSuit() + C2[i].getN() + " ");
			}
		}
		for(int i = 0; i < N; i++) {
			if(!C1[i].getSuit().equals(C2[i].getSuit())) {
				System.out.println("Not stable");
				System.exit(0);
			}
		}
		System.out.println("Stable");
	}
	static void bubbleSort(Card[]C, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = N - 1; j >= i + 1; j--) {
				if(C[j].getN() < C[j - 1].getN()) {
					Card v = C[j];
					C[j] = C[j - 1];
					C[j - 1] = v;
				}
			}
		}
	}
	static void selectionSort(Card[]C, int N) {
		for(int i = 0; i < N - 1; i++) {
			int min_j = i;
			for(int j = i; j < N; j++) {
				if(C[j].getN() < C[min_j].getN()) {
					min_j = j;
				}
			}
			Card v = C[i];
			C[i] = C[min_j];
			C[min_j] = v;
		}
	}
}

class Card{
	String suit;
	int n;
	public Card(String suit, int n) {
		this.suit = suit;
		this.n = n;
	}
	String getSuit() {
		return suit;
	}
	int getN() {
		return n;
	}
}
