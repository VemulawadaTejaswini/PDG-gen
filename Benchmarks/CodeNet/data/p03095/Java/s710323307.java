import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		int mod = (int) Math.pow(10, 9) + 7;
		int r = n;
		long ans = 0L;
		for (int i = 0; i < n; i++) {
			int syurui = map.size();
			char c = s.charAt(i);
			int cCnt = map.get(c);

			long a = (long) Math.pow(2, syurui - 1);
			long b = a / 2 * (r - syurui - (cCnt - 1));
			ans += a % mod + b % mod;

			if (cCnt == 1) {
				map.remove(c);
			} else {
				map.put(c, cCnt - 1);
			}
			r--;
		}
		System.out.println(ans % mod);
	}
}
