import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        COneQuadrillionAndOneDalmatians solver = new COneQuadrillionAndOneDalmatians();
        solver.solve(1, in, out);
        out.close();
    }

    static class COneQuadrillionAndOneDalmatians {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            long n = sc.nextLong();
            n--;
            ArrayList<Long> rep = new ArrayList<>();
            while (n > 0) {
                rep.add(n % 26);
                n /= 26;
            }
            for (int i = rep.size() - 1; i >= 0; i--) {
                if (i != 0)
                    out.print((char) ('a' + rep.get(i) - 1));
                else
                    out.print((char) ('a' + rep.get(i)));
            }
            out.println();
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

