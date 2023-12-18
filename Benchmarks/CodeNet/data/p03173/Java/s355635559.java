
import java.util.*;


public class Main{ 


    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int arr[]=new int[n+1];
	long presum[]=new long[n+1];
	long sum=0;
	for(int i=1;i<=n;i++) {
		arr[i]=s.nextInt();
		sum+=arr[i];
		presum[i]=sum;
	}
	
	
	long dp[][]=new long[n+1][n+1];
	
	
	for(int i=1;i<=n;i++) {
		
		dp[i][i]=0;
		
	}
	
	for(int i=1;i<=n-1;i++) {
		int row=1;
		int col=i+1;
		while(col<=n) {
			long res=Long.MAX_VALUE;
			for(int k=row;k<col;k++) {
				
				res=Math.min(res, dp[row][k]+dp[k+1][col]+sum(row,col,presum));
			}
			dp[row][col]=res;
			row++;
			col++;
		}
	}
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			System.out.print(dp[i][j]+" ");
//		}
//		System.out.println();
//	}
	System.out.println(dp[1][n]);
   }
   
    public static long sum(int row,int col,long presum[]) {
    	return presum[col]-presum[row-1];
    }
}