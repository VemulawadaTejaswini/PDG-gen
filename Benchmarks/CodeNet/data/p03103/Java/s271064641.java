import java.util.*;

public class Main {
	static Map<Long, Long> map = new TreeMap<Long, Long>(); // key:金額,val:本数

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		for (int i = 0; i < N; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}
		sc.close();

		long ans = 0;
		int cnt = 0;

		for (Map.Entry<Long, Long> en : map.entrySet()) {
			long price = en.getKey();
			long num = en.getValue();

			for (int i = 0; i < num; i++) {
				if (cnt < M) {
					ans += price;
					cnt++;
				} else {
					break;
				}
				}
		}

		System.out.println(ans);
	}
}
