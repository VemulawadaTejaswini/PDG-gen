
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();

		sc.nextLine();

		String tmp = "";
		int max = 0;
		for (int i=0; i < N; i++) {
			tmp = sc.nextLine();
			if (map.get(tmp) == null) {
				map.put(tmp, 1);
				max = Math.max(max, 1);
			} else {
				map.put(tmp, map.get(tmp) + 1);
				max = map.get(tmp);
			}
		}

		LinkedHashMap<String, Integer>  map2 =  map.entrySet().stream()
        .sorted(java.util.Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			List<String> list = new ArrayList<String>();
        for (Entry<String, Integer> entry : map2.entrySet()) {
        	if (max == entry.getValue()) {
        		list.add(entry.getKey());
        	}
        }

        Collections.sort(list);
        for (String s : list) {
        	System.out.println(s);
        }
	}
}
