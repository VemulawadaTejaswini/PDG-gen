
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < 4; i++) {
				String tmp = s.substring(i, i + 1);
				if(map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp) + 1);
				} else {
					map.put(tmp, 1);
				}
			}

			if (map.keySet().size() != 2) {
				System.out.println("No");
				return;
			}
			for (String key : map.keySet()) {
				if(map.get(key) != 2) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}
