import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		sc.close();

		Map<Long, Integer> map = new TreeMap<Long, Integer>();

		for (long x = 1; x < 40; x++) {
			for (long y = 1; y < 40; y++) {
				for (long z = 1; z < 40; z++) {
					long num = (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x);
					if (map.containsKey(num)) {
						map.put(num, map.get(num) + 1);
					} else {
						map.put(num, 1);
					}
				}
			}
		}

		for (long i = 1; i <= N; i++) {
			if (map.containsKey(i)) {
				System.out.println(map.get(i));
			} else {
				System.out.println(0);
			}
		}
	}
}
