import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static final char GU = 'g';
	private static final char PA = 'p';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.nextLine().toCharArray();
			Map<List<Integer>, Integer> map = new HashMap<>();
			System.out.println(getResult(0, 0, s, map));
		}
	}

	/**
	 * @param gCount グーを出した回数
	 * @param pCount パーを出した回数
	 * @param s      TopCoDeerくんが出す手
	 * @param map    計算結果を保存するマップ
	 * @return AtCoDeerくんの最大得点
	 */
	private static int getResult(int gCount, int pCount, char[] s, Map<List<Integer>, Integer> map) {
		List<Integer> key = Arrays.asList(gCount, pCount);
		Integer result = map.get(key);
		if (null == result) {
			if (pCount + gCount >= s.length) {
				result = 0;
			} else {
				if (pCount < gCount) {
					result = Math.max(getResult(gCount, pCount + 1, s, map) + calcResult(PA, s[gCount + pCount]),
							getResult(gCount + 1, pCount, s, map) + calcResult(GU, s[gCount + pCount]));
				} else {
					result = getResult(gCount + 1, pCount, s, map) + calcResult(GU, s[gCount + pCount]);
				}
			}
			map.put(key, result);
		}
		return result;
	}

	/**
	 * @param me  AtCoDeerくんが出した手
	 * @param you TopCoDeerくんが出した手
	 * @return AtCoDeerくんの得点
	 */
	private static int calcResult(char me, char you) {
		if ((GU == me) && (PA == you)) {
			return -1;
		} else if ((PA == me) && (GU == you)) {
			return 1;
		}
		return 0;
	}
}
