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
        int n = in.nextInt();
        Coord[] coords = new Coord[n];
        for (int i = 0; i < n; i++) {
            double x = in.nextInt();
            double y = in.nextInt();
            coords[i] = new Coord(x, y);
        }

        double minRadiusSquared = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Coord base = coords[i];
            for (int j = 0; j < n; j++) {
                Coord target = coords[j];

                double centerX = (base.x + target.x) / 2;
                double centerY = (base.y + target.y) / 2;
                double diffX = (base.x - target.x) / 2;
                double diffY = (base.y - target.y) / 2;
                double radiusSquared = diffX * diffX + diffY * diffY;

                // out.println("Checking from i = " + i + ", j = " + j + ", radius^2 = " + radiusSquared);
                if (check(coords, centerX, centerY, radiusSquared)) {
                    // out.println("OK");
                    minRadiusSquared = Math.min(minRadiusSquared, radiusSquared);
                } else {
                    // out.println("NG");
                }
            }
        }

        out.println(Math.sqrt(minRadiusSquared));
    }

    private static boolean check(Coord[] coords, double centerX, double centerY, double radiusSquared) {
        for (Coord coord : coords) {
            double dx = centerX - coord.x;
            double dy = centerY - coord.y;
            if (radiusSquared < dx * dx + dy * dy) {
                return false;
            }
        }
        return true;
    }

    private static class Coord {
        double x;
        double y;

        Coord(double x, double y) {
            this.x = x;
            this.y = y;
        }
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
