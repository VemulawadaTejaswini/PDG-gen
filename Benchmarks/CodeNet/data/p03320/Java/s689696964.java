import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            ArrayList<Long> possibleValues = new ArrayList<>();
            for (int i = 1; i < 18; i++) {
                possibleValues.addAll(allPossibleValuesFromOfSize(i));
            }
            possibleValues.sort(Comparator.comparingDouble(o -> getVal(o)));
            int k = in.NextInt();
            int i = 0;
            long min = 0;
            while (k != 0) {
                long x = possibleValues.get(i++);
                if (x < min) continue;
                min = x;
                out.println(min);
                k--;
            }
        }

        private double getVal(long o) {
            return ((double) o) / IntegerExtention.sumDigits(o);
        }

        private ArrayList<Long> allPossibleValuesFromOfSize(int i) {
            ArrayList<Long> res = new ArrayList<>();
            long start = MathExtentions.power(10, i - 1);
            for (int j = 0; j < i; j++) {
                long add = MathExtentions.power(10, j);
                int k = 0;
                if (j == i - 1) k++;
                for (; k <= 9; k++) {
                    if (k != 0 || j == 0) {
                        res.add(start);
                    }
                    start += add;
                }
                start -= add;
            }
            return res;
        }

    }

    static class MathExtentions {
        public static long power(final long x, final long y) {
            if (y == 0)
                return 1;

            long p = power(x, y / 2);
            p = (p * p);

            if (y % 2 == 0)
                return p;
            else
                return (x * p);
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

    }

    static class IntegerExtention {
        public static int sumDigits(long i) {
            if (i == 0) return 0;
            int res = 0;
            do {
                long i1 = i / 10;
                res += i - i1 * 10;
                i = i1;
            } while (i != 0);
            return res;
        }

    }
}

