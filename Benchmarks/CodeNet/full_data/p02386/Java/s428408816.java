import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = Integer.parseInt(input());
		Dice dice = new Dice(input());
		boolean flag = true;

		for (int i = 0; i < n - 1; i++) {

			if (dice.match(input())) {

				flag = false;
				break;

			}
		}

		if (flag) {

			System.out.println("Yes");

		} else {

			System.out.println("No");
		}

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

	public Dice(String num) {

		String[] partsNum = num.split(" ");

		top = Integer.parseInt(partsNum[0]);
		front = Integer.parseInt(partsNum[1]);
		right = Integer.parseInt(partsNum[2]);
		left = Integer.parseInt(partsNum[3]);
		back = Integer.parseInt(partsNum[4]);
		bottom = Integer.parseInt(partsNum[5]);

	}

	public boolean match(String num) {

		String[] numList = num.split(" ");

		for (int i = 0; i < 7; i++) {

			if (i == 4) {

				this.roll("E");

			}

			if (Integer.parseInt(numList[1]) == this.front) {

				break;

			} else {

				this.roll("N");

			}
		}

		for (int j = 0; j < 4; j++) {

			if (Integer.parseInt(numList[0]) == this.top) {

				break;

			} else {

				this.roll("W");

			}
		}

		return (Integer.parseInt(numList[2]) == right &&
				Integer.parseInt(numList[3]) == left &&
				Integer.parseInt(numList[4]) == back &&
				Integer.parseInt(numList[5]) == bottom);

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
}