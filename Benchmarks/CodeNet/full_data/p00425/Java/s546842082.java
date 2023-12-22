import java.util.Scanner;


public class Main {

	class Dice {
		int UP, LOW, BACK, FRONT, RIGHT, LEFT;
		public Dice() {
			UP = 1; LOW = 6; BACK = 2; FRONT = 5; RIGHT = 3; LEFT = 4;
		}
		public int moveNorth() {
			int temp = UP;
			UP = BACK; BACK = LOW; LOW = FRONT; FRONT = temp;
			return UP;
		}
		public int moveSouth() {
			int temp = UP;
			UP = FRONT; FRONT = LOW; LOW = BACK; BACK = temp;
			return UP;
		}
		public int moveEast() {
			int temp = UP;
			UP = LEFT; LEFT = LOW; LOW = RIGHT; RIGHT = temp;
			return UP;
		}
		public int moveWest() {
			int temp = UP;
			UP = RIGHT; RIGHT = LOW; LOW = LEFT; LEFT = temp;
			return UP;
		}
		public int rotateRight() {
			int temp = BACK;
			BACK = RIGHT; RIGHT = FRONT; FRONT = LEFT; LEFT = temp;
			return UP;
		}
		public int rotateLeft() {
			int temp = BACK;
			BACK = LEFT; LEFT = FRONT; FRONT = RIGHT; RIGHT = temp;
			return UP;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int N = 0;
		while ((N = sc.nextInt()) != 0) {
			Dice dice = (new Main()).new Dice();
			sc.nextLine();
			long score = 1;
			for (int i = 0 ; i < N ; i++) {
				String com = sc.nextLine();
				if (com.equals("North")) score += dice.moveNorth();
				else if (com.equals("East")) score += dice.moveEast();
				else if (com.equals("West")) score += dice.moveWest();
				else if (com.equals("South")) score += dice.moveSouth();
				else if (com.equals("Right")) score += dice.rotateRight();
				else score += dice.rotateLeft();
			}
			System.out.println(score);
		}
	}
}