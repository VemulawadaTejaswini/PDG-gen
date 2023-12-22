import java.util.Scanner;
import java.util.StringJoiner;

class Card {
	char mark;
	int num;
	
	@Override
	public String toString() {
		return "" + this.mark + this.num;
	}

	public boolean equals(Card o) {
		return this.mark == o.mark && this.num == o.num;
	}
	
}

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		String[] inputs = sc.nextLine().split(" ");
		Card[] cards = new Card[n];
		for (int i = 0; i < n; i++) {
			Card card = new Card();
			
			card.mark = inputs[i].charAt(0);
			card.num = inputs[i].charAt(1) - '0';
			
			cards[i] = card;
		}		
		sc.close();
		
		Card[] sortedB = bubbleSort(cards.clone(), n);
		show(sortedB, " ");
		System.out.println("Stable");
		
		Card[] sortedS = selectionSort(cards.clone(), n);
		show(sortedS, " ");
		
		boolean stable = true;
		for(int i = 0; i < n; i++) {
			if(!sortedB[i].equals(sortedS[i])){
				stable = false;
				break;
			}
		}
		if(stable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

	}

	private static Card[] bubbleSort(Card[] cards, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				if(cards[j].num < cards[j-1].num) {
					Card wk = cards[j];
					cards[j] = cards[j-1];
					cards[j-1] = wk;
				}
			}

		}
		return cards;
	}

	private static Card[] selectionSort(Card[] cards, int n) {

		for (int i = 0; i < n; i++) {
			int minj = i;
			for (int j = i; j < n; j++) {
				if(cards[j].num < cards[minj].num) minj = j;
			}
			
			if(minj != i) {
				Card wk = cards[i];
				cards[i] = cards[minj];
				cards[minj] = wk;
			}
		}
		return cards;
	}

	private static void show(Card[] a, String joiner) {

		StringJoiner sj = new StringJoiner(joiner);
		
		for (Card card : a) {
			sj.add(card.toString());
		}
		System.out.println(sj.toString());
	}
}