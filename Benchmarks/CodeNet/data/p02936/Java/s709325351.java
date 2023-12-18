import java.util.*;

public class Main{
	public static List<List<Integer>> to = new ArrayList<>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		for(int i=0;i<N+10;i++) to.add(new ArrayList<Integer>());
		
		//辺を全て貼る
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			//双方向に辺を貼る
			to.get(a).add(b);
			to.get(b).add(a);
		}
		//頂点に値を加える。
		int cnt[] = new int[N];
		for(int i=0;i<Q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			cnt[p-1] += x;	
		}
		dfs(1,-1,cnt);
		StringBuilder sb = new StringBuilder();
		for(int tmp:cnt) {
			sb.append(tmp);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	static void dfs(int v, int f, int[] cnt) {
		for(int tmp:to.get(v)) {
			if (tmp==f)continue;//親については何もしない
			cnt[tmp-1]+=cnt[v-1];
			dfs(tmp, v, cnt);
		}
	}
}
