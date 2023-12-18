import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    ArrayList<Integer>[] graph=new ArrayList[n];
    for(int i=0;i<n;i++)
      graph[i]=new ArrayList<Integer>();
    for(int i=0;i<m;i++){
      int x=s.nextInt();
      int y=s.nextInt();
      graph[x-1].add(y-1);
    }
    int[] dp=new int[n];
    for(int i=0;i<n;i++){
      dfs(i,graph,dp);
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      max=Math.max(dp[i],max);
    }
    
    System.out.println(max);
  }
  public static int dfs(int i, ArrayList<Integer>[] graph, int[] dp){
    if(graph[i].size()==0){
      return 0;
    }
    if(dp[i]!=0)
      return dp[i];
    dp[i]=Integer.MIN_VALUE;
    for(int j=0;j<graph[i].size();j++){
      dp[i]=Math.max(dp[i],dfs(graph[i].get(j),graph,dp)+1);
                     }
                   return   dp[i];
                     }
}
 