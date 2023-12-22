import java.util.Scanner;

public class Main {
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		int length = scanner.nextInt();
		
		Card[] array = new Card[length];
		
		for (int i=0; i<length; i++) {
			char[] temp = scanner.next("[SHCD][0-9]").toCharArray();
			array[i] = new Card(temp[0], Character.getNumericValue(temp[1]));
		}
		scanner.close();
		
		Card[] orgArray = array.clone();
		Card[] array2 = array.clone();
		
		bubbleSort(array, length);
		printArray(array);
		System.out.println(compareArray(orgArray, array));
		
		selectionSort(array2, length);
		printArray(array2);
		System.out.print(compareArray(orgArray, array2));

		
	}
	
	public static void selectionSort(Card[] array, int length) {
		// Variable i stands for the smallest value at this moment.
		// j to traverse the remain items, identify the position of the smallest value in the remain queue.
		for (int i=0; i<length; i++) {
			int mini = i;
			for (int j=i+1; j<length; j++) {
				if (array[j].getValue() < array[mini].getValue()) {
					mini = j;
				}
			}
			// Swap mini and i if mini!=i
			if (mini != i) {
				Card tmpCard = array[mini];
				array[mini] = array[i];
				array[i] = tmpCard;
				count++;
			}
		}
	}
	
	public static void bubbleSort(Card[] array, int length) {
		// Variable i stands for the smallest value at this moment.
		// j to traverse the remain items, smallest bubbled to the position i.
		for (int i=0; i<length; i++) {
			for (int j=length-1; j>i; j--) {
				if (array[j].getValue() < array[j-1].getValue()) {
					// Switch the value of array[j] and array[j-1]
					Card tmpCard = array[j];
					array[j] = array[j-1];
					array[j-1] = tmpCard;
					count++;
				}
			}
		}
	}
	
	public static void printArray(Card[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i>0) System.out.print(" ");
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
	
	public static String compareArray(Card[] org, Card[] sorted) {
		int length = org.length;
		for (int i=0; i<length; i++) {
			for (int j=i+1; j<length; j++) {
				for (int a=0; a<length; a++) {
					for (int b=a+1; b<length; b++) {
						if (org[i].getValue()==org[j].getValue() 
								&& sorted[a].getValue()==sorted[b].getValue() 
								&& org[i].getValue()==sorted[b].getValue() 
								&& org[i].getSuit()==sorted[b].getSuit() 
								&& org[j].getSuit()==sorted[a].getSuit())
							return "Not stable";
					}
				}
			}
		}
		return "Stable";
	}
	
}

class Card {
	private char suit;
	private int value;
	
	public Card(char suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public char getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setSuit(char suit) {
		this.suit = suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + this.suit + this.value;
	}
}
