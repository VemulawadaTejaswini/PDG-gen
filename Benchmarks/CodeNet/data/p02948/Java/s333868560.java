import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<>(m + 1);
		for (int i = 0; i <= m; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			list.get(a).add(b);
		}
		br.close();

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		int ans = 0;
		for (int i = 1; i <= m; i++) {
			for (Integer o : list.get(i)) {
				pq.add(o);
			}
			if (!pq.isEmpty()) {
				ans += pq.poll();
			}
		}
		System.out.println(ans);
	}
}
