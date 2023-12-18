

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int abs(int a) {
        return Math.abs(a);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line[] = bf.readLine().split("\\s");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int ar [] =  new int[n];
        line = bf.readLine().split("\\s");
        for(int i=0;i<n;++i) {
            ar[i] = Integer.parseInt(line[i]);
        }
        int[]dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++) {
            int lim = k;
            int mini = 100005;
            int j = i-k >= 0 ? i-k :0;
            for(;j<i;j++)
            {
                if(lim == 0 )break;
                int ab1 = abs(ar[i] - ar[j]);
                mini = Math.min(mini, dp[j] + ab1);
                lim--;
            }
            dp[i] = mini;
        }
        System.out.println(dp[n-1]);
    }
}
