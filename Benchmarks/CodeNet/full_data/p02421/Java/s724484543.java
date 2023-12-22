import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);

		int gameCount = Integer.parseInt(sc.nextLine());

		int totalPointTaro = 0;
		int totalPointHanako = 0;

		for (int i = 0; i < gameCount; i++) {
			String[] cards = sc.nextLine().split(" ");
			if (cards[0].compareTo(cards[1]) == 0 ) {
				totalPointTaro += 1;
				totalPointHanako += 1;
			} else if (cards[0].compareTo(cards[1]) > 0) {
				totalPointTaro += 3;
			} else {
				totalPointHanako += 3;
			}

		}
		sc.close();

		System.out.printf("%d %d\n", totalPointTaro, totalPointHanako);

	}
}
