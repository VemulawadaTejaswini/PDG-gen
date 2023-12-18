import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		main.solve(sc);
		sc.close();
	}

	void solve(Scanner sc) {
		long N = sc.nextLong();
		long M = sc.nextLong();
		Map<Long, Long> map = new HashMap<Long, Long>();

		for (long i = 0; i < N; i++) {
			long A = sc.nextLong();
			long B = sc.nextLong();

			if (map.containsKey(A)) {
				map.put(A, B + map.get(A));
			} else {
				map.put(A, B);
			}
		}

		map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey());

		long money = 0;
		long cnt = 0;

		for (long A : map.keySet()) {
			long B = map.get(A);
			money += A * B;
			cnt += B;
			if (cnt >= M) {
				long sa = cnt - M;
				money -= A * sa;
				break;
			}
		}

		System.out.println(String.valueOf(money));
	}
}