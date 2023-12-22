

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ??\?±??????°???????´??????????????????¨???
		int[][][] house = new int[4][3][10];
		/*int build = 0;
		int floor = 0;
		int room = 0;
		int count = 0;*/

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		for(int i = 0; i < num; i++){

			int build = in.nextInt();
			int floor = in.nextInt();
			int room = in.nextInt();
			int count = in.nextInt();

			house[build - 1][floor - 1][room - 1] += count;

		}

			/*for(int j = 0; j < 4; j++) {

				if(build != j + 1) {

					continue;

				}

				for(int k = 0; k < 3; k++) {

					if(floor != k + 1) {

						continue;

					}

					for(int l = 0; l < 10; l++) {

						if(room == l + 1) {

							house[j][k][l] += count;

							break;

						}
					}

					break;

				}

				break;

			}
		}*/

		int i = 0;
		int j = 0;
		int k = 0;

		// ?£??????¨?????????
		for(i = 0; i < 4; i++) {

			// ????????¢?????¨?????????
			for(j = 0; j < 3; j++) {

				// ??¨?±??????¨?????????
				for(k = 0; k < 9; k++) {

					System.out.print(" " + house[i][j][k]);

				}

				System.out.println(" " + house[i][j][k]);

			}

			if(i < 3) {

				for(int l = 0; l < 20; l++) {

					System.out.print("#");

				}

				System.out.println("");

			}
		}
	}
}

