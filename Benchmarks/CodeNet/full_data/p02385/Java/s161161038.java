import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ラベル入力・ダイスの生成
		Dice dice1 = new Dice(CreateIntLabel(sc.nextLine()));
		Dice dice2 = new Dice(CreateIntLabel(sc.nextLine()));

		// 同じダイスであるか判定・出力
		if (DiceComparison(dice1, dice2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	// ラベル配列の生成
	public static int[] CreateIntLabel(String str) {
		String[] input=str.split("[\\s]+");
		int[] label = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			label[i] = Integer.parseInt(input[i]);
		}
		return label;
	}

	// 2つのダイスが同じかを判定
	public static boolean DiceComparison(Dice dice1, Dice dice2) {
		// ダイス1の0番目と同じラベルをダイス2から探す
		for (int i = 0; i < dice2.label.length; i++) {
			if (dice1.label[0] == dice2.label[i]) {

				// 側面4つの並びが同じか判定
				if (ComparisonNumberSequence(dice1.getCorrespondingAspectsLabels(0),
						dice2.getCorrespondingAspectsLabels(i))) {
					return true;
				}
			}
		}
		return false;

	}

	// 配列(ダイスの側面4つ)を2つを受け取り、同じ順序ができるか判定
	public static boolean ComparisonNumberSequence(int[] array1, int[] array2) {
		// 0番目の値が同じになるまでarray2を回転させる
		while (array1[0] != array2[0]) {
			int work = array2[0];
			for (int i = 1; i < array2.length; i++) {
				array2[i - 1] = array2[i];
			}
			array2[array2.length - 1] = work;
		}

		// 内容が同じになったかを見る
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;

	}

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
			private int[] Rotat;
			// 回転軸方向に対応する右の面
			private int rightNum;

			Direction(int[] nums, int num) {
				this.Rotat = nums;
				this.rightNum = num;
			}
		}

		// ラベル
		int[] label;

		// コンストラクタ
		Dice(int[] label) {
			this.label = label;
		}

		// 右の面の添え字を受け取り、回転方向の4面の添え字配列を返す
		int[] getCorrespondingAspects(int num) {
			for (Direction dir : Direction.values()) {
				if (dir.rightNum == num) {
					return dir.Rotat;
				}
			}
			return null;
		}

		// 右の面の添え字を受け取り、回転方向の4面のラベル配列を返す
		int[] getCorrespondingAspectsLabels(int num) {
			int[] pointers = getCorrespondingAspects(num);
			int[] labels = new int[pointers.length];
			for (int i = 0; i < labels.length; i++) {
				labels[i] = this.label[pointers[i]];
			}
			return labels;

		}

	}

}

