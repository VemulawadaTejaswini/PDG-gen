import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		int[] rem = new int[4];
		int n2 = n / 3;
		rem[1] = n2;
		rem[2] = n2;
		rem[3] = n2;
		int n3 = n % 3;
		if (n3 > 0) rem[1]++;
		if (n3 > 1) rem[2]++;

		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			Queue<Integer> que = new ArrayDeque<>();
			que.add(i);
			int[] dep = new int[n];
			dep[i] = 1;
			Set<Integer> set = new HashSet<>();
			while (!que.isEmpty()) {
				int cur = que.poll();
				for (int next : list.get(cur)) {
					if (dep[next] == 0) {
						dep[next] = dep[cur] + 1;
						if (dep[cur] == 3) {
							set.add(ans[next]);
						} else {
							que.add(next);
						}
					}
				}
			}
			if (set.contains(2)) {
				ans[i] = 3;
			} else if (set.contains(1)) {
				ans[i] = 2;
			} else {
				ans[i] = 1;
			}
		}

		for (int i = 0; i < n; i++) {
			if (rem[ans[i]] > 0) {
				rem[ans[i]]--;
				ans[i] = rem[ans[i]] * 3 + ans[i];
			} else {
				ans[i] = rem[3] * 3;
				rem[3]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
