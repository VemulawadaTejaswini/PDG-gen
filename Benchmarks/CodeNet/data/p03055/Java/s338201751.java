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
		int n = Integer.parseInt(br.readLine());
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n - 1; i++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);

			List<Integer> list1 = map.get(a);
			if (list1 == null) {
				list1 = new ArrayList<Integer>();
				map.put(a, list1);
			}
			list1.add(b);

			List<Integer> list2 = map.get(b);
			if (list2 == null) {
				list2 = new ArrayList<Integer>();
				map.put(b, list2);
			}
			list2.add(a);
		}
		br.close();

		int[] dep = new int[n + 1];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(1);
		dep[1] = 1;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Integer> next = map.get(cur);
			for (Integer i : next) {
				if (dep[i] == 0) {
					que.add(i);
					dep[i] = dep[cur] + 1;
				}
			}
		}

		int max = 0;
		int num = 0;
		for (int i = 1; i < dep.length; i++) {
			if (dep[i] > max) {
				max = dep[i];
				num = i;
			}
		}

		dep = new int[n + 1];
		que = new ArrayDeque<Integer>();
		que.add(num);
		dep[num] = 1;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Integer> next = map.get(cur);
			for (Integer i : next) {
				if (dep[i] == 0) {
					que.add(i);
					dep[i] = dep[cur] + 1;
				}
			}
		}

		max = 0;
		for (int i = 1; i < dep.length; i++) {
			if (dep[i] > max) {
				max = dep[i];
			}
		}

		if (max % 3 == 2) {
			System.out.println("Second");
		} else {
			System.out.println("First");
		}
	}
}
