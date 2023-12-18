import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		int[] inCnt = new int[n];
		for (int i = 0; i < n - 1 + m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			inCnt[b]++;
		}
		br.close();

		int[] parent = new int[n];
		Queue<Integer> que = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			if (inCnt[i] == 0) {
				que.add(i);
				parent[i] = -1;
			}
		}
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int i : list.get(cur)) {
				inCnt[i]--;
				if (inCnt[i] == 0) {
					que.add(i);
					parent[i] = cur;
				}
			}
		}
		for (int i : parent) {
			System.out.println(i + 1);
		}
	}
}
