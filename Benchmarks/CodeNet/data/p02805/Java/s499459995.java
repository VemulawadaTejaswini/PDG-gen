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

        if (n == 2) {
            Coord first = coords[0];
            Coord second = coords[1];
            double dx = (first.x - second.x) / 2;
            double dy = (first.y - second.y) / 2;
            out.println(
                    Math.sqrt(dx * dx + dy * dy)
            );
            return;
        }

        double minRadiusSquared = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Coord first = coords[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                Coord second = coords[j];
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    Coord third = coords[k];

                    Coord center = findCenter(first, second, third);
                    if (center == null) continue;

                    double dx = first.x - center.x;
                    double dy = first.y - center.y;
                    double radiusSquared = dx * dx + dy * dy;
                    if (check(coords, center, radiusSquared)) {
                        minRadiusSquared = Math.min(minRadiusSquared, radiusSquared);
                    }
                }
            }
        }


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
                Coord center = new Coord(centerX, centerY);
                if (check(coords, center, radiusSquared)) {
                    // out.println("OK");
                    minRadiusSquared = Math.min(minRadiusSquared, radiusSquared);
                } else {
                    // out.println("NG");
                }
            }
        }

        out.println(Math.sqrt(minRadiusSquared));
    }

    private static Coord findCenter(Coord first, Coord second, Coord third) {
        double a = first.x - second.x;
        double b = first.y - second.y;
        double c = second.x - third.x;
        double d = second.y - third.y;
        double normFirst = first.norm();
        double normSecond = second.norm();
        double normThird = third.norm();

        double denominator = 2 * (a * d - b * c);
        if (denominator == 0) return null;

        double centerX = (d * (normFirst - normSecond) + (-b) * (normSecond - normThird)) / denominator;
        double centerY = ((-c) * (normFirst - normSecond) + a * (normSecond - normThird)) / denominator;
        return new Coord(centerX, centerY);
    }

    private static boolean check(Coord[] coords, Coord center, double radiusSquared) {
        for (Coord coord : coords) {
            double dx = center.x - coord.x;
            double dy = center.y - coord.y;
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

        double norm() {
            return this.x * this.x + this.y * this.y;
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
