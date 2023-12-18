import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int[] dp = new int[n];
		for(int i=0;i<n;i++){
			h[i] =sc.nextInt();
		}
		
		dp[0]=0;
		dp[1]=Math.abs(h[0]-h[1]);
		for(int i=2;i<n;i++){
			if(dp[i-1]+Math.abs(h[i-1]-h[i]) > dp[i-2]+Math.abs(h[i-2]-h[i]))
			dp[i]=dp[i-2]+Math.abs(h[i-2]-h[i]);
			else
			dp[i]=dp[i-1]+Math.abs(h[i-1]-h[i]);
		}
		
		System.out.print(dp[n-1]);
	}
}