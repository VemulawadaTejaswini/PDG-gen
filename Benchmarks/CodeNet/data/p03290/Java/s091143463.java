import java.io.*;
import java.util.*;

public class Main {

    class A implements Comparable<A> {
        long p;
        long index;
        long v;
        long c;
        long score;
        double d;

        public A(long index, long p, long v, long c, long score) {
            this.index = index;
            this.p = p;
            this.v = v;
            this.c = c;
            this.score = score;
            this.d = (v + c + 0D) / p;
        }


        @Override
        public int compareTo(A o) {
            return -Double.compare(this.d, o.d);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return p == a.p &&
                    index == a.index &&
                    v == a.v &&
                    c == a.c &&
                    score == a.score &&
                    Double.compare(a.d, d) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(p, index, v, c, score, d);
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int D = in.nextInt();
        long G = in.nextLong();
        A[] a = new A[D];
        for (int i = 0; i < D; i++) {
            int index = i + 1;
            long p = in.nextLong();
            long c = in.nextLong();
            long score = 100;
            long v = p * index * score + c;
            a[i] = new A(index, p, v, c, score);
        }
        Arrays.sort(a);
        long res = Integer.MAX_VALUE;
        long max = 0;
        long count = 0;
        long count2 = 0;
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= a[i].p; j++) {
                count++;
                count2++;
                max += a[i].index * a[i].score;
                if (max >= G) {
                    break;
                }
            }
            if (count2 == a[i].p) {
                max += a[i].c;
            }
            count2 = 0;
            if (max >= G) {
                res = Math.min(res, count);
                max = 0;
                count = 0;
            }
        }
        out.println(res);
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }

}
