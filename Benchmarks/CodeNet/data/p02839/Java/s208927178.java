import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                A[i][j] = Integer.parseInt(in.next());
            }
        }
        int[][] B = new int[H][W];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                B[i][j] = Integer.parseInt(in.next());
            }
        }
        int[][] C = new int[H+1][W+1];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                C[i+1][j+1] = Math.abs(A[i][j]-B[i][j]);
            }
        }
        // System.out.println(Arrays.deepToString(C));

        int AA = 6400*80+100;
        // int AA = 10;
        int[][][] dp = new int[H+1][W+1][3*AA+100];
        dp[0][1][AA]=1;
        dp[1][0][AA]=1;

        // for (int k=0;k<AA;k++) {
        for (int i=0;i<=H;i++) {
            for (int j=0;j<=W;j++) {
                for (int k=0;k<3*AA;k++) {
                    if (i<H && j>0) {
                        if (dp[i][j][k]==1) dp[i+1][j][k+C[i+1][j]]=1;
                        if (k-C[i+1][j]>=0) {
                            if (dp[i][j][k]==1) dp[i+1][j][k-C[i+1][j]]=1;
                        }
                    }
                    if (j<W && i>0) {
                        if (dp[i][j][k]==1) dp[i][j+1][k+C[i][j+1]]=1;
                        if (k-C[i][j+1]>=0) {
                            if (dp[i][j][k]==1) dp[i][j+1][k-C[i][j+1]]=1;
                        }
                    }
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));

        long ans = 1_000_000_000L;
        for (int k=3*AA;k>=0;k--) {
            if (dp[H][W][k]==1) ans = Math.min(ans, Math.abs(k-AA));
        }
        out.println(ans);


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

    }
}
