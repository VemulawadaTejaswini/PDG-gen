import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] edge;
	static long[][] dp;
	static int m;
	static ArrayList<Long>[] fcum;
	static ArrayList<Long>[] bcum;
	static long[] ans;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		m=sc.nextInt();
		//0が白、１が黒
		dp=new long[n][2];
		edge=new ArrayList[n];
		fcum=new ArrayList[n];
		bcum=new ArrayList[n];
		for(int i=0; i<n; i++){
			dp[i][0]=dp[i][1]=1;
			bcum[i]=new ArrayList<>();
			edge[i]=new ArrayList<>();
			fcum[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			edge[x].add(y);
			edge[y].add(x);
		}
		dfs1(0,0);
		ans=new long[n];
		ans[0]=dp[0][1];
		dfs2(0,0,1);
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0; i<n; i++){
			pw.println(ans[i]);
		}
		pw.flush();
	}
	static void dfs2(int now,int from,long mu){
		int index=1;
		for(int i:edge[now]){
			if(i!=from){
				long tmu=(1+mu*((fcum[now].get(index-1)*bcum[now].get(fcum[now].size()-1-index))%m))%m;
				ans[i]=dp[i][1]*tmu%m;
				index++;
				dfs2(i,now,tmu);
			}
		}
	}
	static void dfs1(int now,int from){
		fcum[now].add(1L);
		bcum[now].add(1L);
		for(int i:edge[now]){
			if(i!=from){
				dfs1(i,now);
				dp[now][0]=dp[now][0]*dp[i][0]%m;
				dp[now][1]=dp[now][1]*(dp[i][0]+dp[i][1])%m;
			}
		}
		long cum=1;
		for(int i=0; i<edge[now].size(); i++){
			if(edge[now].get(i)!=from){
				cum=cum*(dp[edge[now].get(i)][1]+1)%m;
				fcum[now].add(cum);
			}
		}
		cum=1;
		for(int i=edge[now].size()-1; i>=0; i--){
			if(edge[now].get(i)!=from){
				cum=cum*(dp[edge[now].get(i)][1]+1)%m;
				bcum[now].add(cum);
			}
		}
	}
}
