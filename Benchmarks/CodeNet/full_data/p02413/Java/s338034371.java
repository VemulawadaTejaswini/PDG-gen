import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int rc[][] = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c + 1; j++) {
				if (j != c) {
					rc[i][j] = sc.nextInt();
					rc[i][c] += rc[i][j];
				}
				rc[r][j] += rc[i][j];
			}
		}
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(rc[i][j] + " ");
			}
			System.out.println();
		}
	}
}
