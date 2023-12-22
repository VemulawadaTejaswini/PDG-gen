import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static Map<Long, Long> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			map.put(a, map.getOrDefault(a, 0L) + 1);
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			changeKey(b, c);
			System.out.println(sumListA());
		}
	}

	public static long sumListA() {
		long ret = 0L;
		for (Entry<Long, Long> entry : map.entrySet()) {
			ret += entry.getKey() * entry.getValue();
		}
		return ret;
	}

	public static void changeKey(long b, long c) {
		long count = map.get(b);
		map.put(b, 0L);
		map.put(c, map.getOrDefault(c, 0L) + count);
	}

}
