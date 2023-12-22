import java.util.Scanner;

class Main {

	final static char[] checkall = { 'N', 'N', 'N', 'N', 'W', 'W', 'W' };

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		stdIn.nextLine();

		Dice[] diceary = new Dice[n];

		for (int i = 0; i < n; i++) {
			diceary[i] = createDice(stdIn);
		}

		for(int i = 0; i < diceary.length; i++) {
			for(int j = i+1; j < diceary.length; j++) {
				if(checkDice(diceary[i], diceary[j])) {
					System.out.println("No");
					stdIn.close();
					System.exit(0);
				}

			}

		}
		System.out.println("Yes");


		stdIn.close();
	}

	private static boolean checkDice(Dice dice1, Dice dice2) {
		alignment(dice1, dice2);
		if (0 <= dice1.getLine().indexOf(dice2.getLine().substring(0, (dice2.getLine().length() / 2)))) {
			return true;
		} else {
			return false;
		}
	}

	private static Dice createDice(Scanner stdIn) {
		int[] sary = new int[6];
		for (int i = 0; i < sary.length; i++) {
			sary[i] = stdIn.nextInt();
		}
		stdIn.nextLine();
		Dice d = new Dice(sary[0], sary[1], sary[2], sary[3], sary[4], sary[5]);
		return d;
	}
	private static void alignment(Dice dice1, Dice dice2) {
		for (int i = 0; i < checkall.length; i++) {
			dice2.roll(checkall[i]);
			if (dice1.getTop() == dice2.getTop() && dice1.getBottom() == dice2.getBottom()) {
				break;
			}
		}
	}
}

class Dice {
	private int top;
	private int front;
	private int right;
	private int left;
	private int back;
	private int bottom;

	int temp;

	public Dice(int top, int front, int right, int left, int back, int bottom) {
		super();
		this.top = top;
		this.front = front;
		this.right = right;
		this.left = left;
		this.back = back;
		this.bottom = bottom;
	}

	public void rollPattern(String rollpattern) {
		for (int i = 0; i < rollpattern.length(); i++) {
			roll(rollpattern.charAt(i));
			System.out.println(rollpattern.charAt(i) + " " + " " + getTop());
		}
	}

	public void roll(char x) {
		switch (x) {
		case 'N':
			rollNorth();
			break;
		case 'S':
			rollSorth();
			break;
		case 'W':
			rollWest();
			break;
		case 'E':
			rollEast();
			break;
		default:
			System.exit(1);
			break;
		}
	}

	private void rollNorth() {
		temp = top;
		top = front;
		front = bottom;
		bottom = back;
		back = temp;
	}

	private void rollSorth() {
		temp = top;
		top = back;
		back = bottom;
		bottom = front;
		front = temp;
	}

	private void rollWest() {
		temp = top;
		top = right;
		right = bottom;
		bottom = left;
		left = temp;
	}

	private void rollEast() {
		temp = top;
		top = left;
		left = bottom;
		bottom = right;
		right = temp;
	}

	public int getTop() {
		return top;
	}

	public int getBottom() {
		return bottom;
	}

	public StringBuilder getAll() {
		int[] ary = { top, front, left, right, back, bottom };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ary.length; i++) {
			sb.append(ary[i]);
		}
		return sb;
	}

	public StringBuilder getLine() {
		int[] ary = { front, right, back, left, front, right, back, left };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ary.length; i++) {
			sb.append(ary[i]);
		}
		return sb;
	}
}