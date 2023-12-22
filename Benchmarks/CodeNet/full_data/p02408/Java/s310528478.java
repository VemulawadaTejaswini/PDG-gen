import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int N = Integer.parseInt(line1);

		String[] inputData = new String[N];
		for (int i = 0; i < N; i++) {
			String line2 = sc.nextLine();
			inputData[i] = line2;
		}

		boolean[] cards = new boolean[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = false;
		}

		int x = 0;
		for (int i = 0; i < inputData.length; i++) {
			String str = inputData[i].substring(0, 1);
			if (str.equals("S")) {
				x = 0;

			} else if (str.equals("H")) {
				x = 13;

			} else if (str.equals("C")) {
				x = 13 * 2;

			} else if (str.equals("D")) {
				x = 13 * 3;

			}
			x += Integer.parseInt(inputData[i].substring(2)) - 1;
			cards[x] = true;
		}
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == false) {
				if (i / 13 == 0) {
					System.out.print("S ");

				} else if (i / 13 == 1) {
					System.out.print("H ");
				} else if (i / 13 == 2) {
					System.out.print("C ");
				} else if (i / 13 == 3) {
					System.out.print("D ");
				}
				System.out.println(String.valueOf(i % 13 + 1));
			}
		}
	}
}