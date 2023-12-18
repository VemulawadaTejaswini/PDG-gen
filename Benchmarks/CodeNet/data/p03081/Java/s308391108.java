import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		Map<String, List<Integer>> numMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String si = s.substring(i, i + 1);

			if (!numMap.containsKey(si)) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				numMap.put(si, list);
			} else {
				List<Integer> list = numMap.get(si);
				list.add(i);
				numMap.put(si, list);
			}
		}
		// System.out.println("numMap " + numMap);

		int[] golemNum = new int[n];
		for (int i = 0; i < n; i++) {
			golemNum[i] = 1;
		}

		int totalNum = n;

		for (int i = 0; i < q; i++) {
			String ti = sc.next();
			String di = sc.next();
			// System.out.println("totalNum " + totalNum);
			if (!numMap.containsKey(ti)) {
				continue;
			}
			List<Integer> list = numMap.get(ti);
			if (di.equals("L")) {
				for (int j = 0; j < list.size(); j++) {
					int curPosition = list.get(j);
					int curGolemNum = golemNum[curPosition];
					// System.out.println("curGolemNum " + curGolemNum);
					if (curPosition == 0) {
						totalNum = totalNum - curGolemNum;
					} else {
						golemNum[curPosition - 1] = golemNum[curPosition - 1] + curGolemNum;
					}
					golemNum[curPosition] = 0;
				}
			} else {
				// Rの場合
				for (int j = list.size() - 1; j >= 0; j--) {
					int curPosition = list.get(j);
					int curGolemNum = golemNum[curPosition];
					// System.out.println("curGolemNum " + curGolemNum);
					if (curPosition == n - 1) {
						totalNum = totalNum - curGolemNum;
					} else {
						golemNum[curPosition + 1] = golemNum[curPosition + 1] + curGolemNum;
					}
					golemNum[curPosition] = 0;
				}
			}

		}
		System.out.println(totalNum);

	}
}
