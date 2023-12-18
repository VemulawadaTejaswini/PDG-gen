import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //out.println("AMAN");
        int n = sc.nextInt(), s=sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i=0;i<n;i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        long dp[] = new long[s+1];
        
        for(int i=0;i<n;i++) {
            for(int j=s;j>=0;j--) {
                if(j-w[i]>=0)
                    dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        long res=0;
        for(int i=0;i<=s;i++) {
            res = Math.max(res,dp[i]);
        }
        out.print(res);

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