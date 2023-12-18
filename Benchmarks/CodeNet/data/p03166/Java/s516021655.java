import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<ArrayList<Integer> >ve ; 
	static int dp[] ; 

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
			ve.get(y).add(x) ; 
			v[x]=true ;

		}
		Queue<Integer> q = new LinkedList<>() ;
		for(int i=0 ; i<n ;i++)
		{
			if(!v[i])
			{
				q.add(i) ; 
			}
		}
		while(!q.isEmpty())
		{
			int u = q.poll() ; 
			ArrayList<Integer> pa = ve.get(u) ; 
			for(int ele : pa)
			{
				dp[ele] = Integer.max(dp[ele], dp[u]+1) ; 
				q.add(ele) ; 

			}
		}
		int y = 1 ;
		for(int i=0 ; i<n ;i++)
		{
			if(dp[i]>y) y=dp[i] ; 
		}

		out.println(y);



		out.flush();
	}
}

