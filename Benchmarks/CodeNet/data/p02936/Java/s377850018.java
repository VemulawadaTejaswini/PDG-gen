import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    graph[a].add(b);
		    graph[b].add(a);
		}
		long[] points = new long[n + 1];
		for (int i = 0; i < q; i++) {
		    points[sc.nextInt()] += sc.nextInt();
		}
		search(1, 0, points, graph);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (i != 1) {
		        sb.append(" ");
		    }
		    sb.append(points[i]);
		}
		System.out.println(sb);
   }
   
   static void search(int to, int from, long[] points, ArrayList<Integer>[] graph) {
       points[to] += points[from];
       for (int x : graph[to]) {
           if (x == from) {
               continue;
           }
           search(x, to, points, graph);
       }
   }
}
