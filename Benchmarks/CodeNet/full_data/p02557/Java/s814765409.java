import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	static int[] c;
	static Map<Integer, Set<Integer>> mapc;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			c[a[i]]++;
			c[b[i]]++;
		}
		for (int i = 1; i <= n; i++) {
			if (c[i] > n) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

		Map<Integer, Set<Integer>> mapa = make(a);
		Map<Integer, Set<Integer>> mapb = make(b);
		mapc = make(c);
		mapc.remove(0);

		List<Obj> list = new ArrayList<>(n);
		for (int i = n; i > 0; i--) {
			Obj o = new Obj();
			Set<Integer> set = mapc.get(i);
			if (set == null) {
				set = mapc.values().iterator().next();
			}
			Integer v = set.iterator().next();
			Integer ia = pollIdx(mapa, v);
			if (ia == null) {
				o.a = pollIdxNot(mapa, v);
				o.b = pollIdx(mapb, v);
			} else {
				o.a = ia;
				o.b = pollIdxNot(mapb, v);
			}
			list.add(o);
		}

		Collections.sort(list, (o1, o2) -> o1.a - o2.a);
		StringBuilder sb = new StringBuilder();
		for (Obj o : list) {
			sb.append(b[o.b]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static Integer pollIdxNot(Map<Integer, Set<Integer>> map, Integer val) {
		for (Integer key : map.keySet()) {
			if (!key.equals(val)) {
				return pollIdx(map, key);
			}
		}
		return null;
	}

	static Integer pollIdx(Map<Integer, Set<Integer>> map, Integer val) {
		Set<Integer> set = map.get(val);
		if (set == null) {
			return null;
		}
		Integer idx = set.iterator().next();
		set.remove(idx);
		if (set.isEmpty()) {
			map.remove(val);
		}
		sub(val);
		return idx;
	}

	static void sub(int v) {
		int num = c[v];
		Set<Integer> set = mapc.get(num);
		set.remove(v);
		if (set.isEmpty()) {
			mapc.remove(num);
		}

		Set<Integer> set1 = mapc.get(num - 1);
		if (set1 == null) {
			set1 = new HashSet<>();
		}
		set1.add(v);
		mapc.put(num - 1, set1);
		c[v]--;
	}

	static Map<Integer, Set<Integer>> make(int[] x) {
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < x.length; i++) {
			Set<Integer> set = map.get(x[i]);
			if (set == null) {
				set = new HashSet<>();
				map.put(x[i], set);
			}
			set.add(i);
		}
		return map;
	}

	static class Obj {
		int a, b;
	}
}
