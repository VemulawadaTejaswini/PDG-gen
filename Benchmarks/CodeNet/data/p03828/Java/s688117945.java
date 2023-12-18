import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 2; i <= n; i++) {
			int num = i;
			for (int sosuu : map.keySet()) {
				while (num % sosuu == 0) {
					map.put(sosuu, map.get(sosuu) + 1);
					num /= sosuu;
				}
			}
			if (num == i) {
				map.put(num, 1);
			}
		}

		long ans = 1;
		for (int sosuu : map.keySet()) {
			ans = ans * (map.get(sosuu) + 1) % 1000000007;
		}
		System.out.println(ans);
	}
}
