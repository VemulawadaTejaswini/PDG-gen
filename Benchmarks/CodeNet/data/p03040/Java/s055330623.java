import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		String[] sa = br.readLine().split(" ");
		int a0 = Integer.parseInt(sa[1]);
		int b0 = Integer.parseInt(sa[2]);
		putCntMap(map, a0);
		int idx = 0;
		int x = a0;
		long v = b0;
		int cnt = 1;

		for (int i = 1; i < q; i++) {
			sa = br.readLine().split(" ");
			int y = Integer.parseInt(sa[0]);
			if (y == 1) {
				int a = Integer.parseInt(sa[1]);
				int b = Integer.parseInt(sa[2]);
				if (cnt % 2 == 0) {
					idx++;
				}
				putCntMap(map, a);
				v += Math.abs(x - a) + b;
				x = getVal(map, idx);
				cnt++;
			} else {
				System.out.println(x + " " + v);
			}
		}
	}

	static int getVal(TreeMap<Integer, Integer> map, int idx) {
		for (Integer key : map.keySet()) {
			int num = map.get(key);
			idx -= num;
			if (idx < 0) {
				return key;
			}
		}
		return Integer.MAX_VALUE;
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
