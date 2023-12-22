import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		do {

			String str = sc.nextLine() ;
			if(str.equals("-")) {
				break;
			}

			char[] cards = str.toCharArray();

			int m = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < m; i++) {
				int h = Integer.parseInt(sc.nextLine());
				cards = shuffle(cards, h);
			}

			for (int j = 0; j < cards.length; j++) {
				System.out.print(cards[j]);
			}
			System.out.println();

		}while(true);

		sc.close();

	}

	private static char[] shuffle(char[] cards, int h) {
		char[] cards_tmp1 = new char[h];
		char[] cards_tmp2 = new char[cards.length - h];
		char[] cards_ex = new char[cards.length];

		for (int i = 0; i < cards_tmp1.length; i++) {
			cards_tmp1[i] = cards[i];
		}

		for (int i = 0; i < cards_tmp2.length; i++) {
			cards_tmp2[i] = cards[h + i];
		}

		for (int i = 0; i < cards_tmp2.length; i++) {
			cards_ex[i] = cards_tmp2[i];
		}

		for (int i = 0; i < cards_tmp1.length; i++) {
			cards_ex[cards.length - h + i] = cards_tmp1[i];
		}

	    return cards_ex;

	}
}

