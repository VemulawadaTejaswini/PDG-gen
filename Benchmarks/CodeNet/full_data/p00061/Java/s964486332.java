import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		int c = 0;
		while (true) {
			String[] s = bf.readLine().split(",");
			Integer k = Integer.valueOf(s[1]);
			Integer v = Integer.valueOf(s[0]);
			if (k.equals(Integer.valueOf(0)) && v.equals(Integer.valueOf(0)))
				break;
			List<Integer> list = map.get(k);
			if (list == null) {
				list = new LinkedList<Integer>();
				map.put(k, list);
			}
			list.add(v);
			c++;
		}
		int[] r = new int[c + 1];
		int n = map.size();
		while (!map.isEmpty()) {
			Entry<Integer, List<Integer>> e = map.pollFirstEntry();
			for (Integer i : e.getValue()) {
				r[i.intValue()] = n;
			}
			n--;
		}
		String s;
		while ((s = bf.readLine()) != null) {
			System.out.println(r[Integer.parseInt(s)]);
		}
	}
}