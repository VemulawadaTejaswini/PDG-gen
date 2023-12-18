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
		Collections.reverse(list);

		PrintWriter pw = new PrintWriter(System.out);
		int sum = 0;
		pw.println(n);
		for (int i = 2; i <= n; i++) {
			if (i > list.size()) {
				pw.println(0);
			} else {
				int x = list.get(i - 2);
				sum += x;
				int y = n - sum;
				pw.println(Math.min(y, n / i));
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
