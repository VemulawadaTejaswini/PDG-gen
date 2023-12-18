import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        long K = in.nextLong();
        long A[] = new long[N];
        for (int i = 0; i <= N - 1; i++) {
            A[i] = in.nextLong();
        }

       
        long[][] bA = new long[41][2];
        for (int i = 0; i <= N - 1; i++) {
            long ac = A[i];
            for (int j = 0; ac > 0; j++) {
                bA[j][0] += ac % 2;
                ac /= 2;
            }
        }

        
        long kc = K;
        int keta = 0;
        for (int i=0; kc > 0; i++){
            bA[i][1] = (int)(kc%2);
            kc /= 2;
            keta++;
        }


        long dp[][] = new long[2][keta+1];
        Arrays.fill(dp[0], -1);
        Arrays.fill(dp[1], -1);
        dp[0][0] = 0; 


        long pow = pow(2, keta);

        
        for (int d = 0; d <= keta-1; d++) {
            pow /= 2;
            long c0 = pow * bA[keta-1-d][0];
            long c1 = pow * (N-bA[keta-1-d][0]);

            
            if (dp[1][d] != -1) {
                dp[1][d+1] = Math.max(dp[1][d+1], dp[1][d] + Math.max(c0, c1)); 
            }

            
            if (dp[0][d] != -1) {
                if (bA[keta-1-d][1] == 1) { 
                    dp[1][d+1] = Math.max(dp[1][d+1], dp[0][d] + c0);
                }
            }

           
            if (dp[0][d] != -1) {
                if (bA[keta-1-d][1] == 1) { 
                    dp[0][d+1] = Math.max(dp[0][d+1], dp[0][d] + c1);
                } else { 
                    dp[0][d+1] = Math.max(dp[0][d+1], dp[0][d] + c0);
                }
            }
        }

        long ans = Math.max(dp[0][keta], dp[1][keta]);
        pow = pow(2, keta);
        for (int d = keta; d <= 40; d++) {
            ans += bA[d][0] * pow;
            pow *= 2;
        }

        out.println(ans);
    }

public   static long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) { 
                sum *= x;        
            }
            x *= x;              
            n >>= 1;
        }
        return sum;
    }

}
}

