import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public int mod = 1000000007;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskA.Event[] evs = new TaskA.Event[2 * n];
            for (int i = 0; i < n; i++) {
                evs[i] = new TaskA.Event(in.nextInt(), +1);
            }
            for (int i = 0; i < n; i++) {
                evs[i + n] = new TaskA.Event(in.nextInt(), -1);
            }
            Arrays.sort(evs);
            int curcount = 0;
            long nways = 1;
            for (int i = 0; i < 2 * n; i++) {
                if (evs[i].b == +1) {
                    if (curcount < 0) {
                        nways = nways * (-curcount) % mod;
                    }
                    curcount++;
                } else {
                    if (curcount > 0) {
                        nways = nways * curcount % mod;
                    }
                    curcount--;
                }
            }
            out.println(nways);
        }

        static class Event implements Comparable<TaskA.Event> {
            public int a;
            public int b;

            public Event(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(TaskA.Event other) {
                return a - other.a;
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

