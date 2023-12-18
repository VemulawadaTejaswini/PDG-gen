
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    static class Query {

        public Query(int t, int a) {
            this.t = t;
            this.a = a;
        }

        int t;
        int a;
        int answer;
    }

    static class HourGrass {

        int a;
        int b;

        public HourGrass(int a, int X) {
            this.a = a;
            b = X - a;
        }

        boolean aIsUp = true;

        void flip() {
            aIsUp = !aIsUp;
        }

        void tick() {
            if (aIsUp) {
                if (a > 0) {
                    a--;
                    b++;
                }
            } else {
                if (b > 0) {
                    b--;
                    a++;
                }
            }
        }

    }

    public static void solve(int X, int K, int[] rs, Query[] qs) {
        for (Query q : qs) {
            HourGrass hg = new HourGrass(q.a, X);
            int rIndex = 0;
            for (int t = 0; t < q.t; t++) {
                if (rIndex < rs.length && rs[rIndex] == t) {
                    hg.flip();
                    rIndex++;
                }
                hg.tick();
            }
            System.out.println(hg.a);
        }
    }

    public static void main(String[] args) throws Throwable {
        InputStream is = null;
        if (false) {
            String input = "100\n"
                + "5\n"
                + "48 141 231 314 425\n"
                + "7\n"
                + "0 19\n"
                + "50 98\n"
                + "143 30\n"
                + "231 55\n"
                + "342 0\n"
                + "365 100\n"
                + "600 10";
            is = new ByteArrayInputStream(input.getBytes());
        } else {
            is = System.in;
        }
        try (BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            int X = readInt(r);
            int K = readInt(r);
            int[] rs = readInts(r);
            int Q = readInt(r);

            Query[] qs = new Query[Q];

            for (int i = 0; i < Q; i++) {
                int[] read = readInts(r);
                qs[i] = new Query(read[0], read[1]);
            }

            solve(X, K, rs, qs);
        }
    }

    private static int readInt(BufferedReader r) throws IOException {
        return Integer.parseInt(r.readLine());
    }

    private static int[] readInts(BufferedReader r) throws IOException {
        String[] data = r.readLine().split("\\s");
        int[] vals = new int[data.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.parseInt(data[i]);
        }
        return vals;
    }

}
