import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		long ans = (long) (n - 2) * (n - 2);
		TreeMap<Integer, Integer> mapx = new TreeMap<>();
		TreeMap<Integer, Integer> mapy = new TreeMap<>();
		mapx.put(n - 1, n - 1);
		mapy.put(n - 1, n - 1);
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[1]) - 1;
			if (sa[0].equals("1")) {
				int b = mapx.get(mapx.ceilingKey(a));
				ans -= b - 1;
				mapy.put(b, Math.min(a, mapy.getOrDefault(b, n - 1)));
			} else {
				int b = mapy.get(mapy.ceilingKey(a));
				ans -= b - 1;
				mapx.put(b, Math.min(a, mapx.getOrDefault(b, n - 1)));
			}
		}
		System.out.println(ans);
		br.close();
	}
}
