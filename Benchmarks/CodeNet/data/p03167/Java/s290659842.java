import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int mod = (int)1e9+7;
        // out.println("AMAN");
        int n = sc.nextInt(), m = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++) {
            s[i] = sc.next();
        }
        int dp[][] = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<m+1;j++) {
                if(j==1 && i==1) continue;
                if(s[i-1].charAt(j-1)=='#') dp[i][j]=0;
                else dp[i][j] = (dp[i-1][j]%mod + dp[i][j-1]%mod)%mod;
            }
        }
        out.print(dp[n][m]);

        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}