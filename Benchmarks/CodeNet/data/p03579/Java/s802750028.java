import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer>[] graph = new HashSet[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new HashSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    graph[a].add(b);
		    graph[b].add(a);
		}
		long total = 0;
		HashSet<Integer> first = new HashSet<>();
		HashSet<Integer> second = new HashSet<>();
		for (int i = 1; i <= n; i++) {
		    int org = graph[i].size();
		    int size = 0;
            while (size != graph[i].size()) {
                size = graph[i].size();
                for (int x : graph[i]) {
                    first.addAll(graph[x]);
                }
                for (int x : first) {
                    second.addAll(graph[x]);
                }
                for (int x : second) {
                    if (i != x && !graph[i].contains(x)) {
                        graph[i].add(x);
                        graph[x].add(i);
                    }
                }
                first.clear();
                second.clear();
            }
            total += graph[i].size() - org;
		}
	    System.out.println(total);
	}
}
	
