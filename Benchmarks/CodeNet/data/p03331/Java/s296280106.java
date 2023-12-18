import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int n = in.nextInt();
        int res = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            res = Math.min(res, f(i) + f(n - i));
        }

        out.println(res);
        out.close();
    }

    private static int f(int i) {
        int res = 0;

        while (i > 0) {
            res += i % 10;
            i /= 10;
        }

        return res;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f), 32768);
            st = null;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }
}
