import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		TreeMap<Integer, Long> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			long b = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}
		sc.close();

		while (true) {
			Entry<Integer, Long> e = map.pollFirstEntry();
			k -= e.getValue();
			if (k <= 0) {
				System.out.println(e.getKey());
				return;
			}
		}
	}
}
