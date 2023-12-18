import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int[]pre;
	static int[]low;
	static int ans = 0;
	static  Map<Integer, List<Integer>> adj = new HashMap<Integer, List<Integer>>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[]a = new int[M];
		int[]b = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			if(adj.containsKey(a[i])) {
				adj.get(a[i]).add(b[i]);
			}else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(b[i]);
				adj.put(a[i], list);
			}
			if(adj.containsKey(b[i])) {
				adj.get(b[i]).add(a[i]);
			}else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(a[i]);
				adj.put(b[i], list);
			}
		}
		sc.close();
		pre = new int[N];
		low = new int[N];
		Arrays.fill(pre, -1);
		Arrays.fill(low, -1);
		dfs(0, 0, 0);
		System.out.println(ans - 1);
	}
	static int dfs(int v, int p, int a) {
		if(pre[v] != -1) {
			low[a] = Math.min(low[a], low[v]);
			return low[a];
		}
		pre[v] = p;
		low[v] = p;
		for(int u : adj.get(v)) {
			if(u == a) continue;
			low[v] = Math.min(low[v], dfs(u, p + 1, v));
		}
		if(pre[v] == low[v]) {
			ans ++;
		}
		return low[v];
	}
}