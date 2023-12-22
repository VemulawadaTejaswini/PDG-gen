import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;


public class Main {


    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);
    static boolean debug = false;


    static void solve() {
        int n = in.nextInt();
        int[] a = new int[n*2];
        for(int i=0;i<2*n;i++){
            a[i] = in.nextInt();
        }
        long[][] dp = new long[n+1][n+1];
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                long x = Integer.MAX_VALUE/2;
                for(int k=0;k<i;k++){
                    x = Math.min(x,dp[j][j+k]+dp[j+k+1][j+i]+a[2*j]*a[2*(j+k)+1]*a[2*(j+i)+1]);
                }
                dp[j][j+i] = x;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                out.print(dp[j][i]+" ");
            }
            out.println();
        }
        out.println(dp[0][n-1]);
    }


    public static void main(String[] args) {
        debug = args.length > 0;
        long start = System.currentTimeMillis();


        solve();
        out.flush();


        long end = System.currentTimeMillis();
        dump((end-start) + "ms");
        in.close();
        out.close();
    }


    static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}