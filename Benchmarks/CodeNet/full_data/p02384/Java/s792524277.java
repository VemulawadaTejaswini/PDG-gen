import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int front;
		int upper;

		String command = "W";
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			//?????????????????????
			String line = sc.nextLine();
			Dice di = new Dice(line);
			int[] dice = di.surface;

			//????????°???????????????
			int loop = sc.nextInt();
			for (int i = 0; i < loop; i++) {

				//?????¢??¨?????¢???????????????
				upper = sc.nextInt();
				front = sc.nextInt();

				//?????????????????????????????¢???

				for (int j = 0; j < 4; j++) {

					for (int k = 0; k < 4; k++) {
						if (dice[0] != upper || dice[1] != front) {
							command = "N";
							dice = Dice.diceroll(dice, command);
							command = "W";

							for (int l = 0; l < 4; l++) {
								dice = Dice.diceroll(dice, command);
								if (dice[0] == upper && dice[1] == front) {
									break;
								}
							}

						}else{
							break;
						}
					}
					if (dice[0] != upper || dice[1] != front) {
						command = "W";
						dice = Dice.diceroll(dice, command);
					}else{
						break;
					}
				}
				int output = dice[2];
				System.out.println(output);

			}

		} finally {
			sc.close();
		}
	}

}