import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
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
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			putMap(map, a, b);
			putMap(map, b, a);
		}
		String[] sa = br.readLine().split(" ");
		List<Integer> c = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			c.add(Integer.parseInt(sa[i]));
		}
		br.close();

		Collections.sort(c);
		Collections.reverse(c);

		PrintWriter pw = new PrintWriter(System.out);

		long m = 0;
		for (int i = 1; i < c.size(); i++) {
			m += c.get(i);
		}
		pw.println(m);

		int[] d = new int[n];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		d[0] = c.get(0);
		int idx = 1;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			List<Integer> list = map.get(cur);
			for (int i = 0; i < list.size(); i++) {
				if (d[list.get(i)] == 0) {
					que.add(list.get(i));
					d[list.get(i)] = c.get(idx);
					idx++;
				}
			}
		}

		pw.print(d[0]);
		for (int i = 1; i < d.length; i++) {
			pw.print(" " + d[i]);
		}
		pw.println();
		pw.flush();
	}

	static void putMap(Map<Integer, List<Integer>> map, int a, int b) {
		List<Integer> listA = map.get(a);
		if (listA == null) {
			listA = new ArrayList<Integer>();
			map.put(a, listA);
		}
		listA.add(b);
	}
}
