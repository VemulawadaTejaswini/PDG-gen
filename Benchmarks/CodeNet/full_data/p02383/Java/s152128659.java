import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int[] sary = new int[6];
		String rollpattern;

		Scanner stdIn = new Scanner(System.in);

		for (int i = 0; i < sary.length; i++) {
			sary[i] = stdIn.nextInt();
		}
		stdIn.nextLine();
		rollpattern = stdIn.nextLine();

		Dice dice = new Dice(sary[0], sary[1], sary[2], sary[3], sary[4], sary[5]);
		dice.rollPattern(rollpattern);
		System.out.println(dice.getTop());

		stdIn.close();
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
}