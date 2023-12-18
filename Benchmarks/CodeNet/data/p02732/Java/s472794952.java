import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
			addCntMap(map, a[i]);
		}
		br.close();

		long sum = 0;
		Integer[] arr = map.keySet().toArray(new Integer[0]);
		for (Integer o : arr) {
			long v = map.get(o);
			sum += v * (v - 1) / 2;
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			long v = map.get(a[i]);
			pw.println(sum - v * (v - 1) / 2 + (v - 2) * (v - 1) / 2);
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
