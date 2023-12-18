import java.util.*;
public class Main {
	
	static int MOD = 1_000_000_007;
	static int N, K;
	static long ans;
	static List<Integer>[] edge;
	
	static void dfs(int now, int from) {
		int color = from == -1 ? K-1 : K-2;
		for(int i : edge[now]) {
			if(i != from) {
				ans = ans * color % MOD;				
				color--;
			}
		}
		for(int i : edge[now])
			if(i != from)
				dfs(i, now);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		ans = K;
		edge = new ArrayList[N];
		for(int i = 0; i < N; i++)
			edge[i] = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            edge[a].add(b);
            edge[b].add(a);
        }
		dfs(0, -1);
		System.out.println(ans);

	}

}