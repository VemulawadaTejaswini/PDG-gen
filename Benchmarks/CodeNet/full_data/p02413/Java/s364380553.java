import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] table = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += table[i][j];
			}
			table[i][c] = sum;
		}
		for (int i = 0; i < c + 1; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += table[j][i];
			}
			table[r][i] = sum;
		}
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j == 0) {
					System.out.print(table[i][j]);
				}else {
					System.out.print(" " + table[i][j]);
				}
			}
			System.out.println();
		}
	}
}
