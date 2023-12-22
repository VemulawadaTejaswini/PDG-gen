
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
	
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= m; i++) {
			map.put(i, new ArrayList<Integer>());
			if (i != 2) {
				list.add(i);
			}
		}
		int[] deg = new int[m + 1];
		while (n-- > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			deg[y]++;
			map.get(x).add(y);

		}
		int y = 0;
		while (list.size() != 0) {
			int x = list.get(y);
			if (deg[x] == 0 && x != 2) {
				System.out.println(x);
				deg[x] = -1;
				for (int t : map.get(x)) {
					deg[t]--;
				}
				list.remove(y);
				if (y == list.size()) {
					y--;
				}
			} else {
				y = (y + 1) % list.size();
			}
		}
		System.out.println(2);
	}
}