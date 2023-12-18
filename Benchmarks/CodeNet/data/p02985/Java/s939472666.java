import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
		    graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    graph[a].add(b);
		    graph[b].add(a);
		}
		long ans = k;
		for (int i = 0; i < graph[0].size(); i++) {
		    ans *= k - i - 1;
		    ans %= MOD;
		    ans *= getCount(graph[0].get(i), 0, k, graph);
		    ans %= MOD;
		}
		System.out.println(ans);
   }
   
   static long getCount(int target, int from, int types, ArrayList<Integer>[] graph) {
       int idx = 2;
       long ret = 1;
       for (int x : graph[target]) {
           if (x == from) {
               continue;
           }
           ret *= types - idx;
           ret %= MOD;
           ret *= getCount(x, target, types, graph);
           ret %= MOD;
           idx++;
       }
       return ret;
   }

}
