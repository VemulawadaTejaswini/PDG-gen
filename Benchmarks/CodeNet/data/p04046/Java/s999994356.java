import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<Integer, Map<Integer, Integer>> nrMap = new HashMap<Integer, Map<Integer, Integer>>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int a = Integer.parseInt(sa[2]);
		int b = Integer.parseInt(sa[3]);
		br.close();

		long ans = 0;
		for (int i = 0; i < h - a; i++) {
			long temp = nCr(i + b - 1, i);
			temp *= nCr(h - i - 1 + w - b - 1, h - i - 1);
			temp %= 1000000007;
			ans += temp;
			ans %= 1000000007;
		}
		System.out.println(ans);
	}

	static int nCr(int n, int r) {
		if (n <= 1) return 1;
		if (r <= 0) return 1;
		if (n <= r) return 1;

		Map<Integer, Integer> rMap = nrMap.get(n);
		if (rMap == null) {
			rMap = new HashMap<Integer, Integer>();
		} else {
			if (rMap.containsKey(r)) {
				return rMap.get(r);
			}
		}
		int v = nCr(n - 1, r - 1) + nCr(n - 1, r);
		v %= 1000000007;
		rMap.put(r, v);
		nrMap.put(n, rMap);
		return v;
	}
}
