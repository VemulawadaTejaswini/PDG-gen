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
		Map<Integer, List<Hen>> map = new HashMap<Integer, List<Hen>>();
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			Hen hen = new Hen();
			hen.a = Integer.parseInt(sa[0]);
			hen.b = Integer.parseInt(sa[1]);
			hen.c = Integer.parseInt(sa[2]);

			List<Hen> listA = map.get(hen.a);
			if (listA == null) {
				listA = new ArrayList<Hen>();
				map.put(hen.a, listA);
			}
			listA.add(hen);

			List<Hen> listB = map.get(hen.b);
			if (listB == null) {
				listB = new ArrayList<Hen>();
				map.put(hen.b, listB);
			}
			listB.add(hen);
		}

		String[] sa = br.readLine().split(" ");
		int q = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);

		long[] d = new long[n + 1];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(k);
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Hen> list = map.get(cur);
			for (Hen o : list) {
				if (o.a == cur) {
					if (d[o.b] == 0 && o.b != k) {
						que.add(o.b);
						d[o.b] = d[o.a] + o.c; 
					}
				} else {
					if (d[o.a] == 0 && o.a != k) {
						que.add(o.c);
						d[o.a] = d[o.b] + o.c; 
					}
				}
			}
		}

		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]);
			System.out.println(d[x] + d[y]);
		}
		br.close();
	}

	static class Hen {
		int a, b, c;
	}
}
