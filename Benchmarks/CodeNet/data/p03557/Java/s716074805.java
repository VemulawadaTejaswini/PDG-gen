import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n], b = new int[n], c = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			IntStream.range(0, n).forEach(i -> b[i] = scanner.nextInt());
			IntStream.range(0, n).forEach(i -> c[i] = scanner.nextInt());
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			Map<Integer, Integer> aIndexMap = new HashMap<>(), bIndexMap = new HashMap<>();
			System.out.println(IntStream.range(0, n).map(i -> getResult(n, a[i], b, aIndexMap, c, bIndexMap)).sum());
		}
	}

	/**
	 * 入力数字で始まるパーツの組合せ数を計算する
	 * 
	 * @param n         配列の長さ
	 * @param ai        入力数字
	 * @param b         検索対象の配列
	 * @param aIndexMap 検索結果を保存するマップ
	 * @param c         次のレベルの検索検索対象配列
	 * @param bIndexMap 次のレベルの検索結果を保存するマップ
	 * @return 入力数字で始まるパーツの組合せ数
	 */
	private static int getResult(int n, int ai, int[] b, Map<Integer, Integer> aIndexMap, int[] c,
			Map<Integer, Integer> bIndexMap) {
		Integer result = aIndexMap.get(ai);
		if (null == result) {
			result = Arrays.binarySearch(b, ai);
			if (result < 0) {
				result = (-result) - 1;
			} else {
				while ((b[result] == ai) && (result < n)) {
					result++;
				}
			}
			if ((null != c) && (null != bIndexMap)) {
				result = IntStream.range(result, n).map(i -> getResult(n, b[i], c, bIndexMap, null, null)).sum();
			} else {
				result = n - result;
			}
			aIndexMap.put(ai, result);
		}
		return result;
	}
}
