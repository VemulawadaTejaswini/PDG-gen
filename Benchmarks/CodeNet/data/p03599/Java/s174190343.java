import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int e = in.nextInt();
            int f = in.nextInt();

            Set<Integer> waterSet = calcSet(a, b, f / 100);
            Set<Integer> sugerSet = calcSet(c, d, f);

            double max = 0;
            int ansSugerWater = 0;
            int ansSuger = 0;
            for (int weightWater : waterSet) {
                for (int weightSuger : sugerSet) {
                    if (weightWater * 100 + weightSuger > f
                            || weightSuger > weightWater * e
                            || max >= (double) weightSuger / (weightSuger + weightWater)) {
                        continue;
                    }

                    ansSugerWater = weightWater * 100 + weightSuger;
                    ansSuger = weightSuger;
                    max = (double) weightSuger / (weightSuger + weightWater);
                }
            }

            out.println(ansSugerWater + " " + ansSuger);
        }

        private Set<Integer> calcSet(int a, int b, int f) {
            Set<Integer> waterSet = new TreeSet<>();
            for (int i = 0; i <= f / a; i++) {
                for (int j = 0; j <= f / b; j++) {
                    if (i == 0 && j == 0) continue;
                    waterSet.add(i * a + j * b);
                }
            }
            return waterSet;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

