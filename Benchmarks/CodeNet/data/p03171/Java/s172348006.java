import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        
        int N = in.nextInt();
        long[] a = new long[N];
        long[][] dp = new long[305][305];
        for(int i = 0; i < N; i++) {
            a[i] = in.nextLong();
        }
        
        for(int L = N-1; L >= 0; --L) {
            for(int R = L; R < N; ++R) {
                if(L == R) {
                    dp[L][R] = a[L];
                }
                else {
                    dp[L][R] = Math.max(a[L] - dp[L+1][R], a[R]-dp[L][R-1]);
                }
            }
        }
        
        System.out.println(dp[0][N-1]);
    }
    

        
}
