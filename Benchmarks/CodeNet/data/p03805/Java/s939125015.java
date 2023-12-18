import java.util.*;

public class Main {
	static int[][] dp;
	static Node[] v;
	static ArrayList<Integer> edges[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next()), M = Integer.parseInt(sc.next());
		edges=new ArrayList[N];
		for(int i=0;i<N;i++) edges[i] = new ArrayList<>();
		for(int i=0;i<M;i++) {
			int a = Integer.parseInt(sc.next())-1, b = Integer.parseInt(sc.next())-1;
			edges[a].add(b);
			edges[b].add(a);
		}
		dp = new int[1<<N][N];
		for(int i =0;i<(1<<N);i++) for(int j=0;j<N;j++) dp[i][j] = -1;
		System.out.println(dp(1,0));
	}
	public static int dp(int i,int j) {
		if(i==0) return dp[i][j] = 1;
		if(dp[i][j] >= 0) return dp[i][j];
		dp[i][j]=0;
		for(int id : edges[j]) if((i & (1<<id)) != 0) dp[i][j]+= dp(i-(1<<id),id);
		return dp[i][j];
	}
}