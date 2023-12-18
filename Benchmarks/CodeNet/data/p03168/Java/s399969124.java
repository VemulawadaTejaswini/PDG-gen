import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int i;	
		int n=sc.nextInt();
		double p[]=new double[n];
		for(i=0;i<n;i++)
			p[i]=sc.nextDouble();
		double dp[]=new double[n+1];
		calc(0,0,1,dp,p);
		double ans=0;
		for(i=(n+1)/2;i<=n;i++)
			ans+=dp[i];
		System.out.println(ans);
	}
	public static void calc(int ind,int hc,double val,double dp[],double p[])
	{
		int i; int n=p.length;
		if(ind==n)
		{
			dp[hc]+=val;
			return;
		}
		calc(ind+1,hc+1,val*p[ind],dp,p);
		calc(ind+1,hc,val*(1-p[ind]),dp,p);		
	}
}