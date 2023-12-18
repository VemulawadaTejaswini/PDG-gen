import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray(), t = scanner.next().toCharArray();
			Map<Character, Integer> sMap = new HashMap<>(), tMap = new HashMap<>();
			IntStream.range(0, s.length).forEach(i -> {
				sMap.put(s[i], sMap.getOrDefault(s[i], 0) + 1);
				tMap.put(t[i], tMap.getOrDefault(t[i], 0) + 1);
			});
			System.out.println(ok(sMap, tMap) ? "Yes" : "No");
		}
	}

	/**
	 * 文字列sから文字列tを生成できるかを計算する
	 * 
	 * @param sMap 文字列sの文字分布数のマップ
	 * @param tMap 文字列tの文字分布数のマップ
	 * @return 文字列sから文字列tを生成できるか
	 */
	private static boolean ok(Map<Character, Integer> sMap, Map<Character, Integer> tMap) {
		if (sMap.equals(tMap)) {
			return true;
		} else if ((sMap.size() >= tMap.size()) && (tMap.size() < 26)) {
			int[] sCounts = sMap.values().stream().sorted().mapToInt(Integer::intValue).toArray();
			int[] tCounts = tMap.values().stream().sorted().mapToInt(Integer::intValue).toArray();
			List<Integer> sDiffList = new ArrayList<>(), tDiffList = new ArrayList<>();
			int sIndex = 0, tIndex = 0;
			while ((sIndex < sCounts.length) && (tIndex < tCounts.length)) {
				if (sCounts[sIndex] > tCounts[tIndex]) {
					sDiffList.add(sCounts[sIndex++]);
				} else if (tCounts[tIndex] > sCounts[sIndex]) {
					tDiffList.add(tCounts[tIndex++]);
				} else {
					sIndex++;
					tIndex++;
				}
			}
			return ok(sDiffList, tDiffList);
		}
		return false;
	}

	/**
	 * 文字列sから文字列tを生成できるかを計算する
	 * 
	 * @param sDiffList 文字列sの文字分布数の配列
	 * @param tDiffList 文字列tの文字分布数の配列
	 * @return 文字列sから文字列tを生成できるか
	 */
	private static boolean ok(List<Integer> sDiffList, List<Integer> tDiffList) {
		if (tDiffList.size() <= 1) {
			return true;
		}
		int minT = tDiffList.get(0);
		for (int i = 2; i < (1 << sDiffList.size()); i++) {
			int sum = 0;
			for (int j = 0; j < sDiffList.size(); j++) {
				if ((i & (1 << j)) > 0) {
					sum += sDiffList.get(j);
				}
			}
			if (minT == sum) {
				List<Integer> newTList = new ArrayList<>(tDiffList), newSList = new ArrayList<>(sDiffList);
				newTList.remove(minT);
				for (int j = 0; j < sDiffList.size(); j++) {
					if ((i & (1 << j)) > 0) {
						newSList.remove(sDiffList.get(j));
					}
				}
				if (ok(newSList, newTList)) {
					return true;
				}
			}
		}
		return false;
	}
}
