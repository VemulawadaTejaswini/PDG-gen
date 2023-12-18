import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++) {
			al.add(new ArrayList<Integer>());
		}
		int m = input.nextInt();
		for(int i=0;i<m;i++) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			al.get(x1).add(y1);
		}
		System.out.println(func(al,n,m));
	}
	static int func(ArrayList<ArrayList<Integer>> al,int n,int m) {
		int dp[] = new int[n+1];
		boolean vis[] = new boolean[n+1];
		for(int i=1;i<=n;i++) {
			if(vis[i]==false) {
				dfs(i,al,dp,vis);
			}
		}
		int res = Integer.MIN_VALUE;
		for(int i=0;i<=n;i++) {
			res = Math.max(res, dp[i]);
		}
		return res;
	}
	static void dfs(int k,ArrayList<ArrayList<Integer>> al,int dp[],boolean vis[]) {
		vis[k] = true;
		for(Integer j:al.get(k)) {
			if(vis[j]==false) {
				dfs(j,al,dp,vis);
			}
			dp[k] = Math.max(dp[k], dp[j]+1);
		}
	}
}