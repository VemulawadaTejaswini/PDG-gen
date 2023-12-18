import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            char[] str = in.next().toCharArray();

            int left = 0, right = N - 1;
            int ans = 0;
            while (left < right) {
                TaskD.Chunk leftChunk = findLeft(left, str);
                TaskD.Chunk rightChunk = findRight(right, str);

                if (leftChunk != null && rightChunk != null) {
                    if (leftChunk.len > rightChunk.len) {
                        ans += leftChunk.len - 2;
                        left = leftChunk.end + 2;
                    } else {
                        ans += rightChunk.len - 2;
                        right = rightChunk.start - 2;
                    }
                } else if (leftChunk != null) {
                    ans += leftChunk.len - 2;
                    left = leftChunk.end + 2;
                } else if (rightChunk != null) {
                    ans += rightChunk.len - 2;
                    right = rightChunk.start - 2;
                } else {
                    break;
                }
            }
            out.println(ans);
        }

        private TaskD.Chunk findRight(int right, char[] str) {
            int N = str.length;
            for (int i = right - 1; i > 0; i--) {
                if (str[i - 1] == '1' && str[i] == '0' && str[i + 1] == '1') {
                    int onesEnd = i + 1;
                    while (onesEnd + 1 <= right && str[onesEnd + 1] == '1') {
                        onesEnd++;
                    }
                    return new TaskD.Chunk(i - 1, onesEnd);
                }
            }
            return null;
        }

        private TaskD.Chunk findLeft(int left, char[] str) {
            int N = str.length;
            for (int i = left + 1; i < N - 1; i++) {
                if (str[i - 1] == '1' && str[i] == '0' && str[i + 1] == '1') {
                    int onesStart = i - 1;
                    while (onesStart - 1 >= left && str[onesStart - 1] == '1') {
                        onesStart--;
                    }
                    return new TaskD.Chunk(onesStart, i + 1);
                }
            }
            return null;
        }

        static class Chunk {
            int start;
            int end;
            int len;

            public Chunk(int start, int end) {
                this.start = start;
                this.end = end;
                this.len = end - start + 1;
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

