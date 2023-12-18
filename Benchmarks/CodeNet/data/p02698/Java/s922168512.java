import java.util.*;
public class Main {
	
	static int INF = Integer.MAX_VALUE;
	static int[] a, dp, ans;
	static List<Integer>[] list;
	static int max;
	
	static int lower_bound(int[] a, int key) {
		if(a[a.length-1] < key)
			return a.length;
		int lb = 0, ub = a.length-1, mid;
		do {
			mid = (ub+lb)/2;
			if(a[mid] < key)
				lb = mid + 1;
			else
				ub = mid;
		}while(lb < ub);
		return ub;
	}
	
	
	static void dfs(int v, int p) {
		int id = lower_bound(dp, a[v]);
		int p_id = id;
		int val = dp[id];
		int p_max = max;
		dp[id] = a[v];
		ans[v] = max = Math.max(max, id);
		for(int i : list[v])
			if(i != p)
				dfs(i, v);
		dp[p_id] = val;
		max = p_max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		a = new int[N];
		list = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			list[i] = new ArrayList<>();
		}
		for(int i = 1; i < N; i++){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			list[u].add(v);
			list[v].add(u);
		}
		dp = new int[N+1];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		ans = new int[N];
		dfs(0, 0);
		for(int i = 0; i < N; i++)
			System.out.println(ans[i]);
	}

}