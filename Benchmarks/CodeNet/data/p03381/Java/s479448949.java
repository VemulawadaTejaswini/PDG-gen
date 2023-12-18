import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ShekharN
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = IntStream.range(0, n).map(i -> in.nextInt()).toArray();
            PairIntInt[] parr = new PairIntInt[n];
            for (int i = 0; i < n; i++) {
                parr[i] = new PairIntInt(arr[i], i);
            }
            Arrays.sort(parr, Comparator.comparing(PairIntInt::getFirst).thenComparing(PairIntInt::getSecond));
            int[] ans = new int[n];
            int mid = n / 2;
            for (int i = 0; i < n; i++) {
                if (i < mid) {
                    ans[parr[i].getSecond()] = parr[mid].getFirst();
                } else {
                    ans[parr[i].getSecond()] = parr[mid - 1].getFirst();
                }
            }
            for (int i = 0; i < n; i++) {
                out.println(ans[i]);
            }
            //out.println();
        }

    }

    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        public String nextString() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }

    static class PairIntInt {
        private int first;
        private int second;

        PairIntInt() {
        }

        public PairIntInt(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PairIntInt that = (PairIntInt) o;

            if (first != that.first) return false;
            return second == that.second;
        }


        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

    }
}

