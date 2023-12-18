import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int max = sc.nextInt();
    	int[] w = new int[n];
    	int[] v = new int[n];
    	for(int i = 0; i < n; i++) {
    		w[i] = sc.nextInt();
    		v[i] = sc.nextInt();
    	}

    	long[] dp = new long[max+1];
    	for(int i = 0; i < n; i++) {
    		for(int j = max; j >= w[i]; j--) {
    			dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
    		}
    		// System.out.println(Arrays.toString(dp));
    	}

    	// System.out.println(n);
    	// System.out.println(Arrays.toString(dp));
    	System.out.println(dp[max]);
    }
}	