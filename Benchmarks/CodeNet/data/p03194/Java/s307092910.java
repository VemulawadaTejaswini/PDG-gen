import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Long N = sc.nextLong();
		Long P = sc.nextLong();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = (int) 2; i <= P; i++) {

			if (P % i == 0) {

				P /= i;

				if (map.get(i) == null) {
					map.put(i, (int) 1);
				} else {
					map.put(i, map.get(i) + 1);
				}

				i = (int) 1;

			}
		}

		int result = 1;
		for (Entry<Integer, Integer> ent : map.entrySet()) {
			if (ent.getValue() >= N) {
				result = (int) (result * (Math.pow(ent.getKey(), (ent.getValue() / N))));
			}
		}

		System.out.println(result);
	}
}