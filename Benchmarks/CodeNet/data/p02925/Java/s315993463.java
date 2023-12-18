import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Queue<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Queue<Integer> que = new ArrayDeque<>();
			map.put(i, que);
			for (int j = 0; j < sa.length; j++) {
				que.add(Integer.parseInt(sa[j]) - 1);
			}
		}
		br.close();

		int ans = 0;
		Set<Integer> set = new HashSet<>();
		while (true) {
			ans++;
			boolean[] flg = new boolean[n];
			boolean flg2 = false;
			Set<Integer> set2 = new HashSet<>();
			boolean sFlg = set.isEmpty();
			Integer[] keys = map.keySet().toArray(new Integer[0]);
			for (int i : keys) {
				if (flg[i]) {
					continue;
				}
				if (!sFlg && set.isEmpty()) {
					break;
				}
				Queue<Integer> que = map.get(i);
				int o = que.peek();

				if (flg[o]) {
					set2.add(o);
					continue;
				}
				Queue<Integer> que2 = map.get(o);
				int o2 = que2.peek();

				if (o2 == i) {
					que.poll();
					que2.poll();
					flg[o] = true;
					flg[o2] = true;
					flg2 = true;
					if (que.isEmpty()) {
						map.remove(i);
					} else {
						set2.add(que.peek());
					}
					if (que2.isEmpty()) {
						map.remove(o);
					} else {
						set2.add(que2.peek());
					}
					set.remove(o);
					set.remove(o2);
				} else {
					set2.add(o2);
				}
			}
			if (map.isEmpty()) {
				break;
			}
			set.clear();
			set.addAll(set2);
			if (!flg2) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans);
	}
}
