import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static class Dice {
		private int[] sides;

		private static int[][] eastTable = {
			{6, 2, 4, 1, 3, 6},
			{3, 6, 0, 5, 6, 2},
			{1, 5, 6, 6, 0, 4},
			{4, 0, 6, 6, 5, 1},
			{2, 6, 5, 0, 6, 3},
			{6, 3, 1, 4, 2, 6}
		};

		private static Dice getDice(String line) {
			Dice dice = new Dice();
			String[] sides = line.split(" ");
			dice.sides = new int[sides.length];
			for (int i = 0; i < sides.length; i++) {
				dice.sides[i] = Integer.parseInt(sides[i]);
			}
			return dice;
		}

		public static int getEast(Dice dice, int tnum, int snum) {
			boolean tflag = false;
			boolean sflag = false;
			int top = 0;
			int south = 0;
			int[] sides = dice.sides;
			for (int i = 0; i < sides.length; i++) {
				if (tnum == sides[i]) {
					top = i;
					tflag = true;
					if (sflag) {
						break;
					}
				} else if (snum == sides[i]) {
					south = i;
					sflag = true;
					if (tflag) {
						break;
					}
				}
			}

			int eastSide = eastTable[top][south];
			if (eastSide == 6) {
				eastSide = -1;
			}

			return sides[eastSide];
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Dice dice1 = Dice.getDice(input.readLine());
			Dice dice2 = Dice.getDice(input.readLine());
			boolean equal = false;

			for (int i = 0; i < 6; i++) {
				if (equal) {
					break;
				}

				if (dice1.sides[0] == dice2.sides[i] && dice1.sides[5] == dice2.sides[5-i]) {
					for (int j = 0; j < 6; j++) {
						if (equal) {
							break;
						} else if (j == i) {
							continue;
						}

						if (dice1.sides[1] == dice2.sides[j] && dice1.sides[4] == dice2.sides[5-j]) {
							for (int k = 0; k < 6; k++) {
								if (equal) {
									break;
								} else if (k == i || k == j) {
									continue;
								}

								if (dice1.sides[2] == dice2.sides[k] && dice1.sides[3] == dice2.sides[5-k]) {
									if (dice1.sides[2] == Dice.getEast(dice2, i, j)) {
										equal = true;
									}
								}
							}
						}
					}
				}
			}

			System.out.println(equal ? "Yes" : "No");
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}