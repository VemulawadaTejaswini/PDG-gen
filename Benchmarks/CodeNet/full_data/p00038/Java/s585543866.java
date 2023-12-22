import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input;
	int[] hand = new int[15];
	int n, fourCard, threePair, twoPair;
	boolean straight;
	while (scan.hasNext()) {
	    input = scan.nextLine().split(",");
	    for (int i = 0; i < 15; i++) {
		hand[i] = 0;
	    }
	    fourCard = 0;
	    threePair = 0;
	    twoPair = 0;
	    straight = false;
	    for (int i = 0; i < 5; i++) {
		n = Integer.parseInt(input[i]);
		hand[n]++;
		if (n == 1) {
		    hand[14]++;
		}
	    }
	    for (int i = 0; i < 14; i++) {
		if (hand[i] == 4) {
		    fourCard++;
		} else if (hand[i] == 3) {
		    threePair++;
		} else if (hand[i] == 2) {
		    twoPair++;
		}
	    }
	    if (fourCard == 1) {
		System.out.println("four card");
	    } else if (threePair == 1 && twoPair == 1) {
		System.out.println("full house");
	    } else if (threePair == 1 && twoPair == 0) {
		System.out.println("three card");
	    } else if (twoPair == 2) {
		System.out.println("two pair");
	    } else if (twoPair == 1) {
		System.out.println("one pair");
	    } else {
		if (isStraight(hand)) {
		    System.out.println("straight");
		} else {
		    System.out.println("null");
		}
	    }
	}
    }
    static boolean isStraight (int[] hand) {
	int num = 15;
	int first = 1;
	for (int i = 10; i < 25; i++) {
	    int card1 = hand[i % num];
	    int card2 = hand[(i + 1) % num];
	    int card3 = hand[(i + 2) % num];
	    int card4 = hand[(i + 3) % num];
	    int card5 = hand[(i + 4) % num];
	    if (card1 == 1 && card1 == card2 && card2 == card3 && card3 == card4 && card4 == card5) {
		return true;
	    }
	}
	return false;
    }
}