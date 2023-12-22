import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static int dfs(Map<Integer, List<Integer>> m, boolean[] visited, int cur, int l) {
		visited[cur] = true;
		List<Integer> el = m.get(cur);
		if (el == null)
			return l;
		int len = l;
		for (int e : el) {
			if (!visited[e]) {
				len = Math.max(len, dfs(m, visited, e, l + 1));
			}
		}
		visited[cur] = false;
		return len;
	}

	public static Map<Integer, List<Integer>> adjMap(int[][] edge) {
		Map<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < edge.length; i++) {
			List<Integer> el = m.get(edge[i][0]);
			if (el == null)
				el = new LinkedList<Integer>();
			el.add(edge[i][1]);
			m.put(edge[i][0], el);
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			if (n == 0)
				break;
			int[][] p = new int[n * 2][2];
			int[] d = new int[101];
			Arrays.fill(d, 0);
			int max = 0;
			for (int i = 0; i < n; i++) {
				p[i * 2 + 1][1] = p[i * 2][0] = s.nextInt();
				p[i * 2 + 1][0] = p[i * 2][1] = s.nextInt();
				if (p[i * 2][0] > max)
					max = p[i * 2][0];
				if (p[i * 2][1] > max)
					max = p[i * 2][1];
				d[p[i * 2][0]]++;
				d[p[i * 2][1]]++;
			}
			// 次数の少ない点が始点/終点足りうる
			int md = 10000;
			for (int i = 1; i <= max; i++) {
				md = Math.min(md, d[i]);
			}
			md += 2;

			Map<Integer, List<Integer>> m = adjMap(p);
			boolean[] visited = new boolean[max + 1];
			Arrays.fill(visited, false);

			int l = 0;
			for (int i = 1; i <= max; i++) {
				if(md>d[i]){
					l = Math.max(l, dfs(m, visited, i, 1));
				}
			}
			System.out.println(l);
		}
	}
}