import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		long[][] dp=new long[n][50*(n-1)+1];
		for(int i=0; i<n; i++){
			Arrays.fill(dp[i],Long.MAX_VALUE);
		}
		ArrayList<State>[] list=new ArrayList[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			int a=sc.nextInt();
			long b=sc.nextLong();
			list[u].add(new State(v,a,b));
			list[v].add(new State(u,a,b));
		}
		int[][] cd=new int[n][2];
		for(int i=0; i<n; i++){
			cd[i][0]=sc.nextInt();
			cd[i][1]=sc.nextInt();
		}
		PriorityQueue<State> q=new PriorityQueue<>((x,y)->((x.time-y.time<0)?-1:1));
		if(s>50*(n-1)){
			s=50*(n-1);
		}
		q.add(new State(0,s,0));
		while(!q.isEmpty()){
			State ss=q.poll();
			if(dp[ss.to][ss.money]==Long.MAX_VALUE){
				dp[ss.to][ss.money]=ss.time;
			}else{
				continue;
			}
			if(ss.money+cd[ss.to][0]<=50*(n-1)){
				q.add(new State(ss.to,ss.money+cd[ss.to][0],ss.time+cd[ss.to][1]));
			}
			for(State i:list[ss.to]){
				if(ss.money-i.money>=0 && dp[i.to][ss.money-i.money]==Long.MAX_VALUE){
					q.add(new State(i.to,ss.money-i.money,ss.time+i.time));
				}
			}
		}
		for(int i=1; i<n; i++){
			long ans=Long.MAX_VALUE;
			for(int j=0; j<=50*(n-1); j++){
				ans=Math.min(ans,dp[i][j]);
			}
			System.out.println(ans);
		}
	}
	static class State{
		int to,money;
		long time;
		State(int to,int money,long time){
			this.to=to;
			this.money=money;
			this.time=time;
		}
	}
}