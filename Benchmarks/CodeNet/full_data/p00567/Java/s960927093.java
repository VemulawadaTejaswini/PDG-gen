import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int l[] = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			sum += l[i];
		}
		
		int ans = Integer.MAX_VALUE;
		for(int left = 0; left < n; left++) {
			int low = 0;
			for(int right = left; right < n; right++) {
				low += l[right];
				int[] dp = new int[n + 1];
				dp[0] = low;
				
				for(int position = 0; position < n; position++) {
					int length = 0;
					dp[position + 1] = Integer.MAX_VALUE;
					
					for(int le = position; le >= 0; le--) {
						length += l[le];
						
						if(position == n - 1 && le == 0) continue;
						
						
						if(length >= low) dp[position + 1] = Math.min(dp[position + 1], Math.max(length, dp[le ]));
					}
				}
				
				ans = Math.min(ans, dp[n] - low);
			}
		}
		
		System.out.println(ans);
	}
}
