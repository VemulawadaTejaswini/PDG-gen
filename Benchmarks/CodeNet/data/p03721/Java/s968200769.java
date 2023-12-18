import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author SimplyDivine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Pair> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(new Pair(in.nextLong(), in.nextLong()));
            }
            Collections.sort(arrayList, new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    if (o1.a > o2.a) return 1;
                    else if (o1.a < o2.a) return -1;
                    else return 0;
                }
            });
            for (int i = 0; i < n; i++) {
                k -= arrayList.get(i).b;
                if (k <= 0) {
                    out.println(arrayList.get(i).a);
                    break;
                }
            }
        }

        class Pair {
            long a;
            long b;

            public Pair(long a, long b) {
                this.a = a;
                this.b = b;
            }

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream i) {
            br = new BufferedReader(new
                    InputStreamReader(i));
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

