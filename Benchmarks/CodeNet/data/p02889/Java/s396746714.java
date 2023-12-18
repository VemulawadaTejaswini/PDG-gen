import java.util.*;

public class Main {
    static ArrayList<Road>[] graph;
    static int l;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		l = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<Road>();
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph[a].add(new Road(b, c));
		    graph[b].add(new Road(a, c));
		}
		int[] counts = new int[n + 1];
		int[] gas = new int[n + 1];
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int s = sc.nextInt();
		    int t = sc.nextInt();
		    Arrays.fill(counts, Integer.MAX_VALUE);
		    Arrays.fill(gas, Integer.MAX_VALUE);
		    search(counts, gas, s, 0, 0);
		    if (counts[t] == Integer.MAX_VALUE) {
		        sb.append(-1);
		    } else {
		        sb.append(counts[t]);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
	
	static void search(int[] counts, int[] gas, int to, int liq, int cnt) {
	    if (cnt == counts[to]) {
	        if (liq >= gas[to]) {
	            return;
	        }
	    } else if (cnt > counts[to]) {
	        return;
	    }
	    counts[to] = cnt;
	    gas[to] = liq;
	    for (Road r : graph[to]) {
	        if (r.cost > l) {
	            continue;
	        }
	        int addC = 0;
	        int addL = r.cost + liq;
	        if (addL > l) {
	            addC++;
	            addL = l - r.cost;
	        }
	        search(counts, gas, r.to, addL, cnt + addC);
	    }
	}
	
	static class Road {
	    int to;
	    int cost;
	    
	    public Road(int to, int cost) {
	        this.to = to;
	        this.cost = cost;
	    }
	}
}
