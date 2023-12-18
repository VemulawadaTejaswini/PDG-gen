import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            cards zero = new cards(N);
            for (int i = 0; i < N; i++) {
                zero.A[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                zero.B[i] = in.nextInt();
            }
            TreeSet<cards> all = new TreeSet<>();
            TreeSet<cards> curStep = new TreeSet<>();
            all.add(zero);
            curStep.add(zero);
            int steps = 0;
            boolean solved = false;
            loop:
            while (!curStep.isEmpty()) {
                TreeSet<cards> nextStep = new TreeSet<>();
                for (cards cur : curStep) {
                    if (cur.isGood()) {
                        solved = true;
                        break loop;
                    }
                    for (int i = 0; i < N - 1; i++) {
                        cards next = new cards(cur);
                        next.swap(i);
                        if (!all.contains(next)) {
                            nextStep.add(next);
                            all.add(next);
                        }
                    }
                }
                curStep = nextStep;
                steps++;
            }
            if (solved) {
                out.println(steps);
            } else {
                out.println(-1);
            }
        }

    }

    static class cards implements Comparable<cards> {
        int[] A;
        int[] B;

        cards(int size) {
            A = new int[size];
            B = new int[size];
        }

        cards(cards prev) {
            A = prev.A.clone();
            B = prev.B.clone();
        }

        void swap(int id) {
            int tmp = A[id];
            A[id] = B[id + 1];
            B[id + 1] = tmp;
            tmp = A[id + 1];
            A[id + 1] = B[id];
            B[id] = tmp;
        }

        boolean isGood() {
            int prev = A[0];
            for (int i = 1; i < A.length; i++) {
                if (A[i] < prev) {
                    return false;
                }
                prev = A[i];
            }
            return true;
        }

        public int compareTo(cards o) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != o.A[i]) {
                    return A[i] - o.A[i];
                }
                if (B[i] != o.B[i]) {
                    return B[i] - o.B[i];
                }
            }
            return 0;
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer stt;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public String next() {
            while (stt == null || !stt.hasMoreTokens()) {
                stt = new StringTokenizer(nextLine());
            }
            return stt.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

