
import java.util.*;

public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int cap = sc.nextInt();
		int max_val = 100000;
		int []w = new int[n];
		int[] v = new int[n];
		
		for(int i= 0 ;i < n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		int[][]dp  = new int[n+1][max_val+1];
		for(int [] k : dp)
		Arrays.fill(k, -1);
		dp[0][0]=0;
		for(int j = 1 ;j <= n;j++) {
			int val = v[j-1];
			int wei = w[j-1];
			for(int i =0  ;i <= max_val ; i++) {
				if(i==0) {dp[j][i]=0;continue;}
				int temp = Integer.MAX_VALUE;
				if(i >=val && dp[j-1][i-val]!=-1 && (long)dp[j-1][i-val] + (long)wei <=cap )
					temp = (int) (dp[j-1][i-val]+wei);
				
				if(dp[j-1][i]!=-1)temp = Math.min(dp[j-1][i], temp);
				if(temp!= Integer.MAX_VALUE)
				dp[j][i] = temp ; 
			}
		}
		
		int ans = 0 ;
		for(int i = max_val ; i>=0 ;i--)if(dp[n][i]!=-1) {ans=i;break;} 
  System.out.println(ans);
	}

}