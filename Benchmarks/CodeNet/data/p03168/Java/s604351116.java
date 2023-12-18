/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    public static double func(double p [], int n , int tail,int curr,double dp[][])
    {
        
        
        
        if((n-tail)<=tail)
        {
            return 0.0;
        }
        
        if(curr>=n)
        {
            
            return 1.0;
            
        }
        if(dp[curr][n-tail-1]>-1.0)return dp[curr][n-tail-1];
        return dp[curr][n-tail-1]=p[curr]*func(p,n,tail,curr+1,dp)+(1.0-p[curr])*func(p,n,tail+1,curr+1,dp);
      
    }
    
    
	public static void main(String[] args) throws Exception {
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String ss[]=(br.readLine()).split(" ");
		
		double p[]=new double [n];
		for (int i=0;i<n;i++)
		{
		    p[i]=Double.parseDouble(ss[i]);
		    
		}
	    double dp[][]=new double[n][n];
	    for(double row[]:dp)
	    Arrays.fill(row,-1.0);
	    
		double ans1=func(p,n,0,0,dp);
		System.out.println(ans1);
		
		
		
		
	}
}
