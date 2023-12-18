import java.util.*;
import java.io.*;

public class Main{



    public static void main(String[] args) {
        FastReader in = new FastReader();
        int dp[][][][] = new int[105][4][4][4], ans = 0;
        dp[0][3][3][3] = 1;
        int n = in.nextInt();
        for (int l = 0; l < n; ++l){
            for (int l2 = 0; l2 < 4; ++l2){
                for (int l3 = 0; l3 < 4; ++l3){
                    for (int l4 = 0; l4 < 4; ++l4){
                        for (int l5 = 0; l5 < 4; ++l5){
                            if (l2 == 0 && l3 == 1 && l4 == 2 || //ACG_
                                l2 == 0 && l3 == 2 && l4 == 1 || //AGC_
                                l3 == 0 && l4 == 1 && l5 == 2 || //_ACG
                                l3 == 0 && l4 == 2 && l5 == 1 || //_AGC
                                l2 == 2 && l3 == 0 && l4 == 1 || //GAC_
                                l3 == 2 && l4 == 0 && l5 == 1 || //_GAC
                                l2 == 0 && l4 == 2 && l5 == 1 || //A_GC
                                l2 == 0 && l3 == 2 && l5 == 1) continue;
                                dp[l+1][l3][l4][l5] = (dp[l+1][l3][l4][l5] + dp[l][l2][l3][l4]) % (1000000007);

                        }
                    }
                }
            }
        }
        for (int l2 = 0; l2 < 4; ++l2){
            for (int l3 = 0; l3 < 4; ++l3){
                for (int l4 = 0; l4 < 4; ++l4){
                    ans = (ans + dp[n][l2][l3][l4]) % (1000000007);
                }
            }
        }
        System.out.println(ans);
    }

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
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
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