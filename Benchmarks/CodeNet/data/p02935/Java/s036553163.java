import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        private ArrayList<Double> ar;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ar = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ar.add((double) in.nextInt());
            }
            ArrayList<Double> temp = new ArrayList<>(ar);
            double ans1 = f1();
            ar = new ArrayList<>(temp);
            double ans2 = f2();
            double ans = Math.max(ans1, ans2);
            out.println(ans);
        }

        private double f1() {
            while (ar.size() > 1) {
                sortD();
                double next = (ar.get(0) + ar.get(1)) / 2.0;
                ar.remove(0);
                ar.remove(0);
                ar.add(next);
            }
            return ar.get(0);
        }

        private double f2() {
            while (ar.size() > 1) {
                sortU();
                double next = (ar.get(0) + ar.get(1)) / 2.0;
                ar.remove(0);
                ar.remove(0);
                ar.add(next);
            }
            return ar.get(0);
        }

        private void sortU() {
            Collections.sort(ar);
        }

        private void sortD() {
            Collections.sort(ar, (o1, o2) -> {
                if (o1 < o2)
                    return -1;
                if (o1 > o2)
                    return 1;
                return 0;
            });
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

