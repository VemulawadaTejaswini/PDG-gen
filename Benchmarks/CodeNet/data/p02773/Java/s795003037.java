import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int max = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		int rem = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				rem = map.get(s)+1;
				map.replace(s, rem);
				max = Math.max(max,rem);
			}else {
				map.put(s, 1);
			}
		}
		List<String> list = new ArrayList<String>();
		for(String key : map.keySet()) {
			if(map.get(key) == max)list.add(key);
		}
		Collections.sort(list);
		for(String key : list) {
			System.out.println(key);
		}
		sc.close();
	}
}