import java.util.*;
import java.io.*;

public class Main {
    private static double[][][] dp = new double[301][301][301];
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int N = in.nextInt();
        int c1 = 0, c2 = 0, c3 = 0;
        
        for(int i = 0; i < N; i++) {
            int val = in.nextInt();
            if(val == 1) c1++;
            else if(val == 2) c2++;
            else c3++;
        }
        
        System.out.println(solve(N, c1, c2, c3));
    }
    
    private static double solve(int n, int c1, int c2, int c3) {
        if(c1 < 0 || c2 < 0 || c3 < 0) return 0.0;
        
        if(c1 == 1 && c2 == 0 && c3 == 0) return 1.0*n;
        if(Math.abs(dp[c1][c2][c3] - 0.0) > 1e-9) return dp[c1][c2][c3];
        
        double res = (c1*solve(n, c1-1, c2, c3) + c2*solve(n, c1+1, c2-1, c3) + c3*solve(n, c1, c2+1,c3-1) + 1.0*n)/(c1 + c2 + c3);
        
        dp[c1][c2][c3] = res;
        
        return res;
    }
        
}
