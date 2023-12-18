import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer> x = new ArrayList<>();
            List<Integer> y = new ArrayList<>();
            List<Integer> h = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int tmpX = in.nextInt();
                int tmpY = in.nextInt();
                int tmpH = in.nextInt();

                if (tmpH > 0) {
                    x.add(tmpX);
                    y.add(tmpY);
                    h.add(tmpH);
                }
            }

            for (int i = 0; i <= 100; i++) {
                out:
                for (int j = 0; j <= 100; j++) {
                    int tmp = h.get(0) + Math.abs(x.get(0) - i) + Math.abs(y.get(0) - j);

                    for (int k = 1; k < x.size(); k++) {
                        if (tmp != h.get(k) + Math.abs(x.get(k) - i) + Math.abs(y.get(k) - j)) continue out;
                    }

                    out.println(i + " " + j + " " + tmp);
                    return;
                }
            }

            throw new RuntimeException();
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

