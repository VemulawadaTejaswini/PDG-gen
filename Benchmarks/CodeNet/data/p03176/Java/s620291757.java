import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		TreeMap<Integer, Long> map = new TreeMap<>();
		map.put(0, 0L);
		map.put(Integer.MAX_VALUE, Long.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			Integer key = map.lowerKey(h[i]);
			long val = map.get(key) + a[i];
			while (true) {
				Integer key2 = map.higherKey(h[i]);
				if (map.get(key2) < val) {
					map.remove(key2);
				} else {
					break;
				}
			}
			map.put(h[i], val);
		}
		map.remove(map.lastKey());
		System.out.println(map.lastEntry().getValue());
	}
}
