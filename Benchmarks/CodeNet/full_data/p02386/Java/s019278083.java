import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static class Dice {
		private String top;
		private String bottom;
		private String front;
		private String back;
		private String left;
		private String right;

		public Dice(
				String top,
				String front,
				String right,
				String left,
				String back,
				String bottom)
		{
			this.top = top;
			this.front = front;
			this.right = right;
			this.left = left;
			this.back = back;
			this.bottom = bottom;
		}

		public String operationE() {
			String tmp = this.top;
			this.top = this.left;
			this.left = this.bottom;
			this.bottom = this.right;
			this.right = tmp;

			return this.top;
		}

		public String operationN() {
			String tmp = this.top;
			this.top = this.front;
			this.front = this.bottom;
			this.bottom = this.back;
			this.back = tmp;

			return this.top;
		}

		public String operationS() {
			String tmp = this.top;
			this.top = this.back;
			this.back = this.bottom;
			this.bottom = this.front;
			this.front = tmp;

			return this.top;
		}

		public String operationW() {
			String tmp = this.top;
			this.top = this.right;
			this.right = this.bottom;
			this.bottom = this.left;
			this.left = tmp;

			return this.top;
		}

		public String getTop() {
			return top;
		}

		public String getBottom() {
			return bottom;
		}

		public String getFront() {
			return front;
		}

		public String getBack() {
			return back;
		}

		public String getLeft() {
			return left;
		}

		public String getRight() {
			return right;
		}

		public boolean equal(Dice dice) {
			for (int i = 0; i < 4; i++) {
				dice.operationS();

				for (int j = 0; j < 4; j++) {
					dice.operationW();

					if (this.compare(dice)) {
						return true;
					}
				}
			}

			dice.operationW();

			for (int i = 0; i < 4; i++) {
				dice.operationS();

				for (int j = 0; j < 4; j++) {
					dice.operationW();

					if (this.compare(dice)) {
						return true;
					}
				}
			}

			return false;
		}

		public boolean compare(Dice dice) {
			if (this.getTop().equals(dice.getTop()) &&
				this.getBottom().equals(dice.getBottom()) &&
				this.getFront().equals(dice.getFront()) &&
				this.getBack().equals(dice.getBack()) &&
				this.getRight().equals(dice.getRight()) &&
				this.getLeft().equals(dice.getLeft()))
			{
				return true;
			}
			return false;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int diceNum = Integer.parseInt(br.readLine());

		Dice[] diceList = new Dice[diceNum];

		for (int i = 0; i < diceNum; i++){
			String[] label = br.readLine().split(" ");
			Dice dice = new Dice(label[0], label[1], label[2], label[3], label[4], label[5]);
			diceList[i] = dice;
		}

		for (int i = 0; i < diceNum - 1; i++){
			for (int j = i + 1; j < diceNum; j++){
				if(diceList[i].equal(diceList[j])) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}