import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        // out.println("AMAN");
        int n = sc.nextInt(), s = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            max+=v[i];
        }
        long dp[] = new long[max+1]; 
        Arrays.fill(dp,(long)10e17);
        dp[0]=0;
        for(int i=0;i<n;i++) {
            for(int j=max;j>=0;j--) {
                if(j-v[i]>=0)
                    dp[j] = Math.min(dp[j],dp[j-v[i]]+w[i]);
            }
        }
        int res = 0;
        for(int i=0;i<max+1;i++) {
            if(dp[i]<=s)
                res=i;
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