import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int time = 0;
		int[][][] map = new int[5][5][4];

		for (int[][] a : map) {
			a = new int[5][4];
		}

		for (int[][] a : map) {
			for (int[] b : a) {
				b = new int[4];
			}
		}

		while (time < 9) {
			String inputData = sc.nextLine();

			if (time % 2 == 0) {
				for (int i = 0; i < 4; i++) {
					map[time / 2][i][0] = Integer.parseInt(String
							.valueOf(inputData.charAt(i)));
				}

				for (int i = 1; i < 5; i++) {
					map[time / 2][i][2] = Integer.parseInt(String
							.valueOf(inputData.charAt(i - 1)));
				}
			} else {
				for (int i = 0; i < 5; i++) {
					map[time / 2][i][1] = Integer.parseInt(String
							.valueOf(inputData.charAt(i)));
				}

				for (int i = 0; i < 5; i++) {
					map[time / 2 + 1][i][3] = Integer.parseInt(String
							.valueOf(inputData.charAt(i)));
				}
			}

			time++;
		}

		int dir = 0;
		int x = 1, y = 0;

		System.out.print("R");

		while (x != 0 || y != 0) {

			if (dir == 0) {
				if (map[y][x][3] == 1) {
					dir = 3;
					y--;

					System.out.print("U");

					continue;
				} else if (map[y][x][0] == 1) {
					dir = 0;
					x++;

					System.out.print("R");

					continue;
				} else if (map[y][x][1] == 1) {
					dir = 1;
					y++;

					System.out.print("D");

					continue;
				} else {
					dir = 2;
					x--;

					System.out.print("L");

					continue;
				}
			} else if (dir == 1) {
				if (map[y][x][0] == 1) {
					dir = 0;
					x++;

					System.out.print("R");

					continue;
				} else if (map[y][x][1] == 1) {
					dir = 1;
					y++;

					System.out.print("D");

					continue;
				} else if (map[y][x][2] == 1) {
					dir = 2;
					x--;

					System.out.print("L");

					continue;
				} else {
					dir = 3;
					y--;

					System.out.print("U");

					continue;
				}
			} else if (dir == 2) {
				if (map[y][x][1] == 1) {
					dir = 1;
					y++;

					System.out.print("D");

					continue;
				} else if (map[y][x][2] == 1) {
					dir = 2;
					x--;

					System.out.print("L");

					continue;
				} else if (map[y][x][3] == 1) {
					dir = 3;
					y--;

					System.out.print("U");

					continue;
				} else {
					dir = 0;
					x++;

					System.out.print("R");

					continue;
				}
			} else if (dir == 3) {
				if (map[y][x][2] == 1) {
					dir = 2;
					x--;

					System.out.print("L");

					continue;
				} else if (map[y][x][3] == 1) {
					dir = 3;
					y--;

					System.out.print("U");

					continue;
				} else if (map[y][x][0] == 1) {
					dir = 0;
					x++;

					System.out.print("R");

					continue;
				} else {
					dir = 1;
					y++;

					System.out.print("D");

					continue;
				}
			}
		}

		System.out.println("");
	}
}