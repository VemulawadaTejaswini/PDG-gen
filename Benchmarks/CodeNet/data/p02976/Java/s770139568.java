import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeSet<Integer>[] graph = new TreeSet[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new TreeSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		for (int i = 1; i < n; i++) {
			if (graph[i].size() % 2 != 0) {
				int x = graph[i].pollLast();
				if (x < i) {
					System.out.println(-1);
					return;
				}
			}
			for (int x : graph[i]) {
				if (x > i) {
					graph[x].remove(i);
				}
			}
		}
		if (graph[n].size() % 2 != 0) {
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int x : graph[i]) {
				sb.append(i).append(" ").append(x).append("\n");
			}
		}
		System.out.print(sb);
	}
}
