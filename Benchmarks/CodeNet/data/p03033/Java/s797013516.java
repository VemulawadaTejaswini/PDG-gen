import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		Kouji[] arr = new Kouji[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Kouji o = new Kouji();
			o.s = Long.parseLong(sa[0]);
			o.t = Long.parseLong(sa[1]);
			o.x = Long.parseLong(sa[2]);
			arr[i] = o;
		}
		long[] d = new long[q];
		for (int i = 0; i < q; i++) {
			d[i] = Long.parseLong(br.readLine());
		}
		br.close();

		Arrays.parallelSort(arr);

		TreeMap<Long, Kouji> map = new TreeMap<Long, Kouji>();
		for (int i = 0; i < n; i++) {
			Kouji o = arr[i];
			o.s = Math.max(o.s - o.x, 0);
			o.t = Math.max(o.t - o.x, 0);
			if (map.containsKey(o.s)) {
				while (map.containsKey(o.s)) {
					Kouji o2 = map.get(o.s);
					if (o.x < o2.x) {
						map.put(o.s, o);
						if (o.t < o2.t) {
							o2.s = o.t;
							o = o2;
						}
					} else {
						if (o.t > o2.t) {
							o.s = o2.t;
						}
					}
				}
				map.put(o.s, o);
			} else {
				map.put(o.s, o);
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			Long k = map.floorKey(d[i]);
			if (k == null) {
				pw.println(-1);
			} else {
				Kouji o = map.get(k);
				if (d[i] >= o.t) {
					pw.println(-1);
				} else {
					pw.println(o.x);
				}
			}
		}
		pw.flush();
	}

	static class Kouji implements Comparable<Kouji> {
		long s, t, x;
		public String toString() {
			return "[" + s + "," + t + "," + x + "]";
		}

		public int compareTo(Kouji o) {
			if (o.x > x) {
				return 1;
			} else if (o.x == x) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
