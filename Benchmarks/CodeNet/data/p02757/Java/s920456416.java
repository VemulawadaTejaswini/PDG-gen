import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int p = Integer.parseInt(sa[1]);
		char[] s = br.readLine().toCharArray();
		br.close();

		long ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(0)) {
				map.put(0, map.get(0) + 1);
			} else {
				map.put(0, 1);
			}
			Map<Integer, Integer> work = new HashMap<>();
			for (Integer key : map.keySet()) {
				int next = key * 10 + (s[i] - '0');
				next %= p;
				int num = map.get(key);
				if (next == 0) {
					ans += num;
				}
				if (work.containsKey(next)) {
					work.put(next, work.get(next) + num);
				} else {
					work.put(next, num);
				}
			}
			map = work;
		}
		System.out.println(ans);
	}
}
