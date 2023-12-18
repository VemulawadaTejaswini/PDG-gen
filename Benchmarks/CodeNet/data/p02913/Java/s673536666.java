import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			// すべての文字の出現indexをlistに保存
			Map<Character, List<Integer>> map = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				List<Integer> list = map.get(s[i]);
				if (null == list) {
					list = new ArrayList<>();
					map.put(s[i], list);
				}
				list.add(i);
			});
			int max = 0;
			for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
				List<Integer> list = entry.getValue();
				for (int i = 0; i < list.size() - 1; i++) {
					for (int j = i + 1; j < list.size(); j++) {
						max = Math.max(max, sameLength(s, list.get(i), list.get(j)));
					}
				}
			}
			System.out.println(max);
		}
	}

	/**
	 * @param s
	 * @param i
	 * @param j
	 * @return sのiからの部分列とjからの部分列の一致する最大の長さ
	 */
	private static int sameLength(char[] s, int i, int j) {
		for (int k = 1; k < Math.min(s.length - j, j - i); k++) {
			if (s[i + k] != s[j + k]) {
				return k;
			}
		}
		return Math.min(s.length - j, j - i);
	}
}
