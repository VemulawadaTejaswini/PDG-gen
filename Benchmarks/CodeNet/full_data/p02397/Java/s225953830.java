import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int rows = 4;
		int columns = 2;
		int temp1;
		int temp2;
		Scanner s = new Scanner(System.in);
		int[][] sort = new int[rows][columns];
		sort[0][0] = s.nextInt();
		sort[0][1] = s.nextInt();
		s.nextLine();
		sort[1][0] = s.nextInt();
		sort[1][1] = s.nextInt();
		s.nextLine();
		sort[2][0] = s.nextInt();
		sort[2][1] = s.nextInt();
		s.nextLine();
		sort[3][0] = s.nextInt();
		sort[3][1] = s.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns - 1; j++) {
				if (sort[i][j] >= 0 && sort[i][j + 1] <= 10000) {
					if (sort[i][j] != 0 && sort[i][j + 1] != 10000) {
						if (sort[i][j] < sort[i][j + 1]) {
							System.out.println(sort[i][j] + " " + sort[i][j + 1]);
						} else {
							System.out.println(sort[i][j + 1] + " " + sort[i][j]);
						}
					}

				}

			}
		}

	}

}