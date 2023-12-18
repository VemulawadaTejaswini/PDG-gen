import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long P = sc.nextLong();

		Map<Long, Long> map = new HashMap<Long, Long>();

		for (Long i = (long) 2; i <= P; i++) {

			if (P % i == 0) {

				P /= i;

				if (map.get(i) == null) {
					map.put(i, (long) 1);
				} else {
					map.put(i, map.get(i) + 1);
				}

				i = (long) 1;

			}
		}

		long result = 1;
		for (Entry<Long, Long> ent : map.entrySet()) {
			if (ent.getValue() >= N) {
				result = result * (ent.getKey() * (ent.getValue() / N));
			}
		}

		System.out.println(result);
	}
}