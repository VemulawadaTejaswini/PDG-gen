import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int numOfTimes;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			numOfTimes = Integer.parseInt(in.readLine());
			if (numOfTimes == 0) {
				break;
			}
			Culc culc = new Culc(numOfTimes);
			System.out.println(culc.control());
		}
	}
}

class Culc {
	private int numOfTimes;
	private int sum = 1;
	private DiceAlpha dice;
	private String order;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public Culc(int numOfTimes) {
		this.numOfTimes = numOfTimes;
	}

	public int control() throws IOException {
		dice = new DiceAlpha(1, 2, 3, 4, 5, 6);
		for (int i = 1; i <= numOfTimes; i++) {
			order = in.readLine();
			if (order.equals("North")) {
				dice.turnToNorth();
				sum += dice.getTopNum();
			} else if (order.equals("East")) {
				dice.turnToEast();
				sum += dice.getTopNum();
			} else if (order.equals("West")) {
				dice.turnToWest();
				sum += dice.getTopNum();
			} else if (order.equals("South")) {
				dice.turnToSouth();
				sum += dice.getTopNum();
			} else if (order.equals("Right")) {
				dice.turnRight();
				sum += dice.getTopNum();
			} else if (order.equals("Left")) {
				dice.turnLeft();
				sum += dice.getTopNum();
			}
		}
		return sum;
	}
}

class DiceAlpha {
	private int top, front, right, left, back, bottom;

	public DiceAlpha(int top, int front, int right, int left, int back,
			int bottom) {
		this.top = top;
		this.front = front;
		this.right = right;
		this.left = left;
		this.back = back;
		this.bottom = bottom;
	}

	public int getTopNum() {
		return top;
	}

	public void turnToNorth() {
		int temp = top;
		top = front;
		front = bottom;
		bottom = back;
		back = temp;
	}

	public void turnToEast() {
		int temp = top;
		top = left;
		left = bottom;
		bottom = right;
		right = temp;
	}

	public void turnToWest() {
		int temp = top;
		top = right;
		right = bottom;
		bottom = left;
		left = temp;
	}

	public void turnToSouth() {
		int temp = top;
		top = back;
		back = bottom;
		bottom = front;
		front = temp;
	}

	public void turnRight() {
		int temp = front;
		front = right;
		right = back;
		back = left;
		left = temp;
	}

	public void turnLeft() {
		int temp = front;
		front = left;
		left = back;
		back = right;
		right = temp;
	}
}