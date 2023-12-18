import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static long maxProfit(int weivalue[][],int capacity){
		
		int minWeight=Integer.MAX_VALUE;
		int maxWeight=Integer.MIN_VALUE;
		for(int i=0;i<weivalue.length;i++){
			if(weivalue[i][0]<minWeight)
				minWeight=weivalue[i][0];
			if(weivalue[i][0]>maxWeight)
				maxWeight=weivalue[i][0];
		}
		
		
		
		int size=(capacity-minWeight+1);
		long dp[][]=new long[2][size];
		
		for(int i=0;i<size;i++)
			dp[0][i]=0;
		for(int i=1;i<=weivalue.length;i++){
			for(int j=minWeight;j<=capacity;j++){
				int k=(j-minWeight);
				if(weivalue[i-1][0]<=j)
					dp[i%2][k]=Math.max(dp[(i-1)%2][k],weivalue[i-1][1]+(j-weivalue[i-1][0]<minWeight?0:dp[(i-1)%2][j-weivalue[i-1][0]-minWeight]));
				else
					dp[i%2][k]=dp[(i-1)%2][k];
			}
		}

		
		
		return dp[weivalue.length%2][size-1];
		
		
	}
	
	public static void main(String []args){
		
		int n=sc.nextInt();
		int w=sc.nextInt();
		int weivalue[][]=new int[n][2];
		for(int i=0;i<n;i++){
			weivalue[i][0]=sc.nextInt();
			weivalue[i][1]=sc.nextInt();
		}
		
		
		System.out.println(maxProfit(weivalue,w));
		
	}
}