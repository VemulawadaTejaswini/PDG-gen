import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.valueOf(sc.nextLine());

		Map<Long, Long> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			Long input = sc.nextLong();
			Long c = map.getOrDefault(input, 0L);
			c++;
			map.put(input, c);
		}
		sc.close();
		if (!map.containsKey(0L)) {
			System.out.println(0);
			return;
		}
		Long before = -1L;
		for (Long key : map.keySet()) {
			if (key != before + 1L) {
				System.out.println(0L);
				return;
			}
			before = key;
		}
		Long size = (long) map.values().size();
		long ans = 1L;
		for (Long i = 0L; i < size - 1L; i++) {
			Long a = map.get(i);
			Long b = map.get(i + 1l);
			ans = ans * (long) Math.pow(a, b);
			ans = ans % 998244353L;
		}
		System.out.println(ans);
	}
}
