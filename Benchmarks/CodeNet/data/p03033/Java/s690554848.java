import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		TreeMap<Long, Kouji> map = new TreeMap<Long, Kouji>();
		for (int i = 0; i < n; i++) {
			Kouji o = new Kouji();
			o.s = sc.nextLong();
			o.t = sc.nextLong();
			o.x = sc.nextLong();
			o.s = Math.max(o.s - o.x, 0);
			o.t = Math.max(o.t - o.x, 0);
			if (map.containsKey(o.s)) {
				Kouji o2 = map.get(o.s);
				if (o.x < o2.x) {
					map.put(o.s, o);
					if (o.t < o2.t) {
						o2.s = o.t;
						map.put(o2.s, o2);
					}
				} else {
					if (o.t > o2.t) {
						o.s = o2.t;
						map.put(o.s, o);
					}
				}
			} else {
				map.put(o.s, o);
			}
		}
		long[] d = new long[q];
		for (int i = 0; i < q; i++) {
			d[i] = sc.nextLong();
		}
		sc.close();

		for (int i = 0; i < q; i++) {
			Long k = map.floorKey(d[i]);
			if (k == null) {
				System.out.println(-1);
			} else {
				Kouji o = map.get(k);
				if (d[i] >= o.t) {
					System.out.println(-1);
				} else {
					System.out.println(o.x);
				}
			}
		}
	}

	static class Kouji {
		long s, t, x, z;
	}
}
