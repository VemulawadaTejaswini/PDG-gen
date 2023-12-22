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

		public static int getEast(Dice dice, String line) {
			String[] nums = line.split(" ");
			int tnum = Integer.parseInt(nums[0]);
			int snum = Integer.parseInt(nums[1]);
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
			
			return sides[eastTable[top][south]];
		}
	}

	public static void main(String[] args) {
		try {
			StringBuilder output = new StringBuilder();
			String lb = System.getProperty("line.separator");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Dice dice = Dice.getDice(input.readLine());
			int q = Integer.parseInt(input.readLine());
			
			for (int i = 0; i < q; i++) {
				String line = input.readLine();
				output.append(String.valueOf(Dice.getEast(dice, line))).append(lb);
			}
			System.out.print(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}