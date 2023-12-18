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

		// 最大値を超えるような条件は与えられない
//		double max = Math.pow(10, 100);

		int N = s.length();
		// 文字列を繰り返しておく
		s = s.concat(s);
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		int lastIndex = 0;
		long loopCnt = 0;
		boolean notExists = false;

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

		for (char c : tChars) {
			if (s.indexOf(c) == -1) {
				notExists = true;
			}
		}

		if (notExists) {
			System.out.println(-1);
		}
		else {
			Map<Character, Integer> beforeMap = new HashMap<>();
			for (char c : tChars) {
				tmpL = map.get(c);
				int start = 0;
				Integer tmp = beforeMap.get(c);
				if (tmp != null) {
					start = tmp + 1;
					if (tmpL.get(tmp) >= N) {
					}
				}
				// 続きから後ろを確認
				for (int i = start; i < tmpL.size(); i++) {
					if (tmpL.get(i) >= lastIndex) {
						beforeMap.clear();
						if (tmpL.get(i) >= N) {
							loopCnt++;
							beforeMap.put(c, (i + 1) / 2);
						}
						else {
							beforeMap.put(c, i);
						}
						lastIndex = (tmpL.get(i) + 1) % N;
						break;
					}
				}
			}
			System.out.println(N * loopCnt + lastIndex);
		}
	}
}