//================??´?????´????????????======================

			/*// ?£???\??§??????
			if(build == 1) {

				// ????????¢??\??§??????
				if(floor == 1 ) {

					// ??¨?±???\??§??????
					if(room == 1) {

						house[0][0][0] += count;

					}else if(room == 2) {

						house[0][0][1] += count;

					}else if(room == 3) {

						house[0][0][2] += count;

					}else if(room == 4) {

						house[0][0][3] += count;

					}else if(room == 5) {

						house[0][0][4] += count;

					}else if(room == 6) {

						house[0][0][5] += count;

					}else if(room == 7) {

						house[0][0][6] += count;

					}else if(room == 8) {

						house[0][0][7] += count;

					}else if(room == 9) {

						house[0][0][8] += count;

					}else if(room == 10) {

						house[0][0][9] += count;

					}
				}else if(floor == 2 ) {

					if(room == 1) {

						house[0][1][0] += count;

					}else if(room == 2) {

						house[0][1][1] += count;

					}else if(room == 3) {

						house[0][1][2] += count;

					}else if(room == 4) {

						house[0][1][3] += count;

					}else if(room == 5) {

						house[0][1][4] += count;

					}else if(room == 6) {

						house[0][1][5] += count;

					}else if(room == 7) {

						house[0][1][6] += count;

					}else if(room == 8) {

						house[0][1][7] += count;

					}else if(room == 9) {

						house[0][1][8] += count;

					}else if(room == 10) {

						house[0][1][9] += count;

					}
				}else if(floor == 3 ) {

					if(room == 1) {

						house[0][2][0] += count;

					}else if(room == 2) {

						house[0][2][1] += count;

					}else if(room == 3) {

						house[0][2][2] += count;

					}else if(room == 4) {

						house[0][2][3] += count;

					}else if(room == 5) {

						house[0][2][4] += count;

					}else if(room == 6) {

						house[0][2][5] += count;

					}else if(room == 7) {

						house[0][2][6] += count;

					}else if(room == 8) {

						house[0][2][7] += count;

					}else if(room == 9) {

						house[0][2][8] += count;

					}else if(room == 10) {

						house[0][2][9] += count;

					}
				}
			}else if(build == 2) {

				if(floor == 1 ) {

					if(room == 1) {

						house[1][0][0] += count;

					}else if(room == 2) {

						house[1][0][1] += count;

					}else if(room == 3) {

						house[1][0][2] += count;

					}else if(room == 4) {

						house[1][0][3] += count;

					}else if(room == 5) {

						house[1][0][4] += count;

					}else if(room == 6) {

						house[1][0][5] += count;

					}else if(room == 7) {

						house[1][0][6] += count;

					}else if(room == 8) {

						house[1][0][7] += count;

					}else if(room == 9) {

						house[1][0][8] += count;

					}else if(room == 10) {

						house[1][0][9] += count;

					}
				}else if(floor == 2 ) {

					if(room == 1) {

						house[1][1][0] += count;

					}else if(room == 2) {

						house[1][1][1] += count;

					}else if(room == 3) {

						house[1][1][2] += count;

					}else if(room == 4) {

						house[1][1][3] += count;

					}else if(room == 5) {

						house[1][1][4] += count;

					}else if(room == 6) {

						house[1][1][5] += count;

					}else if(room == 7) {

						house[1][1][6] += count;

					}else if(room == 8) {

						house[1][1][7] += count;

					}else if(room == 9) {

						house[1][1][8] += count;

					}else if(room == 10) {

						house[1][1][9] += count;

					}
				}else if(floor == 3 ) {

					if(room == 1) {

						house[1][2][0] += count;

					}else if(room == 2) {

						house[1][2][1] += count;

					}else if(room == 3) {

						house[1][2][2] += count;

					}else if(room == 4) {

						house[1][2][3] += count;

					}else if(room == 5) {

						house[1][2][4] += count;

					}else if(room == 6) {

						house[1][2][5] += count;

					}else if(room == 7) {

						house[1][2][6] += count;

					}else if(room == 8) {

						house[1][2][7] += count;

					}else if(room == 9) {

						house[1][2][8] += count;

					}else if(room == 10) {

						house[1][2][9] += count;

					}
				}
			}else if(build == 3) {

				if(floor == 1 ) {

					if(room == 1) {

						house[2][0][0] += count;

					}else if(room == 2) {

						house[2][0][1] += count;

					}else if(room == 3) {

						house[2][0][2] += count;

					}else if(room == 4) {

						house[2][0][3] += count;

					}else if(room == 5) {

						house[2][0][4] += count;

					}else if(room == 6) {

						house[2][0][5] += count;

					}else if(room == 7) {

						house[2][0][6] += count;

					}else if(room == 8) {

						house[2][0][7] += count;

					}else if(room == 9) {

						house[2][0][8] += count;

					}else if(room == 10) {

						house[2][0][9] += count;

					}
				}else if(floor == 2 ) {

					if(room == 1) {

						house[2][1][0] += count;

					}else if(room == 2) {

						house[2][1][1] += count;

					}else if(room == 3) {

						house[2][1][2] += count;

					}else if(room == 4) {

						house[2][1][3] += count;

					}else if(room == 5) {

						house[2][1][4] += count;

					}else if(room == 6) {

						house[2][1][5] += count;

					}else if(room == 7) {

						house[2][1][6] += count;

					}else if(room == 8) {

						house[2][1][7] += count;

					}else if(room == 9) {

						house[2][1][8] += count;

					}else if(room == 10) {

						house[2][1][9] += count;

					}
				}else if(floor == 3 ) {

					if(room == 1) {

						house[2][2][0] += count;

					}else if(room == 2) {

						house[2][2][1] += count;

					}else if(room == 3) {

						house[2][2][2] += count;

					}else if(room == 4) {

						house[2][2][3] += count;

					}else if(room == 5) {

						house[2][2][4] += count;

					}else if(room == 6) {

						house[2][2][5] += count;

					}else if(room == 7) {

						house[2][2][6] += count;

					}else if(room == 8) {

						house[2][2][7] += count;

					}else if(room == 9) {

						house[2][2][8] += count;

					}else if(room == 10) {

						house[2][2][9] += count;

					}
				}
			}else if(build == 4) {

				if(floor == 1 ) {

					if(room == 1) {

						house[3][0][0] += count;

					}else if(room == 2) {

						house[3][0][1] += count;

					}else if(room == 3) {

						house[3][0][2] += count;

					}else if(room == 4) {

						house[3][0][3] += count;

					}else if(room == 5) {

						house[3][0][4] += count;

					}else if(room == 6) {

						house[3][0][5] += count;

					}else if(room == 7) {

						house[3][0][6] += count;

					}else if(room == 8) {

						house[3][0][7] += count;

					}else if(room == 9) {

						house[3][0][8] += count;

					}else if(room == 10) {

						house[3][0][9] += count;

					}
				}else if(floor == 2 ) {

					if(room == 1) {

						house[3][1][0] += count;

					}else if(room == 2) {

						house[3][1][1] += count;

					}else if(room == 3) {

						house[3][1][2] += count;

					}else if(room == 4) {

						house[3][1][3] += count;

					}else if(room == 5) {

						house[3][1][4] += count;

					}else if(room == 6) {

						house[3][1][5] += count;

					}else if(room == 7) {

						house[3][1][6] += count;

					}else if(room == 8) {

						house[3][1][7] += count;

					}else if(room == 9) {

						house[3][1][8] += count;

					}else if(room == 10) {

						house[3][1][9] += count;

					}
				}else if(floor == 3 ) {

					if(room == 1) {

						house[3][2][0] += count;

					}else if(room == 2) {

						house[3][2][1] += count;

					}else if(room == 3) {

						house[3][2][2] += count;

					}else if(room == 4) {

						house[3][2][3] += count;

					}else if(room == 5) {

						house[3][2][4] += count;

					}else if(room == 6) {

						house[3][2][5] += count;

					}else if(room == 7) {

						house[3][2][6] += count;

					}else if(room == 8) {

						house[3][2][7] += count;

					}else if(room == 9) {

						house[3][2][8] += count;

					}else if(room == 10) {

						house[3][2][9] += count;

					}
				}
			}
		}

		int b = 0;
		int f = 0;
		int r = 0;

		// ?£??????¨?????????
		for(b = 0; b < 4; b++) {

			// ????????¢?????¨?????????
			for(f = 0; f < 3; f++) {

				// ??¨?±??????¨?????????
				for(r = 0; r < 9; r++) {

					System.out.print(" " + house[b][f][r]);

				}

				System.out.println(" " + house[b][f][r]);

			}

			if(b < 3) {

				for(int i = 0; i < 20; i++) {

					System.out.print("#");

				}

				System.out.println("");

			}
		}
	}
}*/