import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			Dice d = new Dice(1, 2, 4);
			for (int i = 0; i < N; ++i) {
				char command = sc.next().charAt(0);
				if (command == 'n') {
					d.rollN();
				} else if (command == 'w') {
					d.rollW();
				} else if (command == 's') {
					d.rollS();
				} else {
					d.rollE();
				}
			}
			System.out.println(d.top());
		}
	}

	static class Dice {
		int[] val = new int[6]; // top, north, east, south, west, bottom

		Dice(int top, int north, int east) {
			val[0] = top;
			val[1] = north;
			val[2] = east;
			val[3] = 7 - north;
			val[4] = 7 - east;
			val[5] = 7 - top;
		}

		Dice(int[] val) {
			if (val[0] + val[5] != 7 || val[1] + val[3] != 7 || val[2] + val[4] != 7) throw new RuntimeException();
			for (int i = 0; i < 6; ++i) {
				this.val[i] = val[i];
			}
		}

		void rollN() {
			int tmp = north();
			this.val[1] = this.val[0];
			this.val[0] = this.val[3];
			this.val[3] = this.val[5];
			this.val[5] = tmp;
		}

		void rollS() {
			int tmp = south();
			this.val[3] = this.val[0];
			this.val[0] = this.val[1];
			this.val[1] = this.val[5];
			this.val[5] = tmp;
		}

		void rollE() {
			int tmp = east();
			this.val[2] = this.val[0];
			this.val[0] = this.val[4];
			this.val[4] = this.val[5];
			this.val[5] = tmp;
		}

		void rollW() {
			int tmp = west();
			this.val[4] = this.val[0];
			this.val[0] = this.val[2];
			this.val[2] = this.val[5];
			this.val[5] = tmp;
		}

		public boolean equals(Object o) {
			if (!(o instanceof Dice)) return false;
			return Arrays.equals(this.val, ((Dice) o).val);
		}

		public int hashCode() {
			return Arrays.hashCode(this.val);
		}

		public Dice clone() {
			return new Dice(this.val);
		}

		int top() {
			return this.val[0];
		}

		int bottom() {
			return this.val[5];
		}

		int north() {
			return this.val[1];
		}

		int south() {
			return this.val[3];
		}

		int east() {
			return this.val[2];
		}

		int west() {
			return this.val[4];
		}

	}

}