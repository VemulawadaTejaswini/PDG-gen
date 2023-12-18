import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final int UNCALC = -1;
    static final long INF = (long) 1e18;
    static int n, w[], v[];
    static long memo[][];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        int W = sc.nextInt() + 1;
        v = new int[n];
        w = new int[n];
        memo = new long[W + 1][n+1];
        Arrays.fill(memo[0], -INF);
        for (int i = 0 ; i< n ; i++){
            w[i]= sc.nextInt();
            v[i]= sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--)
            for (int rem = W; rem >= 0; rem--)
                memo[rem][i] = Math.max(v[i] + memo[Math.max(0, rem - w[i])][i + 1], memo[rem][i + 1]);
        out.println(memo[W][0]);
        out.flush();
        out.close();
    }


    static class Scanner {

        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }


    }

}