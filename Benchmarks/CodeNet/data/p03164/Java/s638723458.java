import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int cap=scn.nextInt();
		long[] c=new long[n+1];
		long[] v=new long[n+1];
		
		
		for(int i=0;i<n;i++) {
			long a=scn.nextLong();
			long b=scn.nextLong();
			c[i]=a;
			v[i]=b;
			
			
		}
		System.out.println(kp(c,v,cap,0));
				

	}
	public static long kp(long[] c,long[] v,int cap,int vidx) {
		long[][] dp=new long[c.length+1][cap+1];
		for(int i=0;i<=c.length;i++) {
			for(int j=0;j<=cap;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}else {
					
					
					if(j>=c[i-1]) {
						//System.out.println(j-c[i-1]);
						dp[i][j]=Math.max(dp[i-1][j], v[i-1]+dp[i-1][(int) (j-c[i-1])]);
					}else {
						dp[i][j]=dp[i-1][j];
					}
					
				}
				
			}
		}
		
		
		return dp[c.length-1][cap];
		
		
		
		
	}

}
