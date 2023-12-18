import java.util.*;
public class Main {
	
	static int INF = Integer.MAX_VALUE;
	static int[] a;
	static Integer[] dp, ans;
	static List<Integer>[] list;
	
	static void dfs(int v, int p) {
		int id = Arrays.binarySearch(dp, a[v], (x,y)->x.compareTo(y)>=0?1:-1);
		int p_id = id;
		int val = dp[id];
		dp[id] = a[v];
		ans[v] = Arrays.binarySearch(dp, INF, (x,y)->x.compareTo(y)>=0?1:-1)-1;
		for(int i : list[v])
			if(i != p)
				dfs(i, v);
		dp[p_id] = val;
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
		dp = new Integer[N+1];
		Arrays.fill(dp, INF);
		dp[0] = 0;
		ans = new Integer[N];
		dfs(0, 0);
		for(int i = 0; i < N; i++)
			System.out.println(ans[i]);
	}

}
