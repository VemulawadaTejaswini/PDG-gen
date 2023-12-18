import java.util.*;
public class Main {
	static int dp[] ,N ,M;
	static List<ArrayList<Integer>> G; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); M = sc.nextInt();
		G = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)G.add(new ArrayList<Integer>());
		for(int i=0;i<M;i++) {
			G.get(sc.nextInt()-1).add(sc.nextInt()-1);
		}
		sc.close();
		dp = new int[N];//nを頂点とする時の最長経路の長さ
		Arrays.fill(dp, -1);
		
		int ans = 0;
		//全頂点を始点にする場合を調べる。
		for(int i=0;i<N;i++) {
			ans = Math.max(ans,rec(i));
		}
		System.out.println(ans);
	}
	//　頂点vを始点とした時の最長経路の長さを返す。
	static int rec(int v) {
		if(dp[v]!=-1)return dp[v];
		int ret = 0;
		for(int to:G.get(v)) {
			ret = Math.max(ret, rec(to)+1); //DAGなので、次のノードを始点とした時の最長に、+1する事で自分始点の最長経路の長さが分かる。
		}
		return dp[v] = ret;
	}
}
