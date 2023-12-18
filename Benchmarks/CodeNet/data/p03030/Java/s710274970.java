import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, List<List<Integer>>> sp = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if (sp.keySet().contains(str)) {
				sp.get(str).get(0).add(sc.nextInt());
			} else {
				sp.put(str, new ArrayList<>());
				sp.get(str).add(new ArrayList<>());
				sp.get(str).add(new ArrayList<>());
				sp.get(str).get(0).add(sc.nextInt());
			}
			sp.get(str).get(1).add(i + 1);
		}
		
		List<Integer> result = new ArrayList();
		
		while (sp.size() > 0) {
			String str = Collections.min(sp.keySet());
			int max = Collections.max(sp.get(str).get(0));
			result.add(sp.get(str).get(1).get(sp.get(str).get(0).indexOf(max)));
			int index = sp.get(str).get(0).indexOf(max);
			sp.get(str).get(0).remove(index);
			sp.get(str).get(1).remove(index);
			if (sp.get(str).get(0).size() <= 0) {
				sp.remove(str);
			}
		}
		
		for (int num : result) {
			System.out.println(num);
		}
	}
}
