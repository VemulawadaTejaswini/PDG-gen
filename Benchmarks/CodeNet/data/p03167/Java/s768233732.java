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
	int h=sc.nextInt();
	int w=sc.nextInt();
	sc.nextLine();
	char c[][]=new char[h][w];
	for(int i=0;i<h;i++){
	    String s=sc.nextLine();
	  
	   char  c1[]=s.toCharArray();
	   for(int j=0;j<w;j++){
	       c[i][j]=c1[j];
	   }
	}
	int  m=100000007;
	int dp[][]=new  int[h][w];
	for(int i=0;i<h;i++)
	{
	    if(c[i][0]=='.')
	    dp[i][0]=1;
	    else
	    break;
	}
		for(int i=0;i<w;i++)
	{
	    if(c[0][i]=='.')
	    dp[0][i]=1;
	    else
	    break;
	}
      dp[0][0]=1;
	for(int i=1;i<h;i++){
	    for(int j=1;j<w;j++){
	        if(c[i][j]=='#') continue;
	      
	        dp[i][j]=((dp[i-1][j]%m+dp[i][j-1]%m))%m;
	    }
	}
	System.out.println(dp[h-1][w-1]);
		
	}
}
