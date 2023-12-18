import java.util.*;
public class Main{


public static void main (String []args)
{
	Scanner scan=new Scanner(System.in);
	//long t=scan.nextLong();
	//long ways[]=new long[1000000000];
	//ways[1]=1;
	//ways[i]=ways[i-1]*2;
	
	//while(t-->0){
         int n=scan.nextInt();
       //  int k=scan.nextInt();
         int a[]=new int[n];
         int b[]=new int[n];
          int c[]=new int[n];
        // int dp[]=new int[n];
        for(int i=0;i<n;i++)
       {  a[i]=scan.nextInt();
          b[i]=scan.nextInt();
          c[i]=scan.nextInt();
       }
       
	int dp[][]=new int[n][3];
	for(int i=1;i<n;i++)
        for(int j=0;j<3;j++)
        dp[i][j]=Integer.MIN_VALUE;
        dp[0][0]=a[0];
        dp[0][1]=b[0];
	dp[0][2]=c[0];
	
	for(int i=1;i<n;i++)
	{  
	
		
		dp[i][0]=a[i]+Math.max(dp[i-1][1],dp[i-1][2]);
		dp[i][1]=b[i]+Math.max(dp[i-1][0],dp[i-1][2]);
	     dp[i][2]=c[i]+Math.max(dp[i-1][1],dp[i-1][0]);
		}
         
         System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
//}//
}
}
