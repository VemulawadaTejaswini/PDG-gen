import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<Long, Long> map;
	static long n, a, b, c, d, e;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int t = Integer.parseInt(sa[0]);
		for (int i = 0; i < t; i++) {
			sa = br.readLine().split(" ");
			n = Long.parseLong(sa[0]);
			a = Long.parseLong(sa[1]);
			b = Long.parseLong(sa[2]);
			c = Long.parseLong(sa[3]);
			d = Long.parseLong(sa[4]);

			e = Long.MAX_VALUE / d;
			map = new HashMap<>();
			map.put(0L, 0L);
			map.put(1L, d);
			System.out.println(dfs(n));
		}
		br.close();
	}

	static long dfs(long x) {
		if (map.containsKey(x)) {
			return map.get(x);
		}

		long ret = Long.MAX_VALUE;
		if (x % 2 == 0) {
			ret = Math.min(ret, dfs(x / 2) + a);
			if (x / 2 <= e) {
				ret = Math.min(ret, dfs(x / 2) + x / 2 * d);
			}
		} else {
			ret = Math.min(ret, dfs(x / 2) + a + d);
			ret = Math.min(ret, dfs(x / 2 + 1) + a + d);
			if (x / 2 < e) {
				ret = Math.min(ret, dfs(x / 2) + x / 2 * d + d);
			}
		}
		if (x % 3 == 0) {
			ret = Math.min(ret, dfs(x / 3) + b);
		} else {
			long y = x % 3;
			ret = Math.min(ret, dfs(x / 3) + b + d * y);
			y = 3 - y;
			ret = Math.min(ret, dfs(x / 3 + 1) + b + d * y);
		}
		if (x % 5 == 0) {
			ret = Math.min(ret, dfs(x / 5) + c);
		} else {
			long y = x % 5;
			ret = Math.min(ret, dfs(x / 5) + c + d * y);
			y = 5 - y;
			ret = Math.min(ret, dfs(x / 5 + 1) + c + d * y);
		}
		map.put(x, ret);
		return ret;
	}
}
