import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = Integer.parseInt(sc.nextLine());
		int[] cards = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(cards);

		int a_let = 0;
		int b_let = 0;

		for (int i = 0; i < items; i++) {
			if (i % 2 == 0) {
				a_let += cards[i];
			} else {
				b_let += cards[i];
			}
		}

		System.out.println(Math.abs(a_let - b_let));
	}

}
