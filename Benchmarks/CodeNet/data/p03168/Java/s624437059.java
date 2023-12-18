import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        //int mod = (int) 1e9 + 7;
        //out.println("AMAN");
        int n = sc.nextInt();
        double[] a = new double[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextDouble();
        }

        double dp[] = new double[n+1];
        dp[0] = 1;
        for(int i=0;i<n;i++) {
            for(int j=n;j>=0;j--) {
                dp[j] = (j==0? 0: dp[j-1]*a[i]) + dp[j]*(1-a[i]);
            }
        }
        double sum = 0;
        for(int i=0;i<=n;i++) {
            int tails = n-i;
            if(tails<i) {
                sum+=dp[i];
            }
        }
        out.println(sum);

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

        public Double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public Float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}