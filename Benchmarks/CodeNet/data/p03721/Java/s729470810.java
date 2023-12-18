import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			if (map.containsKey(a)) {
				map.put(a, map.get(a) + b);
			} else {
				map.put(a, b);
			}
		}

		int count = 0;
		for (int key : map.keySet()) {
			count += map.get(key);
			if (count >= k) {
				System.out.println(key);
				return;
			}
		}
	}

}
