import java.util.*;

public class Main {
	private static String[] cards;

	private static String winner(int player) {
		if(cards[player].length() == 0) {
			switch(player) {
				case 0:
					return "A";
				case 1:
					return "B";
				default:
					return "C";
			}
		} else {
			int nextPlayer;
			switch(cards[player].charAt(0)) {
				case 'a':
					nextPlayer = 0;
					break;
				case 'b':
					nextPlayer = 1;
					break;
				default:
					nextPlayer = 2;
					break;
			}
			cards[player] = cards[player].substring(1, cards[player].length());
			return winner(nextPlayer);
		}
	}

	public static void main(String[] args) {
		cards = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
			cards[i] = sc.next();
		System.out.println(winner(0));
	}
}