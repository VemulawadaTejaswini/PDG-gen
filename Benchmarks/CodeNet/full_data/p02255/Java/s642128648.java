
import java.util.Scanner;

/**
 * ZAKIREN第5章
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

		for (int k = 0; k < targetArray.length; k++) {
			if (k < targetArray.length - 1) {
				System.out.print(targetArray[k] + " ");
			} else {
				System.out.println(targetArray[k]);
			}
		}

		// ソート呼び出し
		insertionSort(targetArray, n);

	}

	/**
	 * 指定された整数型配列を挿入ソートします。
	 * @param targetArray ソートしたい配列
	 * @param n 要素数
	 * @return 入れ替え回数
	 */
	private static void insertionSort(int[] targetArray, int n) {

		for (int i = 1; i < n; i++) {
			int num = targetArray[i];
			int j = i -1;

			while (j >= 0 && targetArray[j] > num) {
				targetArray[j+1] = targetArray[j];
				j--;
			}
			targetArray[j+1] = num;

			for (int k = 0; k < targetArray.length; k++) {
				if (k < targetArray.length - 1) {
					System.out.print(targetArray[k] + " ");
				} else {
					System.out.println(targetArray[k]);
				}
			}

		}

	}

}

