import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int room[][][] = new int[4][3][10];
		int b, f, r, v = 0;
		for (int i = 0; i < n; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();

			room[b - 1][f - 1][r - 1] +=v;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + room[i][j][k]);
				}
				System.out.println();
			}
			if (!(i == 3))
				System.out.println("####################");

		}

	}
}