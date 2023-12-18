
///.....FROG-1....///

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
            return (Integer.parseInt(next()));
        }

        long nextLong() {
            return (Long.parseLong(next()));
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);
        for (int i = 2; i < n; i++) {
           // System.out.println(Math.abs(h[i] - h[i - 1]) + dp[i - 1]+" "+Math.abs(h[i] - h[i - 2]) + dp[i - 2]);
            dp[i] = Math.min(Math.abs(h[i] - h[i - 1]) + dp[i - 1], Math.abs(h[i] - h[i - 2]) + dp[i - 2]);
        }
        System.out.println(dp[n-1]);
    }
}
