

import java.util.*;
public class Main{
   

  public static int longestPath(ArrayList<ArrayList<Integer>> graph,int sv,int dp[])
  {
	  
	  ArrayList<Integer> edges=graph.get(sv);
	 
	  int ans=0;
	  if(edges.size()==0)
		  return 0;
	  if(dp[sv]!=0)
		  return dp[sv];
	  for(int i=0;i<edges.size();i++)
	  {
		  
		  ans=Math.max(ans,1+longestPath(graph,edges.get(i),dp));
	  }
	  dp[sv]=ans;
	  return ans;
  }
	
  public static void main(String[] args)
  {
     
  Scanner s=new Scanner(System.in);
  int nVert=s.nextInt();
  int nEdges=s.nextInt();
  ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
  for(int i=0;i<=nVert;i++)
  {
	  graph.add(i,new ArrayList<Integer>());
  }
  
  for(int i=1;i<=nEdges;i++)
  {
	  int sVert=s.nextInt();
	  int eVert=s.nextInt();
	
	  graph.get(sVert).add(eVert);
	  
  }
  
int dp[]=new int[nVert+1];
  int ans=Integer.MIN_VALUE;
  for(int i=1;i<=nVert;i++) {
	
  ans=Math.max(ans,longestPath(graph,i,dp));
  }
 System.out.println(ans);
  s.close();
    
  }
}
