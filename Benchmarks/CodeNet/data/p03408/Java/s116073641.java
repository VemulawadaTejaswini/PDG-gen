import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		Map<String, Long> points = new HashMap<String, Long>();
		for (int i = 0; i < N; i++) {
			String key = sc.next();
			long tmp = (points.get(key) == null) ? 0L : points.get(key);
			points.put(key, ++tmp);
		}
		
		long M = sc.nextLong();
		for (int i = 0; i < M; i++) {
			String key = sc.next();
			long tmp = (points.get(key) == null) ? 0L : points.get(key);
			points.put(key, --tmp);
		}

		Long maxP = 0L;
		for (Entry<String, Long> ent : points.entrySet()) {
			if (maxP < ent.getValue()) {
				maxP = ent.getValue();
			}
		}
		
		System.out.println(maxP);
	}

}