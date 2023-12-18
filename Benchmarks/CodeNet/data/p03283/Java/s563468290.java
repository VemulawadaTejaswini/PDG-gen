
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<Integer, HashMap<Integer, Integer>>(500);

			for (int i = 0; i < m; i++) {
				int lm = sc.nextInt();
				int rm = sc.nextInt();
				if (map.containsKey(lm)) {
					if (map.get(lm).containsKey(rm)) {
						map.get(lm).put(rm, map.get(lm).get(rm)+1);
					} else {
						map.get(lm).put(rm, 1);
					}
				} else {
					HashMap<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
					tmpMap.put(rm, 1);
					map.put(lm, tmpMap);
				}
			}
			for (int i = 0; i < q; i++) {
				int lq = sc.nextInt();
				int rq = sc.nextInt();
				int result = 0;

				for (int j = lq; j <= rq; j++) {
					for (int k = j; k <= rq; k++) {
						if (map.containsKey(j) && map.get(j).containsKey(k)) {
							result += map.get(j).get(k);
						}
					}
				}
				System.out.println(result);
			}
		}
	}
}
