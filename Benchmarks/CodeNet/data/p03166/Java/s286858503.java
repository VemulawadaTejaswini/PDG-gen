/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;
public class Main
{
    
    
    
    public static int func(ArrayList <Integer>ls[], int vis[], int len, int j,int dp[])
    {
        int temp=0;
        int ans=0;
        
        if(ls[j]==null)
        {
            return 0;
        }
         
        if( vis[j]==1)
        {
            return dp[j];
        }
       
        
        else {
            for(int k =0;k<ls[j].size();k++)
            {
            
            
            temp= 1+ func(ls,vis,len,ls[j].get(k),dp);
            
           // dp[ls[j].get(k)]=temp;
            ans=Math.max(temp,ans);
            
            }
        }
        vis[j]=1;
        return dp[j]=ans;
        
        
    }
    
    
	public static void main(String[] args) throws Exception {
	//	System.out.println("Hello World");
		
		int N,M;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	String ss[]=s.split(" ");
	N=Integer.parseInt(ss[0]);
	M=Integer.parseInt(ss[1]);
	int x=0,y=0;
	int ans=0;
	int vis[]=new int[N+1];
	int dp[]=new int [N+1];
	Arrays.fill(dp,0);
	//int dp[][]=new int[N+1][N+1];
	ArrayList<Integer>ls[]=new ArrayList[N+1];
	for(int i=0;i<M;i++)
	{
	    s=br.readLine();
	    ss=s.split(" ");
	 x=Integer.parseInt(ss[0]);
	y=Integer.parseInt(ss[1]);
	 if(ls[x]==null)
	 {
	     ls[x]=new ArrayList();
	 }
	    ls[x].add(y);
	    
	}
	for(int i=1;i<=N;i++)
	{
	 if(vis[i]==1)
	 {
	     ans=Math.max(ans,dp[i]);
	     continue;
	 }
	 if(ls[i]!=null)
	 {
	     vis[i]=1;
	     for(int j=0;j<ls[i].size();j++)
	     {
	      int temp =1+func(ls,vis,0,ls[i].get(j),dp);
	      dp[i]=Math.max(dp[i],temp);
	      
	     }
	      ans=Math.max(ans,dp[i]);
	 }
	   
	}
	System.out.println(ans);
   
	}
}
