import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();

    	double[][] dp = new double[2][n+5];
    	int curr = 0;
    	int next = 1;
    	dp[curr][0] = 1;
    	for(int z = 0; z < n; z++) {
    		Arrays.fill(dp[next], 0);
    		double p = sc.nextDouble();
    		for(int i = 0; i < n; i++) {
    			dp[next][i+1] += dp[curr][i] * p;
    			dp[next][i] += dp[curr][i] * (1-p);
    		}
    		int tmp = curr;
    		curr = next;
    		next = tmp;
    	}

    	double ans = 0;
    	for(int i = (n+1)/2; i < n+1; i++)
			ans += dp[curr][i];

    	System.out.println(ans);
    }
}