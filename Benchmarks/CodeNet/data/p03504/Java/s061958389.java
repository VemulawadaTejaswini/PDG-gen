import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
//		int c = Integer.parseInt(sa[1]);
		Map<Integer, TreeMap<Integer, Obj>> map = new HashMap<Integer, TreeMap<Integer, Obj>>();
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.s = Integer.parseInt(sa[0]) - 1;
			o.t = Integer.parseInt(sa[1]);
			o.c = Integer.parseInt(sa[2]);
			TreeMap<Integer, Obj> map2 = map.get(o.c);
			if (map2 == null) {
				map2 = new TreeMap<Integer, Obj>();
				map.put(o.c, map2);
			}
			map2.put(o.s, o);
		}
		br.close();

		for (Integer k1 : map.keySet()) {
			TreeMap<Integer, Obj> map2 = map.get(k1);
			Integer[] k2 = map2.keySet().toArray(new Integer[0]);
			for (int i = 0; i < k2.length - 1; i++) {
				Obj o1 = map2.get(k2[i]);
				Obj o2 = map2.get(k2[i + 1]);
				if (o1.t == o2.s + 1) {
					o2.s = o1.s;
					map2.remove(k2[i]);
				}
			}
		}

		int[] cnt = new int[100001];
		for (Integer k1 : map.keySet()) {
			TreeMap<Integer, Obj> map2 = map.get(k1);
			for (Integer k2 : map2.keySet()) {
				Obj o = map2.get(k2);
				cnt[o.s]++;
				cnt[o.t]--;
			}
		}
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}

		int ans = 0;
		for (int i = 1; i < cnt.length; i++) {
			ans = Math.max(ans, cnt[i]);
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj>{
		int s, t, c;

		public int compareTo(Obj o) {
			return s - o.s;
		}
	}
}
