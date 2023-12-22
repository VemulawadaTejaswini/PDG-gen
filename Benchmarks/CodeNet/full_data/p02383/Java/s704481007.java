
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Dice dice = new Dice(scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt());
		String a = scn.next();
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			dice.roll(b[i]);
		}
		System.out.println(dice.getTop());
	}
}

class Dice {
	int[] number = new int[6];

	Dice(int a, int b, int c, int d, int e, int f) {
		number[0] = a;
		number[1] = b;
		number[2] = c;
		number[3] = d;
		number[4] = e;
		number[5] = f;
	}

	public void roll(char cd) {
		int tmp = 0;
		switch (cd) {
		case 'N':
			tmp = number[0];
			number[0] = number[1];
			number[1] = number[5];
			number[5] = number[4];
			number[4] = tmp;
			break;
		case 'S':
			tmp = number[0];
			number[0] = number[4];
			number[4] = number[5];
			number[5] = number[1];
			number[1] = tmp;
			break;
		case 'E':
			tmp = number[0];
			number[0] = number[3];
			number[3] = number[5];
			number[5] = number[2];
			number[2] = tmp;
			break;
		case 'W':
			tmp = number[0];
			number[0] = number[2];
			number[2] = number[5];
			number[5] = number[3];
			number[3] = tmp;
			break;
		}
	}

	public int getTop() {
		return number[0];
	}
}
