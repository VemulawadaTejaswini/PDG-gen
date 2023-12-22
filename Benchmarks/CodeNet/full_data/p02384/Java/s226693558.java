import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int DICE = 6;
		int dice[] = new int[DICE];
		int question, front, upsurface, rightside = 0;
		
		
		for (int i = 0; i < DICE; i++) {
			dice[i] = scan.nextInt();
		}
		
		question = scan.nextInt();
		
		for (int i = 0; i < question; i++) {
			upsurface = scan.nextInt();
			front = scan.nextInt();
			for ( int j = 0; j < DICE; j++) {
				if ( dice[j] == front) {
					switch (j) {
					case 0:
						if (dice[1] == upsurface) {
							rightside = dice[3];
						} else if (dice[2] == upsurface) {
							rightside = dice[1];
						} else if (dice[3] == upsurface) {
							rightside = dice[4];
						} else {
							rightside = dice[2];
						}
						break;
					case 1:
						if (dice[0] == upsurface) {
							rightside = dice[2];
						} else if (dice[2] == upsurface) {
							rightside = dice[5];
						} else if (dice[3] == upsurface) {
							rightside = dice[0];
						} else {
							rightside = dice[3];
						}
						break;
					case 2:
						if (dice[0] == upsurface) {
							rightside = dice[4];
						} else if (dice[1] == upsurface) {
							rightside = dice[0];
						} else if (dice[4] == upsurface) {
							rightside = dice[5];
						} else {
							rightside = dice[1];
						}
						break;
					case 3:
						if (dice[0] == upsurface) {
							rightside = dice[1];
						} else if (dice[1] == upsurface) {
							rightside = dice[5];
						} else if (dice[4] == upsurface) {
							rightside = dice[0];
						} else {
							rightside = dice[4];
						}
						break;
					case 4:
						if (dice[0] == upsurface) {
							rightside = dice[3];
						} else if (dice[2] == upsurface) {
							rightside = dice[0];
						} else if (dice[3] == upsurface) {
							rightside = dice[5];
						} else {
							rightside = dice[2];
						}
						break;
					case 5:
						if (dice[1] == upsurface) {
							rightside = dice[2];
						} else if (dice[2] == upsurface) {
							rightside = dice[4];
						} else if (dice[3] == upsurface) {
							rightside = dice[1];
						} else {
							rightside = dice[3];
						}
						break;
					default:
						break;
						
					}
				}
			}
			System.out.println(rightside);
		}
		
		scan.close();
	}
}
