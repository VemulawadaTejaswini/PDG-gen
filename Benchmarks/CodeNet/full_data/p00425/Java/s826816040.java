import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			// ???????????????????????¶???
			int dice[]  = {1,2,3,5,4,6};
			// ??????????????°
			int input = Integer.parseInt(br.readLine());
			// ??¢???????????????
			int output = dice[0];

			if (input == 0) {
				break;
			}

			// ??????????????°???????????????
			for (int i = 0; i < input; ++i) {
				String instruction = br.readLine();

				// ??\????????????????????????????????????
				switch (instruction) {
				case "North":
					dice = trunNorth(dice);
					break;
				case "East":
					dice = turnEast(dice);
					break;
				case "West":
					dice = turnWest(dice);
					break;
				case "South":
					dice = turnSouth(dice);
					break;
				case "Right":
					dice = turnRight(dice);
					break;
				case "Left":
					dice = turnLeft(dice);
					break;

				}
				// ?????´?????°????????????
				output = output + dice[0];
			}

			System.out.println(output);

		}
	}


	private static int[] trunNorth(int[] dice){
		int x = 0;
		x = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[3];
		dice[3] = x;
		return dice;
	}

	private static int[] turnEast(int[] dice){
		int x = 0;
		x = dice[0];
		dice[0] = dice[4];
		dice[4] = dice[5];
		dice[5] = dice[2];
		dice[2] = x;

		return dice;
	}

	private static int[] turnWest(int[] dice){
		int x = 0;
		x = dice[0];
		dice[0] = dice[2];
		dice[2] = dice[5];
		dice[5] = dice[4];
		dice[4] = x;
		return dice;
	}

	private static int[] turnSouth(int[] dice){
		int x = 0;
		x = dice[0];
		dice[0] = dice[3];
		dice[3] = dice[5];
		dice[5] = dice[1];
		dice[1] = x;
		return dice;
	}

	private static int[] turnLeft(int[] dice){
		int x = 0;
		x = dice[1];
		dice[1] = dice[4];
		dice[4] = dice[3];
		dice[3] = dice[2];
		dice[2] = x;
		return dice;
	}

	private static int[] turnRight(int[] dice){
		int x = dice[1];
		dice[1] = dice[2];
		dice[2] = dice[3];
		dice[3] = dice[4];
		dice[4] = x;
		return dice;
	}


}