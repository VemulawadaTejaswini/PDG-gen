
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] zahyo = new int[n + 1];

        for (int i = 0; i < n; i++) {
            zahyo[i] = sc.nextInt();
        }
        zahyo[n] = x;
        Arrays.sort(zahyo);

        BigInteger prev = BigInteger.valueOf(zahyo[1] - zahyo[0]);

        int res = prev.intValue();

        for (int i = 1; i< n; i++) {
            BigInteger now = BigInteger.valueOf(zahyo[i+1] - zahyo[i]);
            BigInteger g = prev.gcd(now);

            res = Math.max(res, g.intValue());
            prev = BigInteger.valueOf(res);
        }

        out.println(res);
        out.flush();
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