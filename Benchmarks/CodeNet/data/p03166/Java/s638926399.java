//LongestPath
import java.io.*;
import java.util.*;
public class Main{
static int n,m;
static int[] b=new int[10005];
static ArrayList<Integer> adj[];
static int count=0;
static int[] dp;
public static void topoSort(int node,boolean[] vis,ArrayList<Integer> order){	
	vis[node]=true;
	for(Integer children:adj[node]){
		if(!vis[children]){
			topoSort(children,vis,order);
		}
	}
	order.add(0,node);
}
public static void  values(int[] dp,ArrayList<Integer> order){
	//elements of topological sort
	for(Integer x:order){
		for(Integer child:adj[x]){
			dp[child]=Math.max(dp[child],dp[x]+1);
		}
	}
	
}
public static int solve(){
	int ans=0;	
	boolean[] vis=new boolean[n+1];
	for(int i=1;i<=n;i++){		
			ArrayList<Integer> order=new ArrayList<>();
			topoSort(i,vis,order);		
			vis=new boolean[n+1];
			System.out.println(order);
			values(dp,order);			
	}

	for(int i=1;i<=n;i++){
		System.out.print(dp[i]+" ");
		ans=Math.max(ans,dp[i]);}
	return ans;
}
public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
  //      FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		String str[]=br.readLine().split(" ");
	 	StringBuilder ans=new StringBuilder();
	 	n=Integer.parseInt(str[0]);
	 	m=Integer.parseInt(str[1]);
	 	adj=new ArrayList[n+1];
	 	dp=new int[n+1];
	 	for(int i=1;i<=n;i++){adj[i]=new ArrayList<>();}
	 	for(int i=1;i<=m;i++){
	 		str=br.readLine().split(" ");
	 		int u=Integer.parseInt(str[0]);
	 		int v=Integer.parseInt(str[1]);
	 		adj[u].add(v);
	 	} 	
	 	ans.append(solve());
		// PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("sampleout.txt")));
  //       pw.write(ans.toString());
  //       pw.flush();
	 	System.out.println(ans.toString());

    }
}