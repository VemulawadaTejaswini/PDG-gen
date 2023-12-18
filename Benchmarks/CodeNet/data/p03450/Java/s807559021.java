import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static final int MaxN = 400000;
	static final int MaxV = 100000;
	static int []pre = new int[MaxN + 5];
	static int []last = new int[MaxN + 5];
	static int []other = new int[MaxN + 5];
	static int []cost = new int[MaxN + 5];
	static int []a = new int [MaxV + 5];
	static boolean []vis = new boolean[MaxV + 5];
	static boolean flag = true;
	static int n, m, all;
	public static void build(int u, int v, int c){
		pre[++all] = last[u];
		last[u] = all;
		other[all] = v;
		cost[all] = c;
	}
	public static void dfs(int u, int sum){
		if(flag == false) return;
		if(vis[u]){
			if(a[u] != sum) flag = false;
			return;
		}
		vis[u] = true;
		a[u] = sum;
		int ed, dr, add;
		ed = last[u];
		while(ed != -1){
			dr = other[ed];
			add = cost[ed];
			dfs(dr, sum + add);
			ed = pre[ed];
		}
	}
	public static void main(String[] args){
		all = -1;
		Arrays.fill(last, -1);
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for(int i = 1; i <= m; i++){
			int u, v, c;
			u = sc.nextInt();
			v = sc.nextInt();
			c = sc.nextInt();
			build(u, v, c);
			build(v, u, -c);
		}
		for(int i = 1; i <= n; i++){
			if(!vis[i]) dfs(i, i);
		}
		if(flag == true) System.out.println("Yes\n");
		else System.out.println("No\n");
	}
}
