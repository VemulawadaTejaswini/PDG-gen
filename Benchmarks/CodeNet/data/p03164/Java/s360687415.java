import java.util.Arrays;
import java.util.Scanner;

class Main{
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
            V+= vi[i];
        }

        long dp[] = new long[m];
        long inf =(long) 1e13+10;
        Arrays.fill(dp, inf);

        dp[0] =0 ;
        for(int item =1;item<=n;item++)
        {
            int wt = wi[item], v = vi[item];
            for(int i =V;i>=v;i--)
            {
                dp[i] = Math.min(dp[i],dp[i-v]+wt);
            }
        }
        for(int i = V;i>=0;i--){
		if(dp[i] <= w){
            // cout << i << endl;
            System.out.println(i);
			break;
		}
	}
    }
}