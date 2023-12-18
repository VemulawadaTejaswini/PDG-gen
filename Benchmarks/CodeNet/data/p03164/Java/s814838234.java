import java.util.Arrays;
import java.util.Scanner;

class Main{
    static int KnapSack(int val[], int wt[], int n, int W) {
        // array to store final result
        // dp[i] stores the profit with KnapSack capacity "i"
        int[] dp = new int[W + 1];

        // initially profit with 0 to W KnapSack capacity is 0
        Arrays.fill(dp, 0);

        // iterate through all items
        for (int i = 0; i < n; i++)

            // traverse dp array from right to left
            for (int j = W; j >= wt[i]; j--)
                dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);

        /*
         * above line finds out maximum of dp[j](excluding ith element value) and val[i]
         * + dp[j-wt[i]] (including ith element value and the profit with
         * "KnapSack capacity - ith element weight")
         */
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int m = (int)1e3+10;
        int[] wi = new int[m],vi = new int[m];

        int V = 0;
        for (int i = 1; i <= n; i++) {
            wi[i] =sc.nextInt();
            vi[i] = sc.nextInt() ;
            // V+= vi[i];
        }

        int ret = KnapSack(vi,wi, n, w);
        System.out.println(ret);
        // long dp[] = new long[m];
        // long inf =(long) 1e13+10;
        // Arrays.fill(dp, inf);

        // dp[0] =0 ;
        // for(int item =1;item<=n;item++)
        // {
        //     int wt = wi[item], v = vi[item];
        //     for(int i =V;i>=v;i--)
        //     {
        //         dp[i] = Math.min(dp[i],dp[i-v]+wt);
        //     }
        // }
        // for(int i = V;i>=0;i--){
		// if(dp[i] <= w){
        //     // cout << i << endl;
        //     System.out.println(i);
		// 	break;
		// }
	// }
    }
}