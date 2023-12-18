import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
//		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int n = Integer.parseInt(sa[2]);
		TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]);
			TreeSet<Integer> set = map.get(x);
			if (set == null) {
				set = new TreeSet<>();
				map.put(x, set);
			}
			set.add(y);
		}
		br.close();

		int x = 1;
		int y = 1;
		for (int k : map.keySet()) {
			TreeSet<Integer> set = map.get(k);
			y += k - x - 1;
			if (set.floor(y) != null) {
				System.out.println(k - 1);
				return;
			}
			if (!set.contains(y + 1)) {
				y++;
			}
			x = k;
		}
		System.out.println(w);
	}
}
