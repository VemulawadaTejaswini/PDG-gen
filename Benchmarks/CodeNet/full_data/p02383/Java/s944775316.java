import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static class Dice {
		
		private int[] sides;
		private int currentSide;
		
		private final static int[][] table = {
			{1, 3, 4, 2},
			{5, 3, 0, 2},
			{1, 0, 4, 5},
			{1, 5, 4, 0},
			{0, 3, 5, 2},
			{4, 2, 1, 3}
		};
		
		private static Dice getDice(String line) {
			Dice dice = new Dice();
			dice.currentSide = 0;
			String[] sides = line.split(" ");
			dice.sides = new int[sides.length];
			for (int i = 0; i < sides.length; i++) {
				dice.sides[i] = Integer.parseInt(sides[i]);
			}
			return dice;
		}
		
		private static int roll(Dice dice, String line) {
			final int north = 0;
			final int east = 1;
			final int south = 2;
			final int west = 3;
			
			int current = dice.currentSide;
			char[] operations = line.toCharArray();
			for (char operation : operations) {
				switch (operation) {
				case 'N':
					current = table[current][north];
					break;
				case 'E':
					current = table[current][east];
					break;
				case 'S':
					current = table[current][south];
					break;
				case 'W':
					current = table[current][west];
					break;
				}
			}
			dice.currentSide = current;
			return dice.sides[current];
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String line = input.readLine();
			String roll = input.readLine();
			
			Dice dice = Dice.getDice(line);
			System.out.println(dice.roll(dice, roll));
			
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}