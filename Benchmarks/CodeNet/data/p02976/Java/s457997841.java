import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;

			List<Integer> list1 = map.get(a);
			if (list1 == null) {
				list1 = new ArrayList<>();
				map.put(a, list1);
			}
			list1.add(b);

			List<Integer> list2 = map.get(b);
			if (list2 == null) {
				list2 = new ArrayList<>();
				map.put(b, list2);
			}
			list2.add(a);
		}
		br.close();

		int[] v = new int[n];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		v[0] = 1;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Integer> list = map.get(cur);
			if (list.size() % 2 == 1) {
				System.out.println(-1);
				return;
			}
			int vn = 3 - v[cur];
			for (int i : list) {
				if (v[i] == 0) {
					que.add(i);
					v[i] = vn;
				} else if (v[i] != vn) {
					System.out.println(-1);
					return;
				}
			}
		}

		for (int i = 0; i < v.length; i++) {
			if (v[i] == 1) {
				List<Integer> list = map.get(i);
				for (int j = 0; j < list.size(); j++) {
					System.out.println((i + 1) + " " + (list.get(j) + 1));
				}
			}
		}
	}
}
