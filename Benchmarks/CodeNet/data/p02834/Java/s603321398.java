import java.util.*;
public class Main {
	static int N,u,v;
	static List<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
	static int t_dist[], a_dist[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); u = sc.nextInt()-1; v = sc.nextInt()-1;
		for(int i=0;i<N;i++) ls.add(new ArrayList<Integer>());
		for(int i=0;i<N-1;i++) {
			int A = sc.nextInt()-1, B = sc.nextInt()-1;
			ls.get(A).add(B);
			ls.get(B).add(A);
		}
		sc.close();
		t_dist = new int[N];
		a_dist = new int[N];
		int dif[] = new int[N];
		dfs(u, 0,-1);
		adfs(v, 0, -1);
		for(int i=0;i<N;i++) {
			dif[i] = Math.max(a_dist[i]-t_dist[i], 0);
		}

		int max = 0;
		for(int i=0;i<N;i++) {
			if(dif[i]>0&&max<a_dist[i]) {
				max = a_dist[i];
			}
		}
			
		long ans = max - 1;
		
		System.out.println(ans);
	}
	static void dfs(int now, int cnt, int parent) {
		t_dist[now]=cnt;
		for(int i=0;i<ls.get(now).size();i++) {
			int next = ls.get(now).get(i);
			if(next == parent)continue;
			dfs(next, cnt+1, now);
		}
	}
	static void adfs(int now, int cnt, int parent) {
		a_dist[now]=cnt;
		for(int i=0;i<ls.get(now).size();i++) {
			int next = ls.get(now).get(i);
			if(next == parent)continue;
			adfs(next, cnt+1, now);
		}
	}
}
