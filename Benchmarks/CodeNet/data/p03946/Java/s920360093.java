import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
//		int t = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int min = a[0];
		int max = a[0];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
				max = a[i];
			} else if (a[i] > max) {
				max = a[i];
				putCntMap(map, max - min);
			}
		}
		System.out.println(map.lastEntry().getValue());
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
