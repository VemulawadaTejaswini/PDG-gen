import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int poolSize = Integer.parseInt(scanner.nextLine());
		String[] cards = scanner.nextLine().split(" ");
		List<Integer> sortedCards = new ArrayList();

		for (String card: cards) {
			sortedCards.add(Integer.parseInt(card));
		}
		sortedCards.sort(Collections.reverseOrder());


		Object c[] = sortedCards.toArray();
		int alice = 0;
		int bob = 0;

		for(int i=0; i<poolSize; i+=2) {
			alice += (int)c[i];
		}
		for(int i=1; i<poolSize; i+=2) {
			bob += (int)c[i];
		}

		System.out.println(alice - bob);
	}
}