import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException {

		Scanner sc = new Scanner(System.in);
		boolean[][] card = new boolean[4][13];

		int n = sc.nextInt();

		for (int k = 0; k < n; k++) { // ????????????????????????????????£??\
			
			String mark = sc.next();
			char c = mark.charAt(0);
			int num = sc.nextInt();
			

			if (c == 'S') {
				card[0][num - 1] = true;
			} else if (c == 'H') {
				card[1][num - 1] = true;
			} else if (c == 'C') {
				card[2][num - 1] = true;
			} else if (c == 'D') {
				card[3][num - 1] = true;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (card[i][j] == false) {
					if (i == 0) {
						System.out.println("S" + " " + (j + 1));
					} else if (i == 1) {
						System.out.println("H" + " " + (j + 1));
					} else if (i == 2) {
						System.out.println("C" + " " + (j + 1));
					} else if (i == 3) {
						System.out.println("D" + " " + (j + 1));
					}
				}
			}
		}
		sc.close();
	}
}