import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Character, List<Integer>> charIndexMap = new HashMap<Character, List<Integer>>();
		Map<Integer, Integer> golemMap = new HashMap<Integer, Integer>();

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long Q = sc.nextLong();

		char[] sList = sc.next().toCharArray();

		for (int i = 0; i < N; i++) {
			char c = sList[i];

			List<Integer> indexList;
			if (charIndexMap.containsKey(c)) {
				indexList = charIndexMap.get(c);
			} else {
				indexList = new ArrayList<Integer>();
			}
			indexList.add(i);
			charIndexMap.put(c, indexList);

			golemMap.put(i, 1);
		}

		long total = N;
		for (long l = 0; l < Q; l++) {
			char t = sc.next().charAt(0);
			char d = sc.next().charAt(0);

			int move;
			if (d == 'L') {
				move = -1;
			} else {
				move = 1;
			}

			if (!charIndexMap.containsKey(t)) {
				continue;
			}
			List<Integer> moveIndex = charIndexMap.get(t);
			for (int i : moveIndex) {
				if (golemMap.containsKey(i + move)) {
					golemMap.put(i + move, golemMap.get(i + move) + golemMap.get(i));
				} else {
					total -= golemMap.get(i);
				}

				golemMap.put(i, 0);
			}
		}

		System.out.println(total);
	}

}