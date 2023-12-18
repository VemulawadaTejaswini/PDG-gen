import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<ArrayList<Integer> >ve ; 
	static int dp[] ; 
	static void dfs(int i)
	{
		ArrayList<Integer> u = ve.get(i) ; 
		if(u.size()!=0)
		{
			int y = 0 ;
			for(int ele : u)
			{
				if(dp[ele]==0)
				{
					dfs(ele) ; 	
				}
				int va = dp[ele] ; 
				y = Integer.max(y, va) ; 
				
			}
	        dp[i]= y+1 ; 
		}
				
	}
	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n =Integer.parseInt(ana.nextToken()) ; 
		int m = Integer.parseInt(ana.nextToken()) ;
		dp = new int[n] ;  
		ve = new ArrayList<>() ; 
		boolean v[] = new boolean[n] ; 
		for(int i=0 ; i<n ;i++) ve.add(new ArrayList<>()) ; 
		for(int i=0 ; i<m ;i++)
		{
			ana = new StringTokenizer(jk.readLine()) ;
			int x= Integer.parseInt(ana.nextToken())-1 ; int y= Integer.parseInt(ana.nextToken())-1 ; 
			ve.get(x).add(y) ; 
			v[y]=true ;

		}
		for(int i=0 ; i<n ;i++)
		{
			if(!v[i]) 	dfs(i) ; 
		}



		int y = 0 ;
		for(int i=0 ; i<n ;i++)
		{
			if(dp[i]>y) y=dp[i] ; 
		}

		out.println(y);



		out.flush();
	}
}

