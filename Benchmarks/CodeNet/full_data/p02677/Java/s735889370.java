import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        // hour
        double a = in.nextInt();
        // minute
        double b = in.nextInt();
        double h = in.nextInt();
        double m = in.nextInt();

        double totalMins = h * 60 + m;
        double aRadians = totalMins / (12 * 60) * 2 * Math.PI;
        Map.Entry<Double, Double> aPoint = new AbstractMap.SimpleEntry<>(Math.cos(aRadians) * a, Math.sin(aRadians) * a);
        double bRadians = m / 60 * 2 * Math.PI;
        Map.Entry<Double, Double> bPoint = new AbstractMap.SimpleEntry<>(Math.cos(bRadians) * b, Math.sin(bRadians) * b);

        double diffX = aPoint.getKey() - bPoint.getKey();
        diffX *= diffX;
        double diffY = aPoint.getValue() - bPoint.getValue();
        diffY *= diffY;
        out.println(Math.sqrt(diffX + diffY));
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
