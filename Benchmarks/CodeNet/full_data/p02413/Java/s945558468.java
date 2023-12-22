import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		int j;

		int r = sc.nextInt();
		int c = sc.nextInt();

		int result[][] = new int[r + 1][c + 1];

		for(i = 0; i < r; i++) {
			for(j = 0; j < c; j++) {
				int a = sc.nextInt();
				result[i][j] = a;
				result[i][c] += a;
				result[r][j] += a;
				result[r][c] += a;
			}
		}

		for(i = 0; i < r + 1; i++) {
			for(j = 0; j < c + 1; j++) {

				if(j == c) {
					System.out.print(result[i][j]);
				} else {
					System.out.print(result[i][j] + " ");
				}

			}
			System.out.println();
		}

	}
}