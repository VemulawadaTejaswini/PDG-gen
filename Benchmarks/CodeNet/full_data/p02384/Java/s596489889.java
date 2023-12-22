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

//?????????????????????
class Dice{

	int[] surface;

	public Dice(String s){

		String[] work;

		work = s.split(" ");

		surface = new int[work.length];

		for (int i = 0; i < work.length; i++) {
			surface[i] = Integer.parseInt(work[i]);
		}
	}

	//?????????????????????
	public int[] dicemake(String s) {
		int[] dice;
		String[] work;

		work = s.split(" ");
		dice = new int[work.length];

		for (int i = 0; i < work.length; i++) {
			dice[i] = Integer.parseInt(work[i]);
		}

		return dice;

	}

	//????????????????????????????????????
	public static int[] diceroll(int[] di , String com){
		int n = 0;
		int[] dice = di;

		//???????????????
			switch (com) {
			case "N":
				n = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = n;
				break;

			case "S":
				n = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = n;
				break;

			case "W":
				n = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = n;
				break;

			case "E":
				n = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = n;
				break;

			default:
				System.out.println("other");
				break;
			}
		return dice;

	}
}