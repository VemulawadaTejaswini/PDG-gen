import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] A = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		int N = scan.nextInt();

		boolean bingo = false;
		int b;
		for (int i = 0; i < N; i++) {
			b = scan.nextInt();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (A[j][k] == b) {
						A[j][k] = 0;
					}
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0) bingo = true;
		}
		for (int i = 0; i < 3; i++) {
			if (A[0][i] == 0 && A[1][i] == 0 && A[2][i] == 0) bingo = true;
		}
		if (A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0) bingo = true;
		if (A[2][0] == 0 && A[1][1] == 0 && A[0][2] == 0) bingo = true;

		if (bingo) System.out.println("Yes");
		else System.out.println("No");

	}

}
