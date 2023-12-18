import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
            int elementCount = in.nextInt();
            int maxWeight = in.nextInt();
            int[] weightList = new int[elementCount];
            int[] valueList = new int[elementCount];
            for (int elementIndex = 0; elementIndex < elementCount; elementIndex++) {
                weightList[elementIndex] = in.nextInt();
                valueList[elementIndex] = in.nextInt();
            }

            long[][] maxValue = new long[elementCount + 1][maxWeight + 1];
            for (int elementIndex = 0; elementIndex < elementCount; elementIndex++) {
                for (int weightIndex = 0; weightIndex <= maxWeight; weightIndex++) {
                    maxValue[elementIndex + 1][weightIndex] = maxValue[elementIndex][weightIndex];
                    if (weightIndex - weightList[elementIndex] >= 0) {
                        maxValue[elementIndex + 1][weightIndex] = Math.max(maxValue[elementIndex + 1][weightIndex],
                                maxValue[elementIndex][weightIndex - weightList[elementIndex]] + valueList[elementIndex]);
                    }
                }
            }

            out.println(LongStream.of(maxValue[elementCount]).max().getAsLong());
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

