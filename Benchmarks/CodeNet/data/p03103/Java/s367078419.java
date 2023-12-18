import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		Map<Integer, Integer> m = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			int cost = Integer.parseInt(sc.next());
			int remain = Integer.parseInt(sc.next());
			m.put(cost, remain);
		}

		long ans = 0;
		int remain = K;
		for (Entry<Integer, Integer> entry : m.entrySet()) {
			if (remain <= 0) {
				// もう買い取る必要がないので抜ける
				break;
			}

			int tmp = remain - entry.getValue();
			if (tmp > 0) {

				// 1店舗分全部買い取れる
				ans += (long) entry.getKey() * entry.getValue();
			} else {

				// 全部は買い取れない。
				ans += (long) entry.getKey() * remain;
			}
			remain -= entry.getValue();
		}
		
		System.out.println(ans);
	}
}
