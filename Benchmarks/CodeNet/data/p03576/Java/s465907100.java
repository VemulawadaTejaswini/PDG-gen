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
import java.util.Collections;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            List<Integer> xList = new ArrayList<>();
            List<Integer> yList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();

                xList.add(x[i]);
                yList.add(y[i]);
            }

            Collections.sort(xList);
            Collections.sort(yList);

            long ans = Long.MAX_VALUE;
            for (int i = 0; i < xList.size(); i++) {
                for (int j = i + 1; j < xList.size(); j++) {
                    for (int l = 0; l < yList.size(); l++) {
                        for (int m = l + 1; m < yList.size(); m++) {
                            int count = 0;
                            for (int o = 0; o < n; o++) {
                                if (xList.get(i) <= x[o]
                                        && x[o] <= xList.get(j)
                                        && yList.get(l) <= y[o]
                                        && y[o] <= yList.get(m)) {
                                    count++;
                                }
                            }
                            if (count >= k) {
                                ans = Math.min(ans, (long) (xList.get(j) - xList.get(i)) * (yList.get(m) - yList.get(l)));
                            }
                        }
                    }
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

