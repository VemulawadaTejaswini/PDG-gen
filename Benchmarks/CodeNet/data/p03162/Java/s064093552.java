import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int [][] mat=new int[N][3];
	 for(int i=0;i<N;i++)
	 {
	     for(int j=0;j<3;j++)
	     {
	         mat[i][j]=sc.nextInt();
	         // System.out.print(mat[i][j]+" ");
	     }
	    // System.out.println();
	 }
	 int [][] dp=new int[N][3];
	 dp[0][0]=mat[0][0];
	 dp[0][1]=mat[0][1];
	 dp[0][2]=mat[0][2];
	 
	 for(int i=1;i<N;i++)
	 {
	     for(int j=0;j<3;j++)
	     {
	         if(j==0)
	         {
	             dp[i][j]=mat[i][j]+Math.max(dp[i-1][j+1],dp[i-1][j+2]);
	         }
	         if(j==1)
	         {
	             dp[i][j]=mat[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j+1]);
	         }
	         if(j==2)
	         {
	             dp[i][j]=mat[i][j]+Math.max(dp[i-1][j-2],dp[i-1][j-1]);
	         }
	     }
	 }
	 int max=0;
	 for(int j=0;j<3;j++)
	 {
	     if(dp[N-1][j]>max)
	     {  max=dp[N-1][j];}
	 }
	
	 System.out.println(max);
	}
}
