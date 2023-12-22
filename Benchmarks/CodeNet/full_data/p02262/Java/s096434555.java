import java.util.Scanner;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int n = scan.nextInt(); // 要素数

		// ソート対象配列の読み込み
		int[] targetArray = new int[n];
		for (int i = 0; i < n; i++) {
			targetArray[i] = scan.nextInt();
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// シェルソートを実行
		shellSort(targetArray, n);

		// 結果出力
		for (int i = 0; i < targetArray.length; i++) {
			stringBuilder.append(targetArray[i]);
			stringBuilder.append('\n');
		}		System.out.print(stringBuilder.toString());

	}

	/**
	 *
	 * @param array
	 * @param number
	 * @param g
	 * @param cnt
	 * @return
	 */
	private static int insertionSort(int[] array, int number, int g) {

		// gからn-1まで
		int cnt = 0;
		for (int i = g, j = 0; i < number; i++) {
			int temp = array[i];
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
	private static void shellSort (int[] array, int number) {

		// Gの準備
		int[] G = new int[15];

		int gSize = 0;
		for (int i = 1; i <= number; i = i * 3 + 1) {
			// 3g + 1
			G[gSize++] = i;
		}

		// ソートしながら結果出力
		int cnt = 0;
		stringBuilder.append(gSize);
		stringBuilder.append('\n');
		for (int i = gSize - 1; i >= 0 ; i--) {
			stringBuilder.append(G[i]);
			if (i != 0)
				stringBuilder.append(' ');
			cnt += insertionSort(array, number, G[i]);
		}
		G = null;

		// 結果出力
		stringBuilder.append('\n');
		stringBuilder.append(cnt);
		stringBuilder.append('\n');
	}
}

