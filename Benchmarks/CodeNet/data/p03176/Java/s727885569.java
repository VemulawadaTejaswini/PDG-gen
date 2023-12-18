
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static FastReader fr = new FastReader();
    private static PrintWriter out=new PrintWriter(System.out);

    private static long[][] dp;

    private static long calculate(int current, int[] h, int[] a, int lastHeight){
        if(current >= a.length) return 0;
        if(dp[current][lastHeight] != -1) return dp[current][lastHeight];
        if(h[current] <= lastHeight) {
            dp[current][lastHeight] = calculate(current + 1, h, a, lastHeight);
        } else {
            long x = a[current] + calculate(current + 1, h, a, h[current]);
            long y = calculate(current + 1, h, a, lastHeight);
            dp[current][lastHeight] = Math.max(x, y);
        }
        return dp[current][lastHeight];
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // code goes here
        int n = fr.nextInt();
        int[] h = fr.nextIntArray(n);
        int[] a = fr.nextIntArray(n);

        dp = new long[n][n + 1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        sb.append(calculate(0, h, a, 0));
        System.out.print(sb.toString());
    }

    static class FastReader{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}
