import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.x = Integer.parseInt(sa[0]);
			o.y = Integer.parseInt(sa[1]);
			o.u = sa[2];
			arr[i] = o;
		}
		br.close();

		int ans = Integer.MAX_VALUE;

		// 上下
		TreeMap<Integer, TreeSet<Obj>> map1 = new TreeMap<>();
		TreeMap<Integer, TreeSet<Obj>> map2 = new TreeMap<>();
		for (Obj o : arr) {
			if ("U".equals(o.u)) {
				TreeSet<Obj> set = map1.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 map1.put(o.x, set);
				}
				set.add(o);
			}
			if ("D".equals(o.u)) {
				TreeSet<Obj> set = map2.get(o.x);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.y - o2.y);
					 map2.put(o.x, set);
				}
				set.add(o);
			}
		}
		for (Integer x : map1.keySet()) {
			TreeSet<Obj> set1 = map1.get(x);
			TreeSet<Obj> set2 = map2.get(x);
			if (set2 != null) {
				for (Obj o1 : set1) {
					Obj o2 = set2.higher(o1);
					if (o2 != null) {
						int val = (o2.y - o1.y) * 5;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 左右
		map1 = new TreeMap<>();
		map2 = new TreeMap<>();
		for (Obj o : arr) {
			if ("R".equals(o.u)) {
				TreeSet<Obj> set = map1.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map1.put(o.y, set);
				}
				set.add(o);
			}
			if ("L".equals(o.u)) {
				TreeSet<Obj> set = map2.get(o.y);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map2.put(o.y, set);
				}
				set.add(o);
			}
		}
		for (Integer y : map1.keySet()) {
			TreeSet<Obj> set1 = map1.get(y);
			TreeSet<Obj> set2 = map2.get(y);
			if (set2 != null) {
				for (Obj o1 : set1) {
					Obj o2 = set2.higher(o1);
					if (o2 != null) {
						int val = (o2.x - o1.x) * 5;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 下-左右
		TreeMap<Integer, TreeSet<Obj>> map = new TreeMap<>();
		map1 = new TreeMap<>();
		map2 = new TreeMap<>();
		for (Obj o : arr) {
			if ("D".equals(o.u)) {
				o.val = o.y + o.x;
				TreeSet<Obj> set = map.get(o.val);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map.put(o.val, set);
				}
				set.add(o);
			}
			if ("R".equals(o.u)) {
				o.val = o.y - o.x;
				TreeSet<Obj> set = map1.get(o.val);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map1.put(o.val, set);
				}
				set.add(o);
			}
			if ("L".equals(o.u)) {
				o.val = o.y + o.x;
				TreeSet<Obj> set = map2.get(o.val);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map2.put(o.val, set);
				}
				set.add(o);
			}
		}
		for (Integer v : map.keySet()) {
			TreeSet<Obj> set = map.get(v);
			TreeSet<Obj> set1 = map1.get(v);
			if (set1 != null) {
				for (Obj o : set) {
					Obj o1 = set1.lower(o);
					if (o1 != null) {
						int val = (o.x - o1.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
			TreeSet<Obj> set2 = map2.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.higher(o);
					if (o2 != null) {
						int val = (o2.x - o.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		// 上-左右
		map = new TreeMap<>();
		for (Obj o : arr) {
			if ("U".equals(o.u)) {
				o.val = o.y - o.x;
				TreeSet<Obj> set = map.get(o.val);
				if (set == null) {
					 set = new TreeSet<Obj>((o1, o2) -> o1.x - o2.x);
					 map.put(o.val, set);
				}
				set.add(o);
			}
		}
		for (Integer v : map.keySet()) {
			TreeSet<Obj> set = map.get(v);
			TreeSet<Obj> set1 = map1.get(v);
			if (set1 != null) {
				for (Obj o : set) {
					Obj o1 = set1.lower(o);
					if (o1 != null) {
						int val = (o.x - o1.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
			TreeSet<Obj> set2 = map2.get(v);
			if (set2 != null) {
				for (Obj o : set) {
					Obj o2 = set2.higher(o);
					if (o2 != null) {
						int val = (o2.x - o.x) * 10;
						ans = Math.min(ans, val);
					}
				}
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println("SAFE");
		} else {
			System.out.println(ans);
		}
	}

	static class Obj {
		int x, y, val;
		String u;
	}
}
