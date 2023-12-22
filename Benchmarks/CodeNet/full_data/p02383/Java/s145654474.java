import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Dice dice = new Dice(input());
		dice.roll(input());
		System.out.println(dice.getTop());

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

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

	public Dice (String num) {

		String[] partsNum = num.split(" ");

		top = Integer.parseInt(partsNum[0]);
		front = Integer.parseInt(partsNum[1]);
		right = Integer.parseInt(partsNum[2]);
		left = Integer.parseInt(partsNum[3]);
		back = Integer.parseInt(partsNum[4]);
		bottom = Integer.parseInt(partsNum[5]);

	}

	public void roll(String direction) {

		int temp;

		for (int i = 0; i < direction.length(); i++) {

			switch (direction.charAt(i)) {

			case 'E':

				temp = top;
				top = left;
				left = bottom;
				bottom = right;
				right = temp;
				break;

			case 'N':

				temp = top;
				top = front;
				front = bottom;
				bottom = back;
				back = temp;
				break;

			case 'S':

				temp = top;
				top = back;
				back = bottom;
				bottom = front;
				front = temp;
				break;

			case 'W':

				temp = top;
				top = right;
				right = bottom;
				bottom = left;
				left = temp;
				break;

			}
		}
	}

	public int getTop() {

		return top;

	}
}