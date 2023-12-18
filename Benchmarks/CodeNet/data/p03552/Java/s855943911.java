import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] A;
        int N;
        int Z;
        int W;
        Map<TaskD.State, Integer> cache = new HashMap<>();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            Z = in.nextInt();
            W = in.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            out.println(msx(new TaskD.State(-1, -1)));
        }

        private int msx(TaskD.State st) {
            int idx = Math.max(st.xi, st.yi) + 1;
            int xi = st.xi == -1 ? Z : A[st.xi];
            int yi = st.yi == -1 ? W : A[st.yi];

            if (idx == N) {
                return Math.abs(xi - yi);
            }

            Integer c = cache.get(st);
            if (c != null) return c;

            int ans = 0;
            for (int i = idx; i < N; i++) {
                TaskD.State nst = new TaskD.State(i, st.yi);
                ans = Math.max(ans, msy(nst));
            }
            cache.put(st, ans);
            return ans;
        }

        private int msy(TaskD.State st) {
            int idx = Math.max(st.xi, st.yi) + 1;
            int xi = st.xi == -1 ? Z : A[st.xi];
            int yi = st.yi == -1 ? W : A[st.yi];

            if (idx == N) {
                return Math.abs(xi - yi);
            }
            Integer c = cache.get(st);
            if (c != null) return c;

            int ans = Integer.MAX_VALUE;
            for (int i = idx; i < N; i++) {
                TaskD.State nst = new TaskD.State(st.xi, i);
                ans = Math.min(ans, msx(nst));
            }
            cache.put(st, ans);
            return ans;
        }

        static class State {
            int xi;
            int yi;

            public State(int xi, int yi) {
                this.xi = xi;
                this.yi = yi;
            }


            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                TaskD.State state = (TaskD.State) o;

                if (xi != state.xi) return false;
                return yi == state.yi;

            }


            public int hashCode() {
                int result = xi;
                result = 31 * result + yi;
                return result;
            }

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

