import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Rule rule = new Rule();
		SortedSet<Card> cards = new TreeSet<Card>();
		boolean hasNextCase = true;
		while (hasNextCase) {
			int n = in.nextInt();
			rule.setCardPoints(in);
			rule.setYaku(in);
			for (int i = 0; i < n; i++) {
				cards.clear();
				int cp = 0;
				for (int c = 0; c < 5; c++) {
					final String s = in.next();
					Card card = Card.of(s);
					cp += rule.getCardPoint(card);
					cards.add(card);
				}
				int dp = 0;
				if (cp > 0) {
					dp = rule.getYakuPoint(cards);
				}
				System.out.println(dp * cp);
			}
			hasNextCase = in.hasNext();
			if (hasNextCase) {
				System.out.println();
			}
		}

	}
}

class Card implements Comparable<Card> {
	final int suit;
	final int num;

	private Card(String str) {
		final char c = str.charAt(1);
		this.suit = (c == 'S') ? 0 : (c == 'C') ? 1 : (c == 'H') ? 2
				: (c == 'D') ? 3 : -1;
		final char c1 = str.charAt(0);
		this.num = ((c1 == 'A') ? 1 : (c1 == 'T') ? 10 : (c1 == 'J') ? 11
				: (c1 == 'Q') ? 12 : (c1 == 'K') ? 13 : Character.digit(c1, 10)) - 1;
	}

	static HashMap<String, Card> all = new HashMap<String, Card>();

	public static Card of(String str) {
		if (!all.containsKey(str)) {
			final Card newCard = new Card(str);
			all.put(str, newCard);
			return newCard;
		}
		return all.get(str);

	}

	@Override
	public int compareTo(Card o) {
		if (this == o) {
			return 0;
		}
		return (num > o.num) ? 1 : (num == o.num) ? ((suit > o.suit) ? 1
				: (suit == o.suit) ? 0 : -1) : -1;
	}

	@Override
	public String toString() {
		return String.format("%2d%2d", suit, num + 1);
	}
}

class Rule {

	final int[][] points = new int[4][13];
	final int[] yakuPoints = new int[9];

	void setCardPoints(Scanner in) {
		for (final int[] s : points) {
			for (int i = 0; i < 13; i++) {
				s[i] = in.nextInt();

			}
		}
	}

	void setYaku(Scanner in) {
		for (int i =0; i < 9; i++) {
			yakuPoints[i] = in.nextInt();
		}
	}

	int getCardPoint(Card card) {
		return points[card.suit][card.num];
	}

	int getYakuPoint(SortedSet<Card> cardset) {
		boolean flash = true;
		boolean st = true;
		boolean r = false;
		int[] count = new int[13];
		int num = cardset.first().num;
		int suit = cardset.first().suit;
		for (Card card : cardset) {
			flash = flash && (card.suit == suit);
			if (num == 1 && card.num == 9) {
				num = 9;
				r = true;
			}
			st = st && (card.num == (num++));
			r = r && st;
			count[card.num]++;
		}
		if (st) {
			if (flash) {
				if (r) {
					return yakuPoints[8];
				}
				return yakuPoints[7];
			}
			return yakuPoints[3];
		}
		if (flash) {
			return yakuPoints[4];
		}
		int pair = 0;
		int three = 0;
		int counter = 0;
		for (int n : count) {
			if (n == 2) {
				pair++;
				if (pair == 2) {
					return yakuPoints[1];
				}
			} else if (n == 3) {
				three++;
			} else if (n == 4) {
				return yakuPoints[6];
			}
			if ((counter += n) == 5) {
				if (three == 1) {
					if (pair == 1) {
						return yakuPoints[5];
					}
					return yakuPoints[2];
				}
				if (pair == 1) {
					return yakuPoints[0];
				}
				break;
			}
		}
		return 0;
	}
}