

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] dice_number = new int[6];

		for(int side_number = 0; side_number < 6; side_number++) {

			dice_number[side_number] = in.nextInt();

		}

		dice dice = new dice();

		dice.setDice_number(dice_number);

		String roll_direction = in.next();

		for(int roll_count = 0; roll_count < roll_direction.length(); roll_count++) {

			dice.roll(roll_direction.charAt(roll_count));

		}

		dice_number = dice.getDice_number();
		System.out.println(dice_number[0]);

	}
}

class dice{

	int[] dice_number;

	public int[] getDice_number() {
		return dice_number;
	}

	public void setDice_number(int[] dice_number) {
		this.dice_number = dice_number;
	}

	void roll(char roll_direction){

		int tmp;

		switch(roll_direction){

		case 'S':

			tmp = dice_number[0];
			dice_number[0] = dice_number[4];
			dice_number[4] = dice_number[5];
			dice_number[5] = dice_number[1];
			dice_number[1] = tmp;

			break;

		case 'N':

			tmp = dice_number[0];
			dice_number[0] = dice_number[1];
			dice_number[1] = dice_number[5];
			dice_number[5] = dice_number[4];
			dice_number[4] = tmp;

			break;

		case 'W':

			tmp = dice_number[0];
			dice_number[0] = dice_number[2];
			dice_number[2] = dice_number[5];
			dice_number[5] = dice_number[3];
			dice_number[3] = tmp;

			break;

		case 'E':

			tmp = dice_number[0];
			dice_number[0] = dice_number[3];
			dice_number[3] = dice_number[5];
			dice_number[5] = dice_number[2];
			dice_number[2] = tmp;

			break;

		}
	}
}