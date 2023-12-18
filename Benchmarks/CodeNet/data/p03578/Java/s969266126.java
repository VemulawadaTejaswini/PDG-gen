import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		Map<Long, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			long d = Long.parseLong(str[i]);

			if (map.containsKey(d))
				map.put(d, map.get(d) + 1);
			else
				map.put(d, 1);
		}

		int m = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");

		for (int i = 0; i < m; i++) {
			long t = Long.parseLong(str[i]);
			if (!map.containsKey(t)) {
				System.out.println("NO");
				return;
			} else {
				if (map.get(t) <= 0) {
					System.out.println("NO");
					return;
				} else {
					map.put(t, map.get(t) - 1);
				}
			}
		}

		System.out.println("YES");

	}
}
