import java.util.*;
public class Main3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int bc = sc.nextInt();
		for (int i = 0; i < bc; i++) {
			String line = sc.next();
			if (map.containsKey(line)) {
				map.put(line, map.get(line) + 1);
			} else {
				map.put(line, 1);
			}
		}
		
		int rc = sc.nextInt();
		for (int i = 0; i < rc; i++) {
			String line = sc.next();
			if (map.containsKey(line)) {
				map.put(line, map.get(line) - 1);
			} else {
				map.put(line, -1);
			}
		}
		
		int max = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}
		
		System.out.println(max);
	}
}