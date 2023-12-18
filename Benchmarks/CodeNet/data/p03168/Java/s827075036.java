import java.io.*;
import java.util.*;

public class Main {

		
	
	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n =Integer.parseInt(ana.nextToken()) ; 
		double h[] = new double[n+1] ; 
		ana = new StringTokenizer(jk.readLine()) ;
		for(int i=0 ;i<n ;i++)
		{
			h[i+1]=Double.parseDouble(ana.nextToken());
		}
		double dp[][]= new double[n+1][n+1] ; 
		dp[1][0]= 1-h[1] ; 
		dp[1][1]=h[1]  ;
 		for(int i=2 ; i<=n ;i++)
		{
			double c = h[i] ; 
			dp[i][0]=(1-c)*dp[i-1][0] ; 
			for(int k= 1; k<=i ;k++)
			{
				double res= dp[i-1][k]*(1-c) + dp[i-1][k-1]*c ; 
				dp[i][k] = res ; 
			}
		}
		double res= 0 ; 
		for(int i=(n/2)+1 ; i<=n ;i++)
		{
			res+=(dp[n][i]);
		}
		out.println(res);

		



		out.flush();
	}
}

