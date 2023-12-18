import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
//		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			putCntMap(map, Integer.parseInt(sa[0]));
			putCntMap(map, Integer.parseInt(sa[1]));
		}
		br.close();

		for (Integer key : map.keySet()) {
			if (map.get(key) % 2 == 1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
