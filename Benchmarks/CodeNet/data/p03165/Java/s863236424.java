/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n=s.length(),m=t.length(),len=0,row=0,col=0;
		int dp[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=m;j++){
		        if(s.charAt(i-1)==t.charAt(j-1)){
		            dp[i][j]=1+dp[i-1][j-1];
		            if(len<dp[i][j]){
		                len=dp[i][j];
		                row=i;col=j;
		            }
		        }
		        else{
		            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		        }
		    }
		}
		if(len==0) {System.out.println("");return;}
		int i=n,j=m;
		String ans="";
		while(i>0&&j>0){
		    if(s.charAt(i-1)==t.charAt(j-1)){
		        ans=s.charAt(i-1)+ans;i--;j--;
		    }else if(dp[i-1][j]>dp[i][j-1]) i--;
		    else j--;
		}
		System.out.println(ans);
		
	}
}
