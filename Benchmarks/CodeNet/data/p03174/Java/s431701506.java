import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	static long MOD = 1000000007;
	static int N;
	static Long dp[][];

	static long countWays(int matrix[][], int n, int women)
	{
		if(n==0)
			return (women==((1<<N)-1))? 1: 0;
		if(women==((1<<N)-1))
			return 0;

		if(dp[n][women]!=null)
			return dp[n][women];

		long temp=0;
		for(int i=0;i<N;i++)
		{
			if((((women>>i)&1)==0) && matrix[n-1][i]==1)
			{
				temp += countWays(matrix, n-1, (women|(1<<i)));
				temp = temp % MOD;
			}
		}
		return dp[n][women]=temp;
	}

	public static void main(String[] args)
	{
		FastReader scan=new FastReader();
		int n=scan.nextInt();

		int matrix[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				matrix[i][j]=scan.nextInt();

		N=n;
		dp=new Long[n+1][(1<<N)];
		long ans = countWays(matrix, n, 0);
		System.out.println(ans);
	}
}


 class FastReader
{
    BufferedReader br;
    StringTokenizer st;
 
    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }
 
    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
 
    int nextInt()
    {
        return Integer.parseInt(next());
    }
 
    long nextLong()
    {
        return Long.parseLong(next());
    }
 
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
 
    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}
