import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve0500();
	}

	public static void solve0500() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (0 == n) {
				break;
			}

			int scoreA = 0;
			int scoreB = 0;

			for (int i = 0; i < n; i++) {
				int cardA = sc.nextInt();
				int cardB = sc.nextInt();
				if (cardA == cardB) {
					scoreA += cardA;
					scoreB += cardB;
				} else if (cardA > cardB) {
					scoreA += cardA + cardB;
				} else {
					scoreB += cardA + cardB;
				}
			}
			System.out.println(scoreA + " " + scoreB);
		}

		sc.close();
	}

}

