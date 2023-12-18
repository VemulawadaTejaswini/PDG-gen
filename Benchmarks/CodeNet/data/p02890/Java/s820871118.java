import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			addCntMap(map, Integer.parseInt(sa[i]));
		}
		br.close();

		List<Integer> list = new ArrayList<>(map.size());
		for (Integer o : map.values()) {
			list.add(o);
		}
		Collections.sort(list);

		Integer[] sum = list.toArray(new Integer[0]);
		int len = sum.length;
		for (int i = 1; i < len; i++) {
			sum[i] += sum[i - 1];
		}
		PrintWriter pw = new PrintWriter(System.out);
		int ans = n;
		int x = len - 1;
		for (int i = 1; i <= n; i++) {
			if (i > len) {
				pw.println(0);
				continue;
			}
			for ( ; ans >= 0; ans--) {
				for ( ; x > 0; x--) {
					if (list.get(x) <= ans) {
						break;
					}
				}
				int val = sum[x];
				val += (len - 1 - x) * ans;
				if (val >= i * ans) {
					pw.println(ans);
					break;
				}
			}
		}
		pw.flush();
	}

	static void addCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
