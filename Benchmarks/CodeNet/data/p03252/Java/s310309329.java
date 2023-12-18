import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String T = in.nextLine();

		Map<Character, Integer> sCount = new ConcurrentHashMap<>();
		Map<Character, Integer> tCount = new ConcurrentHashMap<>();
		for (int i = 0; i < S.length(); ++i) {
			Character c = S.charAt(i);
			if (!sCount.containsKey(c)) {
				sCount.put(c, 1);
			} else {
				sCount.put(c, sCount.get(c) + 1);
			}
		}
		for (int i = 0; i < T.length(); ++i) {
			Character c = T.charAt(i);
			if (!tCount.containsKey(c)) {
				tCount.put(c, 1);
			} else {
				tCount.put(c, tCount.get(c) + 1);
			}
		}
		List<Integer> sList = new ArrayList<>(sCount.size());
		List<Integer> tList = new ArrayList<>(tCount.size());
		sList.addAll(sCount.values());
		tList.addAll(tCount.values());
		Collections.sort(sList);
		Collections.sort(tList);
		boolean result = true;
		if (sList.size() < tList.size()) {
			result = false;
		} else if (sList.size() == tList.size()) {
			for (int i = 0; i < sList.size(); ++i) {
				if (sList.get(i) != tList.get(i)) {
					result = false;
					break;
				}
			}
		} else {
			// 複数の要素を1つにマッピングすることで対応可能か判定
			List<Integer> sOnly = new ArrayList<>();
			List<Integer> tOnly = new ArrayList<>();
			sOnly.addAll(sList);
			sOnly.removeAll(tList);
			tOnly.addAll(tList);
			tOnly.removeAll(sList);
			Collections.sort(sOnly);
			Collections.reverse(sOnly);
			Collections.sort(tOnly);
			Collections.reverse(tOnly);
			// sOnlyとtOnlyの間で対応がとれるかどうか
			result = checkMatch(sOnly, tOnly);
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}

	private static boolean checkMatch(List<Integer> sOnly, List<Integer> tOnly) {
		if(sOnly.isEmpty() || tOnly.isEmpty()) {
			return false;
		}
		if (sOnly.get(0) > tOnly.get(0)) {
			// 対応するものがない
			return false;
		}
		boolean[] select = new boolean[sOnly.size()];
		Arrays.fill(select, false);
		select[0] = true;
		int val = sOnly.get(0);
		for (int i = 1; i < sOnly.size(); ++i) {
			if (val + sOnly.get(i) <= tOnly.get(0)) {
				val += sOnly.get(i);
				select[i] = true;
			}
		}
		if (val != tOnly.get(0)) {
			// 対応するものがない
			return false;
		} else {
			// 対応するものがあった．
			// 残りの候補で，さらに探す
			List<Integer> newSOnly = new ArrayList<>();
			for (int i = 1; i < sOnly.size(); ++i) {
				if (!select[i]) {
					newSOnly.add(sOnly.get(i));
				}
			}
			return checkMatch(newSOnly, tOnly.subList(1, tOnly.size()));
		}
	}
}