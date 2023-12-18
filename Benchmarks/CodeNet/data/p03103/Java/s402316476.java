import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Long, Long> shop =new TreeMap<Long, Long>();

		int N = sc.nextInt();
		int M = sc.nextInt();
		long min = 0;
		for (int i = 0; i < N; i++) {
			long key = sc.nextLong();
			long val = sc.nextLong();

			if (shop.containsKey(key)) {
				shop.put(key, shop.get(key) + val);
			} else {
				shop.put(key, val);
			}
		}

		for (Long item : shop.keySet()) {
			long lot = shop.get(item);
			if (lot >= M) {
				min += item*M;
				break;
			} else {
				M -= lot;
				min += item*lot;
			}
		}

		System.out.println(min);

	}
}
