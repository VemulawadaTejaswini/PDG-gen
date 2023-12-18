import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			int now = map.getOrDefault(str, 0);
			map.put(str, now + 1);
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String str = sc.next();
			int now = map.getOrDefault(str, 0);
			map.put(str, now - 1);
		}

		int ans = map.values().stream().mapToInt(Integer::valueOf).max().getAsInt();

		ans = ans < 0 ? 0 : ans;


		System.out.println(ans);
		sc.close();
	}

}