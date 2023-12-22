import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ダイス数の入力
		int diceCount = Integer.parseInt(sc.nextLine());

		// ダイスリスト
		ArrayList<Dice> DiceList = new ArrayList<Dice>();

		// ラベル入力・ダイスの生成し、リストに追加
		for (int i = 0; i < diceCount; i++) {
			Dice dice = new Dice(CreateIntLabel(sc.nextLine()));
			DiceList.add(dice);
		}
		sc.close();

		// 同じダイスがあるか判定・出力
		for (int i = 0; i < DiceList.size() - 1; i++) {
			for (int second = i + 1; second < DiceList.size(); second++) {
				if (DiceComparison(DiceList.get(i), DiceList.get(second))) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");

	}

	// ラベル配列の生成
	public static int[] CreateIntLabel(String str) {
		String[] input = str.split("[\\s]+");
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

				// 裏面が同じか判定
				if (dice1.getReverseSideLabel(0) == dice2.getReverseSideLabel(i)) {

					// 側面4つの並びが同じか判定
					if (ComparisonNumberSequence(dice1.getCorrespondingAspectsLabels(0),
							dice2.getCorrespondingAspectsLabels(i))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	// 配列(ダイスの側面4つ)を2つを受け取り、同じ順序ができるか判定
	public static boolean ComparisonNumberSequence(int[] array1, int[] array2) {
		// array2が1周するまでarray2の内容を回転させる
		for (int e = 0; e < array1.length; e++) {
			// ラベルが同じ場合ループを抜ける
			if (array1[0] == array2[0])
				break;
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

		// 3つの回転軸
		enum DiceStructure {
			Roll	(new int[] { 0, 1, 5, 4 }, 2,3),
			Pitch	(new int[] { 0, 3, 5, 2 }, 1,4),
			Yaw		(new int[] { 4, 2, 1, 3 }, 5,0);

			// 回転軸方向の4つの面
			private int[] Rotat;
			// 回転軸方向に対応する右の面
			private int rightNum;
			// 回転軸方向に対応する左の面
			private int leftNum;

			DiceStructure(int[] nums, int right, int left) {
				this.Rotat = nums;
				this.rightNum = right;
				this.leftNum = left;
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
			for (DiceStructure ds : DiceStructure.values()) {
				if (ds.rightNum == num) {
					return ds.Rotat;
				} else if (ds.leftNum == num) {
					return TurnOver(ds.Rotat);
				}
			}
			return null;
		}

		// 配列を逆順にして返す
		int[] TurnOver(int[] nums) {
			int[] turnNums = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				turnNums[nums.length - 1 - i] = nums[i];
			}
			return turnNums;
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

		// 表面の添え字を受け取り、裏面の添え字を返す
		int getReverseSideLabel(int num) {
			for (DiceStructure ds : DiceStructure.values()) {
				if (ds.rightNum == num) {
					return this.label[ds.leftNum];
				} else if (ds.leftNum == num) {
					return this.label[ds.rightNum];
				}
			}
			return 0;

		}
	}
}

