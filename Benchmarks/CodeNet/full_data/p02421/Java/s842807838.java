import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] scores = new int[2];
		String[] cards = new String[2];
		String str = null;

		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			str = sc.nextLine();
			cards = str.split(" ");
			scores = fight(scores, cards);
		}

			System.out.println(scores[0] + " " + scores[1]);


		sc.close();

	}

	private static int[] fight(int[] scores, String[] cards) {

			if (cards[0].compareTo(cards[1]) > 0) {
				scores[0] += 3;
			} else if (cards[0].compareTo(cards[1]) < 0) {
				scores[1] += 3;
			} else {
				scores[0]++;
				scores[1]++;
			}

		return scores;


	}

}

