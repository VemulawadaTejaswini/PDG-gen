import java.util.Scanner;

public class Main {

	static class Dice {
		enum Direction {
			N(0, 1, 5, 4), E(0, 3, 5, 2), W(0, 2, 5, 3), S(0, 4, 5, 1);

			private int[] nextRotat;

			Direction(int num1, int num2, int num3, int num4) {
				this.setNextRotat(new int[] { num1, num2, num3, num4 });
			}

			public int[] getNextRotat() {
				return nextRotat;
			}

			public void setNextRotat(int[] nextRotat) {
				this.nextRotat = nextRotat;
			}
		}

		int[] label;

		Dice(int[] label) {
			this.label = label;
		}

		public void Rotation(String str) {
			Direction dir = Direction.valueOf(str);
			LabelUpdate(dir.getNextRotat());
		}

		void LabelUpdate(int[] nextRotat) {
			int work = label[nextRotat[0]];
			for (int i = 1; i < nextRotat.length; i++) {
				label[nextRotat[i - 1]] = label[nextRotat[i]];
			}
			label[nextRotat[nextRotat.length - 1]] = work;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Dice dice = new Dice(CreateIntLabel(sc.nextLine().split("[\\s]+")));

		String[] input = sc.nextLine().split("");

		for (String str : input) {
			dice.Rotation(str);
		}

		System.out.println(dice.label[0]);

	}

	public static int[] CreateIntLabel(String[] input) {
		int[] label = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			label[i] = Integer.parseInt(input[i]);
		}
		return label;
	}

}

