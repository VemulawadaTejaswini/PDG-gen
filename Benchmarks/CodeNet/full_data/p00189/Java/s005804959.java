import java.util.*;
import java.awt.Point;

public class Main{
	public static int[][] dp;

	public static void dfs(int[][] map,int[] u,int s,int g,int cost){
		if(dp[s][g]!=0){
			if(u[g]>cost+dp[s][g]) u[g] = cost+dp[s][g];
			return;
		}

		if(u[s] > cost) u[s] = cost;
		else return;

		if(s == g)return;

		for(int i=0;i<map.length;i++){
			if(i==s) continue;
			if(map[s][i]!=0){
				dfs(map,u,i,g,cost+map[s][i]);
			}
		}
	}

	public static Point solve(int[][] map,int n){
		int ansDist=Integer.MAX_VALUE, ans=0;
		dp = new int[n][n];

		for(int i=0;i<n;i++){
			int res = 0;
			for(int j=0;j<n;j++){
				if(i==j) continue;
				int[] u = new int[n];
				Arrays.fill(u,Integer.MAX_VALUE);
				dfs(map,u,i,j,0);
				res += u[j];
				dp[i][j] = dp[j][i] = u[j];
			}
			if(ansDist>res){ansDist=res; ans=i;}
		}
		return new Point(ans,ansDist);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int m = 0;
			int[][] map = new int[10][10];
			while(n-- > 0){
				int s=sc.nextInt(), g=sc.nextInt(), d=sc.nextInt();
				map[s][g] = map[g][s] = d;
				if(m < s) m = s;
				if(m < g) m = g;
			}
			Point p = solve(map,m+1);
			System.out.println(p.x + " " + p.y);
		}
	}
}