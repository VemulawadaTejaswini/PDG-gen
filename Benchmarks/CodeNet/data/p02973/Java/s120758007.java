import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESequenceDecomposing solver = new ESequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceDecomposing {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int[] m = new int[n + 1]; // m[i] is the index of the smallest value a[i] s.t. there are i-1 elements in a subseq

            int answer = 0;
            for (int i = 0; i < n; i++) {
                int finalI = i;
                int finalAnswer = answer;
                int j = BinarySearch.binarySearch(index -> {
                    if (index <= 0)
                        return false;
                    if (index > finalAnswer)
                        return true;
                    if (a[m[index]] >= a[finalI])
                        return false;
                    return true;
                });

                m[j] = i;
                answer = Math.max(answer, j);
            }

            out.println(answer);
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

    static class BinarySearch {
        public static int binarySearch(Function<Integer, Boolean> bigEnough) {
            int tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

