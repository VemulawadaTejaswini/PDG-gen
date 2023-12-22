

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		/*int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		int num6 = in.nextInt();*/
		int[] dice_number = new int[6];


		for(int side_number = 0; side_number < 6; side_number++) {

			dice_number[side_number] = in.nextInt();

		}

		dice dice = new dice(dice_number);

		String roll = in.next();

		for(int roll_count = 0; roll_count < roll.length(); roll_count++) {

			switch(roll.charAt(roll_count)) {

				case 'S':

					dice_number = dice.roll_s(dice_number);

					break;
				case 'N':

					dice_number = dice.roll_n(dice_number);

					break;
				case 'W':

					dice_number = dice.roll_w(dice_number);

					break;
				case 'E':

					dice_number = dice.roll_e(dice_number);

					break;
			}
	}

		System.out.println(dice_number[0]);

	}
}


class dice{

	/*int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int num5 = 0;
	int num6 = 0;*/
	int[] dice_number = new int[6];

	dice(int[] dice_number){

		this.dice_number = dice_number;

	}

	int[] roll_s(int[] dice_number){

		int[] change_number = new int[6];

		change_number[0] = dice_number[4];
		change_number[1] = dice_number[0];
		change_number[2] = dice_number[2];
		change_number[3] = dice_number[3];
		change_number[4] = dice_number[5];
		change_number[5] = dice_number[1];

		return change_number;

	}

	int[] roll_n(int[] dice_number){

		int[] change_number = new int[6];;

		change_number[0] = dice_number[1];
		change_number[1] = dice_number[5];
		change_number[2] = dice_number[2];
		change_number[3] = dice_number[3];
		change_number[4] = dice_number[0];
		change_number[5] = dice_number[4];

		return change_number;

	}

	int[] roll_w(int[] dice_number){

		int[] change_number = new int[6];;

		change_number[0] = dice_number[2];
		change_number[1] = dice_number[1];
		change_number[2] = dice_number[5];
		change_number[3] = dice_number[0];
		change_number[4] = dice_number[4];
		change_number[5] = dice_number[3];

		return change_number;

	}

	int[] roll_e(int[] dice_number){

		int[] change_number = new int[6];;

		change_number[0] = dice_number[3];
		change_number[1] = dice_number[1];
		change_number[2] = dice_number[0];
		change_number[3] = dice_number[5];
		change_number[4] = dice_number[4];
		change_number[5] = dice_number[2];

		return change_number;

	}

}