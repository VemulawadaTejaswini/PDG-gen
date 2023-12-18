import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	private static int count = 0;
	private static Map<Integer, Set<Integer>> pass;
	private static Set<Integer> visited = new HashSet<Integer>();
	private static int n;
	
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] ab = new int[m + 1][2];
		for (int i = 1; i <= m; i++) {
			ab[i] = new int[]{scanner.nextInt(), scanner.nextInt()};
		}
		pass = new HashMap<Integer, Set<Integer>>();
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (ab[i][0] == j) {
					Set<Integer> set = pass.get(j);
					if (set == null) {
						set = new TreeSet<Integer>();
						pass.put(j, set);
					}
					set.add(ab[i][1]);
				} else if (ab[i][1] == j) {
					Set<Integer> set = pass.get(j);
					if (set == null) {
						set = new TreeSet<Integer>();
						pass.put(j, set);
					}
					set.add(ab[i][0]);
				}
			}
		}
		visited.add(1);
		next(1);
		System.out.println(count);
	}

	private static void next(int current) {
		if (allVisited()) {
			count++;
			return;
		}
		
		for (Integer end : pass.get(current)) {
			if (!visited.contains(end)) {
				visited.add(end);
				next(end);
				visited.remove(end);	// 1つ戻る
			}
		}
	}
	
	private static boolean allVisited() {
		return visited.size() == n;
	}
}
