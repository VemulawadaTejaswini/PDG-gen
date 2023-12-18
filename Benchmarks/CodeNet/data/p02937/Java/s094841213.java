import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		long N = s.length();
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		long lastIndex = 0;
		long loopCnt = 0;

		// 文字と要素番号をマップに格納
		Map<Character, List<Integer>> map = new HashMap<>();
		List<Integer> tmpL = new ArrayList<>();
		for (int i = 0; i < sChars.length; i++) {
			tmpL = map.get(sChars[i]);
			if (tmpL == null) {
				tmpL = new ArrayList<>();
				map.put(sChars[i], tmpL);
			}
			tmpL.add(i);
		}

		// 文字列ｔの文字が文字列ｓに含まれるかチェック
		for (char c : tChars) {
			if (!map.containsKey(c)) {
				System.out.println(-1);
				return;
			}
		}

		Map<Character, Integer> beforeMap = new HashMap<>();
		long ans = 0;
		boolean exists = false;
		int start = 0;
		for (char c : tChars) {
			tmpL = map.get(c);
			Integer tmpI = beforeMap.get(c);
			if (tmpI != null) {
				start = tmpI + 1;
			}
			beforeMap.clear();

			// 続きから後ろを確認
			for (int i = start; i < tmpL.size(); i++) {
				if (tmpL.get(i) > lastIndex) {
					lastIndex = tmpL.get(i);
					beforeMap.put(c, i);
					exists = true;
					break;
				}
			}
			if (!exists) {
				loopCnt++;
				lastIndex = tmpL.get(0);
				beforeMap.put(c, 0);
			}
			else {
				exists = false;
			}
			start = 0;
		}
		ans = (long)(N * loopCnt + lastIndex + 1);
		System.out.println(ans);
	}
}
