import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        VacantSeat solver = new VacantSeat();
        solver.solve(1, in, out);
        out.close();
    }

    static class VacantSeat {
        int n;
        String[] states;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            states = new String[n];
            int l = 0, r = n - 1;
            out.println(r);
            out.flush();
            states[r] = in.next();
            if (states[r].equals("Vacant")) return;
            out.println(l);
            out.flush();
            states[l] = in.next();
            if (states[l].equals("Vacant")) return;
            while (true) {
                int m = (l + r) >> 1;
                out.println(m);
                out.flush();
                if ((states[m] = in.next()).equals("Vacant")) return;
                if (states[m].equals(states[r])) r = m;
                else l = m;
            }
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

