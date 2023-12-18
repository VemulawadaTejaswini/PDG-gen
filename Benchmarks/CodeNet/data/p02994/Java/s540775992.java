import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBiteEating solver = new BBiteEating();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBiteEating {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int l = in.nextInt();
            Apple[] apples = new Apple[n];
            for (int i = 0; i < n; i++) {
                apples[i] = new Apple(l + i);
            }
            int sumMax = 0;
            for (int i = 0; i < n; i++) {
                sumMax += apples[i].flavor;
            }
            int res = 0;
            int abs = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (Math.abs(sumMax - (sumMax - apples[i].flavor)) < abs) {
                    abs = Math.abs(sumMax - (sumMax - apples[i].flavor));
                    res = i;
                }
            }
            out.print(sumMax - apples[res].flavor);
        }

        class Apple implements Comparable<Apple> {
            int flavor;

            public Apple(int flavor) {
                this.flavor = flavor;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Apple apple = (Apple) o;
                return flavor == apple.flavor;
            }

            public int hashCode() {
                return Objects.hash(flavor);
            }

            public int compareTo(Apple o) {
                return this.flavor - o.flavor;
            }

        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

