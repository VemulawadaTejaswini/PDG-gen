import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int DICE = 6;
		int dice[][] = new int[DICE][2];
		int clear = 0, root = -1;
		
		for (int i = 0; i < DICE; i++) {
			dice[i][0] = scan.nextInt();
		}
		
		for (int i = 0; i < DICE; i++) {
			dice[i][1] = scan.nextInt();
		}
		
		for (int i = 0; i < DICE; i++) {
			if ( i < 3) {
				if (root == -1) {
					if (dice[i][0] == dice[i][1]) {
						clear++;
						root = (DICE - 1) - i;
					} else if (dice[i][0] == dice[(DICE - 1) - i][1]){
						clear++;
					}
				} else {
					if (dice[i][0] == dice[(DICE - 1) - i][1]) {
						clear++;
					}
				}
				
			} else if (root > 2){
				if ( root == i) {
					if (dice[i][0] == dice[i][1]) {
						clear++;
					}
				} else {
					if (dice[i][0] == dice[(DICE - 1) - i][1]) {
						clear++;
					}
				}
			}
			
			if (clear <= i) break;
		}
		
		if (clear == 6) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scan.close();
	}
}
