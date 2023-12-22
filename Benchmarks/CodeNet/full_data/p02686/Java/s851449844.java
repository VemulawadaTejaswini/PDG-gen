import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt();
            int required[] = new int[N];
            int total[] = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                String s = in.next();
                int M = s.length();
                int current = 0;
                for (int j = 0; j < M; j++) {
                    if (s.charAt(j) == '(') {
                        current++;
                    } else {
                        current--;
                        if (current < 0) {
                            required[i] = Math.max(required[i], Math.abs(current));
                        }
                    }
                }
                total[i] = current;
                sum += current;
            }
            if (sum != 0) {
                out.printLine("No");
                return;
            }
            Pair p[] = new Pair[N];
            for (int i = 0; i < N; i++) {
                p[i] = new Pair(required[i], total[i]);
            }
            Arrays.sort(p, new Comparator<Pair>() {

                public int compare(Pair o1, Pair o2) {
                    if (o1.req != o2.req) {
                        return o1.req - o2.req;
                    } else {
                        return o2.tot - o1.tot;
                    }
                }
            });
            sum = 0;
            int i = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            while (i < N) {
                while (i < N && p[i].req <= sum) {
                    queue.add(p[i].tot);
                    i++;
                }
                if (queue.isEmpty()) {
                    out.printLine("No");
                    return;
                }
                sum += queue.poll();
            }
            out.printLine("Yes");
        }

        class Pair {
            int req;
            int tot;

            public Pair(int req, int tot) {
                this.req = req;
                this.tot = tot;
            }

        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tokenizer = null;

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(in.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter {
        PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

