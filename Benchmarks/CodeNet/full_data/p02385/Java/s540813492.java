import java.util.Scanner;

public class Dice1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int DICE = 6;
		int dice[] = new int[DICE];
		int dice2[] = new int[DICE];
		String direction;
		
		for (int i = 0; i < DICE; i++) {
			dice[i] = scan.nextInt();
		}
		
		dice2 = dice;
		direction = scan.next();
		
		for (int i = 0; i < direction.length(); i++) {
			switch(direction.charAt(i)) {
			case 'N':
				dice2[0] = dice[1];
				dice2[1] = dice[5];
				dice2[4] = dice[0];
				dice2[5] = dice[4];
				break;
			case 'E':
				dice2[0] = dice[3];
				dice2[2] = dice[0];
				dice2[3] = dice[5];
				dice2[5] = dice[2];
				break;
			case 'S':
				dice2[0] = dice[4];
				dice2[1] = dice[0];
				dice2[4] = dice[5];
				dice2[5] = dice[1];
				break;
			case 'W':
				dice2[0] = dice[2];
				dice2[2] = dice[5];
				dice2[3] = dice[0];
				dice2[5] = dice[3];
				break;
			default:
				break;
			}
			
			dice2 = dice;
		
		}
		
		scan.close();
		System.out.println(dice[0]);
	}
}

