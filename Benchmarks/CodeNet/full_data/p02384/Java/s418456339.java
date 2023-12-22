import java.util.*;
import java.util.stream.IntStream;

class Dice {
	int[] surfaces = new int[6];

	Dice(int[] diceNumArr) {surfaces = diceNumArr;}

	public int getTopNumber() {return surfaces[0];}

	public void move(String str) {
		for (char d : str.toCharArray()) {
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

	public void setTopAndFront(int top, int front) {
		isSame(top, front, -1);
	}

	private boolean isSame(int... srf) {
		for (int xy = 0; xy < 6; xy++) {
			for (int z = 0; z < 4; z++) {
				if (surfaces[0] == srf[0] && surfaces[1] == srf[1] && srf[2] < 0) return false;
				int[] a = Arrays.copyOfRange(surfaces, 2, surfaces.length);
				int[] b = Arrays.copyOfRange(srf, 2, srf.length);
				if (Arrays.equals(a, b)) return true;
				roll(false, false, true);
			}
			if (xy % 2 == 0) {roll(true, false, false);}
			else {roll(false, true, false);}
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		Dice other = (Dice) obj;
		return isSame(other.surfaces);
	}
}

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int[] diceNumArr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
			Dice dice = new Dice(diceNumArr);
			int cnt = sc.nextInt();

			for (int i = 0; i< cnt; i++ ) {
				dice.setTopAndFront(sc.nextInt(), sc.nextInt());
				System.out.println(dice.surfaces[2]);
			}
		}
	}
}
