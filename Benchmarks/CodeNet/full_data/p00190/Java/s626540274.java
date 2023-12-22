
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int[][] map = { { 2 }, { 2, 5 }, { 0, 1, 3, 6 }, { 2, 7 }, { 5 },
				{ 1, 4, 6, 9 }, { 2, 5, 7, 10 }, { 3, 6, 8, 11 }, { 7 },
				{ 5, 10 }, { 6, 9, 11, 12 }, { 7, 10 }, { 10 } };
		String reslt = "0ABCDEFGHIJK0";
		Map<String, Integer> memo = new HashMap<String, Integer>();
		memo.put(reslt, 0);
		int step = 1;
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer(reslt);
		while (step <= 10) {
			int size = deque.size();
			while (size-- > 0) {
				char[] chs = deque.pop().toCharArray();
				for (int i = 0; i < 13; i++) {
					if (chs[i] == '0') {
						for (int j : map[i]) {
							chs[i] = chs[j];
							chs[j] = '0';
							String tmp = String.valueOf(chs);
							if (!memo.containsKey(tmp)) {
								memo.put(tmp, step);
								deque.offer(tmp);
							}
							chs[j] = chs[i];
							chs[i] = '0';
						}
					}
				}
			}
			step++;
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == -1)
				break;
			char[] cs = new char[13];
			cs[0] = n == 0 ? '0' : (char) (n - 1 + 'A');
			for (int i = 1; i < 13; i++) {
				int c = scanner.nextInt();
				cs[i] = c == 0 ? '0' : (char) (c - 1 + 'A');
			}
			String s = String.valueOf(cs);
			Set<String> set = new HashSet<String>();
			set.add(s);
			int ans = slove(0, map, memo, s, set);
			System.out.println(ans == -1 ? "NA" : String.valueOf(ans));
		}
	}

	int slove(int k, int[][] map, Map<String, Integer> memo, String str,
			Set<String> set) {
		if (k == 11) {
			return -1;
		}
		if (memo.containsKey(str)) {
			return memo.get(str) + k;
		}
		char[] chs = str.toCharArray();
		for (int i = 0; i < 13; i++) {
			if (chs[i] == '0') {
				for (int j : map[i]) {
					chs[i] = chs[j];
					chs[j] = '0';
					String tmp = String.valueOf(chs);
					if (!set.contains(tmp)) {
						set.add(tmp);
						slove(k + 1, map, memo, tmp, set);
					}
				}
			}
		}

		return -1;

	}
}