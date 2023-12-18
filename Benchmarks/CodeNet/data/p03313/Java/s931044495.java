import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int n2 = 1 << n;
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n2];
		for (int i = 0; i < n2; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		List<PriorityQueue<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n2; i++) {
			PriorityQueue<Integer> que = new PriorityQueue<>();
			que.add(a[i]);
			list.add(que);
		}
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n2; i++) {
				if ((i >> j & 1) == 1) {
					PriorityQueue<Integer> que = list.get(i);
					que.addAll(list.get(i & ~(1 << j)));
					while (que.size() > 2) {
						que.poll();
					}
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		int ans = 0;
		for (int i = 1; i < n2; i++) {
			int val = 0;
			for (int o : list.get(i)) {
				val += o;
			}
			ans = Math.max(ans, val);
			pw.println(ans);
		}
		pw.flush();
	}
}
