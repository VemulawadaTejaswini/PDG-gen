import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        final int MOD = 1000000007;

        String s = sc.nextLine();
        int len = s.length();

        int[][] dp = new int[len+1][13];
        dp[0][0] = 1;
        int place = 1;

        for(int i=1;i<=len;i++) {
            int n = len - i;
            char c = s.charAt(n);
            if(c == '?') {
                for(int j=0;j<10;j++) {
                    for(int k=0;k<13;k++) {
                        dp[i][(j*place+k)%13] += dp[i-1][k];
                        dp[i][(j*place+k)%13] %= MOD;
                    }
                }
            }
            else {
                int j = (c - '0');
                for(int k=0;k<13;k++) {
                    dp[i][(j*place+k)%13] += dp[i-1][k];
                    dp[i][(j*place+k)%13] %= MOD;
                }
            }
            place *= 10;
            place %= 13;
        }

        pw.println(dp[len][5]);
        pw.close();
    }
}
