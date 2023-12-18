import java.util.*;

public class Main {

	

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    int mod=(int)(Math.pow(10, 9)+7);   
		int n=sc.nextInt();
	        int m=sc.nextInt();
	        char arr[][]=new char[n][m];
	        
	        for(int i=0;i<n;i++)
	        {
	        	String s=sc.next();
	        	arr[i]=s.toCharArray();
	        }
	        long dp[][]=new long[n][m];
	        for(int i=0;i<n;i++)
	        {
	        	if(arr[i][0]=='#')
	        	{
	        		break;
	        	}
	        	dp[i][0]=1;
	        }
	        for(int i=0;i<m;i++)
	        {
	        	if(arr[0][i]=='#')
	        	{
	        		break;
	        	}
	        	dp[0][i]=1;
	        }
	        ///
	        for(int i=1;i<n;i++)
	        {
	        	for(int j=1;j<m;j++)
	        	{
	        		if(arr[i][j]=='.')
	        		{
	        			dp[i][j]=dp[i-1][j]+dp[i][j-1];
	        			dp[i][j]%=mod;
	        		}
	        	}
	        }
	        System.out.println(dp[n-1][m-1]);
			
	    		
	}
	
	
}
