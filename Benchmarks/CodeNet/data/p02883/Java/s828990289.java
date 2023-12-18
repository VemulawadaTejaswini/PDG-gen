import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int N = in.nextInt();
            long K = in.nextLong();
            Integer A[] = in.nextIntArray(N);
            Integer F[] = in.nextIntArray(N);
            Items items[] = new Items[N];
            Arrays.sort(A, Collections.reverseOrder());
            Arrays.sort(F);
            for (int i = 0; i < N; i++) {
                items[i] = new Items(A[i], F[i]);
            }
            Arrays.sort(items);
            long low = 0, high = (long) 1e13;
            long ans = high;
            while (low <= high) {
                long mid = (low + high) / 2;
                if (possible(mid, items, K)) {
                    ans = Math.min(ans, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            out.printLine(ans);
        }

        public boolean possible(long x, Items[] items, long K) {
            long required = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].score > x) {
                    long p = x / items[i].F;
                    required += items[i].A - p;
                }
            }
            return required <= K;
        }

        class Items implements Comparable<Items> {
            long A;
            long F;
            long score;

            public Items(long A, long F) {
                this.A = A;
                this.F = F;
                score = A * F;
            }

            public int compareTo(Items x) {
                if (x.score != this.score) {
                    return Long.compare(x.score, this.score);
                }
                if (x.A != this.A) {
                    return Long.compare(x.A, this.A);
                }
                return 1;
            }

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public Integer[] nextIntArray(int size) {
            Integer array[] = new Integer[size];
            for (int i = 0; i < size; i++) {
                array[i] = nextInt();
            }
            return array;
        }

    }
}

