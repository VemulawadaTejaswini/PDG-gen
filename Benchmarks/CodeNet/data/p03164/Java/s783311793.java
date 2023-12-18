import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt();
		long W = input.nextLong();
		long[][] dp = new long[101][100001]; //Minimum weights to get value v by item N
		//100000 = 100*1000 = (max items)*(max value)
		//Arrays.fill(dp, (long)(1e5));
		long[] w = new long[N+1];
		int[] v = new int[N+1];
		int maxVal = 0;
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			w[i]=input.nextLong();
			v[i] = input.nextInt();
			maxVal=Math.max(maxVal, v[i]);
		}
		dp[1][v[1]]=w[1];
		if (w[1]<=W) ans=Math.max(ans, v[1]);
		for (int i = 2; i <= N; i++) {
			dp[i][v[i]]=w[i];
			for (int val = 1; val <= maxVal*N; val++){
				if (dp[i][val]==0) dp[i][val]=dp[i-1][val];
				if (dp[i][val]==0&&val-v[i]>=0&&dp[i-1][val-v[i]]>0) dp[i][val]=dp[i-1][val-v[i]]+w[i];
				else if (val-v[i]>=0&&dp[i-1][val-v[i]]>0) dp[i][val] = Math.min(dp[i][val], dp[i-1][val-v[i]]+w[i]);
				if (dp[i][val]<=W&&dp[i][val]>0) ans=Math.max(ans, val);
			}
			/*int value = v[i-1];
			long weight = w[i-1];
			dp[i][value]=weight;
			if (dp[i][value]<=W) ans=Math.max(ans, value);
			for (int j = 1; j < i; j++) {
				value+=v[j-1];
				weight+=w[i-1];
			}*/
		} 
		System.out.println(ans);
	}	
}