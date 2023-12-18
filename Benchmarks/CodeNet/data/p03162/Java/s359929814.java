import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
//2 out of 26 done
public class Main { //CHANGE TO MAIN WHEN SUBMITTING
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[][] a = new int[n][3];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<3; j++){
                a[i][j] = in.nextInt();
            }
        }
        int[][] dp = new int[n][3];
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][1];
        dp[0][2] = a[0][2];
        for(int i = 1; i<n; i++){
            for(int j = 0; j<3; j++){
                dp[i][j] = -1;
                for(int k = 0; k<3; k++){
                    if(k==j){

                    }
                    else{
                        dp[i][j] = Math.max(dp[i][j],dp[i-1][k]+a[i][j]);
                    }
                }
            }
        }
        out.println(Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2])));
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}

