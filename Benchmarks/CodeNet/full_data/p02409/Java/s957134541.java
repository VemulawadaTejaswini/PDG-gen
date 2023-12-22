import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][][] p = new int[4][3][10];

		int n = sc.nextInt();

		int house;
		int floor;
		int room;
		int num;

		for (int i = 0; i < n; i++) {
			house = sc.nextInt();
			floor = sc.nextInt();
			room = sc.nextInt();
			num = sc.nextInt();

			p[house - 1][floor - 1][room - 1] += num;
			
		}

		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 3; k++) {
				for (int l = 0; l < 10; l++) {
					System.out.print(" ");
					System.out.print(p[j][k][l]);
				}
				System.out.println();
			}
			if (j != 3) {
				for (int m = 0; m < 20; m++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}

	}
}
