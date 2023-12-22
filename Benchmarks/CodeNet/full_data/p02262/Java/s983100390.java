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
		int[] targetArray = new int[n];

		String target = scan.nextLine();
		for (int i = 0; i < n; i++) {
			targetArray[i] = Integer.parseInt(target);
			if (i < n - 1) {
				target = scan.nextLine();
			}
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// シェルソートを実行
		shellSort(targetArray, n);

		// 結果出力
		printSortResult(targetArray);

	}

	/**
	 *
	 * @param array
	 * @param number
	 * @param g
	 * @param cnt
	 * @return
	 */
	private static int insertionSort(int[] array, int number, int g, int cnt) {

		// gからn-1まで
		int temp = 0;
		for (int i = g, j = 0; i < number; i++) {
			temp = array[i];
			j = i - g;

			// 自分より大きいやつが見つかるまで
			while (j >= 0 && array[j] > temp) {
				array[j + g] = array[j];
				j = j - g;
				cnt++;
			}
			array[j + g] = temp;
		}
		return cnt;
	}

	/**
	 *
	 * @param array
	 * @param number
	 */
	private static void shellSort(int[] array, int number) {

		// Gの準備
		int g = 0;
		int size = 0;
		while (true) {
			// 3g+1
			g = (3 * g) + 1;
			if (g > number) {
				break;
			}
			size++;
		}

		int[] G = new int[size];
		int j = 0;
		g = 0;
		while (true) {
			// 3g+1
			g = (3 * g) + 1;
			if (g > number) {
				break;
			}
			G[j++] = g;
		}

		// 結果出力
		System.out.println(size);
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(G[i] + (i == 0 ? "\n" : " "));
		}

		int cnt = 0;
		for (int i = size - 1; i >= 0 ; i--) {
			cnt = insertionSort(array, number, G[i], cnt);
		}

		// 結果出力
		System.out.println(cnt);
	}

	/**
	 * ソート結果の出力をする。
	 * @param sortedArray ソートされた配列
	 */
	private static void printSortResult(int[] sortedArray) {
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}

