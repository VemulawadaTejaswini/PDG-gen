import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] cardCount = new int[100001];

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			cardCount[ai]++;
		}

		int extra = 0;
		for (int i = 0; i < cardCount.length; i++) {
			if (cardCount[i] > 1) {
				extra += cardCount[i] - 1;
			}
		}

		if (extra % 2 == 0) {
			System.out.println(N - extra);
		} else {
			System.out.println(N - ((extra / 2) + 1) * 2);
		}

		sc.close();
	}

}
