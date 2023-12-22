import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		char[] marks = {'S', 'H', 'C', 'D'};

		for(char mark : marks) {
			for (int i = 1; i <= 13; i++) {
				Card.allCards.add(new Card(mark, i));
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			for (Card card : Card.allCards) {
				if (card.mark != arr[0].charAt(0)) {
					continue;
				}
				if (card.rank == Integer.parseInt(arr[1])) {
					card.have = true;
				}
			}
		}

		for (Card card : Card.allCards) {
			if (!card.have) {
				System.out.println(card.mark + " " + card.rank);
			}
		}
	}
}

class Card {
	char mark;
	int rank;
	boolean have = false;
	static List<Card> allCards = new ArrayList<Card>();

	Card(char mark, int rank) {
		this.mark = mark;
		this.rank = rank;
	}
}