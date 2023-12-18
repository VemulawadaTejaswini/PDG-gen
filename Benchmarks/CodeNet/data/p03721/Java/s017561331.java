import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long n = Long.parseLong(str[0]);
		long k = Long.parseLong(str[1]);

		TreeMap<Long, Long> map = new TreeMap<>();

		for (long i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);

			if (map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}

		long count = 0;
		for (long key : map.keySet()) {
			count += map.get(key);
			if (count >= k) {
				System.out.println(key);
				return;
			}
		}
	}

}
