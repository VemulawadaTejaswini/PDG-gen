import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGacha solver = new CGacha();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGacha {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            String[] a = in.nextArrString(n);
            int res = solveMe(n, a);
            out.println(res);

            //out.print("Case #"+ testNumber + ": ");
        }

        private int solveMe(int n, String[] a) {
            HashSet<String> set = new HashSet<>();
            set.addAll(toArrayList(a));
            return set.size();
        }

        public static <T> ArrayList<T> toArrayList(T[] a) {
            ArrayList<T> res = new ArrayList<>(a.length);
            Collections.addAll(res, a);
            return res;
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String[] nextArrString(int n) {
            String[] a = new String[n];
            for (int i = 0; i < a.length; i++)
                a[i] = next();
            return a;
        }

    }
}

