
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static int MOD = (int)Math.pow(10,9)+7;

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        long N = sc.nextInt();
        long K = sc.nextInt();


        long minSum = 0;
        long maxSum = 0;
        minSum = K*(K-1)/2;
        maxSum = (2*N-K+1)*K/2;

        long ans = 0;
        long num = maxSum - minSum +1;

        ans += num;

        long minIdx = K;
        long maxIdx = N-K;

        for(int i = 0; i < N-K+1; i++) {
            num += maxIdx - minIdx;
            ans += num;
            ans %= MOD;
            minIdx++;
            maxIdx--;
        }

        os.println(ans);

    }
}