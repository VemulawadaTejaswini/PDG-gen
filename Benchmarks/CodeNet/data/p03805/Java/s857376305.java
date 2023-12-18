import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static long count = 0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        search(1, new boolean[n + 1]);
		System.out.println(count);
	}
	
	static void search(int idx, boolean[] visited) {
	    if (visited[idx]) {
	        return;
	    }
	    visited[idx] = true;
	    boolean flag = true;
	    for (int i = 1; i < visited.length && flag; i++) {
	        flag = visited[i];
	    }
	    if (flag) {
	        count++;
	        visited[idx] = false;
	        return;
	    }
	    for (int x : graph[idx]) {
	        search(x, visited);
	    }
	    visited[idx] = false;
	}
}
