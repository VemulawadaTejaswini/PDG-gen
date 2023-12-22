import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] dice = inputDice();
		char[] order = inputOrder();

		turnDice(dice, order);
		sc.close();
	}

	private static void turnDice(int[][] dice, char[] order) {
		int i = 0;
		int j = 0;


		for (int n = 0; n < order.length; n++) {

				switch(order[n]) {
					case 'N':
						i++;
					break;

					case 'E':
						j--;
					break;

					case 'S':
						i--;
					break;

					case 'W':
						j++;
					break;
				}

				if (i > dice.length - 1) {
					i = 0;
				}else if (i < 0) {
					i = dice.length - 1;
				}

				if (j > dice.length - 1) {
					j = 0;
				}else if (j < 0) {
					j = dice.length - 1;
				}
		}

		System.out.println(dice[i][j]);


	}

	private static char[] inputOrder() {
		char[] order = sc.nextLine().toCharArray();

		return order;
	}

	private static int[][] inputDice() {
		String str = sc.nextLine();
		String[] label = str.split(" ");
		int[] dl = new int[6];

			for (int i = 0; i < 6; i++) {
				dl[i] = Integer.parseInt(label[i]);
			}

			int[][] dice = new int[][] { { dl[0], dl[2], dl[5], dl[3] },
											{ dl[1], dl[2], dl[4], dl[3] },
											{ dl[5], dl[2], dl[0], dl[3] },
											{ dl[4], dl[2], dl[1], dl[3] },
										 };

		return dice;
	}

}
