import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[1]);
		List<String> list = new ArrayList<String>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		while (m > 0) {
			String r = br.readLine();
			list.add(r);
			String[] row = r.split(" ");
			int p = Integer.parseInt(row[0]);
			int y = Integer.parseInt(row[1]);
			if (map.containsKey(p)) {
				map.get(p).add(y);
			} else {
				List<Integer> l = new ArrayList<Integer>();
				l.add(y);
				map.put(p, l);
			}
			m--;
		}
		Map<Integer, Map<Integer, Integer>> nm = new HashMap<Integer, Map<Integer, Integer>>();
		for (Entry<Integer, List<Integer>> en : map.entrySet()) {
			int key = en.getKey();
			List<Integer> value = en.getValue();
			Collections.sort(value);
			Map<Integer, Integer> subm = new HashMap<Integer, Integer>();
			for (int i = 1; i < value.size() + 1; i++) {
				subm.put(value.get(i - 1), i);
			}
			nm.put(key, subm);
		}
		for (String r : list) {
			String[] row = r.split(" ");
			int p = Integer.parseInt(row[0]);
			int y = Integer.parseInt(row[1]);
			int num = nm.get(p).get(y);
			String str1 = "000000" + p;
			String font = str1.substring(str1.length() - 6);
			String str2 = "000000" + num;
			String end = str2.substring(str2.length() - 6);
			System.out.println(font + end);
		}
	}
}