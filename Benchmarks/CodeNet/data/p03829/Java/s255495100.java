import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Teleportation solver = new Teleportation();
        solver.solve(1, in, out);
        out.close();
    }

    static class Teleportation {
        int n;
        long[] x;
        long A;
        long B;

        public void solve(int testNumber, FastReader fs, PrintWriter pw) {
            n = fs.nextInt();
            A = fs.nextLong();
            B = fs.nextLong();
            x = new long[n];
            for (int i = 0; i < n; i++) x[i] = fs.nextLong();
            long ans = 0;
            for (int i = 1; i < n; i++) {
                if ((x[i] - x[i - 1]) * A > B) ans += B;
                else ans += (x[i] - x[i - 1]) * A;
            }

            pw.println(ans);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public FastReader(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

