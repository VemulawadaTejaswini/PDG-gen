import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	/** 方向変換するときの文字 */
	private static final char TRANSFER = 'T';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int[][] step = new int[2][s.length / 2 + 1];
			IntStream.range(0, 2).forEach(i -> Arrays.fill(step[i], 0));
			// X軸ステップとY軸ステップ数の数
			int[] number = new int[2];
			number[0] = 0;
			number[1] = 1;
			int current = 0;
			int count = 0;
			for (char c : s) {
				if (TRANSFER == c) {
					step[current][number[current]] = count;
					number[current]++;
					count = 0;
					current = 1 - current;
				} else {
					count++;
				}
			}
			if (count > 0) {
				step[current][number[current]] = count;
				number[current]++;
			}
			System.out.println(
					(ok(number[0] - 1, step[0], x, new HashMap<>()) && ok(number[1] - 1, step[1], y, new HashMap<>()))
							? "Yes"
							: "No");
		}
	}

	/**
	 * あるステップ数後に目的地が達成できるかどうかを計算
	 * 
	 * @param index       ステップ数（0-index）
	 * @param step        ステップ一覧
	 * @param destination 目的値
	 * @param map         計算結果を保存するマップ
	 * @return あるステップ数後に目的地が達成できるかどうか
	 */
	private static boolean ok(final int index, final int[] step, final int destination,
			Map<List<Integer>, Boolean> map) {
		if (0 == index) {
			return step[0] == destination;
		}
		List<Integer> key = Arrays.asList(index, destination);
		Boolean result = map.get(key);
		if (null == result) {
			result = ok(index - 1, step, destination - step[index], map)
					|| ok(index - 1, step, destination + step[index], map);
			map.put(key, result);
		}
		return result;
	}
}
