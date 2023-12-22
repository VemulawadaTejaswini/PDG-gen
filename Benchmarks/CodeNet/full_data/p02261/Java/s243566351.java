import java.util.*;

class Card {

	private char suit;
	private int number;

	public Card(String card) {
		this.suit = card.charAt(0);
		this.number = Integer.parseInt(String.valueOf(card.charAt(1)));
	}
	
	public char getSuit() {
		return this.suit;
	}
	public int getNumber() {
		return this.number;
	}
	public Card getCopy(){
		return new Card(String.valueOf(this.suit) + String.valueOf(this.number));
	}
	
	String getString(){
		return String.valueOf(this.suit) + String.valueOf(this.number);
	}
	
}

class stateOfCards {

	private final int NUMBER = 9;
	public final Card[] cards;
	private final ArrayList<ArrayList<Card>> STATE;

	public stateOfCards(Card[] cards){

		this.cards = cards;
		STATE = new ArrayList<ArrayList<Card>>();
		
		for (int i = 0; i < NUMBER; i++) {
			STATE.add(new ArrayList<Card>());
		}
		
		for (int i = 0; i < cards.length; i++) {
			STATE.get(cards[i].getNumber() - 1).add(cards[i]);
		}
	}
	
	public boolean judgeStability(stateOfCards s){

		for (int i = 0; i < NUMBER; i++) {
			if(this.STATE.get(i).size() != s.STATE.get(i).size()){
				return false;
			}
			
			for (int j = 0; j < this.STATE.get(i).size(); j++) {
				if (this.STATE.get(i).get(j).getSuit() != s.STATE.get(i).get(j).getSuit()) {
					return false;
				}
			}
		}
		return true;
	}

	Card[] getCardsCopy(){

		Card[] cards = new Card[this.cards.length];
		
		for (int i = 0; i < this.cards.length; i++) {
			cards[i] = this.cards[i].getCopy();
		}
		
		return cards;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Card[] cards = new Card[N];
		
		for (int i = 0; i < N; i++) {
			cards[i] = new Card(sc.next());
		}

		stateOfCards firstState = new stateOfCards(cards);
		
		Card[] afterBubbleSort = bubbleSort(firstState);
		printCards(afterBubbleSort);
		printStable(firstState.judgeStability(new stateOfCards(afterBubbleSort)));

		Card[] afterSelectionSort = selectionSort(firstState);
		printCards(afterSelectionSort);
		printStable(firstState.judgeStability(new stateOfCards(afterSelectionSort)));
	}

	private static Card[] bubbleSort(stateOfCards stateOfCards) {

		Card temp;
		Card[] cards = stateOfCards.getCardsCopy();

		for (int i = 0; i < cards.length; i++){
			for(int j = cards.length - 1; j > i; j-- ){
				if (cards[j].getNumber() < cards[j - 1].getNumber()){
					temp = cards[j];
					cards[j] = cards[j - 1];
					cards[j - 1] = temp;
				}
			}
		}
		return cards;
	}

	private static Card[] selectionSort(stateOfCards stateOfCards){
		
		Card[] cards = stateOfCards.getCardsCopy();
		
		for (int i = 0; i < cards.length; i++) {
			boolean swapFlag = false;
			int minIndex = i;
			for (int j = i + 1,min = cards[minIndex].getNumber(); j < cards.length; j++) {
				if ( cards[j].getNumber() < min ){
					min = cards[j].getNumber();
					minIndex = j;
					swapFlag = true;
				}
			}
			if (swapFlag) {
				Card temp = cards[i];
				cards[i] = cards[minIndex];
				cards[minIndex] = temp;
			}
		}
		return cards;
	}

	private static void printCards(Card[] cards){

		for (int i = 0; i < cards.length - 1; i++) {
			System.out.print(cards[i].getString() + " ");
		}
		System.out.println(cards[cards.length - 1].getString());
		
	}

	private static void printStable(boolean result){

		if(result){
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}
}