import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] list;
	static int[] a;
	static int[] dp;
	static int[] ans;
	static int max;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		list=new ArrayList[n];
		a=new int[n];
		dp=new int[n+1];
		ans=new int[n];
		max=0;
		Arrays.fill(dp,1000000001);
		dp[0]=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			list[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int u=sc.nextInt()-1;
			int v=sc.nextInt()-1;
			list[u].add(v);
			list[v].add(u);
		}
		dfs(0,0);
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0; i<n; i++){
			pw.println(ans[i]);
		}
		pw.flush();
	}
	static void dfs(int now,int from){
		int idx=Arrays.binarySearch(dp,a[now]);
		if(idx<0){
			idx=-idx-1;
		}
		int tmp=idx;
		int val=dp[idx];
		dp[idx]=a[now];
		int pp=max;
		max=Math.max(max,idx);
		ans[now]=max;
		
		for(int i:list[now]){
			if(i!=from){
				dfs(i,now);
			}
		}
		max=pp;
		dp[tmp]=val;
	}
}