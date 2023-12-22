import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static class Dice {
		// 回転方向と方向に対応する変更面の添え字配列
		enum Direction {
			Roll			(new int[] { 0, 1, 5, 4 }, 2),
			Pitch			(new int[] { 0, 3, 5, 2 }, 1),
			Yaw				(new int[] { 4, 2, 1, 3 },	5),
			ReverseRoll	(new int[] { 0, 4, 5, 1 }, 3),
			ReversePitch	(new int[] { 0, 2, 5, 3 }, 4),
			ReverseYaw		(new int[] { 4, 3, 1, 2 }, 0);

			private int[] nextRotat;
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

		public int DiceSearch(int num1, int num2) {
			for (Direction dir : Direction.values()) {
				if (NumberSearch(num1, num2, dir.nextRotat)) {
					return dir.rightNum;
				}
			}
			return 0;
		}

		boolean NumberSearch(int num1, int num2, int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] == num1 && array[i + 1] == num2) {
					return true;
				}
			}
			if (array[array.length - 1] == num1 && array[0] == num2) {
				return true;
			}
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ラベル入力・ダイスの生成
		Dice dice = new Dice(CreateIntLabel(sc.nextLine().split("[\\s]+")));

		int questionCount = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		for (int i = 0; i < questionCount; i++) {
			ansList.add(dice.DiceSearch(sc.nextInt()-1, sc.nextInt()-1));
		}

		// 出力
		for (int i : ansList) {
			System.out.println(i+1);
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

}

