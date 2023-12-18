
import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int size = sc.nextInt();
		long maxWeight = sc.nextLong();
		long values[] = new long[size];
		long weight[] = new long[size];
		for(int i=0;i<values.length;i++){
			weight[i]=sc.nextLong();
			values[i]=sc.nextLong();
		}
		long dp[][] = new long[values.length+1][maxWeight+1];
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				if(i==0||j==0)dp[i][j]=0;
				else if(weight[i-1]<=j){
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+values[i-1]);
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		} 
		System.out.println(dp[values.length][maxWeight]);
	}
}