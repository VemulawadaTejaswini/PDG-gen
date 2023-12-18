import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		int[][] bingos = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bingos[i][j] = kb.nextInt();
			}
		}
		boolean[][] realbingo = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				realbingo[i][j] = false;
			}
		}

		int numbtocompare = kb.nextInt();
		int[] comparing = new int[numbtocompare];
		for(int i = 0; i<comparing.length; i++) {
			comparing[i] = kb.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for(int k = 0; k<comparing.length; k++)
				if (bingos[i][j] == comparing[k]) {
					realbingo[i][j] = true;
				}

			}
		}
		for (int i = 0; i < 3; i++) {
			if (realbingo[i][0] == true && realbingo[i][1] == true && realbingo[i][2] == true) {
				System.out.println("Yes");
				return;
			} else if (realbingo[0][i] == true && realbingo[1][i] == true && realbingo[2][i] == true) {
				System.out.println("Yes");
				return;
			}

		}
		if (realbingo[0][0] == true && realbingo[1][1] == true && realbingo[2][2] == true) {
			System.out.println("Yes");
			return;
		} else if (realbingo[0][2] == true && realbingo[1][1] == true && realbingo[2][0] == true) {
			System.out.println("Yes");
			return;
		} else {
			System.out.println("No");
		}
		
		
	}
}
