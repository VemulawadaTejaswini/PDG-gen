import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();

		int sLen = s.length();
		int tLen = t.length();

		HashMap<Character, ArrayList<Integer>> posMap = new HashMap<Character, ArrayList<Integer>>();
		ArrayList<Integer> poss;
		int idx;
		for (idx = 0; idx < sLen; idx++) {
			poss = posMap.get(schar[idx]);
			if (poss == null) {
				poss = new ArrayList<Integer>();
				posMap.put(schar[idx], poss);
			}
			poss.add(idx);
		}

		// 探索
		int curLoops = 0;
		int curPos = -1; // 0文字目に対応できるよう最初だけ-1
		int chPos;
		for (idx = 0; idx < tLen; idx++) {
			poss = posMap.get(tchar[idx]);
			if (poss == null) {
				// 解なし
				System.out.println("-1");
				return;
			}
			chPos = poss.get(0);
			for (int pos : poss) {
				if (curPos < pos) {
					chPos = pos;
					break;
				}
			}
			if (curPos >= chPos) {
				++curLoops;
			}
			curPos = chPos;
		}

		long answer = ((long) curLoops) * ((long) sLen) + ((long) curPos) + 1L;

		System.out.println(answer);

	}

}
