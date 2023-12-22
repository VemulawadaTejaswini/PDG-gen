import java.util.*;
import java.util.stream.IntStream;

class Dice {
	int[] surfaces = new int[6];

	Dice(int[] diceNumArr) {surfaces = diceNumArr;}

	public int getTopNumber() {return surfaces[0];}

	public void move(String str) {
		char[] directions = str.toCharArray();
		for (char d : directions) {
			if (d == 'E') {roll(true, false, false);}
			else if (d == 'W') {IntStream.range(0, 3).forEach(e -> roll(true, false, false));}
			else if (d == 'S') {IntStream.range(0, 3).forEach(e -> roll(false, true, false));}
			else if (d == 'N') {roll(false, true, false);}
		}
	}

	private void roll(boolean x, boolean y, boolean z) {
		if (x && !y && !z) {roll(0, 3, 5, 2);}
		else if (!x && y && !z) {roll(0, 1, 5, 4);}
		else if (!x && !y && z) {roll(1, 2, 4, 3);}
	}

	private void roll(int w, int x, int y, int z) {
			int tmp = surfaces[w];
			surfaces[w] = surfaces[x];
			surfaces[x] = surfaces[y];
			surfaces[y] = surfaces[z];
			surfaces[z] = tmp;
	}
}

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int[] diceNumArr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
			Dice dice = new Dice(diceNumArr);
			dice.move(sc.next());
			System.out.println(dice.getTopNumber());
		}
	}
}
