import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		char[] c = new char[10];
		String s;
		HashMap<String, Long> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			c = sc.next().toCharArray();
			Arrays.sort(c);
			s = new String(c);
			if (map.get(s) == null) {
				map.put(s, 1L);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}

		long ans = 0;
		for (Long v : map.values()) {
			ans += v * (v - 1) / 2;
		}

		System.out.println(ans);
	}
}
