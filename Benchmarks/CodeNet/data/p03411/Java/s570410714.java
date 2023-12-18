import java.util.*;

public class Main {
	static int cnt = 0;
	static ArrayDeque<Integer> stack = new ArrayDeque<>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long a[] = new long[n+2];
		
		long dp[][] = new long[n+2][n+2];
		
		for(int i=1;i<=n;i++){
			a[i] = sc.nextLong();
			dp[i][i] = a[i];
		}
		
		for(int len = 2;len<=n;len++){
			for(int s = 1;s + len-1<=n;s++){
				dp[s][s+len-1] = Math.max(dp[s+1][s+len-1], dp[s][s+len-2]);
				dp[s][s+len-1] = Math.max(dp[s+1][s+len-2], dp[s][s+len-1]);
				
				for(int m = s+1;m<=s+len-2;m++){
					dp[s][s+len-1] = Math.max(dp[s][s+len-1], dp[s][m-1] + dp[m+1][s+len-1]);
				}
				
			}
		}
		
		System.out.println(dp[1][n]);
		print(dp, 1, n);
		System.out.println(cnt);
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		
	}
	static int print(long[][] dp, int l, int r) {
		int left = 0;
		if(l>=r)
			return 0;
		
		for(int m = l;m<=r;m++){
			if(dp[l][r] == dp[l][m-1] + dp[m+1][r]){
				cnt++;
				
				left = print(dp, l, m-1);
				stack.push(m-left);
				print(dp, m+1, r);
				
				return left+1;
			}
		}
		
		if(dp[l][r] == dp[l+1][r-1]){
			cnt+=2;
			stack.push(l);
			stack.push(r);
		}
		return 1;
	}
	
}
