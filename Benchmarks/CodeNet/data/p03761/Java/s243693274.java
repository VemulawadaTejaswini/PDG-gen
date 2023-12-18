import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Map<String, Integer>> ary = new ArrayList<Map<String, Integer>>();
		List<Set<String>> hash_ary = new ArrayList<Set<String>>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			Map<String, Integer> map = new HashMap<String, Integer>();
			Set<String> hashset = new HashSet<String>();
			for (int j = 0; j < str.length(); j++) {
				if (map.containsKey(String.valueOf(str.charAt(j)))) {
					map.put(String.valueOf(str.charAt(j)), map.get(String.valueOf(str.charAt(i))) + 1);
				} else {
					map.put(String.valueOf(str.charAt(j)), 1);
				}
				hashset.add(String.valueOf(str.charAt(j)));
			}
			ary.add(map);
			hash_ary.add(hashset);
		}
		Set<String> tmpset = hash_ary.get(0);
		for (int i = 0; i < n; i++) {
			Set<String> tmpset2 = hash_ary.get(i);
			tmpset.retainAll(tmpset2);
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : tmpset) {
			map.put(str, Integer.MAX_VALUE);
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			for (Map<String, Integer> tmpmap : ary) {
				if (tmpmap.containsKey(entry.getKey())) {
					if (entry.getValue() > tmpmap.get(entry.getKey())) {
						map.put(entry.getKey(), tmpmap.get(entry.getKey()));
					}
				}
			}
		}
		List<String> out = new ArrayList<String>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				out.add(entry.getKey());
			}
		}
		Collections.sort(out);
		for (String o : out) {
			System.out.print(o);
		}
	}

}