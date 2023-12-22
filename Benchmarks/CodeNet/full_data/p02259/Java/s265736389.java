import java.util.Scanner;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 入力
		int n = Integer.parseInt(scan.nextLine()); // 要素数

		// ソート対象配列の読み込み
		String[] targetArrayStr = scan.nextLine().split(" ");
		int[] targetArray = new int[targetArrayStr.length];
		for (int i = 0; i < targetArrayStr.length; i++) {
			targetArray[i] = Integer.parseInt(targetArrayStr[i]);
		}

		// 読み込み終了
		scan.close();

		// ソート
		int exchangingCount = bubbleSort(n, targetArray);

		// 結果出力
		for (int i = 0; i < targetArray.length; i++) {
			if (i < targetArray.length - 1) {
				System.out.print(targetArray[i] + " ");
			} else {
				System.out.println(targetArray[i]);
			}
		}
		System.out.println(exchangingCount);;

	}

	/**
	 * 指定された整数配列をバブルソートする。
	 *
	 * @param n 配列の要素数
	 * @param targetArray バブルソートしたい整数配列
	 */
	private static int bubbleSort(int n, int[] targetArray) {
		boolean isNotSorted = true; // ソート未完了フラグ
		int exchangingCount = 0; // 入れ替え回数

		// ソートが完了するまで
		while (isNotSorted) {
			isNotSorted = false;

			// 天秤を右端から移動していく
			for (int i = n - 1; i > 0; i--) {
				// 自分より小さい値が左側に居たら
				if (targetArray[i] < targetArray[i - 1]) {
					// 2つの要素を入れ替える
					exchangeArrayValue(targetArray, i, i - 1);
					isNotSorted = true;
					exchangingCount++;
				}
			}
		}

		return exchangingCount;
	}

	/**
	 * 配列内の2つの要素を入れ替える。
	 *
	 * @param array 入れ替えたい要素を含む配列
	 * @param a 入れ替えたい要素のindex
	 * @param b 入れ替えたい要素のindex
	 */
	private static void exchangeArrayValue(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
