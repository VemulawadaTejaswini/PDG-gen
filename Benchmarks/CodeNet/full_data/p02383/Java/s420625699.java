import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int loop = 0;
		String[] command;
		int[] dice = new int[6];

		Scanner sc = null;
		Dice di = new Dice();

		try {
			sc = new Scanner(System.in);

			//??????????????????
			for (int i = 0; i < 6; i++) {
				dice[i] = sc.nextInt();
			}
			//?????????????????????
			String line = sc.next();
			command = line.split("");
			loop = command.length;

			dice = di.diceroll(dice, command);

			//???????????????
			/*int n = 0;
			for (int i = 0; i < loop; i++) {
				switch (command[i]) {
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
			}*/
			System.out.println(dice[0]);
		} finally {
			sc.close();
		}
	}

}

class Dice{
	public int[] diceroll(int[] di , String[] com){
		int loop;
		int n = 0;
		int[] dice = di;

		loop = com.length;
		//???????????????
		for (int i = 0; i < loop; i++) {
			switch (com[i]) {
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
		}
		return dice;

	}
}