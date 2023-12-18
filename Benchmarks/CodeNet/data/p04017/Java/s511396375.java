import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	  static int MOD=1000000007;
	  static long p[][]=new long[405][405];
	  static long sum[][]=new long[405][405];
	  static long dp[][]=new long[35][100005];
	  static long a[]=new long[100005];
	  static long b[]=new long[405];
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
          int n=in.nextInt();
         
         for(int i=0;i<=30;i++)
        	 dp[i]=new long[100005];
          for(int i=1;i<=n;i++)
          {
        	  a[i]=in.nextLong();
          }
          int L=in.nextInt();
          for(int i=1;i<=n;i++)
          {
        	  int pos=find(1,n,a[i]+L);
        	  //System.out.println("pos:"+pos);
        	  dp[0][i]=pos;
          }
          for(int i=1;i<=30;i++)
          {
        	  for(int j=1;j<=n;j++)
        	  {
        		  dp[i][j]=dp[i-1][(int) dp[i-1][j]];
        	  }
          }
          int q=in.nextInt();
          while(q-->0)
          {
        	  int l=in.nextInt();
        	  int r=in.nextInt();
        	  if(l>r) {int t=l;l=r;r=t;}
        	  long ans=0;
        	  for(int i=30;i>=0;i--)
        	  {
        		  if(dp[i][l]<r)
        		  {
        			  ans+=(1<<i);
        			  l=(int) dp[i][l];
        		  }
        	  }
        	  System.out.println(ans+1);
          }
    	  return;
      }
	private static int find(int l, int r, long v) {
		// TODO 自动生成的方法存根
		while(l<r)
		{
			int mid=(l+r+1)>>1;
		    if(a[mid]<=v)
		    	l=mid;
		    else
		    	r=mid-1;
		}
		return l;
	}
}
