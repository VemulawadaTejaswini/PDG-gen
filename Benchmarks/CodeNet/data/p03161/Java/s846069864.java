import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    private static final class FastInput {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        private int nextInt() throws Exception {
            return Integer.parseInt(nextWord());
        }

        private long nextLong() throws Exception {
            return Long.parseLong(nextWord());
        }

        private String nextWord() throws Exception {
            if (st == null || !st.hasMoreElements()) st = new StringTokenizer(br.readLine(), " ");
            return st.nextToken();
        }

        private long[] lineToIntArr(int len) throws Exception {
            long[] arr = new long[len];
            for (int i = 0; i < arr.length; i++) arr[i] = nextLong();
            return arr;
        }
    }

    public static void main(String[] args) throws Exception {
        FastInput in = new FastInput();
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = in.lineToIntArr(n);
        long[] dp = new long[n+1];
        for(int i = 0; i <= n; ++i){
            dp[i] = 1000000007;
        }
        dp[0] = 0;
        for(int i = 0; i < n; ++i){
            for(int j = 1; j <= k; ++j){
                if(i + j < n)
                    dp[i+j] = Math.min(dp[i+j], dp[i] + Math.abs(a[i] - a[i+j]));
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[n - 1]));
        bw.flush();
    }
}