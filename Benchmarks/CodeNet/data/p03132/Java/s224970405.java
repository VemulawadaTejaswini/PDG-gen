import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DEars solver = new DEars();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEars {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int l = in.NextInt();
            int[] a = in.NextIntArray(l);
            long[][] bestSenarioForBeingInXAndPassingPointYInTheTrack = new long[l + 1][5];
            for (int i = 1; i <= l; i++) {
                long[] cur = bestSenarioForBeingInXAndPassingPointYInTheTrack[i];
                long[] last = bestSenarioForBeingInXAndPassingPointYInTheTrack[i - 1];
                int v = a[i - 1];
                int paymentForMissing = v;
                int paymentForNeedToBeEven = v == 0 ? 2 : (v & 1);
                int paymentForNeedToBeOdd = (v & 1) ^ 1;
                long ifItWas0Before = last[0] + paymentForMissing;
                long ifItWas1Before = last[1] + paymentForNeedToBeEven;
                long ifItWas2Before = last[2] + paymentForNeedToBeOdd;
                long ifItWas3Before = last[3] + paymentForNeedToBeEven;
                long ifItWas4Before = last[4] + paymentForMissing;
                cur[0] = ifItWas0Before;
                cur[1] = Math.min(cur[0], ifItWas1Before);
                cur[2] = Math.min(cur[1], ifItWas2Before);
                cur[3] = Math.min(cur[2], ifItWas3Before);
                cur[4] = Math.min(cur[3], ifItWas4Before);
            }
            out.println(bestSenarioForBeingInXAndPassingPointYInTheTrack[l][4]);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

    }
}

