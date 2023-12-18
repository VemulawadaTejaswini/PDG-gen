import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int n;
    static int[] visited;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new ArrayList[3 * n];
		for (int i = 0; i < 3 * n; i++) {
		    graph[i] = new ArrayList<Integer>();
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph[a].add(b + n);
		    graph[a + n].add(b + 2 * n);
		    graph[a + 2 * n].add(b);
		    
		}
		int s = sc.nextInt() - 1;
		int t = sc.nextInt() - 1;
		visited = new int[n * 3];
		search(s, 1);
		if (visited[t] == 0) {
		    System.out.println(-1);
		} else {
	    	System.out.println(visited[t] / 3);
		}
	}
	
	static void search(int idx, int value) {
	    if (visited[idx] != 0 && visited[idx] <= value) {
	        return;
	    }
	    visited[idx] = value;
	    for (int x : graph[idx]) {
	        search(x, value + 1);
	    }
	}
}
