
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static class Dice {
		private int[] sides;

		Dice(String line) {
			String[] sides = line.split(" ");
			this.sides = new int[sides.length];
			for (int i = 0; i < sides.length; i++) {
				this.sides[i] = Integer.parseInt(sides[i]);
			}
		}

		Dice(int[] sides) {
			this.sides = sides;
		}

		private static int[][] eastTable = {
			{6, 2, 4, 1, 3, 6},
			{3, 6, 0, 5, 6, 2},
			{1, 5, 6, 6, 0, 4},
			{4, 0, 6, 6, 5, 1},
			{2, 6, 5, 0, 6, 3},
			{6, 3, 1, 4, 2, 6}
		};

		public static int getEast(Dice dice, final int tnum, final int snum) {
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

			int east;
			int eastSide = eastTable[top][south];

			if (eastSide == 6) {
				east = -1;
			} else {
				east = sides[eastSide];
			}

			return east;
		}

		public static boolean isIdentification(Dice dice1, Dice dice2) {
			boolean isEqual = false;

			for (int i = 0; i < 6; i++) {
				if (isEqual) {
					break;
				}

				if (dice1.sides[0] == dice2.sides[i] && dice1.sides[5] == dice2.sides[5-i]) {
					for (int j = 0; j < 6; j++) {
						if (isEqual) {
							break;
						} else if (j == i) {
							continue;
						}

						if (dice1.sides[1] == dice2.sides[j] && dice1.sides[4] == dice2.sides[5-j]) {
							for (int k = 0; k < 6; k++) {
								if (isEqual) {
									break;
								} else if (k == i || k == j) {
									continue;
								}

								if (dice1.sides[2] == dice2.sides[k] && dice1.sides[3] == dice2.sides[5-k]) {
									if (dice1.sides[2] == Dice.getEast(dice2, dice2.sides[i], dice2.sides[j])) {
										isEqual = true;
									} else if (dice2.sides[k] == dice2.sides[5-k]) {
										isEqual = true;
									}
								}
							}
						}
					}
				}
			}

			return isEqual;
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			boolean isEqual = false;

			int n = Integer.parseInt(in.readLine());
			Dice[] dices = new Dice[n];
			for (int i = 0; i < n; i++) {
				dices[i] = new Dice(in.readLine());
			}
			in.close();

			for (int i = 0; i < n; i++) {
				if (isEqual) break;
				
				for (int j = i+1; j < n; j++) {
					if (Dice.isIdentification(dices[i], dices[j])) {
						isEqual = true;
						break;
					}
				}
			}

			System.out.println(isEqual ? "No" : "Yes");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}




