/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    static int check;
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		int c[]=new int[n+1];
		int dp[]=new int[n+1];
		int dp2[]=new int[n+1];
		int dp3[]=new int[n+1];
		for(int i=1;i<=n;i++){
		    a[i]=sc.nextInt();
		    b[i]=sc.nextInt();
		    c[i]=sc.nextInt();
		}
		dp[1]=a[1];
		check=1;
		for(int i=2;i<=n;i++){
		    if(check==1)
		    dp[i]=dp[i-1]+max1(b[i],c[i]);
		    else if(check==2)
		    dp[i]=dp[i-1]+max2(a[i],c[i]);
		    else if(check==3){
		        dp[i]=dp[i-1]+max3(a[i],b[i]);
		    }
		}
		dp2[1]=b[1];
		check=2;
		for(int i=2;i<=n;i++){
		    if(check==1)
		    dp2[i]=dp2[i-1]+max1(b[i],c[i]);
		    else if(check==2)
		    dp2[i]=dp2[i-1]+max2(a[i],c[i]);
		    else if(check==3){
		        dp2[i]=dp2[i-1]+max3(a[i],b[i]);
		    }
		}
		dp3[1]=c[1];
		check=3;
		for(int i=2;i<=n;i++){
		    if(check==1)
		    dp3[i]=dp3[i-1]+max1(b[i],c[i]);
		    else if(check==2)
		    dp3[i]=dp3[i-1]+max2(a[i],c[i]);
		    else if(check==3){
		        dp3[i]=dp3[i-1]+max3(a[i],b[i]);
		    }
		}
		//System.out.println(dp[n]+" "+dp2[n]+" "+dp3[n]);
		int ans = Math.max(dp[n],Math.max(dp2[n],dp3[n]));
		System.out.println(ans);
	
	}
	private static int max1(int b,int c){
	    if(b>=c)
	    {check=2;
	    return b;}
	    else
	    {check=3;
	    return c;}
	}
	private static int max2(int a,int c){
	    if(a>=c)
	    {check=1;
	    return a;}
	    else
	    {check=3;
	    return c;}
	}
	private static int max3(int a,int b){
	    if(a>=b)
	    {check=1;
	    return a;}
	    else
	    {check=2;
	    return b;}
	}
	
}