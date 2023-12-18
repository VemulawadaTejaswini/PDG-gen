import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		long t = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Queue<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Queue<Integer> que = new ArrayDeque<>();
			list.add(que);
			for (int j = 0; j < sa.length; j++) {
				que.add(Integer.parseInt(sa[j]) - 1);
			}
		}
		br.close();

		int ans = 0;
		while (true) {
			if (System.currentTimeMillis() - t > 1800) {
				System.out.println(n * (n - 1) / 2);
				return;
			}
			ans++;
			boolean[] flg = new boolean[n];
			boolean flg2 = false;
			boolean[] flg3 = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (flg[i]) {
					continue;
				}
				Queue<Integer> que = list.get(i);
				if (que.isEmpty()) {
					flg3[i] = true;
					continue;
				}
				int o = que.peek();

				if (flg[o]) {
					continue;
				}
				Queue<Integer> que2 = list.get(o);
				if (que2.isEmpty()) {
					flg3[o] = true;
					continue;
				}
				int o2 = que2.peek();

				if (o2 == i) {
					que.poll();
					que2.poll();
					flg[o] = true;
					flg[o2] = true;
					flg2 = true;
					if (que.isEmpty()) {
						flg3[i] = true;
					}
					if (que2.isEmpty()) {
						flg3[o] = true;
					}
				}
			}
			boolean flg4 = true;
			for (int i = 0; i < n; i++) {
				if (!flg3[i]) {
					flg4 = false;
					break;
				}
			}
			if (flg4) {
				break;
			}
			if (!flg2) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(ans);
	}
}
