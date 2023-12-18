/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		int n=s.length();
		int m=t.length();
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++ ){
		    for(int  j=0;j<=m;j++){
		        if(i==0||j==0)
		        dp[i][j]=0;
		       else if(s.charAt(i-1)==t.charAt(j-1))
		        dp[i][j]=dp[i-1][j-1]+1;
		        else
		        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		       //  System.out.print(dp[i][j]+" ");
		    }
		  //   System.out.println(" ");
		}
		    int idx=dp[n][m];
		    int  t1=idx;
		   // System.out.println(t1);
		    char lcs[]=new char[idx+1];
		    lcs[idx]=' ';
		    int  i=n;
		    
		    int j=m;
		    while(i>0&&j>0){
		        if(s.charAt(i-1)==t.charAt(j-1)){
		             lcs[idx-1]=s.charAt(i-1);
		            i--;
		            j--;
		            idx--;
		           
		            
		        }
		        else if(dp[i-1][j]>dp[i][j-1])
		        i--;
		        else
		        j--;
		    }
		    for(int k=0;k<=t1;k++){
		        System.out.print(lcs[k]);
		    }
		
	}
}
