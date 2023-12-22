import java.util.Scanner;

public class Main {

	static class Dice {
		// 回転方向上にある4つの面の添え字、対応する右の面の添え字
		enum Direction {
			Roll			(new int[] { 0, 1, 5, 4 }, 2),
			Pitch			(new int[] { 0, 3, 5, 2 }, 1),
			Yaw				(new int[] { 4, 2, 1, 3 }, 5),
			ReverseRoll	(new int[] { 0, 4, 5, 1 }, 3),
			ReversePitch	(new int[] { 0, 2, 5, 3 }, 4),
			ReverseYaw		(new int[] { 4, 3, 1, 2 }, 0);

			// 回転軸方向の4つの面
			private int[] nextRotat;
			// 回転軸方向に対応する右の面
			private int rightNum;

			Direction(int[] nums, int num) {
				this.nextRotat = nums;
				this.rightNum = num;
			}
		}

		// ラベル
		int[] label;

		// コンストラクタ
		Dice(int[] label) {
			this.label = label;
		}

		int[] getCorrespondingAspects(int num) {
			for (Direction dir : Direction.values()) {
				if (dir.rightNum == num) {
					return dir.nextRotat;
				}
			}
			return null;
		}

		int[] getCorrespondingAspectsLabel(int num) {
			int[] pointers = getCorrespondingAspects(num);
			int[] CorrespondingAspectsLabel = new int[pointers.length];
			for (int i = 0; i < CorrespondingAspectsLabel.length; i++) {
				CorrespondingAspectsLabel[i] = this.label[pointers[i]];
			}
			return CorrespondingAspectsLabel;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ラベル入力・ダイスの生成
		Dice dice1 = new Dice(CreateIntLabel(sc.nextLine().split("[\\s]+")));

		Dice dice2 = new Dice(CreateIntLabel(sc.nextLine().split("[\\s]+")));

		if (DiceComparison(dice1, dice2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	// ラベル配列の生成
	public static int[] CreateIntLabel(String[] input) {
		int[] label = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			label[i] = Integer.parseInt(input[i]);
		}
		return label;
	}

	public static boolean DiceComparison(Dice dice1, Dice dice2) {
		for (int i = 0; i < dice2.label.length; i++) {
			if (dice1.label[0] == dice2.label[i]) {

				if (ComparisonNumberSequence(dice1.getCorrespondingAspectsLabel(0),
						dice2.getCorrespondingAspectsLabel(i))) {
					return true;
				}
			}
		}
		return false;

	}

	public static boolean ComparisonNumberSequence(int[] array1, int[] array2) {
		while (array1[0] != array2[0]) {
			int work = array2[0];
			for (int i = 1; i < array2.length; i++) {
				array2[i - 1] = array2[i];
			}
			array2[array2.length - 1] = work;
		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}

		return true;

	}

}

