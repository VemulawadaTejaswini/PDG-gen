import java.util.*;
import java.lang.*;
class deque{
	static long[][][]dp=new long[3001][3001][2];
	//static boolean turn=true;
	static long solve(int i,int j,int[]arr,int turn){
		if(i>j)
			return 0;
		if(dp[i][j][turn]!=0)
			return dp[i][j][turn];
		if(turn==1)
			return dp[i][j][turn]=Math.max(arr[i]+solve(i+1,j,arr,0),arr[j]+solve(i,j-1,arr,0));
		else
			return dp[i][j][turn]=Math.min(solve(i+1,j,arr,1),solve(i,j-1,arr,1));
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []arr=new int[n+1];
		long sum=0;
		
		long y=0;
		for(int i=1;i<=n;i++){
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		long x=solve(1,n,arr,1);
		 y=sum-x;
		System.out.println(x-y);
	}
}