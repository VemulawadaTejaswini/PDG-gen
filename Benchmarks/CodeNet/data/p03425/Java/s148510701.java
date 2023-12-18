import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			sc.nextLine();

			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {

				String s = sc.nextLine();
				if (!s.matches("^[MARCH].*$")) {
					continue;
				}

				inc(map, s.substring(0, 1));

			}

			int ans = 0;
			List<Integer> list = new ArrayList<>(map.values());
			for (int i = 0; i < list.size() - 2; i++) {
				for (int j = i + 1; j < list.size() - 1; j++) {
					for (int k = j + 1; k < list.size(); k++) {

						int c = 1;
						c *= list.get(i).intValue();
						c *= list.get(j).intValue();
						c *= list.get(k).intValue();

						ans += c;

					}
				}
			}

			System.out.println(ans);

		}

	}

	private static final <T> void inc(Map<T, Integer> map, T key) {

		Integer val = map.get(key);

		if (null == val) {
			val = Integer.valueOf(1);

		} else {
			val = Integer.valueOf(val.intValue() + 1);
		}

		map.put(key, val);

	}

}
