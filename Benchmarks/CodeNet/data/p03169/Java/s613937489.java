import java.io.*;
import java.util.*;
public class Main {
    
    static double dfs(double[][][] dp, int n, int c1, int c2, int c3) {
        if(c1 + c2 + c3 == 0)
            return 0.0;
        if(dp[c1][c2][c3] - 1 > 0.01) {
            return dp[c1][c2][c3];
        }
        
        double expectValueToZero = (n*1.0)/(c1+c2+c3);
        double ret = 0.0;
        if(c1>0)
            ret += (dfs(dp, n, c1 - 1, c2, c3) + expectValueToZero)*c1/(c1+c2+c3);
        if(c2>0)
            ret += (dfs(dp, n, c1 + 1, c2 - 1, c3) + expectValueToZero)*c2/(c1+c2+c3);
        if(c3>0)
            ret += (dfs(dp, n, c1, c2 + 1, c3 - 1) + expectValueToZero)*c3/(c1+c2+c3);
        
        // System.out.println("Returning " + ret + " " + expectValueToZero + " " + c1/(double)(c1+c2+c3));
        return (dp[c1][c2][c3]=ret);
    }
    
    public static void main(String args[]) {
        int n = 0;
        int[] sushiCount = new int[4];
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            
            for(int i = 0; i < n; i++) {
                sushiCount[scanner.nextInt()]++;
            }
        }
        
        double[][][] dp = new double[n+1][n+1][n+1];
        for(double[][] dd : dp)
            for(double[] d : dd)
                Arrays.fill(d, -1);
        
        int oneCount = sushiCount[1];
        int twoCount = sushiCount[2];
        int threeCount = sushiCount[3];
        
        double ret = dfs(dp, n, oneCount, twoCount, threeCount);
        // for(double[][] dd : dp)
        //     for(double[] d : dd)
        //         System.out.println(Arrays.toString(d));
        System.out.println(ret);
    }
}