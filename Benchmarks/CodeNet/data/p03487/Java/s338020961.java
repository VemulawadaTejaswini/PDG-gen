import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		HashMap<Long, Long> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i],1L);
			}
		}

		long cnt = 0;

		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			if (entry.getValue()>entry.getKey()) {
				cnt += entry.getValue() - entry.getKey();
			} else {
				cnt += Math.min(entry.getValue(), entry.getKey() - entry.getValue());
			}
		}
		System.out.println(cnt);
	}
}
