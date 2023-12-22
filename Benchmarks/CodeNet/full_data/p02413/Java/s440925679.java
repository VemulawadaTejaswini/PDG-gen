import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] sum = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][j] = scn.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum[i][c] += sum[i][j];
				sum[r][j] += sum[i][j];
			}
			sum[r][c] += sum[i][c];
		}

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println(sum[i][c]);
		}
	}
}

