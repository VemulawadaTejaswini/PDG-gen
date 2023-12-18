
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(n);

			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				if (a <= m) {
					if(map.containsKey(a)) {
						map.get(a).add(b);
					} else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(b);
						map.put(a, list);
					}
				}
			}
			for (int i = 1; i <= m; i++) {
				if (map.containsKey(i)) {
					Collections.sort(map.get(i), Collections.reverseOrder());
				}
			}


			long result = 0;
			for (int i = 1; i <= m; i++) {
				int mapKey = 0;
				int max = 0;
				for (int j = 1; j <= i; j++) {
					if (map.containsKey(j)) {
						if (max < map.get(j).get(0)) {
							max = map.get(j).get(0);
							mapKey = j;
						}
					}
				}
				result += max;
				if (mapKey != 0) {
					map.get(mapKey).remove(0);
					if (map.get(mapKey).size() == 0) {
						map.remove(mapKey);
					}
				}
			}

			System.out.println(result);

		}
	}
}
