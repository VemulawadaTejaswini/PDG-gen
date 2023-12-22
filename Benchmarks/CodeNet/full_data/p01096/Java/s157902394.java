import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[] w;
    static int[][] dp;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        while(true){
            n = fs.nextInt();
            if (n == 0){
                break;
            }else if (n == 1){
                pw.println(0);
                continue;
            }

            w = new int[n];
            for (int i = 0; i < n; i++){
                w[i] = fs.nextInt();
            }

            if (n == 2){
                if (Math.abs(w[0] - w[1]) <= 1){
                    pw.println(2);
                }else{
                    pw.println(0);
                }
                continue;
            }

            dp = new int[n][n];
            for (int i = 0;i < n - 1; i++){
                if (Math.abs(w[i + 1] - w[i]) <= 1){
                    dp[i][i+1] = 2;
                }
            }

            for (int s = 2;s < n;s++){
                for (int l = 0;l + s < n;l++){
                    int r = l + s;
                    if (s % 2 == 1){
                        if (dp[l + 1][r - 1] == s - 1 && Math.abs(w[l] - w[r]) <= 1){
                            dp[l][r] = s + 1;
                            continue;
                        }
                    }
                    for (int i = 0; i < s;i++){
                        dp[l][r] = Math.max(dp[l][r], dp[l][l + i] + dp[l + i + 1][r]);
                    }
                }
            }
            if (n % 2 == 0){
                pw.println(dp[0][n-1]);
            }else{
                pw.println(Math.max(dp[0][n-2], dp[1][n-1]));
            }
        }
        pw.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

