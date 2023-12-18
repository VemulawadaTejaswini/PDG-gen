import java.util.*;

public class Main {
    static int[] colors;
    static ArrayList<Path>[] graph;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<Path>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int length = sc.nextInt();
		    graph[a].add(new Path(b, length));
		    graph[b].add(new Path(a, length));
		}
		colors = new int[n + 1];
		Arrays.fill(colors, -1);
		search(1, 0);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    System.out.print(color[i]);
		}
		
	}
	
	static void search(int idx, int color) {
	    if (colors[idx] != -1) {
	        return;
	    }
	    colors[idx] = color;
	    for (Path x : graph[idx]) {
	        int next;
	        if (x.length % 2 == 0) {
	            next = color;
	        } else {
	            next = (1 + color) % 2;
	        }
	        search(x.to, next);
	    }
	}
	
	static class Path {
	    int to;
	    int length;
	    
	    public Path (int to, int length) {
	        this.to = to;
	        this.length = length;
	    }
	}
}
