import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int DICE = 6;
		int dice[] = new int[DICE];
		int dice2[] = new int[DICE];
		int dice22[] = new int[DICE];
		boolean perfect = false;
		
		for (int i = 0; i < DICE; i++) {
			dice[i] = scan.nextInt();
		}
		
		for (int i = 0; i < DICE; i++) {
			dice2[i] = scan.nextInt();
		}
		dice22 = dice2;
		
		for (int i = 0; i < DICE; i++) {
			dice2 = dice22;
			if (dice[1] == dice2[i]) {
				switch (i) {
				case 0:
					dice2 = Move("S", dice2);
					break;
				case 2:
					dice2 = Move("EN", dice2);
					break;
				case 3:
					dice2 = Move("ES", dice2);
					break;
				case 4:
					dice2 = Move("NN", dice2);
					break;
				case 5:
					dice2 = Move("N", dice2);
					break;
				default:
					break;
				}
			}
			
			perfect = Judge(dice, dice2);
			
			if (perfect == true) break;
		}
		scan.close();
		
		if (perfect == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static int [] Move ( String direction, int str[]) {
		String dir = direction;
		int pro_dice[] = new int[6];
		
		for (int i = 0; i < dir.length(); i++) {
			switch(dir.charAt(i)) {
			case 'N':
				pro_dice[0] = str[1];
				pro_dice[1] = str[5];
				pro_dice[2] = str[2];
				pro_dice[3] = str[3];
				pro_dice[4] = str[0];
				pro_dice[5] = str[4];
				break;
			case 'E':
				pro_dice[0] = str[3];
				pro_dice[1] = str[1];
				pro_dice[2] = str[0];
				pro_dice[3] = str[5];
				pro_dice[4] = str[4];
				pro_dice[5] = str[2];
				break;
			case 'S':
				pro_dice[0] = str[4];
				pro_dice[1] = str[0];
				pro_dice[2] = str[2];
				pro_dice[3] = str[3];
				pro_dice[4] = str[5];
				pro_dice[5] = str[1];
				break;
			case 'W':
				pro_dice[0] = str[2];
				pro_dice[1] = str[1];
				pro_dice[2] = str[5];
				pro_dice[3] = str[0];
				pro_dice[4] = str[4];
				pro_dice[5] = str[3];
				break;
			default:
				break;
			}
			
			for ( int j = 0; j < 6; j++) {
				str[j] = pro_dice[j];
			}
		
		}
		
		return str;
	}
	
	public static boolean Judge (int str1[], int str2[]) {
		boolean judge = true;
		
		for (int i = 0; i < 3; i++) {
			judge = true;
			for (int j = 0; j < 6; j++) {
				if (str1[j] != str2[j]) {
					judge = false;
				}
			}
			if (judge == true) break;
			str2 = Move("E",str2);
		}
		
		return judge;
	}
}

