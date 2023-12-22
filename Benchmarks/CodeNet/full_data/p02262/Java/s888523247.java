import java.util.ArrayList;
import java.util.List;
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
		String[] targetArrayOrg = new String[n];

		String target = scan.nextLine();
		for (int i = 0; i < targetArrayOrg.length; i++) {
			targetArrayOrg[i] = target;
			if (i < targetArrayOrg.length - 1) {
				target = scan.nextLine();
			}
		}

		// 読み込み終了
		scan.close();

		int[] targetArray = new int[targetArrayOrg.length];
		for (int i = 0; i < targetArray.length; i++) {
			targetArray[i] = Integer.parseInt(targetArrayOrg[i]);
		}
		targetArrayOrg = null;

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
		List<Integer> G = new ArrayList<>();
		int g = 0;
		while (true) {
			// 3g+1
			g = (3 * g) + 1;
			if (g > number) {
				break;
			}
			G.add(g);
		}

		// 結果出力
		System.out.println(G.size());
		for (int i = G.size() - 1; i >= 0; i--) {
			System.out.print(G.get(i) + (i == 0 ? "\n" : " "));
		}

		int cnt = 0;
		for (int i = G.size() - 1; i >= 0 ; i--) {
			cnt = insertionSort(array, number, G.get(i), cnt);
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

