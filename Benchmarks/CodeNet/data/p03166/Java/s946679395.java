/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class Main {
    static int dp[];
    static boolean vis[];
    public static void dfs(int in,ArrayList<Integer>[]graph){
       
         vis[in]=true;
         for(int i=0;i<graph[in].size();i++){
             int cur=graph[in].get(i);
            if(!vis[cur])dfs(cur,graph);
             dp[in]=Math.max(dp[in],1+dp[cur]);
         
         }
       
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s=br.readLine().split("\\s+");
		
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            

            ArrayList<Integer>[]graph=new ArrayList[n];
            for(int i=0;i<n;i++)graph[i]=new ArrayList<>();
		   
		    for(int i=0;i<m;i++){
                s=br.readLine().split("\\s+");
                int v=Integer.parseInt(s[0])-1;
                int u=Integer.parseInt(s[1])-1;
                graph[v].add(u);
                
            }

           vis=new boolean[n];
            dp=new int[n];
            
            int max=0;
            for(int i=0;i<n;i++){
                if(!vis[i]){
                  dfs(i,graph);
                }

            }
            for(int i=0;i<n;i++)max=Math.max(max,dp[i]);
            
         
        
            System.out.print(max);
		
		    
	
		
	}
}
