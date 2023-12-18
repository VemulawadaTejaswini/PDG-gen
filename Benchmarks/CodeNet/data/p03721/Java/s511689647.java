import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				if (map.get(a) == null) {
					map.put(a, b);
				} else {
					map.put(a, map.get(a) + b);
				}
			}


			for (int i : map.keySet()) {
				k -= map.get(i);
				if (k <= 0) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}