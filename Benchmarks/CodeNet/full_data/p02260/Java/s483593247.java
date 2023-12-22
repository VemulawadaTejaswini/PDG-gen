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
		int exchangingCount = selectionSort(n, targetArray);

		// 結果出力
		for (int i = 0; i < targetArray.length; i++) {
			if (i < targetArray.length - 1) {
				System.out.print(targetArray[i] + " ");
			} else {
				System.out.println(targetArray[i]);
			}
		}
		System.out.println(exchangingCount);
		;

	}

	/**
	 * 指定された整数配列を選択ソートする。
	 *
	 * @param n 要素数
	 * @param targetArray 選択ソートしたい整数配列
	 * @return 入れ替え回数
	 */
	private static int selectionSort(int n, int[] targetArray) {

		int exchangingCount = 0; // 入れ替え回数
		for (int i = 0; i < n; i++) {
			int minIndex = i; // 最小値の要素番号
			for (int j = i; j < n; j++) {
				// 最小値より低い値があったら
				if (targetArray[j] < targetArray[minIndex]) {
					// 最小値の要素番号を更新
					minIndex = j;
				}
			}
			// 最小値の値と左端を入れ替える
			if (i != minIndex) {
				exchangeArrayValue(targetArray, minIndex, i);
				exchangingCount++;
			}
		}

		return exchangingCount;
	}

	/**
	 * 配列内の2つの要素を入れ替える。
	 *
	 * @param array
	 *            入れ替えたい要素を含む配列
	 * @param a
	 *            入れ替えたい要素のindex
	 * @param b
	 *            入れ替えたい要素のindex
	 */
	private static void exchangeArrayValue(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}

