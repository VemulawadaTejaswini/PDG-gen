import java.math.*;
import java.util.*;

import static java.math.BigDecimal.*;
import static java.util.Arrays.*;
public class Main
{
	int [][]a;
	ArrayList<Integer>[]g;
	int []x;
	int []y;
	int []z;
	int st;
	BigDecimal []dp;
	BigDecimal []fz;
	BigDecimal []fz1;
	BigDecimal getdp(int u,int st)
	{
		if (u==st)return dp[u]=ONE;
		if (dp[u].compareTo(ONE.negate())>0)return dp[u];
		BigDecimal sum=ZERO;
		for (Integer i:g[u])
		{
			sum=sum.add(getdp(i,st));
		}	
		return dp[u]=sum;
	}
    @SuppressWarnings("unchecked")
	void run()
    {
    	Scanner cin=new Scanner(System.in);
    	int i,j,k;
    	while (cin.hasNext())
    	{
    		int n=cin.nextInt(),m=cin.nextInt(),q=cin.nextInt();
    		if (n==0)break; 
    		a=new int[n][n];
    		x=new int[m];
    		y=new int[m];
    		z=new int[m];
    		for (i=0;i<n;i++)
    		{
    			fill(a[i],-1);
    		}
    		for (i=0;i<n;i++)a[i][i]=0;
    		for (i=0;i<m;i++)
    		{
    			x[i]=cin.nextInt();
    			y[i]=cin.nextInt();
    			z[i]=cin.nextInt();
    			a[x[i]][y[i]]=z[i];
    		}
    		for (k=0;k<n;k++)
    		{
    			for (i=0;i<n;i++)
    			{
    				for (j=0;j<n;j++)
    				{
    					if (a[i][k]==-1||a[k][j]==-1)continue;
    					if (a[i][j]==-1||a[i][j]>a[i][k]+a[k][j])
    					{
    						a[i][j]=a[i][k]+a[k][j];
    					}
    				}
    			}
    		}
    		BigDecimal tot=ZERO;
    		g=new ArrayList[n];
    		for (i=0;i<n;i++)
    		{
    			g[i]=new ArrayList<Integer>();
    		}
    		dp=new BigDecimal[n];
    		fz=new BigDecimal[n];
    		fz1=new BigDecimal[n];
    		for (i=0;i<n;i++)
    		{
    			st=i;
    			for (j=0;j<n;j++)
        		{
    				g[j].clear();
        		}
    			for (j=0;j<m;j++)
        		{
        			if (a[st][x[j]]+z[j]==a[st][y[j]])
        			{
        				g[y[j]].add(x[j]);
        			}
        		}
    			fill(dp,ONE.negate());
    			for (j=0;j<n;j++)
    			{
    				getdp(j,st);
    			}
    			fz1[st]=dp[n-1];
    			if (i==0)
    			{
    				tot=dp[n-1];
    				for (j=0;j<n;j++)
    				{
    					fz[j]=dp[j];
    				}
    			}
    		}
    		for (i=0;i<q;i++)
    		{
    			int x=cin.nextInt();
    			System.out.println(fz[x].multiply(fz1[x]).divide(tot,16,ROUND_HALF_UP));
    		}
    	}
    }
    public static void main(String args[])
    {
    	new Main().run();
    }
}