import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	enum Color {
		R, G, B;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputCount = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < inputCount; i++) {
			ArrayList<Card> hand = inputHand(sc.nextLine(), sc.nextLine());

			if (VictoryDecision(hand)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		sc.close();
	}

	private static ArrayList<Card> inputHand(String numLine, String colorLine) {
		String[] colorStr = colorLine.split("[\\s]+");
		String[] numStr = numLine.split("[\\s]+");
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int i = 0; i < numStr.length; i++) {
			hand.add(new Card(Integer.parseInt(numStr[i]), Color.valueOf(colorStr[i])));
		}
		return hand;
	}

	static boolean VictoryDecision(ArrayList<Card> hand) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> g = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (Card c : hand) {
			switch (c.color) {
			case R:
				r.add(c.num);
				break;
			case G:
				g.add(c.num);
				break;
			case B:
				b.add(c.num);
				break;
			}
		}

		if (3 == PairSearch(r) + PairSearch(g) + PairSearch(b)) {
			return true;
		}

		return false;

	}

	static int PairSearch(ArrayList<Integer> list) {
		int pairCount = 0;
		while (list.size() >= 3) {
			Collections.sort(list);

			int num = list.get(0);
			int secondIndex = Arrays.binarySearch(list.toArray(), num + 1);
			int thirdIndex = Arrays.binarySearch(list.toArray(), num + 2);
			if (secondIndex > 0 && thirdIndex > 0) {
				pairCount++;
				list.remove(thirdIndex);
				list.remove(secondIndex);
				list.remove(0);
			} else if (num == list.get(1) && num == list.get(2)) {
				pairCount++;
				list.remove(2);
				list.remove(1);
				list.remove(0);
			} else {
				list.remove(0);
			}
		}
		return pairCount;

	}

	static class Card {
		int num;
		Color color;

		Card(int num, Color color) {
			this.num = num;
			this.color = color;
		}
	}
}

