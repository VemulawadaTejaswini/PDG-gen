import java.util.*;
public class Main{
 static ArrayList<Integer> adj[];
public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
  int ver=sc.nextInt();
  int edg=sc.nextInt();
  adj=new ArrayList[ver];
  for(int i=0;i<ver;i++){
  adj[i]=new ArrayList<Integer>();
  }
  for(int i=0;i<edg;i++){
    int a=sc.nextInt();
    int b=sc.nextInt();
    adj[a-1].add(b-1);
   }
  boolean visited[]=new boolean[ver];
  int dp[]=new int[ver];
  for(int i=0;i<ver;i++){
  if(!visited[i])
    dfs(dp,visited,i,adj);
  }
  
  int max=0;
  for(int i=0;i<dp.length;i++){
    if(dp[i]>max)
      max=dp[i];
  }
  System.out.println(max);
}
        public static void dfs(int dp[],boolean visited[],int node,ArrayList<Integer> adj[]){
        visited[node]=true;
          for(int i=0;i<adj[node].size();i++){
              if(!visited[adj[node].get(i)])
                          dfs(dp,visited,adj[node].get(i),adj);
                          
               dp[node]=Math.max(dp[node],1+dp[adj[node].get(i)]);           
          }
          
        }
}