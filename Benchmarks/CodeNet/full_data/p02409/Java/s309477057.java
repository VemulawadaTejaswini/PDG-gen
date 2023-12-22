import java.util.Scanner;

public class Main {

	static int[][][] oh = new int[4][3][10];

	public static void main(String[] args) {
		int[] edit = new int[4];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				edit[j] = sc.nextInt();
			}
			editRoom(edit[0], edit[1], edit[2], edit[3]);
		}

		dispHouse();

		sc.close();
	}

	private static void dispHouse() {

		for(int i = 0; i < oh.length; i++) {
			for(int j = 0; j < oh[0].length; j++) {
				for(int k = 0; k < oh[0][0].length; k++) {

					System.out.print(" " + oh[i][j][k]);

				}

					System.out.println();
			}
				if (i < oh.length) {
					System.out.println("####################");
				}

		}

	}

	public static void editRoom(int b, int f, int r, int v){
		oh[b - 1][f - 1][r - 1] += v;
	}
}
