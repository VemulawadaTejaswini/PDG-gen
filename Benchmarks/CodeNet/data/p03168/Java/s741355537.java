import java.util.*;
import java.io.*;
public class template{
    static int N;
    static double dp[][], p[], ans=0.0;
    public static void main(String[] args) throws IOException{
        N = readInt();
        dp = new double[N+1][N+1];
        p = new double[N+1];
        for (int i = 1; i<=N; i++) p[i] = readDouble();
        dp[1][1] = p[1];
        dp[1][0] = 1.0 - p[1];
        for (int i = 2; i<=N; i++){
            dp[i][0] = dp[i-1][0]*(1.0-p[i]);
            for (int j = 1; j<=i; j++){
                dp[i][j] = dp[i-1][j-1]*p[i] + dp[i-1][j]*(1.0-p[i]);
            }
        }
        for (int i = N/2 + 1; i<=N; i++) ans+=dp[N][i];
        System.out.println(ans);
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong() throws IOException {
            return Long.parseLong(next());
    }

    static float readFloat() throws IOException {
            return Float.parseFloat(next());
    }

    static boolean readBool() throws IOException {
            return Boolean.parseBoolean(next());
    }

    static short readShort() throws IOException {
            return Short.parseShort(next());
    }

    static byte readByte() throws IOException {
            return Byte.parseByte(next());
    }

    static int readInt() throws IOException {
            return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
            return Double.parseDouble(next());
    }

    static char readChar() throws IOException {
            return next().charAt(0);
    }

    static String readLine() throws IOException {
            return br.readLine().trim();
    }

    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    static void print(Object o) {
            pr.print(o);
    }
}